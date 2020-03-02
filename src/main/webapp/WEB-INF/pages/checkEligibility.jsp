<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Validation_Checking</title>
	<style>
		#validyPass{
		  background-color:#FFA500;
		  height:200px;
		  align:center;
		}
		#validyFail{
		  background-color:#73e600;
		  height:200px;
		  align:center;
		}
		#panIdCheck{
		  background-color: #ff7c4d;
		  height:200px;
		  align:center;
		}
		h1{
		  align:center;
		}
	</style>
</head>
<body>
	<%
 validationCheck= "${Validity}";
	%>
	<%if(validationCheck!=null){ %>
		<%if(validationCheck.equals("eligible")){ %>
			<div id="validyPass">
				<center>
				<h1>Congratulations!!!You are eligible for a Credit Card</h1>
				</center>
			</div>
		<%}%>
		<%if(validationCheck.equals("ineligible")){ %>
			<div id="validyFail">
				<center>
				<h1>Sorry!!!You are not eligible for a Credit Card</h1>
				</center>
			</div>
		<%}%>
	<%} %>
	<%if(validationCheck.equals("invalid")){ %>
		<div id="panIdCheck">
			<center>
			<h1>Invalid Pan Entry!!!</h1>
			<a href="index.jsp">Enter Again</a>
			</center>
		</div>
	<%}%>
</body>
</html>