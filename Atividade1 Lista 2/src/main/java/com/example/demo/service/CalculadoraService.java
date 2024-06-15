package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public double calcular(double num1, double num2, String operador) {
        switch (operador) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0) throw new IllegalArgumentException("Divisão por zero não permitida");
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Operador inválido");
        }
    }

    public String obterNomeOperador(String operador) {
        switch (operador) {
            case "+":
                return "adição";
            case "-":
                return "subtração";
            case "*":
                return "multiplicação";
            case "/":
                return "divisão";
            default:
                return "operador desconhecido";
        }
    }
}
