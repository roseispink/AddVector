package com.company;

import java.io.*;
import java.util.Scanner;
import java.util.*;

public class MyVector {
    private final Vector <Integer> vector1 = new Vector <>();
    private final Vector <Integer> vector2 = new Vector <>();
    private final Vector <Integer> replecmentVec = new Vector <>();
    private final Scanner scr = new Scanner(System.in);

    void validateVector(){
        System.out.println("Podaj wektor: ");
        boolean flag;

        while(true) {
            flag = false;
            String input = scr.nextLine();
            String[] valid = input.split(" ");
            int n;
            for (String s : valid) {
                try {
                    n = Integer.parseInt(s);
                    replecmentVec.add(n);
                } catch (Exception e) {
                    replecmentVec.clear();
                    System.out.println("Podano nieprawidłowy wektor. Wprowadz go ponownie: ");
                    flag = true;
                    break;
                }
            }
            if(flag) continue;
            break;
        }
    }

    void addTwoVector(){
        for(int i = 0; i < vector1.size(); i++){
            replecmentVec.add(vector1.get(i) + vector2.get(i));
        }
    }

    boolean enterTwoVector(){
        validateVector();
        vector1.addAll(replecmentVec);
        replecmentVec.clear();
        validateVector();
        vector2.addAll(replecmentVec);
        replecmentVec.clear();
        if(vector1.size()!=vector2.size()) try {
            throw new WektoryRoznejDlugosciException(vector1.size(), vector2.size());
        } catch (WektoryRoznejDlugosciException e) {
            vector1.clear();
            vector2.clear();
            System.out.println("Spróbuj ponownie dodać wektory");
            return true;
        }
        return false;
    }

    void saveToFile() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("myVector.txt"));
        PrintWriter pw = new PrintWriter(bw);
        pw.print(replecmentVec);
        pw.close();
        bw.close();
    }

}
