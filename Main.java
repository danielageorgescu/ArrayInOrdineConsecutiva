package com.itfactory;

import javax.naming.directory.InvalidSearchFilterException;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Introduceti patru numere consecutive: ");
        int[] numereIntroduse = new int[4];
        Scanner scanner = new Scanner(System.in);

        int i;
        for (i = 0; i < numereIntroduse.length; i++)
            numereIntroduse[i] = Integer.parseInt(scanner.nextLine());

        int x = 0;
        if ((numereIntroduse[x+1] - numereIntroduse[x]) != 1) {
            try {
                throw new Exception(" Numerele nu sunt consecutive");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            System.out.println("Numerele sunt consecutive.");
        }
    }
}

