
<%@page import="servlets.ControleLogin"%>

<!-- evita o acesso direto sem login -->
<!-- coloque o código abaixo em todos os módulos JSP do seu projeto -->

<% if(!ControleLogin.testaAcesso(request, response))
    response.sendRedirect("."); // volta ao login
%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilos.css" rel="stylesheet" type="text/css"/>
        <title>Exemplo de Controle de Login</title>
    </head>
    <body>
        <form id="centralizar" name="horoscopo" action="ControleHoroscopo">
            <br><br><img src="calendario.png"><br>
            <br><input id="data" required name="nascimento" type="date">
            
            <br><br><br><br>
            <div id="div">
                <input id="novoB" type="submit" value="Previsão">
                <a id="button1" href="ControleLogin?acao=logout">Clique aqui para deslogar</a>
            </div>
        </form>
    </body>
</html>
