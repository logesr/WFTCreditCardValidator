<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>CreditCard-Home Page</title>
	<style>
		div.a{
		  text-align: center;
		}
		.button {
		  background-color: grey;
		  border: none;
		  color: white;
		  padding: 15px 50px;
		  text-align: center;
		  text-decoration: none;
		  display: inline-block;
		  font-size: 16px;
		  margin: 4px 2px;
		  cursor: pointer;
		}
		table{
		  border: 1px solid black; 
		  margin-left:auto; 
		  margin-right:auto;
		}
		td {
		  border: 1px solid black;
		}
		body {
		  background-color: #00FFFF;
		}
		#pan_No {
		  padding: 15px 100px;   
		} 
	</style>
</head>
<body>
	<form name="myForm" action="CreditCardValidation" method="get" >
		<div class="a">
			<h1>Check For Credit Card Eligibility</h1>
			<table style="width:65%">
				<tr>
					<td><h2>Enter PAN Number:<input type="text" name="PAN_No" id="pan_No"  required aria-required="true"  pattern="[A-Za-z-0-9]{10}" title="10 character alpha numeric"/></h2></td>
				</tr>
				<tr>
					<td><input type="submit" class="button" value="Check"></td>
				</tr>
			</table>
		</div>
	</form>
</body>
</html>