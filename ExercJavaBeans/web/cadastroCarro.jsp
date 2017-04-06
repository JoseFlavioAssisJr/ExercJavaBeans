<%-- 
    Document   : cadastroCarro
    Created on : 05/04/2017, 22:09:43
    Author     : José Flávio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
    </head>
    <body>
        <h2>Cadastro</h2>
        <p>Placa: <input type="text" name="Placa" value="" size="10" /></p>
        <p>Nome: <input type="text" name="Nome" value="" size="20" /></p>
        <p>Marca: <input type="text" name="Marca" value="" size="10" /></p>
        <p>Modelo: <input type="text" name="Modelo" value="" size="10" /></p>
        <p>Preço: <input type="text" name="Preço" value="" size="5" /></p>
        <p>Valor da diária do aluguel: <input type="text" name="Valor Diária" value="" size="5" /></p>
        <p>Dias de locação: <input type="text" name="Dias Locação" value="" size="3" /></p>
        <p>Situação: <select >
            <option></option>    
            <option>Locado</option>
            <option>Não locado</option>
        </select></p>
        <input type="submit" value="Cadastrar" />
        <input type="reset" value="Limpar" />
    </body>
</html>
