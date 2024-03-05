package org.ahorcado;

import org.ahorcado.applications.AhorcadoChecker;
import org.ahorcado.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AhorcadoChecker ahorcado = context.getBean(AhorcadoChecker.class);
        ahorcado.initializeGame();


    }

}