<%@ page import="model.Product" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bucket</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
            integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous">

    </script>
</head>
<body>
<h1 align="center">Welcome on my first web shop</h1>
<div style="margin-left: 20px">
    <button onclick="document.location='product'">Show products</button>
    <button onclick="document.location='bucket/clear'">Clear bucket</button>
    <%
        if (session.getAttribute("bucket") != null) {%>
    <div class="row">
        <div class="col-md-2" style="background-color: red">Product</div>
        <div class="col-md-2" style="background-color: green">Price</div>
    </div>
    <%
        ArrayList<Product> list = (ArrayList<Product>) session.getAttribute("bucket");
        int total = 0;
        for (Product product : list) {
    %>
    <div class="row">
        <div class="col-md-2">
            <% out.print(product.getName());%>
        </div>
        <div class="col-md-2">
            <%out.print(product.getPrice());%>
        </div>
    </div>
    <% total += product.getPrice();%>
    <% }%>
    <div class="col-md-4" style="height:5px;border-top:1px solid black;padding-left:10px;">
    </div>
    <div class="row">
        <div class="col-md-2">
            Total price
        </div>
        <div class="col-md-2"><% out.println(total);%></div>
    </div>
</div>
<%} else {%>
<div>Your bucket is empty
</div>
<%}%>
</body>
</html>
