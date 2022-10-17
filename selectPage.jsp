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
<form action="select" method="post">
<h3 style="font-family:Arial;color:pink">
Enter Mobile Number:<input type="text" id="mobileNumber" name="mobileNumber" minlength="8" maxlength="10" size="10">
<br/><br/>

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
  <a href="/output"><input type="submit" value="submit"/></a>
</form>
</div>
</body>
</html>