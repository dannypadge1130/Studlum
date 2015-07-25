<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Login Page">
    <meta name="author" content="Studlum">

	<title>Login Page</title>
	
    <!-- Bootstrap Core CSS - Uses Bootswatch Flatly Theme: http://bootswatch.com/flatly/ -->
    <link href='<c:url value="/resources/css/bootstrap-css/bootstrap.min.css"/>' rel="stylesheet">

    <!-- Custom CSS -->
    <link href='<c:url value="/resources/css/freelancer.css"/>' rel="stylesheet">

    <!-- Custom Fonts -->
    <link href='<c:url value="/resources/font-awesome/css/font-awesome.min.css"/>' rel="stylesheet" type="text/css">
    <link href="http://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href="http://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>
    
    <!-- Navigation -->
    <nav class="navbar navbar-default navbar-fixed-top">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header page-scroll">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="<c:url value='/'/>">Studlum</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
	                <li class="hidden">
	                    <a href="<c:url value='/'/>"></a>
	                </li>
	                <li class="page-scroll">
	                    <a href="<c:url value='/#about'/>">About</a>
	                </li>
	                <li class="page-scroll">
	                    <a href="<c:url value='/#services'/>">Services</a>
	                </li>
	                <li>
	                    <a href="<c:url value='/#register'/>">Sign Up</a>
	                </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>
    
    <section>
	    <div class="container">
			<div class="wrapper">
				<form action="/login" method="post" name="Login_Form" class="form-signin">       
				    <h3 class="form-signin-heading">Welcome Back! Please Sign In</h3>
					  <hr class="colorgraph"><br>
					  
					  <input type="text" class="form-control" name="username" placeholder="Username" required="required" autofocus="autofocus" />
					  <input type="password" class="form-control" name="password" placeholder="Password" required="required"/>     		  
					 
					  <button class="btn btn-lg btn-primary btn-block"  name="Submit" value="Login" type="Submit">Login</button>  			
				</form>			
			</div>
		</div>
	</section>
    
    <!-- Footer -->
    <footer class="text-center">
        <div class="footer-above">
            <div class="container">
                <div class="row">
                    <div class="footer-col col-md-4">
                        <h3>Location</h3>
                        <p>1234 West Place<br>Beverly Hills, CA 90210</p>
                    </div>
                    <div class="footer-col col-md-4">
                        <h3>Around the Web</h3>
                        <ul class="list-inline">
                            <li>
                                <a href="#" class="btn-social btn-outline"><i class="fa fa-fw fa-facebook"></i></a>
                            </li>
                            <li>
                                <a href="#" class="btn-social btn-outline"><i class="fa fa-fw fa-google-plus"></i></a>
                            </li>
                            <li>
                                <a href="#" class="btn-social btn-outline"><i class="fa fa-fw fa-twitter"></i></a>
                            </li>
                            <li>
                                <a href="#" class="btn-social btn-outline"><i class="fa fa-fw fa-linkedin"></i></a>
                            </li>
                            <li>
                                <a href="#" class="btn-social btn-outline"><i class="fa fa-fw fa-dribbble"></i></a>
                            </li>
                        </ul>
                    </div>
                    <div class="footer-col col-md-4">
                    </div>
                </div>
            </div>
        </div>
        <div class="footer-below">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        Copyright &copy; Sludlum 2014
                    </div>
                </div>
            </div>
        </div>
    </footer>
    
     <!-- jQuery -->
    <script src='<c:url value="/resources/js/jquery/jquery.js"/>'></script>

    <!-- Bootstrap Core JavaScript -->
    <script src='<c:url value="/resources/js/bootstrap/bootstrap.min.js"/>'></script>

    <!-- Plugin JavaScript -->
    <script src="http://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>
    <script src='<c:url value="/resources/js/classie.js"/>'></script>
    <script src='<c:url value="/resources/js/cbpAnimatedHeader.js"/>'></script>

    <!-- Contact Form JavaScript -->
    <script src='<c:url value="/resources/js/jqBootstrapValidation.js"/>'></script>

    <!-- Custom Theme JavaScript -->
    <script src='<c:url value="/resources/js/freelancer.js"/>'> </script>
    
</body>
</html>