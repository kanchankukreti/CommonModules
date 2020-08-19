<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Details of Data Saved!!</title>

</head>
<body>
	<h1> Success!!</h1>
<table class="table table-striped"></table>
	<table>
		<tr>
			<td>Country Name</td>
			
			<td>:<b>${militaryDTO.countryName}</b></td>
		</tr>
		<tr>
			<td>Military Type</td>
			<td>:<b>${militaryDTO.militaryType}</b></td>
		</tr>
		<tr>
			<td>Equipment</td>
			<td>:<b>${militaryDTO.equipment}</b></td>
		</tr>
		<tr>
			<td>Price</td>
			<td>:<b>${militaryDTO.price}</b></td>
		</tr>
		<tr>
			<td>Quantity</td>
			<td>:<b>${militaryDTO.quantity}</b></td>
		</tr>
		<tr>
			<td>Delivery Year</td>
			<td>:<b>${militaryDTO.deliveryYear}</b></td>
		</tr>
		<tr>
			<td>Total Price</td>
			<td>:<b>${militaryDTO.price*quantity}</b></td>
		</tr>
		
	</table> 

</body>
</html>
