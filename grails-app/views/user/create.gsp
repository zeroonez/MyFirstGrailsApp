<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
</head>

<body>
<div id="create-user" class="content scaffold-create" role="main">
    <g:form resource="${this.user}" method="POST">
        <fieldset class="form">
            <f:all bean="user" order="userName, password"/>
        </fieldset>
        <fieldset class="buttons">
            <g:submitButton name="create" class="save" value="Create new user"/>
        </fieldset>
    </g:form>
</div>
</body>
</html>