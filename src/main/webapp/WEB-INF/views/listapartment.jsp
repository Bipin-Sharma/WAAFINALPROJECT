<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<link rel="stylesheet" type="text/css"
	href="<spring:url value="/resource/css/style.css"/>" />

<div id="main">

	<button onclick="add()" class="btn btn-success">ADD CATEGORY</button>

	<div id="table">

		<table style="width: 100%; text-align: center;">
			<thead>
				<tr class="cart_menu ">
					<td class="name" width="20%">Id</td>
					<td class="name" width="20%">Number of Bedroom</td>
					<td class="description" width="10%">Construction Year</td>
					<td class="descript" width="10%">Number of year</td>
					<td>Details</td>
					<td></td>
				</tr>
				</thead>
				<c:forEach items="${propertyList}" var="apartment"
					varStatus="loopCounter">
					<tr style="border: 1px solid black;" id="${apartment.id}">


						<td class="category_name"><c:out
								value="${ loopCounter.count}" />
						<td class="category_name"><c:out
								value="${ apartment.numberOfBedroom}" /></td>
						<td class="category_description"><c:out
								value="${category.numberOfRoom}" /></td>

						<td class="category_description"><c:out
								value="${category.yearOfConstruction}" /></td>
						<td class=""><a href="edit/${apartment.id}">Edit</a> <a
							href="delete/${apartment.id}">Delete </a></td>
					</tr>

				</c:forEach>
			</tbody>
		</table>
	</div>
</div>

<tbody>
</tbody>

<script type="text/javascript">
	
	function add(){
		 window.location.href='add';
	}
	</script>
	
