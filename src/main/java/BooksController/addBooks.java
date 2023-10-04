package BooksController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Helpers.BooksHelper;
import models.Books;

/**
 * Servlet implementation class addBooks
 */
@WebServlet("/addBooks")
public class addBooks extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addBooks() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Books b = new Books();
		BooksHelper helper = new BooksHelper();
		b.setTitle(request.getParameter("title"));
		b.setAuthor(request.getParameter("author"));
		b.setCategory(request.getParameter("category"));
		b.setPublicationDate(Integer.valueOf(request.getParameter("publication date")));
		helper.persist(b);
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		
	}

}
