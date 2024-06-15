package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Operacao;
import com.example.demo.service.CalculadoraService;

@Controller
@RequestMapping("/")
public class CalculadoraController {

    @Autowired
    private CalculadoraService calculadoraService;

    @GetMapping
    public String index() {
        return "index";
    }

    @PostMapping("/calcular")
    public String calcular(Operacao operacao, Model model) {
        try {
            double resultado = calculadoraService.calcular(operacao.getNum1(), operacao.getNum2(), operacao.getOperador());
            String nomeOperador = calculadoraService.obterNomeOperador(operacao.getOperador());
            model.addAttribute("num1", operacao.getNum1());
            model.addAttribute("num2", operacao.getNum2());
            model.addAttribute("operador", operacao.getOperador());
            model.addAttribute("nomeOperador", nomeOperador);
            model.addAttribute("resultado", resultado);
            return "resultado";
        } catch (IllegalArgumentException e) {
            model.addAttribute("mensagem", e.getMessage());
            return "error";
        }
    }
}
