package com.company;

public class WektoryRoznejDlugosciException extends Exception {
    WektoryRoznejDlugosciException(int size1, int size2){
        System.out.println("Długość pierwszego wektora to " + size1 + " a drugiego to "+size2);
    }
}
