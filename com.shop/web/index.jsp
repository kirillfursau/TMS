<%@ page import="java.util.ArrayList" %>
<%@ page import="model.Product" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>My first shop</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
          integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
            integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous">
    </script>
</head>
<body>
<h1 align="center">Welcome on my first web shop</h1>
<div style="margin-left: 20px">
    <button onclick="document.location='bucket.jsp'">Bucket</button>
    <button onclick="document.location='bucket/clear'">Clear bucket</button>
    <div class="row">
        <div class="col-md-2" style="background-color: red">Product</div>
        <div class="col-md-2" style="background-color: green">Price</div>
    </div>
    <% ArrayList<Product> list = (ArrayList<Product>) request.getAttribute("products");
        for (int i = 0; i < list.size(); i++) {%>
    <% String name = list.get(i).getName();%>
    <% int price = list.get(i).getPrice();%>
    <div class="row">
        <div class="col-md-2">
            <%=name%>
        </div>
        <div class="col-md-2">
            <%=price%>
        </div>
        <div class="col-md-2">
            <button onclick="document.location='add?product=<%=name%>&price=<%=price%>'">add to bucket</button>
        </div>
    </div>
    <% }%>
</div>
</body>
</html>