<%--
  Created by IntelliJ IDEA.
  User: thibault
  Date: 16/10/2020
  Time: 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
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
    <h1>Affichage de l'étape</h1>
    <div>
        <h2>Informations étape:</h2>

        <p>identifiant : ${etape.id }</p>
        <p>poids : ${etape.latitude } </p>
        <p>prix : ${etape.longitude } </p>
        <p>origine : ${etape.emplacement } </p>
        <p>destination : ${etape.etatColis } </p>

    </div>
</div>
</body>
</html>
