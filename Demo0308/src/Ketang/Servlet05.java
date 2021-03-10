package Ketang;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet(name = "Servlet05",urlPatterns = "/servlet05.do")
public class Servlet05 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        OutputStream outputStream = response.getOutputStream();

        File file = new File("F:\\java\\1.jpg");
        response.setHeader("content-disposition","attachment;fileName="+new String("教我学java.jpg".getBytes("utf-8"),"ISO8859-1"));

        InputStream inputStream = new FileInputStream(file);
        byte[] buffer = new byte[1024];
        int length = 0 ;
        while ((length = inputStream.read(buffer))!=-1){
            outputStream.write(buffer);
            outputStream.flush();
        }
        inputStream.close();
        outputStream.close();


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doPost(request, response);
    }
}
