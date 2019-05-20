<!DOCTYPE html>
<html xmlns:th="http://www.thymeLeaf.org">
<head>
    <meta charset="ISO-8859-1">
    <title>Create student</title>
    <link rel="stylesheet" type="text/css" th:href="@{/css/style.css}">
</head>
<body>
<div align="center">
    <br/>
    <form action="#" th:action="@{/save}" th:object="${student}" method="post">
        <table class="table_1">
            <caption>Create person</caption>
            <tr>
                <td>Name</td>
                <td><input type="text" th:field="*{name}"/></td>
            </tr>
            <tr>
                <td>eMail</td>
                <td><input type="number" th:field="*{mail}"/></td>
            </tr>
            <tr>
                <td>Birthday</td>
                <td><input type="text" th:field="*{birthday}"/></td>
            </tr>
            <tr>
                <td colspan="2">
                    <button class="button" type="submit">Save</button>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>