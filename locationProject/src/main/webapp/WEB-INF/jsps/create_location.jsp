<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create location</title>
</head>
<body>
		<h1>Location | Add new location</h1>
		<form action="saveLocation" method="post">
			<pre>
			ID <input type="text" name="id"/>
			Name <input type="text" name="name"/>
			Code <input type="text" name="codes"/>
			Type :
				Urban <input type="radio" value="urban" name="type"/>
				Rular <input type="radio" value="rular" name="type"/>
			<input type="submit" value="Save"/>			
		</pre>
		</form>
</body>
</html>