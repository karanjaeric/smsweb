<%-- 
    Document   : index
    Created on : May 23, 2020, 10:16:04 AM
    Author     : ekaranja
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SMS</title>
    </head>
    <body>
        <form action="student" method="POST">
            Name:
            <br/><input type="text" name="name" id="name" onkeypress="alertUser()" /><br/>
            Gender:<br/>
            <select name="gender">
                <option value="">Select Gender</option>
                <option value="Male">Male</option>
                <option value="Female">Female</option>
                <option value="Unspecified">Unspecified</option>
            </select><br/>
            Registration Number:<br/>
            <input type="text" name="regNo" /><br/>
            Phone Number:<br/>
            <input type="text" name="phoneNumber" /><br/>
            Username:<br/>
            <input type="text" name="username" /><br/>
            Password:<br/>
            <input type="text" name="passwword" /><br/>
            Course:<br/>
            <input type="text" name="course" /><br/>
            <input type="submit" value="Save Student"/><br/>
            <input type="reset" value="RESET"/>
        </form>
    </body>
    <script src="formalert.js">    
    </script>>
</html>
