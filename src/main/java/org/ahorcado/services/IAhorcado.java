package org.ahorcado.services;

import org.springframework.stereotype.Service;

@Service
public interface IAhorcado {
    String generateWord();

    String checkWord(String solutionWord,  String inputUser, String actualDisplayWord);
}
