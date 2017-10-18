<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: lu.zl
  Date: 2017/10/17
  Time: 10:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>This is the user Display page</title>
</head>
    <br>
    <h2>The information of user is: </h2>
    <br>User Name is: <s:property value="user.userName"/>
    <br>Password is: <s:property value="#userKey.password"/>
    <br>Sign is: <s:property value="#action.user.sign" />
    <br>Phone number is: <s:property value="#userReq.user.phoneNumber" />
    <br>Address is: <s:property value="#userMap.address" />
    <br><br>
    <h2>The following information is get from request</h2>
    <br>User Name is: <s:property value="#request.userKey.userName" />
    <br>User Name is: <s:property value="#request.userMap.userName" />
    <br>User Name is: <s:property value="#request.userReq.userName" />
    <br>User Name is: <s:property value="#request.user.userName" />
    <br>User Name is: <s:property value="#request.action.user.userName" />
    <br><br>
    <p><a href='<s:url action="userRegister" />'><h2>Now input your personal information!</h2></a></p>
    <p><a href='<s:url action="index" />'><h2>Back to index by action!</h2></a></p>
    <p><a href="index.jsp"/><h2>Back to index by direct link!</h2></a></p>
</body>
</html>
