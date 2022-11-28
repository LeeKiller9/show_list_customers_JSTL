<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<style>
    * {
        box-sizing: border-box;
        margin: 0;
        padding: 0;
    }

    table, th, td {
        border: 1px solid black;
        padding: 10px;
    }

    .text {
        text-align: center;
        font-size: 20px;
    }

    table {
        border-collapse: collapse;
    }

    img {
        width: 25px;
        height: 25px;
        margin: auto;
        display: block;
    }
</style>
<body>
<table>
    <tbody>
    <tr>
        <th>Name</th>
        <th>BOD</th>
        <th>Address</th>
        <th>Avatar</th>
    </tr>
    <c:forEach items="${requestScope.empList}" var="emp">
        <tr>
            <td class="text"><c:out value="${emp.employeeName}"></c:out></td>
            <td class="text"><c:out value="${emp.employeeBOD}"></c:out></td>
            <td class="text"><c:out value="${emp.employeeAddress}"></c:out></td>
            <td class="pic"><img src="<c:out value="${emp.employeeImg}"></c:out>"></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>