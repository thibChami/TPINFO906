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
@WebServlet("/CreerColisServlet")
public class CreerColisServlet extends HttpServlet {

    private static final long serialVersionUID = 5236668439173484090L;
    @EJB
    private Operation op;


    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreerColisServlet() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float poids = Float.parseFloat(request.getParameter("poids"));
        float prix = Float.parseFloat(request.getParameter("prix"));
        String origine = request.getParameter("origine");
        String destination = request.getParameter("destination");


        Colis colis = op.createColis(origine,destination,poids,prix);
        request.setAttribute("colis", colis);
        request.getRequestDispatcher("/AfficherColis.jsp").forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}