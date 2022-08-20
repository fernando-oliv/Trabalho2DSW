package br.ufscar.dc.dsw.controller;

import java.io.IOException;
import java.util.List;
import java.sql.Timestamp;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import br.ufscar.dc.dsw.domain.Usuario;
import br.ufscar.dc.dsw.domain.Cliente;
import br.ufscar.dc.dsw.domain.Agencia;
import br.ufscar.dc.dsw.dao.IAgenciaDAO;
import br.ufscar.dc.dsw.dao.IClienteDAO;
import br.ufscar.dc.dsw.dao.IUsuarioDAO;

@Controller
@RequestMapping("/admin")
public class AdminController {

   
    private IUsuarioDAO udao; 

    @GetMapping("/listar")
    private String lista(ModelMap model) {
        List<Usuario> listaUsuarios = udao.findAll();
        model.addAttribute("usuarios", listaUsuarios);
        return "admin/lista";
    }

    /*
    @PostMapping("/remover/{id}")
    private void removeUsuario(@PathVariable("id")  Long id, ModelMap model){

        Usuario usuario = udao.getById(id);
        if (usuario.getTipo().equals("Cliente")) {
            Cliente cliente = cdao.getById(usuario.getId());
            cdao.delete(cliente);
        }
        else if (usuario.getTipo().equals("Agencia")) {
            Agencia agencia = adao.getById(usuario.getId());
            adao.delete(agencia);
        }
        model.addAttribute("sucess", "usuario.delete.sucess");
        return listar(model);
    }
    
    
    @PostMapping("/editar")
    public String editar(@PathVariable("id") Long id, ModelMap model) {

        if (usuario.getTipo().equals("Cliente")) {
            Cliente cliente = cdao.getById(id);

            model.setAttribute("cliente", cliente);
            return "admin/ClienteEditar"; 
        }
        else if (usuario.getTipo().equals("Agencia")) {
            Agencia agencia = adao.getById(id);
            model.setAttribute("agencia", agencia);
            return "admin/AgenciaEditar";
        }
    }

    private void updateCliente(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        
        Erro erros = new Erro();
        
       
        Long id = Long.parseLong(request.getParameter("id")); 
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String cpf = request.getParameter("cpf");
        String telefone = request.getParameter("telefone"); 
        String sexo = request.getParameter("sexo"); 
        String dataNascimentoParam = request.getParameter("data-nascimento");
        String senha = request.getParameter("senha");
        String confirmarSenha = request.getParameter("confirmar-senha");
    
        Timestamp dataNascimento = null;
    
        if (dataNascimentoParam != null && !dataNascimentoParam.isEmpty()) {
            try {
                DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                Date date = formatter.parse(dataNascimentoParam);
                dataNascimento = new Timestamp(date.getTime());
            } catch (java.text.ParseException e) {
                erros.add(e.toString());
                request.setAttribute("mensagens", erros);
                RequestDispatcher rd = request.getRequestDispatcher("/erro.jsp");
                rd.forward(request, response);
            }
        }
        if (!senha.contentEquals(confirmarSenha)) {
        	
        	erros.add("senhas não conferem");
            request.setAttribute("mensagens", erros);
            RequestDispatcher rd = request.getRequestDispatcher("/erro.jsp");
            rd.forward(request, response);
        	
        }

           
        
        Cliente cliente = new Cliente(id, nome, email, senha, "Cliente", cpf, telefone, sexo, dataNascimento);
        cdao.update(cliente);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("lista");
        dispatcher.forward(request, response);

    }

    private void updateAgencia(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        Erro erros = new Erro();
        
        
        Long id = Long.parseLong(request.getParameter("id")); 
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String cnpj = request.getParameter("cnpj");
        String descricao = request.getParameter("descricao");
        String senha = request.getParameter("senha");
        String confirmarSenha = request.getParameter("confirmar-senha");
        if (!senha.contentEquals(confirmarSenha)) {
        	
        	erros.add("senhas não conferem");
            request.setAttribute("mensagens", erros);
            RequestDispatcher rd = request.getRequestDispatcher("/erro.jsp");
            rd.forward(request, response);
        	
        }
        


        Agencia agencia = new Agencia(id, nome, email, senha, "Agencia", cnpj, descricao);
        adao.update(agencia);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("lista");
        dispatcher.forward(request, response);
        
    }

    */    
}
