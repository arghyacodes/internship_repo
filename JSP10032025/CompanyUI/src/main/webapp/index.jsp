<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Company Home Page</title>
    <style>
        body { font-family: Arial, sans-serif; margin: 0; padding: 0; }
        .navbar { background-color: #333; padding: 10px; color: white; text-align: center; }
        .navbar a { color: white; padding: 14px 20px; text-decoration: none; }
        .navbar a:hover { background-color: #CB4154; color: black; }
        .container { text-align: center; margin: 20px; }
        .image-slider { width: 80%; margin: auto; padding: 10px; }
        .products { display: flex; justify-content: space-around; margin-top: 20px; }
        .product { width: 30%; padding: 20px; border: 1px solid #ddd; }
        .form-container { text-align: left; margin-top: 30px; }
    </style>
</head>
<body>

	
	<div class="head">
	<center>
		<img src="images/logo.jfif" width=316px height=177px>
	</center>
	</div>
    <!-- Navigation Bar -->
    <div class="navbar" >
        <a href="#">Logo</a>
        <a href="#">Home</a>
        <a href="#">Services</a>
        <a href="#">Products</a>
        <a href="login.jsp">Login / Signup</a>
    </div>

    <!-- Image Slider -->
    <div class="container">
        <div class="image-slider">
            		<center>
		<img src="images/roll.png" width=800px height=174px>
	</center>
        </div>
    </div>

    <!-- Products Section -->
    <div class="products">
        <div class="product"><img src="images/scorpion.jpeg" alt="Scorpio N" width=420px height=200px ></div>
        <div class="product"><img src="images/thar.jpg" alt="Thar" width=420px height=200px ></div>
        <div class="product"><img src="images/xuv700.jfif" alt="Scorpio N" width=420px height=200px ></div>
    </div>

    <!-- Form Section -->
    <div class="container form-container">
        <h3>User Form</h3>
        <form action="RegisterServlet" method="post">
            Name: <input type="text" name="name" required> <br><br>
            Email: <input type="email" name="email" required> <br><br>
            Gender:
            <input type="radio" name="gender" value="Male"> Male
            <input type="radio" name="gender" value="Female"> Female <br><br>
            Services:
            <select name="services">
                <option>SUV</option>
                <option>MPV</option>
                <option>Heavy Vehicle</option>
            </select> <br><br>
            <input type="checkbox" name="subscribe" value="yes"> Subscribe to newsletter <br><br>
            Password: <input type="password" name="password" required> <br><br>
            <button type="submit">Submit</button>
        </form>
    </div>

</body>
</html>