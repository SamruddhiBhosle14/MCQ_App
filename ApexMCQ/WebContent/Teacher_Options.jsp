<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="first.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>

	<%!
	String[] q_papers;
	String paper = "j";
	%>
	<input type="hidden" name="hidden_var" value="myValue">
				<script type="text/javascript">
	
				function display(a){
						
						document.getElementsByName("hidden_var").value = a;
						
						
					}
				</script>
				

		Already Existing Tests:<br>
		<% 
			 q_papers = Databases.Total_Tables();
			 for(int i=0;i<q_papers.length;i++){
			
				 out.println("<input type=\"button\" value="+q_papers[i]+" onClick=\"display(\'"+q_papers[i]+"\')\"><br>");
				
			}
			 
			 
		%>
		<br><br><br><br>
		<form action="Make_test.jsp">
			<input type="submit" value="Make a test">
		</form>
</body>
</html>