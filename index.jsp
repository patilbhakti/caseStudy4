<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h3 style="font-family:Arial;color:pink">
<form action="bill" method="post">
Enter Mobile Number:<input type="text" name="mobileNumber" minlength="8" maxlength="10" size="10">
<br/><br/>
Select plan from below
<table border="2" bgcolor="yellow">
  <tr bgcolor="orange">
    <th>PLAN ID</th>
    <th>DAYS</th>
    <th>TALKTIME</th>
    <th>DATA</th>
    <th>PRICE</th>
    <th>SELECT</th>
    </tr>
    <c:forEach  items="${offerList}" var="offer">
      <tr>
      <td>${offer.id}</td>
      <td>${offer.days}</td>
      <td>${offer.talkTime}</td>
      <td>${offer.data} GB</td>
      <td>${offer.price}</td>
      <td><input type="radio" name="offerId" value="${offer.id }"/></td>
      <td>
      </tr>
     </c:forEach>
  </table>
  </h3>
  <input type="submit" value="submit"/>
</form>
</div>
</body>
</html>