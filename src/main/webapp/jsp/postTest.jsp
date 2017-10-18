<%--
  Created by IntelliJ IDEA.
  User: lu.zl
  Date: 2017/10/17
  Time: 9:01
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>This is the post test page!</title>
</head>
<body>
    <h2>Please input your personal information in the following table!</h2>
    <s:form name="userLogin" method="post" action="register">
        <s:textfield key="user.userName"/>
        <s:password key="user.password" />
        <s:textfield key="user.sign" />
        <s:textfield key="user.phoneNumber" />
        <s:textfield key="user.address" />
        <s:submit key="submit" />
    </s:form>
</body>
</html>
