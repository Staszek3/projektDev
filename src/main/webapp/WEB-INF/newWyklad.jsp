<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<head>

</head>

<body>

<%--<h1>Please fill the data in the form below.</h1>--%>
<h1>Prosze wpisać dane w poniższy formularz.</h1>
<br>

<form action="/nowyWyklad" method="post">
    <%--<input type="text" name="content"> Content<br><br>--%>
    <input type="text" name="title"> Tytuł wykładu<br><br>
    <textarea name="descript" id=" " rows="3" cols="50">wpisz opis wykładu po polsku; max 150 znaków</textarea><br><br>
    <input type="text" name="lecturer"> Nazwisko wykładowcy<br><br>

    <input type="submit" value="Add">
        <a href="/listaStudentow"><h2>ListaStudentow</h2></a>
</form>



</body>

</html>