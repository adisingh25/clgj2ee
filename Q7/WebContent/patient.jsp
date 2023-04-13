<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="hospital" method="get">
		Patient Id : <input type="text" name="Id"/>
		Patient Name  : <input type="text" name="name" />
		Age : <input type="text" name="age" />
		Date of Admission : <input type="text" name="doa" />
		Cause of Admission : <input type="text" name="coa" />
		Doctor Diagnosed : <input type="text" name="doctor" />
		Treatment Proposed : <input type="text" name="treatment" />
		<input type="submit"/>
	</form>
</body>
</html>