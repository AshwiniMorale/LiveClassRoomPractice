package com.daoImpl;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.bean.UserDetails;
import com.dao.SaveDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SaveImpl implements SaveDao {

	SessionFactory factory;
	Session session;
	Transaction tx;
	static final String HQLCHECK1 = "FROM UserDetails WHERE emailId = ? AND password = ?";
	static final String HQLCHECK2 = "FROM UserDetails WHERE emailId = ? OR mobileNo = ?";
	static final String HQLCHECKEMAIL = "FROM UserDetails WHERE emailId = ? ";

	public void startTransaction() {
		factory = HibernateUtil.getSessionFactory();
		session = factory.openSession();
		tx = session.beginTransaction();
		System.out.println("Transection Begin...");
	}

	public int register(UserDetails userDetails, HttpServletRequest req) {
		System.out.println("register() called:-->SaveImpl");
		startTransaction();
		int userId = 0;
		try {
			String firstName = req.getParameter("firstName");
			String lastName = req.getParameter("lastName");
			String emailId = req.getParameter("emailId");
			String password = req.getParameter("password");
			String mobileNo = req.getParameter("mobileNo");

			userDetails.setFirstName(firstName);
			userDetails.setLastName(lastName);
			userDetails.setEmailId(emailId);
			userDetails.setMobileNo(mobileNo);
			userDetails.setPassword(PasswordDaoImpl.passwordSecurity(password));
			userId = (int) session.save(userDetails);
			System.out.println("Object saved successfully..." + userId);
			tx.commit();
			session.close();

		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (NoSuchProviderException e) {
			e.printStackTrace();
		}
		return userId;

	}

	@SuppressWarnings("unchecked")
	public boolean checkUser(String emailId, String mobileNo) {
		System.out.println("checkUser() called:-->SaveImpl");

		startTransaction();
		// System.out.println(userDetails.getEmailId());

		Query q = session.createQuery(HQLCHECK2);
		q.setParameter(0, emailId);
		q.setParameter(1, mobileNo);
		tx.commit();
		List<UserDetails> list = q.list();
		session.close();
		Iterator<UserDetails> itr = list.iterator();
		if (itr.hasNext())
			return true;
		else
			return false;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<UserDetails> login(String emailId, String password) {

		System.out.println("login() called:-->SaveImpl");
		List<UserDetails> list = null;
		startTransaction();
		Query query = session.createQuery(HQLCHECK1);
		query.setParameter(0, emailId);
		query.setParameter(1, password);
		System.out.println(password);
		list = query.list();
		tx.commit();
		session.close();

		return list;

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UserDetails> forgetPassword(String emailId) {
		System.out.println("forgetPassword() called:-->SaveImpl");
		List<UserDetails> list = null;

		startTransaction();
		Query query = session.createQuery(HQLCHECKEMAIL);
		query.setParameter(0, emailId);
		list = query.list();
		tx.commit();
		session.close();
		return list;
	}

}
