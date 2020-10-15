package fr.usmb.m2isc.javaee.comptes.web;
import fr.usmb.m2isc.javaee.comptes.ejb.Operation;
import fr.usmb.m2isc.javaee.comptes.jpa.Colis;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


/**
 * Servlet utilisee pour afficher un compte.
 */
@WebServlet("/AfficherColisServlet")
public class AfficherColisServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

	@EJB
	private Operation colisOperation;


    /**
     * @see HttpServlet#HttpServlet()
     */
    public AfficherColisServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final List<Colis> colis = colisOperation.findAllColis();
		request.setAttribute("colis", colis);
		request.getRequestDispatcher("/AfficherColis.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
