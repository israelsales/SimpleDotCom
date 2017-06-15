package com.useacabecajava.com;

public class SimpleDotCom {

    int[] locationCells;
    int numOfHits;

    //            Capiture o palpite do usuario como um parametro de String
    String checkYourself(String stringGuess) {

//        Converta o palpite do usuario em um int
        int intGuess = Integer.parseInt(stringGuess);

//        cria uma variavel para armazenar o resultado que retornaremos. Insere "miss" como o padrao
//        (isto é, estamos presumindo que ocorrerá um "erro")
        String result = "miss";

//        repete para cada celula da matriz locationCells (cada local de celulas do objeto)
        for (int cell : locationCells) {

//            compara o palpite do usuario com esse elemento (celula) da matriz
            if (intGuess == cell) {
                result = "hit"; //timemos um acerto
                numOfHits++;
                break; //sai do loop, nao é preciso testar as outras celulas
            }
        }

        if(numOfHits==locationCells.length){
            result = "kill";
        }



        return null;
    }

    void setLocationCells(int[] loc) {
//        Capture os locais das celulas como um parametro de matriz int
//        Atribua o parametro dos locais das celulas a variavel de instancia desses locais
    }
}
