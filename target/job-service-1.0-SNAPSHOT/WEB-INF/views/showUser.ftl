<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Personal Account</title>
</head>
<body>
<h1>User Info</h1>
<br>
<table>
    <tr>
        <td>Id</td>
        <td>${user.user_id}</td>
    </tr>
    <p></p>
    <tr>
        <td>User Name</td>
        <td>${user.firstname} ${user.lastname}</td>
    </tr>
    <p></p>
    <tr>
        <td>Contact Email</td>
        <td>${user.email}</td>
    </tr>
    <p></p>
    <tr>
        <td>Contact Telephone</td>
        <td>${user.telephone}</td>
    </tr>
    <p></p>
    <tr>
        <td>Age</td>
        <td>${user.age}</td>
    </tr>
</table>
<p></p>
<a href="/users">Back</a>


</body>
</html>