<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Getting Started: Handling Form Submission</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
	<h1>Form</h1>
    <form action="http://localhost:8080/addProduct/" method="post">
         <pre>

          PRODUCTID       : <input type="text" name="productId" />      <br/>
         
          PRODUCTNAME     : <input type="text" name="productName" />   <br/>

          PADDRESS      : <input type="text" name="address" />  
              
                        <input type="submit" value="Add Product"/>
       </pre>
    </form>
</body>
</html>