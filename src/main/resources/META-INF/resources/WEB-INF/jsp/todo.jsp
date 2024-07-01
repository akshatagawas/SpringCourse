<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <head>
        <title>Add Todos Page</title>
        <link href="/webjars/bootstrap/5.3.3/css/bootstrap.min.css" rel="stylesheet">
        <link href="/webjars/bootstrap-datepicker/1.10.0/css/bootstrap-datepicker.standalone.min.css" rel="stylesheet">
    </head>
    <body>
        <div class="container">
            <h2>Enter Todo Details.</h2>
            <form:form method="post" modelAttribute="todo">

            <fieldset class="mb-3">
                <form:label path="description">Description</form:label>
                <form:input type="text" path="description" required="required"></form:input>
                <form:errors path="description" class="text-warning"/>
            </fieldset>

            <fieldset class="mb-3">
                <form:label path="targetDate">Target Date</form:label>
                <form:input type="text" path="targetDate" required="required"></form:input>
                <form:errors path="targetDate" class="text-warning"/>
            </fieldset>
                

                <form:input type="hidden" path="id"/>
                <form:input type="hidden" path="done"/>
                <input type="submit" class="btn btn-success">

            </form:form>
        </div>
        <script src="/webjars/bootstrap/5.3.3/js/bootstrap.min.js"></script>
        <script src="/webjars/jquery/3.7.1/jquery.min.js"></script>
        <script src="/webjars/bootstrap-datepicker/1.10.0/js/bootstrap-datepicker.min.js"></script>
        
        <script type="text/javascript">
        	$('#targetDate').datepicker({
        		format:'yyyy-mm-dd',
        		startDate: '-3d'
        	})
        </script>
    </body>
</html>

