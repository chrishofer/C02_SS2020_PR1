public class Beispiel2 {
    public static void main(String[] args) {
        int station = 3;
        // 2.a
        int dauer;
        dauer = zeitZumZiel(station);

        // output
        //System.out.println("Dauer: " + dauer);

        // 2.b
        if (dauer == 0) {
            System.out.println("Achtung! Ziel erreicht!");
        }else{
            System.out.println("Dauer:" + dauer);
        }

        // 2.c
        int baustellenStation = 4;
        int baustellenDauer = 6; // Minuten
        dauer = zeitZumZielMitWartezeit(station, baustellenStation, baustellenDauer);

        // output
        System.out.println("Dauer: " + dauer);
    }

    static int zeitZumZiel(int station) {
        int zeit = 0;

        switch ( station ) {
            case 1:
                zeit = 20;
                break;
            case 2:
                zeit = 16;
                break;
            case 3:
                zeit = 15;
                break;
            case 4:
                zeit = 10;
                break;
            case 5:
                zeit = 3;
                break;
            case 6:
                System.out.println("raus");
                zeit = 0;
                break;
        }
        return zeit;
    }

    static int zeitZumZielMitWartezeit(int station, int baustellenStation, int dauer) {
        int zeit = 0;

        switch ( station ) {
            case 1:
                zeit = 20;
                break;
            case 2:
                zeit = 16;
                break;
            case 3:
                zeit = 15;
                break;
            case 4:
                zeit = 10;
                break;
            case 5:
                zeit = 3;
                break;
        }

        if ( station <= baustellenStation ) {
            zeit = zeit + dauer;
        }

        return zeit;
    }
}