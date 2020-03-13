package com.company;


public class Tierheim {
    public static void main(String[] args) {
        System.out.println("Wilkommen im glücklichen Tierheim!");
        // Hund Lessie - 20 kg - spielfreudig, löst Kriminalfälle
        double futterLessie;
        double ge = 20;
        futterLessie = berechneFuttermenge(ge);
        System.out.println("Lessie bekommt " + futterLessie + " kg Futter");
        // Unterschiedliche Varianten um das Gewicht um 1 kg zu erhoehen
        double x;
        x = ge++;
        System.out.println(x + " " + ge);
        // ge = ge + 1;
        // ge += 1;
        // ge++; ++ge;

        // fuettern am Abend
        futterLessie = berechneFuttermenge(ge);
        System.out.println("Lessie bekommt am Abend " + futterLessie + " kg Futter");



        //Teste wietweitspazieren
        System.out.println(wieWeitSpazieren(12, 25, true));

        //Testen Kuschelzeit
        int []kuschelFeld = new int[] {2, 26, 27};
        boolean k = kuschelBedarf(kuschelFeld);
        if(k){
            System.out.println("yaayy wird gekuschelt");
        }
        else{
            System.out.println("snuff snuff snief snief");
        }
    }
    public static boolean kuschelBedarf(int[] kuschelZeit){
        if((kuschelZeit[0] + kuschelZeit[1] + kuschelZeit[2]) > 60)
        {
            return false;
        }
        // Beispiel für aufsteigende Kuscheleiten
        // 10, 20, 40
        // nicht aufsteigend wäre: 20 , 30 , 10
        if((kuschelZeit[0] < kuschelZeit[1] ) && (kuschelZeit[1] < kuschelZeit[2]))
        {
            return true;
        }
        if(kuschelZeit[1] > 25)
        {
            return false;
        }
        return true;
    }
    public static double wieWeitSpazieren(double gewicht, double letztesMal, boolean vertraegtSich){

        // falls Gewicht unter 1 kg und Hund nicht vertraeglich nur 2 km gehen
        if(gewicht < 1.0 && !vertraegtSich){
            return 2.0;
        }
        if(gewicht < 1.0){
            return 4.0;
        }
        //alternative
/*        if(gewicht < 1.0){
            if(vertraegtSich){
                return 4.0;
            }else{
                return 2.0;
            }
        }*/

        if((letztesMal > 24 || gewicht > 15) && vertraegtSich)
        {
            return 8.0;
        }

        return 5.0;
    }

    public static double berechneFuttermenge(double gewicht){
        double futterMenge;

        futterMenge = gewicht / 20;

        return futterMenge;
        // ganz kurz geschrieben
        // return gewicht / 20;
    }
}
