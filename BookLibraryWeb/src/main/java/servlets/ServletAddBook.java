package servlets;

import com.book.basicTypes.Book;
import com.book.managers.BookManager;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class ServletAddBook extends HttpServlet {
    private BookManager manager;
    private Book book;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        boolean isMultipart = ServletFileUpload.isMultipartContent(request);
        if (!isMultipart) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }

        DiskFileItemFactory factory = new DiskFileItemFactory();
        factory.setSizeThreshold(1024*1024);
        File tempDir = (File)getServletContext().getAttribute("javax.servlet.context.tempdir");
        factory.setRepository(tempDir);
        ServletFileUpload upload = new ServletFileUpload(factory);
        try {
            List items = upload.parseRequest(request);
            Iterator iter = items.iterator();

            while (iter.hasNext()) {
                FileItem item = (FileItem) iter.next();

                if (item.isFormField()) {
                    //если принимаемая часть данных является полем формы
                    if (item.getFieldName().equals(new String("author"))){
                        book.setAuthor(item.getString());
                    } else if (item.getFieldName().equals(new String("title"))) {
                        book.setTitle(item.getString());
                    }  else if (item.getFieldName().equals(new String("isbn"))) {
                        book.setIsbn(item.getString());
                    } else if (item.getFieldName().equals(new String("description"))) {
                        book.setDescription(item.getString());
                    }
                } else {
                    if (item.getFieldName().equals(new String("bookText"))){
                        File uploadetFile = null;
                        do{
                            String path = getServletContext().getRealPath("/upload/"+book.getTitle()+book.getIsbn());
                            uploadetFile = new File(path);
                        }while(uploadetFile.exists());
                        uploadetFile.createNewFile();
                          item.write(uploadetFile);
                          book.setBookText(uploadetFile);
                    } else if (item.getFieldName().equals(new String("coverImage"))) {
                        File uploadetFile2 = null;
                        do{
                            String path = getServletContext().getRealPath("/upload/"+book.getTitle()+book.getIsbn()+"cover");
                            uploadetFile2 = new File(path);
                        }while(uploadetFile2.exists());
                        uploadetFile2.createNewFile();
                        item.write(uploadetFile2);
                        book.setCoverImage(uploadetFile2);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            return;
        }
        Long id = manager.addBook(book);
        if (id==null) {
            String result = "Some error happends, please try again! book wasn't added. ";
            request.setAttribute("resultOfAdd", result);
            getServletContext().getRequestDispatcher("/booksaved.jsp").forward(request, response);
        } else {
            String result = "Your book was succesfully added in online library. Id =" + id;
            request.setAttribute("resultOfAdd", result);
            getServletContext().getRequestDispatcher("/booksaved.jsp").forward(request, response);
        }
    }


    @Override
    public void init() throws ServletException {
        super.init();
        manager = BookManager.getInstance();
        book = new Book();
    }
}
