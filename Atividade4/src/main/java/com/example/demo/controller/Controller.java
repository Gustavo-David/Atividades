package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private Integer result;

    @GetMapping("/soma")
    public String meuEndpoint(@RequestParam(value = "valor1") String valor1,
            @RequestParam(value = "valor2") String valor2) {
        result = Integer.parseInt(valor1) + Integer.parseInt(valor2);
        return "As soma dos valores foram:  " + valor1 + " e " + valor2 + " é: " + result;
    }

    @GetMapping("/subtracao")
    public String subtracao(@RequestParam(value = "valor1") String valor1,
            @RequestParam(value = "valor2") String valor2) {
        result = Integer.parseInt(valor1) - Integer.parseInt(valor2);
        return "A subtração dos valores " + valor1 + " e " + valor2 + " é: " + result;
    }

    @GetMapping("/multiplicacao")
    public String multiplicacao(@RequestParam(value = "valor1") String valor1,
            @RequestParam(value = "valor2") String valor2) {
        result = Integer.parseInt(valor1) * Integer.parseInt(valor2);
        return "A multiplicação dos valores " + valor1 + " e " + valor2 + " é: " + result;
    }

    @GetMapping("/divisao")
    public String divisao(@RequestParam(value = "valor1") String valor1,
            @RequestParam(value = "valor2") String valor2) {
        if (!valor2.equals("0")) {
            result = Integer.parseInt(valor1) / Integer.parseInt(valor2);
            return "A divisão dos valores " + valor1 + " e " + valor2 + " é: " + result;
        } else {
            return "Erro: divisão por zero!";
        }
    }
}
