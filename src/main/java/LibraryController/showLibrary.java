package LibraryController;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Helpers.LibraryHelper;
import models.Library;

/**
 * Servlet implementation class showLibrary
 */
@WebServlet("/showLibrary")
public class showLibrary extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showLibrary() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		LibraryHelper helper = new LibraryHelper();
		List<Library> librarylist = helper.showAllLibrary();
		request.setAttribute("allLibrarys", librarylist);
		String path = "/showLibrary.jsp";
		getServletContext().getRequestDispatcher(path).forward(request, response);
	}

}
