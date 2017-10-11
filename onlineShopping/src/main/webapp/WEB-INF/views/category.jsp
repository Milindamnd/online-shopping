<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sf:form modelAttribute="category" action="category">
id :<sf:input path="id" id="id"/>
name :<sf:input path="name" id="name"/>
des  :<sf:input path="description" id="description"/>
image :<sf:input path="image_url" id="image_url"/>
active :<sf:input path="is_active" id="is_active"/>
<input type="submit" value="Save" >
</sf:form>
</body>
</html>