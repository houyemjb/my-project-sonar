package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String getMessage() {

        // BUG 1 : NullPointerException – appel de méthode sur null
        String prefix = null;
        int len = prefix.length();   // Lance NPE à l'exécution

        // BUG 2 : Division par zéro
        int total = 10;
        int divisor = 0;
        int result = total / divisor;  // ArithmeticException

        // CODE SMELL : variable inutilisée
        String unusedVar = "inutile";

        return "Hello from Service ! result=" + result;
    }
}
