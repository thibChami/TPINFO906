<%--
  Created by IntelliJ IDEA.
  User: thibault
  Date: 06/10/2020
  Time: 17:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
    <header>
        <div>
            <!-- Title -->
            <h1>Progressions du colis</h1>
        </div>
    </header>
    <main>
        <div>
            <h2>Colis n°${colis.id }</h2>
        </div>
        <div>
            <table>
                <thead>
                <tr>
                    <th>Id de l'étape</th>
                    <th>Emplacement</th>
                    <th>Etat</th>
                    <th>Latitude</th>
                    <th>Longitude</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${listEtapeColis}" var="etapeColis">
                    <tr>
                        <td>${etapeColis.id}</td>
                        <td>${etapeColis.emplacement}</td>
                        <td>${etapeColis.etatColis}</td>
                        <td>${etapeColis.latitude}</td>
                        <td>${etapeColis.longitude}</td>
                        <td><a href="/CompteWeb/ModifierEtape.jsp">
                            <button>Modifier</button>
                        </a></td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </main>
</div>
</body>
</html>
