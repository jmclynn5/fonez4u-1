<%-- 
    Document   : logout
    Created on : 16-Jan-2014, 13:29:46
    Author     : USER
--%>

<%
session.setAttribute("userid", null);
session.invalidate();
response.sendRedirect("index.jsp");
%>