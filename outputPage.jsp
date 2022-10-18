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
<c:url value="/output" var="output"/>
<div align="center">
<h1 style="color:green">
<u><i>Bill for recharge on mobile number:${MobileNumber }</i></u>
</h1>
<br/>
<h2 style="color:red">
    Transaction Id:${transactionId }
    <br/><br/>
    Offer Id:${resOffer.id }
    <br/><br/>
    Valid for:${resOffer.days }
    <br/><br/>
    Talktime Amount:${resOffer.talkTime }
    <br/><br/>
    Data Balance:${resOffer.data } GB
    <br/><br/>
    Amount Payable:${resOffer.price }
    <br/><br/>
    
  <a href="/index">Return</a>
</h2>
</div>
</body>
</html>