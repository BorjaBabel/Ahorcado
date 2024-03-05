/*package org.ahorcado.services;

import java.util.Scanner;

public class Game  {
    String[] palabras = {"abrigo", "clavo", "mujer",
            "adulto", "coche", "negro",
            "agua", "comarca", "ninio"};
    private String solutionWord;
    private String actualDisplayWord;
    private int attempts;

    public String getSolutionWord() {
        return solutionWord;
    }

    public void setSolutionWord(String solutionWord) {
        this.solutionWord = solutionWord;
    }

    public String getActualDisplayWord() {
        return actualDisplayWord;
    }

    public void setActualDisplayWord(String actualDisplayWord) {
        this.actualDisplayWord = actualDisplayWord;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }


    public void startNewGame(){
        setSolutionWord(ahorcadoService.generateWord());
        String solWordReplaced = getSolutionWord().replaceAll("[a-zA-Z]","-");
        setActualDisplayWord(solWordReplaced);
        System.out.println(actualDisplayWord);
        System.out.println(solutionWord);
        playGame();
    }
    public void playGame(){
        boolean winner = false;
        while(attempts != 0 && !winner) {
            checkIfRightWord(ahorcadoService.checkWord(solutionWord, inputWord(), actualDisplayWord));
            System.out.println(actualDisplayWord);
            if(actualDisplayWord.equals(solutionWord)){
                winner = true;
            }
            System.out.println("Te quedan: "+ attempts);
        }
        if(attempts == 0){
            System.out.println("\nPierdes!\n");
        }else{
            System.out.println("\nGanas!\n");
        }
    }
    public void checkIfRightWord(String input){
        if(input.equals(actualDisplayWord)){
            attempts--;
        }else{
            actualDisplayWord = input;
        }
    }

    public String inputWord(){
        System.out.println("Introduce la letra: ");
        Scanner scanner = new Scanner(System.in);
        String userInputLetter = scanner.nextLine();
        return userInputLetter;

    }
}*/
