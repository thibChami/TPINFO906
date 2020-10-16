package fr.usmb.m2isc.javaee.comptes.web;

import fr.usmb.m2isc.javaee.comptes.EtatColis;
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
@WebServlet("/FormulaireModifierEtapeServlet")
public class FormulaireModifierEtapeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @EJB
    private EtapeColisOperation etapeColisOperation;
    @EJB
    private Operation operation;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormulaireModifierEtapeServlet() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        long id_etape = Long.parseLong(request.getParameter("id_etape"));

        request.setAttribute("idEtape", id_etape);

        request.getRequestDispatcher("/ModifierEtape.jsp").forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}