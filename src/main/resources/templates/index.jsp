<!DOCTYPE html>
<html xmlns:th="http://www.thymeLeaf.org">
<head>
    <meta charset="ISO-8859-1">
    <title>Person CRUD Operation</title>
    <link rel="stylesheet" type="text/css" th:href="@{/css/style.css}">
</head>
<body>
<div align="center">
    <table class="table_2">
        <caption>Student crud operations</caption>
        <thead>
        <tr>
            <th>Person ID</th>
            <th>Name</th>
            <th>eMail</th>
            <th>Birthday</th>
        </tr>
        </thead>
        <tbody>
        <tr th:each="persons : ${listPersons}">
            <td th:text="${person.id}">Person ID</td>
            <td th:text="${person.name}">Name</td>
            <td th:text="${person.email}">eMail</td>
            <td>
                <a class="button" th:href="@{'/edit/' + ${person.id}}">Edit</a>
                &nbsp;&nbsp;&nbsp;&nbsp;
                <a class="button-delete" th:href="@{'/delete/' + ${person.id}}">Delete</a>
            </td>
        </tr>
        </tbody>
    </table>
    <br/>
    <a class="button" th:href="@{'/new'}">Create new person</a>
</div>
</body>
</html>