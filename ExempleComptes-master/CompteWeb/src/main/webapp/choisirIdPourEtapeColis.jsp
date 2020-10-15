<%--
  Created by IntelliJ IDEA.
  User: thibault
  Date: 06/10/2020
  Time: 19:16
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
<div><h1>Numéro du colis dont vous voulez visualiser les étapes</h1></div>
<div>
    <form action="SuivreEtapeColisServlet" method="post" class="form">
        <div >
            <input type="text" name="id" id="id" >
            <label for="id">Identifiant colis</label>

        </div>
        <input type="submit" value="chercher">
    </form>
</div>
</body>
</html>
