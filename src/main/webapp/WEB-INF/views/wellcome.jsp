<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@page import="OAuth.VkAuth"%>
<%@ include file = "header.jsp"%> 
<% VkAuth tt = new VkAuth(); %>
<center>
WELLCOME PAGE

<div class="panel-body">

	<a href="<%=tt.startOAuth()%>" class="btn btn-primary navbar-btn"
						role="button">test Auth vk</a>	
						
	<a href="#" class="btn btn-primary navbar-btn"
						role="button">Button2</a>
						
	<a href="#" class="btn btn-primary navbar-btn"
						role="button">Button3</a>					
						
</div>
</center>

<%@ include file = "footer.jsp"%>