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
<form class="col s12" action="/register"  name="user" method="post">

    <div class="row">
        <div class="input-field col s3">
            <input id="first_name" name="firstname" type="text" class="validate" minlength="3" maxlength="40" required>
            <label for="first_name" data-error="should be more than 3 characters" data-success="right">First Name</label>
        </div>
        <div class="input-field col s3">
            <input id="last_name" name="lastname" type="text" class="validate" minlength="3" maxlength="40" required>
            <label for="last_name" data-error="should be more than 3 characters" data-success="right">Last Name</label>
        </div>
    </div>
    <div class="row">
        <div class="input-field col s6">
            <input id="email" name="email" type="email" class="validate" required maxlength="40">
            <label for="email" data-error="incorrect email format" data-success="right">Email</label>
        </div>
    </div>
    <div class="row">
        <div class="input-field col s6">
            <input id="password" name="password" type="password" class="validate" minlength="6" maxlength="30" required>
            <label for="password" data-error="password should be more than 6 characters" data-success="right">Password</label>
        </div>
    </div>
    <div class="row">
        <div class="input-field col s3">
            <input id="telephone" name="telephone" type="text" class="validate" pattern="[0-9]{3}-[0-9]{3}-[0-9]{2}-[0-9]{2}" required>
            <label for="telephone" data-error="telephone format required: 097-547-57-17" data-success="right">Telephone</label>
        </div>
        <div class="input-field col s3">
            <input id="age" name="age" type="number" class="validate" min="1" maxlength="3" required>
            <label for="age" data-error="wrong" data-success="right">Age</label>
        </div>
    </div>
    <div class="waves-button-input center">
        <button type="submit"  class="waves-effect waves-light btn center">Register</button>
    </div>

    <#--<p>First Name</p>
    <input placeholder="Entrer First Name" name="firstname" type="text">
    <p>Last Name</p>
    <input placeholder="Entrer Last Name" name="lastname" type="text">
    <p>Email</p>
    <input placeholder="Entrer Email Address" name="email" type="email">
    <p>Password</p>
    <input placeholder="Entrer Password" name="password" type="password">
    <p>Telephone</p>
    <input placeholder="Entrer Telephone" name="telephone" type="text">
    <p>Age</p>
    <input placeholder="Entrer your Age" name="age" type="number">
    <button type="submit">Register</button>-->
<#--<table>
<tr>
    <td><a href="/hello">Back to Home</a></td>
    <td><a href="/users">Back to List</a> </td>
</tr>
</table>-->

</form>
<br>
<br>
<br>
<#include "templates/footer.ftl">

<!--  Scripts-->
<script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
<script src="/resources/js/materialize.js"></script>
<script src="/resources/js/init.js"></script>

</body>
</html>