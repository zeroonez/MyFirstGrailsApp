<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
</head>

<body>
<div class="nav" role="navigation">
    <ul>
        <li><g:link class="create" action="create">Create new user</g:link></li>
    </ul>
</div>

<div id="list-user" class="content scaffold-list" role="main">
    <f:table collection="${userList}"
             properties="['userName', 'password']"/>
</div>
</body>
</html>