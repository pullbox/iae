<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="g" uri="http://gurn/alpha"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Input</title>
</head>
<body>
<a href="${pageContext.request.contextPath}">home</a>
<br>

<f:view>
	<h:form id="frm">
		<g:input jsf-id="pw" jsf-tag="span"
			jsf-in="#{password}"
			jsf-value="#{password}">
			<f:validator validatorId="pwvalidator"/>
			<g:template jsf-escape="#{false}">
			Password:
			<input type="password" id="password" name="password" >
			<br>
			Confirm:
			<input type="password" id="confirmation" name="confirmation" >
			</g:template>
		</g:input>
		
		<br>
		<h:commandButton value="submit" />
		<br>
		<h:messages />
		
		<br>
		
	</h:form>
</f:view>
</body>
</html>