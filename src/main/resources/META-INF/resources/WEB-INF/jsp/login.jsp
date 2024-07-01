<html>
    <head>
        <title>Login Web App</title>
        <link href="webjars/bootstrap/5.3.3/css/bootstrap.min.css" rel="stylesheet">

    </head>
    <body>
        <div class="container">
            <h2> Login!</h2>
            <pre>${errorMessage}</pre>
            <form method="post">
                Name: <input type="text" name="name">
                Password: <input type="password" name="password">
                <input type="submit">
    
            </form>
        </div>
        <script src="webjars/bootstrap/5.3.3/js/bootstrap.min.js"></script>
        <script src="webjars/jquery/3.7.1/jquery.min.js"></script>
    </body>
</html>