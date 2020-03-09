<%@ page import="java.util.ArrayList" %>
<%@ page import="model.Product" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="obk" class="someClass.Product"/>
<html>
<head>
    <title>My first shop</title>
</head>
<body>
<h1 align="center">Welcome on my first web shop</h1>
<form action="bucket.jsp"><input type="button" value="Bucket"/></form>
<table>
    <tr id="title">
        <td>Product</td>
        <td>Price</td>
            <% ArrayList<Product> list = (ArrayList<Product>) request.getAttribute("products");
    for (int i = 0; i < list.size();i++) {%>
            <% String name = list.get(i).getName();%>
            <% int price = list.get(i).getPrice();%>
    <tr>
        <td>
            <% out.print(name);%>
        </td>
        <td>
            <%out.print(price);%>
        </td>
        <td>
            <a href="http://localhost:8082/com_shop_war_exploded/add?product=
<%=name%>&price=<%=price%>">add to bucket</a>
        </td>
    </tr>
    <% }%>
</table>
</body>
</html>