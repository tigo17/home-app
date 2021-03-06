package com.concrete.HomeApp.controllers;

import com.concrete.HomeApp.models.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
 

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "home/index";
    }

    @GetMapping("/validacao-cpf")
    public String validacaocpf(){
        return "home/validacaocpf";
    }

    @PostMapping("/valida-cpf")
    public String validarCPF(Cliente cliente, Model model){
        model.addAttribute("cliente", cliente);
        model.addAttribute("validado", cliente.validarCPF());
        return "home/cpfvalidado";
    }

    @GetMapping("/anaamarante")
    public String anaamarante(){
        return "home/anaamarante";
    }

    @GetMapping("/tiagomartin")
    public String tiagomartin(){
        return "home/tiagomartin";
    }

    @GetMapping("/devops")
    public String devops(){
        return "home/devops";
    }
    @GetMapping("/motivacao")
    public String motivacao(){
        return "home/motivacao";
    }
}
