
package Ver;

import Control.ControleCandidato;
import Modelo.Candidato;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Modelo.CandidatoDAO;
import java.util.Map;
import javax.servlet.RequestDispatcher;

public class CandidatoFC extends HttpServlet {
   
    private final ControleCandidato controleCandidato = new ControleCandidato();

    //@Override
    /*protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        try (PrintWriter out = resp.getWriter()) {
            
            if (request.getParameter("insert") != null) {
                renderInsertPage(out);
                return;
            } else if (request.getParameter("update") != null) {
                
            } else if (request.getParameter("delete") != null) {
                
            } else {
                // ???
            }
            
        }
        catch(IOException ex){
            System.out.println(ex);
        }
    }*/
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try (PrintWriter out = response.getWriter()) {
            
            if(request.getParameter("search") != null){
                
                //response.s
                //request.setAttribute("cpf", request.getParameter("searchcpf"));
                //response.sendRedirect("control.jsp?aftersearch=aftersearch&update=update&cpf=" + request.getParameter("searchcpf"));
                
                request.setAttribute("cpf", request.getParameter("searchcpf"));

                RequestDispatcher rd = request.getRequestDispatcher("control.jsp?aftersearch=aftersearch&update=update&cpf=" + request.getParameter("searchcpf"));
                rd.forward(request,response);
            }
            else if(request.getParameter("update") != null){
                
                return;
            }
            else {
                String cpf = request.getParameter("cpf"); 
                String identidade = request.getParameter("identidade");
                String nome = request.getParameter("nome");
                String sexo = request.getParameter("sexo");
                String orgao = request.getParameter("orgao");
                String email = request.getParameter("email");
                String data = request.getParameter("data");
                String expedicao = request.getParameter("expedicao");
                String uf = request.getParameter("uf");
                String telefone = request.getParameter("telefone");
                String vaga = request.getParameter("vaga");
                String valorVaga = "";

                switch(vaga){
                    case "1":
                        valorVaga = "Tecnico de Desenvolvimento Web";
                        break;
                    case "2":
                        valorVaga = "Analista de Suporte";
                        break;
                    case "3":
                        valorVaga = "Administrador de Rede";
                        break;
                    case "4":
                        valorVaga = "Analista de Banco de Dados";
                        break;
                    default:


                }

                //Date d = new Date(data);
                Candidato cadastro = new Candidato(cpf,identidade,telefone,valorVaga,nome,orgao,email,data,expedicao,sexo,uf);
                CandidatoDAO.Inserir(cadastro);
                response.sendRedirect("/TrabalhoMVC"); //redireciona pra main page
            }
        }
        catch(IOException ex){
            PrintWriter out = response.getWriter();
            out.println(ex.toString());
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
    }
    
    
 
    
    
   
   
    /*protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try { 
            String acao = request.getParameter("acao");
            acao = (acao == null) ? "L" : acao;
            if (acao.equals("IX")) {
                Integer cpf = new Integer(request.getParameter("cpf"));
                String nome = request.getParameter("nome");
                Date data = new Date(request.getParameter("data"));
                String sexo = request.getParameter("sexo"); //Lista//
                Integer identidade = new Integer(request.getParameter("identidade"));
                String orgao = request.getParameter("orgao");
                String UF = request.getParameter("UF"); //Lista//
                Date expedicao = new Date(request.getParameter("expedicao"));
                Integer telefone = new Integer(request.getParameter("telefone"));
                String email = request.getParameter("email");
                String vaga = request.getParameter("vaga");
                controleCandidato.incluir(cpf, nome, data, sexo, identidade, orgao, UF, expedicao, telefone, email, vaga);
            }
            if (!acao.equals("I")) {
                  request.setAttribute("", controleCandidato.obterTodos());
            }
          String pagDestino = (acao.equals("I")) ? "" : "";
          request.getRequestDispatcher(pagDestino).forward(request, response);
        }catch (IOException | NumberFormatException | ServletException ex) {
            System.out.println(ex.getMessage());
        }
    } */
}