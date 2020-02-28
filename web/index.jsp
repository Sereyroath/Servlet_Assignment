<%-- 
    Document   : index
    Created on : Feb 27, 2020, 8:52:54 PM
    Author     : User
--%>
<%@page import="com.connectDB"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <title>Web Assignment</title>
    </head>
    <body>
          
        <ul class="nav nav-tabs justify-content-center">
            <li class="nav-item ">
              <a class="nav-link active" href="index.jsp">Home</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="InsertRecord.jsp">Insert Record</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">View Record</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">Update Record</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">Delete Record</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">View All Record</a>
            </li>
        </ul>
        
        
        <%
            if(connectDB.isConnected()){
                out.println("<div role=\"alert\" class=\"alert alert-success show fade data-dismiss fade in\">"); 
                out.println("<a href=\"#\" class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>");
                out.println("<strong>Success!</strong> Database is connected");
                out.println("</div>");
            }
            else{
                out.println("<div role=\"alert\" class=\"alert alert-danger show fade data-dismiss fade in\">"); 
                out.println("<a href=\"#\" class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>");
                out.println("<strong>Error!</strong> Database isn't connected");
                out.println("</div>");
            }
        %>
                
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
            
        </script>
        
    </body>
</html>
