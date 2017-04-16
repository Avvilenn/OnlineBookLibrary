package servlets;

import com.book.basicTypes.BookList;
import com.book.managers.BookManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SearchRandomWords extends HttpServlet {
    private BookManager manager;
    private BookList bookList;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String description = req.getParameter("description");
        bookList = manager.searchRandonWords(description);
        req.setAttribute("bookList", bookList);
        getServletContext().getRequestDispatcher("/allbooks.jsp").forward(req, resp);
    }

    @Override
    public void init() throws ServletException {
        super.init();
        manager = BookManager.getInstance();
    }
}
