package org.ahorcado.services;

public interface IAhorcado {
    String generateWord();

    String checkWord(String solutionWord,  String inputUser, String actualDisplayWord);
}
