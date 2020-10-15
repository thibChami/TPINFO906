<%--
  Created by IntelliJ IDEA.
  User: thibault
  Date: 14/10/2020
  Time: 15:55
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
<div><h1>Modifier une étape à un de vos colis</h1></div>
<div>
    <form action="ModifierEtapeServlet" method="post" class="form">
        <div>
            <input type="text" value="" name="id_colis" id="id_colis" >
            <label for="id_colis">id colis</label>
        </div>
        <div>
            <input type="text" value="" name="id_etape" id="id_etape" >
            <label for="id_etape">id etape colis</label>
        </div>
        <div >
            <input  type="text" id="latitude" name="latitude">
            <label for="latitude">Latitude</label>
        </div>
        <div >
            <input type="text" id="longitude" name="longitude">
            <label for="longitude">Longitude</label>
        </div>
        <div>
            <input  type="text" id="emplacement" name="emplacement">
            <label for="emplacement">Emplacement</label>
        </div>
        <div >
            <label>Etat</label>
            <select name="etat">
                <option value="ENREGISTRE">ENREGISTRE</option>
                <option value="ENATTENTE">EN_ATTENTE</option>
                <option value="ENLIVRAISON">EN_LIVRAISON</option>
                <option value="LIVRER">LIVRER</option>
                <option value="BLOQUER">BLOQUER</option>
            </select>
        </div>
        <input type="submit" value="Modifier">
    </form>
</div>
</body>
</html>
