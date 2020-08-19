<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">

<title>input!!</title>
</head>
<body>
	<h2 class="text-center">Military Equipment</h2>
	<div class="container mt-5">
	
	<form action="form" method="post">
	
		<div class="form-group col-md-4">
			<label for="inputState">Country Name</label> <select id="inputState"
				class="form-control" name="countryName">
				<option selected>--Select-</option>
				<option>India</option>
				<option>USA</option>
				<option>UK</option>
			</select>
		</div>
		
		<div class="form-group col-md-4">
			<label for="inputState">Military Type</label> <select id="inputState"
				class="form-control" name="militaryType">
				<option selected>--Select--</option>
				<option>Army</option>
				<option>Air Force</option>
				<option>Navy</option>
				
			</select>
		</div>

		<div class="form-row">
			<div class="form-group col-md-6">
				<label for="inputEmail4">Equipment</label>
				 <input type="text"
					class="form-control" id="equipment" placeholder="Enter here"
					name="equipment"
					>
			</div>
			<div class="form-group col-md-6">
				<label for="inputPassword4">Price</label> <input type="text"
					class="form-control" id="price" name="price">
			</div>
		</div>
		<div class="form-group">
			<label for="inputAddress">Quantity</label> <input type="text"
				class="form-control" id="quantity" placeholder="Enter here" name="quantity">
		</div>
		<div class="form-group">
			<label for="inputAddress2">Delivery Year</label> <input type="text"
				class="form-control" id="deliveryyear" placeholder="Enter year" name="deliveryYear">
		</div>




		<div class="form-group">
			<div class="form-check">
				<input class="form-check-input" type="checkbox" id="gridCheck">
				<label class="form-check-label" for="gridCheck"> tick </label>
			</div>
		</div>
		<div class="container text-center">
			<button type="submit" class="btn btn-primary">Save</button>
		</div>
	</form>
</div>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
		integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
		integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV"
		crossorigin="anonymous"></script>
</body>
</html>
