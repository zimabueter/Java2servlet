<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>რეგისტრაცია</title>
</head>
<body>

<form action="userservlet" method="post">

    <p> შინაური ცხოველების სარეგისტრაციო ფორმა</p>
    <tr>
        <td>სახელი</td>
        <td><label>
            <input name="name"/>
        </label></td>
    </tr>
    <tr>
        <br>
        <td>ჯიში</td>
        <td><label>
            <input name="breed"/>
        </label></td>
    </tr>
    <tr>
        <br>
        <td>სქესი</td>
        <td><label>
            <input name="gender"/>
        </label></td>
    </tr>
    <tr>
        <br>
        <td>ასაკი</td>
        <td><label>
            <input name="age"/>
        </label></td>
    </tr>
    <br>
    <input type="submit" value="რეგისტრაცია"/>
</form>

</body>
</html>