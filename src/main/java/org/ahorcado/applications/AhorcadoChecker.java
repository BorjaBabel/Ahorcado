package org.ahorcado.applications;

import org.ahorcado.services.IAhorcado;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class AhorcadoChecker {
    private final IAhorcado ahorcadoService;
    private String solutionWord;
    private String actualDisplayWord;
    private int attempts;
    public AhorcadoChecker(IAhorcado ahorcadoService) {
        this.ahorcadoService = ahorcadoService;
    }


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
    public void initializeGame(){
        boolean condicion = true;
        while(condicion){
            attempts = 8;
            System.out.println("Let's play!");
            System.out.println("1. Jugar");
            System.out.println("2. Salir");
            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    startNewGame();
                    break;
                case 2:
                    condicion = false;
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
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





}
