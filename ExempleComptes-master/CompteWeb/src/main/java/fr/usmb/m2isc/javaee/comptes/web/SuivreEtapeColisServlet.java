package fr.usmb.m2isc.javaee.comptes.web;

import fr.usmb.m2isc.javaee.comptes.ejb.EtapeColisOperation;
import fr.usmb.m2isc.javaee.comptes.ejb.Operation;
import fr.usmb.m2isc.javaee.comptes.jpa.Colis;
import fr.usmb.m2isc.javaee.comptes.jpa.EtapeColis;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/SuivreEtapeColisServlet")
public class SuivreEtapeColisServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @EJB
    private EtapeColisOperation progressionOperation;

    @EJB
    private Operation colisOperation;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SuivreEtapeColisServlet() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, IOException {
        long colisId = Long.parseLong(request.getParameter("id"));
        final Colis colis = colisOperation.findColisById(colisId);
        final List<EtapeColis> listEtapeColis = progressionOperation.findEtapesColis(colis);
        request.setAttribute("listEtapeColis", listEtapeColis);
        request.setAttribute("colis", colis);
        request.getRequestDispatcher("/SuivreEtapeColis.jsp").forward(request, response);

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}
