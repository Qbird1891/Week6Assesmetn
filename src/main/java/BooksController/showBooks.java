package BooksController;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Helpers.BooksHelper;
import models.Books;

/**
 * Servlet implementation class showBooks
 */
@WebServlet("/showBooks")
public class showBooks extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showBooks() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		BooksHelper helper = new BooksHelper();
		List<Books> booklist = helper.showAllBooks();
		request.setAttribute("allBooks", booklist);
		String path = "/showBooks.jsp";
		
		getServletContext().getRequestDispatcher(path).forward(request, response);
		
	}

}
