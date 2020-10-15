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

@WebServlet("/ModifierEtapeServlet")
public class ModifierEtapeServlet extends HttpServlet{
    private static final long serialVersionUID = 1L;

    @EJB
    private EtapeColisOperation etapeColisOperation;
    @EJB
    private Operation operation;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifierEtapeServlet() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        long id = Long.parseLong(request.getParameter("id_colis"));
        final Colis colis = operation.findColisById(id);
        long id_etape = Long.parseLong(request.getParameter("id_etape"));
        float latitude = Float.parseFloat(request.getParameter("latitude"));
        float longitude = Float.parseFloat(request.getParameter("longitude"));
        String emplacement = request.getParameter("emplacement");
        EtatColis etat = EtatColis.valueOf(request.getParameter("etat"));

        etapeColisOperation.modifierEtapeColis(id_etape, emplacement, etat, latitude, longitude);

        final List<EtapeColis> listEtapeColis = etapeColisOperation.findEtapesColis(operation.findColisById(id));
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