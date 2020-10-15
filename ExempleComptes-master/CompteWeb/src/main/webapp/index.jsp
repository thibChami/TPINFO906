<%--
  Created by IntelliJ IDEA.
  User: thibault
  Date: 06/10/2020
  Time: 19:14
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
<div>
    <h1>Ajouter votre nouveau colis</h1>
</div>
<div>
    <form action="CreerColisServlet" method="post" class="form">
        <div>
            <input type="number" id="poids" name="poids">
            <label  for="poids">Poids</label>
        </div>
        <div>
            <input type="number" id="prix" name="prix">
            <label for="prix">Valeur</label>
        </div>
        <div>
            <input  type="text" id="origine" name="origine">
            <label for="origine">Origine</label>
        </div>
        <div>
            <input type="text" id="destination" name="destination">
            <label for="destination">Destination</label>
        </div>
        <input type="submit" value="Enregistrer" >
    </form>
</div>
</body>
</html>
