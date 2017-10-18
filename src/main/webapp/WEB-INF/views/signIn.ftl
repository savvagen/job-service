<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Register New user</title>

    <!-- CSS  -->
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link href="/resources/css/materialize.css" type="text/css" rel="stylesheet" media="screen,projection"/>
    <link href="/resources/css/style.css" type="text/css" rel="stylesheet" media="screen,projection"/>
</head>
<body>
<#include "templates/header.ftl">
<br>
<div class="col s6">
    <form name="signIn" action="/login" method="post">
        <div class="row s3">
            <label> User Name : <input type="text" name="username"/> </label>
        </div>
        <div class="row s3">
            <label> Password: <input type="password" name="password"/> </label>
        </div>
        <div>
            <input class="waves-light btn" type="submit" value="Sign In"/>
        </div>
    </form>
</div>
<br>
<#include "templates/footer.ftl">
<!--  Scripts-->
<script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
<script src="/resources/js/materialize.js"></script>
<script src="/resources/js/init.js"></script>
</body>
</html>