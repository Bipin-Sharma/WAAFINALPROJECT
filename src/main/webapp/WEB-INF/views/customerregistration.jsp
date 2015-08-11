<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<style type="text/css">
fieldset {
	border-radius: 5px;
	width: 750px;
	margin: auto;
	margin-top: 50px;
	border: 2px solid #6E6E6E;
	margin-bottom: 50px;
}

.formlabel {
	display: block;
	margin-left: 20px;
	min-width: 100px;
	float: left;
	margin-top: 4px;
	clear: left;
}

.forminput {
	display: inline-block;
	float: left;
	margin-top: 4px;
	min-width: 300px;
}

.formerror {
	display: inline-block;
	color: red;
	border: 1px solid red;
	background-color: #F6CED8;
	border-radius: 3px;
	min-width: 300px;
	clear: right;
	margin-top: 4px;
	margin-left: 4px;
	min-height: 20px;
}

button {
	display: block;
	clear: both;
	margin-left: 20px;
	margin-bottom: 30px;
}

legend {
	background-color: #FE980F;
	border-radius: 5px;
	border: 2px solid #6E6E6E;
	padding: 2px;
}
</style>

<fieldset>

	<legend> Apartment Registration</legend>


	<form:form commandName="customer" action="savecustomer" class="forminput">

		<form:label path="firstname" class="formlabel">FirstName </form:label>
		<form:input path="firstname" class="forminput" />

		<form:label path="lastname" class="formlabel">LastName</form:label>
		<form:input path="lastname" class="forminput" />


		<form:label path="userName" class="formlabel">UserName </form:label>
		<form:input path="userName" class="forminput" />

		<form:label path="password" class="formlabel">Password</form:label>
		<form:password path="password" class="forminput" />

		<form:label path="phone" class="formlabel">Phone</form:label>
		<form:input path="phone" class="forminput" />

</form:form>
</fieldset>