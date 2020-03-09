package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code
        int alter = 14;
        // hier wird der code immer ausgefuehrt
        if(alter >= 18){
            // hier nur rein wenn mindestens 18 jahre alt
            System.out.println("Auch Schnapps erlaubt :)");

        }else if (alter >= 16){
            System.out.println("Yaaayyy ich darf hinein aber nur mit Wein ^^");
        }else{
            // hier gehen wir rein wenn wir jünger als 18 sind
            System.out.println("Gehe zwischenzeitlich Pizza essen");
        }
        // hier wird der code immer ausgefuehrt
        System.out.println("Warte gelangweilt im Auto");

        // Beispiel fuer einen switch
        int note = 2, stipendium;
        double kommazahl;

        // Berechne Förderstipendium
        switch(note){
            case 1:
                // hier steht der code der ausgeführt wird wenn ich 1 bekomme
                stipendium = 100;
                break;
            case 2:
                stipendium = 50;
                break;
            case 3:
                stipendium = 30;
                break;
            default:
                stipendium = 10;
                break;
        }
        System.out.println("Stipendium: " + stipendium + "€");


    }
}
