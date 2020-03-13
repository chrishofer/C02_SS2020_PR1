import java.util.Arrays;

public class Beispiel4 {
    public static void main(String[] args) {
        int []f = new int[] {1, 2, 3, 4};

        System.out.println(f[0]);
        System.out.println(f[1]);
        System.out.println(f[2]);
        System.out.println(f[3]);
        feldUmsortieren(f);
        //System.out.println();
        System.out.println(f[0]);
        System.out.println(f[1]);
        System.out.println(f[2]);
        System.out.println(f[3]);
        //-------------

        System.out.println(istSchaltjahr(2000));
        System.out.println(istSchaltjahr(1900));
        System.out.println(istSchaltjahr(2020));
        System.out.println(istSchaltjahr(1997));

        //-------
        System.out.println(berechneLohnsteuer(1000000));
    }
    public static int naechsteZeckenImpfung(int alter, int letztesImpfungsjahr, boolean ersteAuffrischung)
    {
        if(alter >= 60 || ersteAuffrischung)
        {
            return letztesImpfungsjahr + 3;
        }
        return letztesImpfungsjahr + 5;
    }
    public static void feldUmsortieren(int []feld )
    {
        int t;
        t = feld[0];
        feld[0] = feld[3];
        feld[3] = t;
        t = feld[1];
        feld[1] = feld[2];
        feld[2] = t;
    }

    static boolean istSchaltjahr(int jahr){
        if((jahr % 400) == 0)
        {
            return true; // fangen damit alle 400er jahre ab
        }
        if((jahr % 100) == 0)
        {
            return false; // fangen 100er jahre ab
        }
        if((jahr % 4) == 0){
            return true; // die normalen 4er jahre
        }
        return false;
    }
    public static double berechneLohnsteuer(double einkommen)
    {
        if(einkommen > 1000000){
            return (einkommen - 1000000) * 0.55 + 487880;
        }
        if(einkommen > 90000){
            return (einkommen - 90000) * 0.5 + 32880;
        }
        if(einkommen > 60000){
            return (einkommen - 60000) * 0.48 + 18480;
        }
        if(einkommen > 31000){
            return (einkommen - 31000) * 0.42 + 6300;
        }
        if(einkommen > 18000){
            return (einkommen - 18000) * 0.35 + 1750;
        }
        if(einkommen > 11000){
            return (einkommen - 11000) * 0.25;
        }
        return 0;
    }
}
