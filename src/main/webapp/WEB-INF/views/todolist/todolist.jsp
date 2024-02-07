<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="/style.css" />
    <title>Todo List</title>
</head>
<body>
<header>
    <h3><a href="/login">로그인</a></h3>
    <p>님 어서오세요.</p>
</header>
<h1>todo-list</h1>
<form id="form">
    <input type="text" class="input" id="input" placeholder="Enter your todo" autocomplete="off">
    <ul class="todos" id="todos">

    </ul>
</form>
<small>왼쪽 클릭: 항목 완료 <br> 오른쪽 클릭: 해당 항목 삭제</small>
<script src="/script.js"></script>
</body>
</html>