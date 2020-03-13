public class Beispiel0 {

    // Beispiel 0.a.a
    static String lichtA(byte schalter) {
        String ergebnis;
        if (schalter > 1.0) {
            ergebnis = "Licht an!";
        } else {
            ergebnis = "Licht aus!";
        }
        return ergebnis;
    }







    // Beispiel 0.a.a
    static String lichtB(byte schalter) {
        String ergebnis;
        if (schalter == 1) {
            ergebnis = "Licht an!";
        } else {
            ergebnis = "Licht aus!";
        }
        return ergebnis;
    }








    static String skiflugRanking(double flugweite) {
        String einleitung = "Ergebnis: ";
        String ergebnis = "nicht verfügbar";
        String warnung = "Verletzung! ACHTUNG: Hile holfen!";

        if (flugweite > 198.7) {
            ergebnis = "Gold";
        } else if (flugweite > 197.1) {
            ergebnis = "Silber";
        } else if (flugweite > 195) {
            ergebnis = "Bronze";
        } else if (flugweite > 193.67) {
            ergebnis = "Blech";
        } else if (flugweite >= 100 && flugweite <= 150) {
            ergebnis = "Ausgeschieden";
        }
        // 0.c.a
        if (flugweite >= 20 && flugweite <= 50) {
            return warnung;
        } else {
            return einleitung + ergebnis;
        }
    }

    // 0.d.b
    static double speed(int gang, double windgeschwindigkeit, boolean richtung) {
        double speed = 0.0;

        switch (gang) {
            case 1:
                speed = 10.0;
                break;
            case 2:
                speed = 20.0;
                break;
            case 3:
                speed = 30.0;
                break;
            case 4:
                speed = 40.0;
                break;
        }

        // 0.d.c
        double speedMitWind = speed;
        if (windgeschwindigkeit <= 15) {
            speedMitWind = speedMitWind - speedMitWind*0.1;
        } else if (windgeschwindigkeit <= 25) {
            speedMitWind = speedMitWind * 0.8;
        } else {
            speedMitWind *= 0.6; // speedMitWind = speedMitWind * 0.6;
            // x += 1  gleich wie x = x + 1
        }

        // 0.d.d
        if (richtung) {
            return speedMitWind;
        } else {
            return speed;
        }
    }

    public static void main(String[] args) {

        // Beispiel 0.a
        byte schalter = 0;

        if (schalter > 1.0) {
            System.out.println("Licht an!");
        } else {
            System.out.println("Licht aus!");
        }

        // 0.a.b
        String licht = lichtA(schalter);
        System.out.println(licht);








        // Beispiel 0.b
        schalter = 1;

        if (schalter == 1) {
            System.out.println("Licht an!");
        } else {
            System.out.println("Licht aus!");
        }

        // 0.a.b
        licht = lichtB(schalter);
        System.out.println(licht);





        // Beispiel 0.c
        double flugweite = 196.5;
        if (flugweite > 198.7) {
            System.out.println("Gold");
        } else if (flugweite > 197.1) {
            System.out.println("Silber");
        } else if (flugweite > 195) {
            System.out.println("Bronze");
        } else if (flugweite > 193.67) {
            System.out.println("Blech");
        } else if (flugweite >= 100 && flugweite <= 150) {
            System.out.println("Ausgeschieden");

            // 0.c.a
        } else if (flugweite >= 20 && flugweite <= 50) {
            System.out.println("Verletzung! ACHTUNG: Hilfe holfen!");
        }




        // 0.c.c
        String skiflugErgebnis;
        skiflugErgebnis = skiflugRanking(flugweite);
        System.out.println(skiflugErgebnis);

        // Beispiel 0.d
        int gang = 2;
        double speed = 0.0;
        if (gang == 1) {
            speed = 10.0;
        } else if (gang == 2) {
            speed = 20.0;
        } else if (gang == 3) {
            speed = 30.0;
        } else if (gang == 4) {
            speed = 40.0;
        }
        System.out.println(speed);




        // 0.d.a:
        switch (gang) {
            case 1:
                speed = 10.0;
                break;
            case 2:
                speed = 20.0;
                break;
            case 3:
                speed = 30.0;
                break;
            case 4:
                speed = 40.0;
                break;
        }



        // 0.d.b
        speed = speed(gang,23,true);
        System.out.println("Geschwindigkeit: "+speed);
    }
}