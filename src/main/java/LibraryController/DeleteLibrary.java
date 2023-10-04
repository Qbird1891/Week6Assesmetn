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
 * Servlet implementation class DeleteLibrary
 */
@WebServlet("/deleteLibrary")
public class DeleteLibrary extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteLibrary() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		LibraryHelper helper = new LibraryHelper();
		String nameOfLibrary = request.getParameter("nameOfLibrary");
		Library deletable = helper.searchLibraryByName(nameOfLibrary);
		helper.delete(deletable);
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
