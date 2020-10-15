<%--
  Created by IntelliJ IDEA.
  User: thibault
  Date: 23/09/2020
  Time: 19:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Affichage des colis:</title>
</head>
<body>
<div class="navbar">
    <a href="/CompteWeb/">
        <button>Ajouter un colis</button>
    </a>
    <a href="/CompteWeb/AfficherTousColisServlet">
        <button>Visualiser les colis</button>
    </a>
    <a href="/CompteWeb/AjouterEtapeColis.jsp">
        <button>Ajouter une étape pour un colis</button>
    </a>
    <a href="/CompteWeb/choisirIdPourEtapeColis.jsp">
        <button>Visualiser les etapes d'un colis</button>
    </a>
</div>

<div class="container">
    <h1>Informations sur vos colis</h1>
    <div>
        <table>
            <thead>
            <tr>
                <th>id</th>
                <th>prix</th>
                <th>poids</th>
                <th>origine</th>
                <th>destination</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="colis" items="${listeColis}">
            <tr>
                <td>${colis.id}</td>
                <td>${colis.prix}</td>
                <td>${colis.poids}</td>
                <td>${colis.origine}</td>
                <td>${colis.destination}</td>
<%--                <td><a href="/CompteWeb/AfficherColisServlet?id=${colis.id}">--%>
<%--                    <button>Visualiser</button>--%>
<%--                </a></td>--%>
            </tr>
            </tbody>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>
