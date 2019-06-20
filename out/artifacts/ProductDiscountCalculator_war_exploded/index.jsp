<%--
  Created by IntelliJ IDEA.
  User: hieuthao
  Date: 20/06/19
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form method="post" action="/display-discount">
    <input type="text" name="Product Description" placeholder="Product Description"/>
    <input type="number" name="List Price" placeholder="List Price"/>
    <input type="number" name="Discount Percent" placeholder="Discount Percent"/>
    <input type="submit" value="Calculate"/>

  </form>
  </body>
</html>
