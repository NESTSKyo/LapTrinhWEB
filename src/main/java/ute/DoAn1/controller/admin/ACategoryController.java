package ute.DoAn1.controller.admin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Tinhlam.categories;
import Tinhlam.categoriesDAO;

/**
 * Servlet implementation class ACategoryController
 */
@WebServlet(urlPatterns = { "/admin-category" })
public class ACategoryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ACategoryController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		List<categories> lsp = new ArrayList<categories>();
		categoriesDAO cat = new categoriesDAO();
		lsp = cat.getAllP();
		request.setAttribute("catP", lsp);
		
		List<categories> lsc = new ArrayList<categories>();
		lsc = cat.getAllC();
		request.setAttribute("catC", lsc);
		
		RequestDispatcher rd = request.getRequestDispatcher("/views/admin/new/list.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
