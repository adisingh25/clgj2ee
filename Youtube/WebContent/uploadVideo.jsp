<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to Youtube!!</h1><br>
<h2>You can now upload videos from here!!</h2><br>
	<form action="youtube" method="get">
		Channel Id : <input type="text" name="Id"/><br>
		PlayList : 
		<select name="playlist">
			<option>Playlist 1</option>
			<option>Playlist 2</option>
			<option>Playlist 3</option>
			<option>Playlist 4</option>
		</select><br>
		Title of the Video  : <input type="text" name="title" /><br>
		Creator Name  : <input type="text" name="name" /><br>
		Length of the video in minutes : <input type="text" name="length" /><br>
		Background Song Credit  : <input type="text" name="song" /><br>
		Age Limit : 
		<select name="AgeLimit"><br>
			<option><10 yrs</option>
			<option>11-18 yrs</option>
			<option>18 yrs > </option>
		</select><br>
		Description : <input type="text" name ="description" /><br>
		<input type="submit"/><br>
	</form>
</body>
</html>