<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="tilesx" uri="http://tiles.apache.org/tags-tiles-extras"%>

 
<link rel="stylesheet" type="text/css"
	href="<spring:url value="/resource/css/menu-style.css"/>" />


<!-- script type="text/javascript">

	window.onload = function(){
	alert("${cssurl}");
}

</script-->
<div id='cssmenu'>
<ul>
   <li class="${current == 'welcome' ? 'active': ''}"><a href="<spring:url value='/home'/>"><span>Home</span></a></li>   
  	<li class="${current == 'welcome' ? 'active': ''}"><a href="<spring:url value='/property/'/>" ><span>ADDPROPERTY</span></a></li>
   	<li class="${current == 'welcome' ? 'active': ''}"><a href="<spring:url value='/products'/>" ><span>Products</span></a></li>
 </ul>
</div>