<%--
  Created by IntelliJ IDEA.
  User: thibault
  Date: 23/09/2020
  Time: 19:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Affichage du colis</title>
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
    <h1>Affichage du colis</h1>
    <div>
        <h2>Informations colis :</h2>

        <p>identifiant : ${colis.id }</p>
        <p>poids : ${colis.poids } </p>
        <p>prix : ${colis.prix } </p>
        <p>origine : ${colis.origine } </p>
        <p>destination : ${colis.destination } </p>

    </div>
</div>
</body>
</html>
