package com.company;


import java.util.Arrays;

public class FelderUndMehr {
    public static void main(String[] args) {
        // schauen wir uns ein altbekanntes array an
        int []feld = new int[] {1, 2, 3};

        // es gibt eine hilfsmethode die ein array ausgibt
        System.out.println(Arrays.toString(feld));
        System.out.println("-----");

        // definition 2 dimensionsales array (array in array)
        int [][] feld2dim = new int [3][4];

        // einem element etwas zuweisen
        feld2dim[1][2] = 42;
        System.out.println(Arrays.toString(feld2dim)); // zeigt arrays in arrays
        System.out.println(Arrays.toString(feld2dim[0]));
        System.out.println(Arrays.toString(feld2dim[1]));
        System.out.println(Arrays.toString(feld2dim[2]));

        // definition und initialisierung
        int [][] feld2dim2 = new int [][] {{1,2, 3}, {4,5,6}};
        System.out.println(Arrays.toString(feld2dim2[0]));
        System.out.println(Arrays.toString(feld2dim2[1]));

        // ganz kurz input string
        String str = "Hallo ZAM";
        System.out.println(str.length());
        // strings dürfen nicht mit == verglichen werden (macht was anderses - cliffhanger)
        // aber equals kann verwendet werden
        System.out.println(str.equals("Hallo ZAM"));
    }
}
