<%@ page import="model.Product" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bucket</title>
</head>
<body>
<td>Product</td>
<td>Price</td>
<% ArrayList<Product> list = (ArrayList<Product>) session.getAttribute("bucket");
    for (Product product : list) {%>
<tr>
    <td>
        <% out.print(product.getName());%>
    </td>
    <td>
        <%out.print(product.getPrice());%>
    </td>
</tr>
<% }%>
</table>
</body>
</html>
