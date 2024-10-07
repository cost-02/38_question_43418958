package com.example;

import java.security.SecureRandom;
import java.util.Random;

public class SynchronizedRandom {
    public static void main(String[] args) {
        // Inserire lo stesso seed su entrambi i dispositivi
        long seed = 12345;  // Questo è un esempio di seed, può essere qualsiasi numero lungo

        // Inizializza SecureRandom con il seed
        SecureRandom random = new SecureRandom();
        random.setSeed(seed);

        // Genera e stampa i primi 10 numeri casuali
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt());
        }
    }
}
