/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author joao
 */
@WebServlet(name = "ControleHoroscopo", urlPatterns = {"/ControleHoroscopo"})
public class ControleHoroscopo extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    String partes[];
    RandomAccessFile arq = null; 
    String previsao = "";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        try (PrintWriter out = response.getWriter()) 
        {
            partes = request.getParameter("nascimento").split("-");
            int dia = Integer.parseInt(partes[2]);
            int mes = Integer.parseInt(partes[1]);
            //out.println("Dia: "+dia);
            //out.println("Mês: "+mes);
            if(mes == 3 && dia >= 21 || mes == 4 && dia <= 20)
            {
                //aries
                BufferedReader textoBuffer = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\horoscopo.txt"), "UTF-8"));
                previsao = textoBuffer.readLine();
                out.println(html.TOPO);
                out.println("<div class='container'");
                out.println("<div class='jumbotron'>");
                out.println("<h1>Sua previsão</h1>");
                out.println("<img src='aries.png'>");
                out.println("<br><br><p>"+previsao+"</p>");
                out.println("</div>");
                out.println(html.BASE);
            }
            if(mes == 4 && dia >= 21 || mes == 5 && dia <= 20)
            {
                //touro
                BufferedReader textoBuffer = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\horoscopo.txt"), "UTF-8"));
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                out.println(html.TOPO);
                out.println("<div class='container'");
                out.println("<div class='jumbotron'>");
                out.println("<h1>Sua previsão</h1>");
                out.println("<img src='touro.png'>");
                out.println("<br><br><p>"+previsao+"</p>");
                out.println("</div>");
                out.println(html.BASE);
                
            }
            if(mes == 5 && dia >=21 || mes == 6 && dia <=20)
            {
                //gemeos
                BufferedReader textoBuffer = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\horoscopo.txt"), "UTF-8"));
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                out.println(html.TOPO);
                out.println("<div class='container'");
                out.println("<div class='jumbotron'>");
                out.println("<h1>Sua previsão</h1>");
                out.println("<img src='gemeos.png'>");
                out.println("<br><br><p>"+previsao+"</p>");
                out.println("</div>");
                out.println(html.BASE);
            }
            if(mes == 6 && dia >= 21 || mes == 7 && dia <= 21)
            {
                //cancer
                BufferedReader textoBuffer = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\horoscopo.txt"), "UTF-8"));
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                out.println(html.TOPO);
                out.println("<div class='container'");
                out.println("<div class='jumbotron'>");
                out.println("<h1>Sua previsão</h1>");
                out.println("<img src='cancer.png'>");
                out.println("<br><br><p>"+previsao+"</p>");
                out.println("</div>");
                out.println(html.BASE);
            }
            if(mes == 7 && dia >= 22 || mes == 8 && dia <= 22)
            {
                //leao
                BufferedReader textoBuffer = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\horoscopo.txt"), "UTF-8"));
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                out.println(html.TOPO);
                out.println("<div class='container'");
                out.println("<div class='jumbotron'>");
                out.println("<h1>Sua previsão</h1>");
                out.println("<img src='leao.png'>");
                out.println("<br><br><p>"+previsao+"</p>");
                out.println("</div>");
                out.println(html.BASE);
            }
            if(mes == 8 && dia >= 23 || mes == 9 && dia <= 22)
            {
                //virgem
                BufferedReader textoBuffer = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\horoscopo.txt"), "UTF-8"));
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                out.println(html.TOPO);
                out.println("<div class='container'");
                out.println("<div class='jumbotron'>");
                out.println("<h1>Sua previsão</h1>");
                out.println("<img src='virgem.png'>");
                out.println("<br><br><p>"+previsao+"</p>");
                out.println("</div>");
                out.println(html.BASE);
            }
            if(mes == 9 && dia >= 23 || mes == 10 && dia <= 22)
            {
                //libra
                BufferedReader textoBuffer = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\horoscopo.txt"), "UTF-8"));
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                out.println(html.TOPO);
                out.println("<div class='container'");
                out.println("<div class='jumbotron'>");
                out.println("<h1>Sua previsão</h1>");
                out.println("<img src='libra.png'>");
                out.println("<br><br><p>"+previsao+"</p>");
                out.println("</div>");
                out.println(html.BASE);
            }
            if(mes == 10 && dia >= 23 || mes == 11 && dia <= 21)
            {
                //escorpiao
                BufferedReader textoBuffer = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\horoscopo.txt"), "UTF-8"));
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                out.println(html.TOPO);
                out.println("<div class='container'");
                out.println("<div class='jumbotron'>");
                out.println("<h1>Sua previsão</h1>");
                out.println("<img src='escorpiao.png'>");
                out.println("<br><br><p>"+previsao+"</p>");
                out.println("</div>");
                out.println(html.BASE);
            }
            if(mes == 11 && dia >= 22 || mes == 12 && dia <= 21)
            {
                //sagitario
                BufferedReader textoBuffer = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\horoscopo.txt"), "UTF-8"));
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                out.println(html.TOPO);
                out.println("<div class='container'");
                out.println("<div class='jumbotron'>");
                out.println("<h1>Sua previsão</h1>");
                out.println("<img src='sagitario.png'>");
                out.println("<br><br><p>"+previsao+"</p>");
                out.println("</div>");
                out.println(html.BASE);
            }
            if(mes == 12 && dia >= 22 || mes == 1 && dia <= 20)
            {
                //capricornio
                BufferedReader textoBuffer = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\horoscopo.txt"), "UTF-8"));
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                out.println(html.TOPO);
                out.println("<div class='container'");
                out.println("<div class='jumbotron'>");
                out.println("<h1>Sua previsão</h1>");
                out.println("<img src='capricornio.png'>");
                out.println("<br><br><p>"+previsao+"</p>");
                out.println("</div>");
                out.println(html.BASE);
            }
            if(mes == 1 && dia >= 21 || mes == 2 && dia <= 19)
            {
                //aquario
                BufferedReader textoBuffer = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\horoscopo.txt"), "UTF-8"));
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                out.println(html.TOPO);
                out.println("<div class='container'");
                out.println("<div class='jumbotron'>");
                out.println("<h1>Sua previsão</h1>");
                out.println("<img src='aquario.png'>");
                out.println("<br><br><p>"+previsao+"</p>");
                out.println("</div>");
                out.println(html.BASE);
            }
            if(mes == 2 && dia >= 20 || mes == 3 && dia <= 20)
            {
                //peixes
                BufferedReader textoBuffer = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\horoscopo.txt"), "UTF-8"));
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                previsao = textoBuffer.readLine();
                out.println(html.TOPO);
                out.println("<div class='container'");
                out.println("<div class='jumbotron'>");
                out.println("<h1>Sua previsão</h1>");
                out.println("<img src='peixes.png'>");
                out.println("<br><br><p>"+previsao+"</p>");
                out.println("</div>");
                out.println(html.BASE);
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
