package servlets;

import com.book.basicTypes.BookList;
import com.book.managers.BookManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class ServletSearchAuthorTitle  extends HttpServlet {
    private BookManager manager;
    private BookList bookList;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String author = req.getParameter("author");
        String title = req.getParameter("title");
        bookList = manager.searchAuthorTitle(author, title);
        req.setAttribute("bookList", bookList);
        getServletContext().getRequestDispatcher("/allbooks.jsp").forward(req, resp);
    }

    @Override
    public void init() throws ServletException {
        super.init();
        manager = BookManager.getInstance();
    }
}
