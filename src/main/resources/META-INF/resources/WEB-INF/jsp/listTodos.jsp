<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <title>List Todos Page</title>
        <link href="webjars/bootstrap/5.3.3/css/bootstrap.min.css" rel="stylesheet">

    </head>
    <body>
        <div class="container">
            <h2> Welcome to Todo list, ${name}!</h2>
            <hr>
            <h1>
                Your Todos are
            </h1>
            <table class="table">
                <thead>
                    <tr>
                        <th>Description</th>
                        <th>Target Date</th>  
                        <th>Status</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${todos}" var="todo">
                        <tr>
                            <td>${todo.description}</td>
                            <td>${todo.targetDate}</td>
                            <td>${todo.done}</td>
                            <td><a href="delete-todo?id=${todo.id}" class="btn btn-warning">DELETE</a></td>
                            <td><a href="update-todo?id=${todo.id}" class="btn btn-success">Update</a></td>
                        </tr>

                    </c:forEach>
                </tbody>
            </table>

            <a href="add-todo" class="btn btn-success">Add Todo</a>
        </div>
        
        
        <script src="webjars/bootstrap/5.3.3/js/bootstrap.min.js"></script>
        <script src="webjars/jquery/3.7.1/jquery.min.js"></script>
    </body>

</html>