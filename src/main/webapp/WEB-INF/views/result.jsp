<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@page import="servlets.OAuthResult"%>
<%@page import="OAuth.VkAuth"%>
<%@ include file = "header.jsp"%> 
<% VkAuth tt = new VkAuth(); %>


<center>
OAUTH PAGE<br>
<br>

result 1<br>
result 2<br>

<%String code = request.getParameter("code");%> 
<%=code%>
<br><br>

<div class="panel-body">

	<a href="<%=tt.startOAuthToken(code)%>" class="btn btn-primary navbar-btn"
				role="button">Token</a>	
						
</div>


</center>

<%@ include file = "footer.jsp"%>