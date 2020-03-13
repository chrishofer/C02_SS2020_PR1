public class Beispiel1 {
    public static void main(String[] args) {
        double feuchtigkeit = 0.33;
        int pflanze = 4;

        // 1.a
        int zeitGieszen;
        zeitGieszen = gieszDauer(feuchtigkeit);

        // output
        System.out.println("Gießdauer: " + zeitGieszen);

        // 1.b
        double wasserAnteil;
        wasserAnteil = wasserGehalt(pflanze);

        // output
        System.out.println("Wasseranteil: " + wasserAnteil);
    }

    // 1.a
    static int gieszDauer(double feuchtigkeit) {
        int dauer;

        if ( feuchtigkeit < 0.2 ) {
            dauer = 5;
        } else if ( feuchtigkeit < 0.4 ) {
            dauer = 3;
        } else if ( feuchtigkeit < 0.75 ) {
            dauer = 1;
        } else {
            dauer = 0;
        }

        return dauer;
    }

    // 1.b
    static double wasserGehalt(int pflanzenNummer) {
        double ergebnis = 1;

        switch (pflanzenNummer) {
            case 2:
                ergebnis = 0.95;
                break;
            case 3:
                break;
            case 4:
                ergebnis = 0.98;
                break;
            case 1:
            default:
                ergebnis = 0.99;
        }

        return ergebnis;
    }
}