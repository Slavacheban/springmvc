<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org">

<head>
    <title>Spring Security</title>
    <link rel="stylesheet" type="text/css" th:href="@{/css/form.css}" />
</head>

<body>
<form th:action="@{/}" method="post">
    <button  type="Submit">Registration or Login</button>
</form>
</body>
</html>