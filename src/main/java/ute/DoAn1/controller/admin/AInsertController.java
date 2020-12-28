package ute.DoAn1.controller.admin;

import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Tinhlam.categoriesDAO;
import ute.DoAn1.service.ICategoriesService;

/**
 * Servlet implementation class AEditController
 */
@WebServlet(urlPatterns = {"/admin-insert"})
public class AInsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AInsertController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		String action = request.getParameter("action");
		
		switch (action) {
			case "add":
				RequestDispatcher rd = request.getRequestDispatcher("/views/admin/new/insert.jsp");
				rd.forward(request, response);
				break;
			case "insert":
				String name = request.getParameter("Name");
				String parent_id = request.getParameter("Parent_id");
				categoriesDAO dao = new categoriesDAO();
				dao.insertOne(name, parent_id);
				RequestDispatcher rd1 = request.getRequestDispatcher("/views/admin/new/list.jsp");
				rd1.forward(request, response);
				break;
		}		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

