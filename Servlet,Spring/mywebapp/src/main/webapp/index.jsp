
<%@page import="java.util.Date"%>
<%!
	public void jspInit(){
		System.out.println("init");
	}
	public void jspDestroy(){
	System.out.println("destroy");
}
%>

<% 
	Date date =new Date();
%>
<html>
<body>
<h2>Hello World!</h2>
<h2>Current date and type</h2>
<h2><%=date %></h2>
</body>
</html>
