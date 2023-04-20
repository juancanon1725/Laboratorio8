package edu.eci.cvds.servlet;
import java.io.IOException;
import java.io.Writer;
import java.util.Optional;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import edu.eci.cvds.servlet.model.Todo;
import java.util.List;
import java.util.ArrayList;
import java.net.MalformedURLException;
import java.lang.NumberFormatException;
import java.io.FileNotFoundException;

@WebServlet(
        urlPatterns = "/anotherServlet"
)
public class AnotherServlet extends HttpServlet{
    static final long serialVersionUID = 36L;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Writer responseWriter = resp.getWriter();
        try {
            int todoId = Integer.parseInt(req.getParameter("id"));
            Service serv = new Service();
            Todo responseTodo = serv.getTodo(todoId);
            List<Todo> listaTodos = new ArrayList<Todo>();
            listaTodos.add(responseTodo);
            String htmlTable = serv.todosToHTMLTable(listaTodos);
            resp.setStatus(HttpServletResponse.SC_OK);
            responseWriter.write(htmlTable);
        }
        catch (MalformedURLException e) {
            resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        }
        catch (FileNotFoundException e) {
            resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
            responseWriter.write("<h1>No existe un item con el identificador dado.</h1>");
        }
        catch (NumberFormatException e) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            responseWriter.write("<h1>No se ha ingresado un numero valido de id.</h1>");
        }
        catch (Exception e) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Writer responseWriter = resp.getWriter();
        try {
            int todoId = Integer.parseInt(req.getParameter("id"));
            Service serv = new Service();
            Todo responseTodo = serv.getTodo(todoId);
            List<Todo> listaTodos = new ArrayList<Todo>();
            listaTodos.add(responseTodo);
            String htmlTable = serv.todosToHTMLTable(listaTodos);
            resp.setStatus(HttpServletResponse.SC_OK);
            responseWriter.write(htmlTable);
        }
        catch (MalformedURLException e) {
            resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        }
        catch (FileNotFoundException e) {
            resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
            responseWriter.write("<h1>No existe un item con el identificador dado.</h1>");
        }
        catch (NumberFormatException e) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            responseWriter.write("<h1>No se ha ingresado un numero valido de id.</h1>");
        }
        catch (Exception e) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        }
    }
}