<!DOCTYPE html>
<html lang="en">

<head>
<!-- Required meta tags-->
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="au theme template">
<meta name="author" content="Hau Nguyen">
<meta name="keywords" content="au theme template">

<!-- Title Page-->
<title>Login</title>

<!-- Fontfaces CSS-->
<link href="css/font-face.css" rel="stylesheet" media="all">
<link href="vendor/font-awesome-4.7/css/font-awesome.min.css"
	rel="stylesheet" media="all">
<link href="vendor/font-awesome-5/css/fontawesome-all.min.css"
	rel="stylesheet" media="all">
<link href="vendor/mdi-font/css/material-design-iconic-font.min.css"
	rel="stylesheet" media="all">

<!-- Bootstrap CSS-->
<link href="vendor/bootstrap-4.1/bootstrap.min.css" rel="stylesheet"
	media="all">

<!-- Vendor CSS-->
<link href="vendor/animsition/animsition.min.css" rel="stylesheet"
	media="all">
<link
	href="vendor/bootstrap-progressbar/bootstrap-progressbar-3.3.4.min.css"
	rel="stylesheet" media="all">
<link href="vendor/wow/animate.css" rel="stylesheet" media="all">
<link href="vendor/css-hamburgers/hamburgers.min.css" rel="stylesheet"
	media="all">
<link href="vendor/slick/slick.css" rel="stylesheet" media="all">
<link href="vendor/select2/select2.min.css" rel="stylesheet" media="all">
<link href="vendor/perfect-scrollbar/perfect-scrollbar.css"
	rel="stylesheet" media="all">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<!-- Main CSS-->
<link href="css/theme.css" rel="stylesheet" media="all">
</head>
<body>
	<nav class="navbar navbar-expand-lg bg-dark navbar-dark">
		<div class="container-fluid">
			<!-- Logo -->
			<div class="navbar-header">
				<h2 class="text-white">
					<strong>EDUCATION ERP</strong>
				</h2>
			</div>
		</div>
	</nav>
	<div class="page-wrapper">
		<div class="page-content--bge5">
			<div class="container">
				<div class="login-wrap">
					<div class="card">
						<div class="card-header bg-primary">
							<h3 class="text text-white text-center">SIGN -IN</h3>
						</div>
						<!-- Card Header -->
						<div class="card-body">
							<form action="login.htm" method="post" class="form-vertical">
								<div class="row form-group">
									<div class="col col-sm-12">
										<span class="badge badge-pill badge-primary">Email</span> <input
											class="au-input au-input--full" type="email" name="emailId"
											placeholder="Email">
									</div>
								</div>
								<div class="row form-group">
									<div class="col col-sm-12">
										<span class="badge badge-pill badge-primary">Password</span> <input
											class="au-input au-input--full" type="password"
											name="password" placeholder="Password">
									</div>
								</div>
								<div class="login-checkbox">
									<label> <input type="checkbox" name="remember">Remember
										Me
									</label> <label> <a href="forget-pass.jsp">Forgotten
											Password?</a>
									</label>
								</div>
								<button class="au-btn au-btn--block au-btn--green m-b-20"
									type="submit">
									<b>sign in</b>
								</button>
							</form>
							<div class="register-link">
								<p>
									Don't you have account? <a href="register.jsp">Sign Up Here</a>
								</p>
							</div>
						</div>
						<!-- Card-body end-->
						<div align="center">
								<span class="text text-white bg-danger">${message}</span>
						</div>
						<!-- Card Footer -->
					</div>
					<!-- Card end -->
				</div>
			</div>
		</div>
	</div>

	<!-- Jquery JS-->
	<script src="vendor/jquery-3.2.1.min.js"></script>
	<!-- Bootstrap JS-->
	<script src="vendor/bootstrap-4.1/popper.min.js"></script>
	<script src="vendor/bootstrap-4.1/bootstrap.min.js"></script>
	<!-- Vendor JS       -->
	<script src="vendor/slick/slick.min.js">
		
	</script>
	<script src="vendor/wow/wow.min.js"></script>
	<script src="vendor/animsition/animsition.min.js"></script>
	<script src="vendor/bootstrap-progressbar/bootstrap-progressbar.min.js">
		
	</script>
	<script src="vendor/counter-up/jquery.waypoints.min.js"></script>
	<script src="vendor/counter-up/jquery.counterup.min.js">
		
	</script>
	<script src="vendor/circle-progress/circle-progress.min.js"></script>
	<script src="vendor/perfect-scrollbar/perfect-scrollbar.js"></script>
	<script src="vendor/chartjs/Chart.bundle.min.js"></script>
	<script src="vendor/select2/select2.min.js">
		
	</script>

	<!-- Main JS-->
	<script src="js/main.js"></script>

</body>

</html>
<!-- end document-->