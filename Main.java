package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        MyVector myVector = new MyVector();
        while(true){
            if(!myVector.enterTwoVector()) break;
        }
        myVector.addTwoVector();
        try {
            myVector.saveToFile();
            System.out.println("Zapisano plik");
        }catch (Exception e){
            System.out.println("Zapis do pliku się nie powiódł :(");
        }

    }
}
        


