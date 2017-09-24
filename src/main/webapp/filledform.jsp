<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">



<title>Filled Form</title>
</head>
<body>

	<select class="selectpicker" data-live-search="true">
  <option data-tokens="ketchup mustard">Hot Dog, Fries and a Soda</option>
  <option data-tokens="mustard">Burger, Shake and a Smile</option>
  <option data-tokens="frosting">Sugar, Spice and all things nice</option>
  
  <form action="filledform" method="GET">
         First Name: <input type="text" name="first_name">
    <br />
         Last Name: <input type="text" name="last_name" />
    <input type="submit" value="Submit" />
    </form>
</body>
</html>