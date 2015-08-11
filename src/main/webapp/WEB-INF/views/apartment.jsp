<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>



<link rel="stylesheet" type="text/css"
	href="<spring:url value="/resource/css/style.css" />" />

<style type="text/css">
fieldset {
	border-radius: 5px;
	width: 750px;
	margin: auto;
	margin-top: 50px;
	border: 2px solid #6E6E6E;
	margin-bottom: 50px;
}

legend {
	background-color: #FE980F;
	border-radius: 5px;
	border: 2px solid #6E6E6E;
	padding: 2px;
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
</style>

<fieldset>

	<legend> Apartment Registration</legend>

	<form:form commandName="apartment" action="saveproperty" method = "post"
		class="forminput">

		<form:label path="numberOfBedroom" class="formlabel">Number of Bedroom </form:label>
		<form:input path="numberOfBedroom" class="forminput"  placeholder = "Numberofbedroom" />

		<form:label path="numberOfRoom" class="formlabel">Number of Room       </form:label>
		<form:input path="numberOfRoom" class="forminput" placeholder = "NumberofRoom"/>

		<form:label path="yearOfConstruction" class="formlabel">Year of construction</form:label>
		<form:input path="yearOfConstruction" class="forminput" placeholder = "YearofConstruction"/>

		<form:label path="availableDate" class="formlabel">Available Date</form:label>
		<form:input path="availableDate" class="forminput" placeholder = "availableDate"/>

		<form:label path="typeOf" class="formlabel">Type Of             </form:label>
		<form:input path="typeOf" class="forminput" placeholder = "Type" />

		<form:label path="address.street" class="formlabel">Street       </form:label>
		<form:input path="address.street" class="forminput" placeholder = "Address.Street"/>

		<form:label path="address.city" class="formlabel">City           </form:label>
		<form:input path="address.city" class="forminput" placeholder = "Address.city" />

		<form:label path="address.zipCode" class="formlabel">ZipCode      </form:label>
		<form:input path="address.zipCode" class="forminput" placeholder = "Address.zipCode" />

		<form:label path="amenities" class="formlabel">Amenities </form:label>
		<form:input path="amenities" class="forminput" placeholder = "amenities" />

		<button class="btn-primary">Register</button>

	</form:form>

</fieldset>