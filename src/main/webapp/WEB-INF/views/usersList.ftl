<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>Users list</h1>
<br>
<a href="/signUp">Register</a>
<p></p>
<table>
    <tr>
        <th>Id</th>
        <th>FirstName</th>
        <th>LastName</th>
        <th>Email</th>
        <th>Telephone</th>
        <th>Age</th>
        <th>Status</th>
        <th>Actions</th>
    </tr>
<#list users as user>
    <tr>
        <td><a href="/user/${user.user_id}">${user.user_id}</a></td>
        <td>${user.firstname}</td>
        <td>${user.lastname}</td>
        <td>${user.email}</td>
        <td>${user.telephone}</td>
        <td>${user.age}</td>
        <td>${user.status}<#--<#if user.status = 1>
            Online
        <#elseif user.status = 2>
            Offline
        </#if><--></td>
        <td><a href="/user/${user.user_id}">View</a></td>
        <td><a href="/update/${user.user_id}">Update</a></td>
        <td><a href="/delete/${user.user_id}">Delete</a></td>
       <#-- <td>
            <form action="/user/${user.user_id}" method="get">
                <button type="submit">Open</button>
            </form>
            <form action="/delete/${user.user_id}" method="get">
                <button>Delete</button>
            </form>
        </td>-->

    </tr>
</#list>
</table>
<p></p>
<a href="/hello">Back to Home</a>
<p></p>
</body>
</html>