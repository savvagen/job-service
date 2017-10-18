<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form name="user" action="/update" method="post">
    <#--<p>Id</p>-->
    <input name="user_id" type="text" value="${user.user_id}" style="display: none"  >
    <p>First Name</p>
    <input name="firstname" type="text" value="${user.firstname}">
    <p>Last Name</p>
    <input name="lastname" type="text" value="${user.lastname}">
    <p>Email</p>
    <input name="email" type="email" value="${user.email}">
    <p>Password</p>
    <input name="password" type="password" value="${user.password}">
    <p>Telephone</p>
    <input name="telephone" type="text" value="${user.telephone}">
    <p>Age</p>
    <input name="age" type="number" value="${user.age}">
    <p>Status</p>
        <select id="status" name="status" value="${user.status}">
            <#list status as s>
                <option value="#{s.status_id}">${s.status}</option>
            </#list>
        </select>
    <p></p>
    <button type="submit">Update</button>
</form>
<table>
    <tr>
        <td><a href="/hello">Back to Home</a></td>
        <td><a href="/users">Back to List</a> </td>
    </tr>
</table>
</body>
</html>