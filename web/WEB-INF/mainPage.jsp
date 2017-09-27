<%-- 
    Document   : mainPage
    Created on : Sep 20, 2017, 4:20:46 PM
    Author     : 734743
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/includes/header.html" />
        <h1>Main Page</h1>
        <p>Hello, ${username} <a href="login">Logout</a></p>
<c:import url="/includes/footer.html" />