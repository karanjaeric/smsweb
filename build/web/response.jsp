<%-- 
    Document   : response
    Created on : May 23, 2020, 11:19:21 AM
    Author     : ekaranja
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Response</title>
    </head>
    <body>
        <h1>Name:<%=(String) request.getAttribute("message")%></h1>
    </body>
    
   
</html>
