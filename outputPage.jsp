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
<u><i>Bill for recharge on mobile number:${bill.mobileNumber }</i></u>
</h1>
<br/>
<h2 style="color:red">
    Transaction Id:${bill.transactionId }
    <br/><br/>
    Offer Id:${bill.offerId }
    <br/><br/>
    Valid for:${offer.days }
    <br/><br/>
    Talktime Amount:${offer.talkTime }
    <br/><br/>
    Data Balance:${offer.data }
    <br/><br/>
    Amount Payable:${offer.price }
    <br/><br/>
    
  <a href="/select">Return</a>
</h2>
</div>
</body>
</html>