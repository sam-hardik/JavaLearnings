<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer form</title>

<link type="text/css" rel="stylesheet"
	href = "${pageContext.request.contextPath}/resources/css/style.css"
/>

<link type="text/css" rel="stylesheet"
	href = "${pageContext.request.contextPath}/resources/css/add-customer-style.css"
/>

</head>
<body>
customer -form
		<div id = "wrapper">
			<div id="header">
			<h3> CRM - Customer Relationship manager </h3>
			</div>
		</div>
		
		<div id="container">
		<h4>save customer</h4>
			<form:form  action="saveCustomer" modelAttribute="customer" method="POST">
			
			<form:hidden  path="id"></form:hidden>
				<table>
				 	<tbody>
						<tr>
							<td><label>First Name : </label></td>
							<td><form:input path="firstName"/></td>
						</tr>	
						<tr>
							<td><label>Last Name : </label></td>
							<td><form:input path="lastName"/></td>
						</tr>	
						<tr>
							<td><label>Email : </label></td>
							<td><form:input path="email"/></td>
						</tr>	
						<tr>
							<td><label></label></td>
							<td><input type="submit" value="Save" class="save"/></td>
						</tr>				 	
				 	</tbody>
				</table>
			
			</form:form>
			
			<p>
				<a href="${pageContext.request.contextPath}/customer/list">Back to list page</a>
			</p>
		</div>


</body>
</html>