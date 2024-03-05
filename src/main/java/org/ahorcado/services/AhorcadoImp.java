package org.ahorcado.services;

import java.util.Random;

public class AhorcadoImp implements IAhorcado{
    String[] palabras = {"abrigo", "clavo", "mujer",
            "adulto", "coche", "negro",
            "agua", "comarca", "ninio"};
    @Override
    public String generateWord() {
        Random rand = new Random();
        int upperbound = 7;
        int int_random = rand.nextInt(upperbound);

        return palabras[int_random];
    }

    @Override
    public String checkWord(String solutionWord, String inputUser, String actualDisplayWord) {
        char[] solutionWordToChar = solutionWord.toCharArray();
        char[] actualDisplayWordToChar = actualDisplayWord.toCharArray();
        for(int i = 0; i<solutionWord.length(); i++){
            if(solutionWordToChar[i] == inputUser.toCharArray()[0])
                actualDisplayWordToChar[i] = inputUser.toCharArray()[0];
        }
        return  new String(actualDisplayWordToChar);
    }


}
