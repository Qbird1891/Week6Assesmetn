package LibraryController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Helpers.LibraryHelper;
import models.Library;

/**
 * Servlet implementation class addLibrary
 */
@WebServlet("/addLibrary")
public class addLibrary extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addLibrary() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Library l = new Library();
		LibraryHelper helper = new LibraryHelper();
		l.setNameOfLibrary(request.getParameter("nameOfLibrary"));
		l.setAddress(request.getParameter("address"));
		helper.persist(l);
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		
	}

}
