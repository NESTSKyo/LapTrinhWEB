package ute.DoAn1.controller.admin;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Tinhlam.categories;
import Tinhlam.categoriesDAO;
import ute.DoAn1.service.ICategoriesService;


/**
 * Servlet implementation class AEditController
 */
@WebServlet(urlPatterns = {"/admin-edit"})
public class AEditController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AEditController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		String action = request.getParameter("action");
		
		switch (action) {
			case "update":
				String id = request.getParameter("id");	
				categories cat = new categories();
				categoriesDAO dao = new categoriesDAO();
				cat = dao.findID(id);
				request.setAttribute("cat", cat);
				RequestDispatcher rd = request.getRequestDispatcher("/views/admin/new/edit.jsp");
				rd.forward(request, response);
				break;
			case "edit":
				String id1 = request.getParameter("iD");	
				String name = request.getParameter("name");
				String parent_id = request.getParameter("parent_id");
				categoriesDAO dao1 = new categoriesDAO();
				dao1.editOne(id1, name, parent_id);
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
