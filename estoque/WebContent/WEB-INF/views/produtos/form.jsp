<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de Produto</title>
</head>
<body>

	<form action="/estoque/produtos/salvar.html" method="post">
		Descricao: <input type="text" name="descricao" /> <form:errors path="produto.descricao" /><br />
		Quantidade: <input type="text" name="quantidade" /> <form:errors path="produto.quantidade" /><br />
		<input type="submit" value="Cadastrar" />
	</form>
</body>
</html>