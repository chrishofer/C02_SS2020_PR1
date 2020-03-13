public class Beispiel5 {
    public static void main(String[] args) {
        //System.out.println(taschenrechner(10,5,"durch"));

        System.out.println(vergleiche("ABC", "ABCDEFGH"));
        System.out.println(vergleiche("ABCDEFGH", "ABC"));
        System.out.println(vergleiche("ABCDEFGH", "ABCDEFGH"));
        System.out.println(vergleiche("EFGH", "ABC"));


        int [][]testarray = new int[][] {{1,1,1},{2,2,2},{3,3,3}};
        System.out.println(zeilensumme(testarray, 1));
        System.out.println(zeilensumme(testarray, 2));
        System.out.println(zeilensumme(testarray, 3));
    }

    public static double taschenrechner(double zahl1, double zahl2, String operation)
    {

        if(operation.equals("plus"))
        {
            return zahl1 + zahl2;
        }
        if(operation.equals("minus"))
        {
            return zahl1 - zahl2;
        }
        if(operation.equals("mal"))
        {
            return zahl1 * zahl2;
        }
        if(operation.equals("durch"))
        {
            return zahl1 / zahl2;
        }
        return 0;
    }
    public static int vergleiche(String s1, String s2)
    {
        if(s1.equals(s2))//(s1.contains(s2) && s2.contains(s1))
        {
            return 3;
        }
        if(s1.contains(s2))
        {
            return 2;
        }
        if(s2.contains(s1))
        {
            return 1;
        }
        return 4;
    }

    public static int zeilensumme(int [][] array, int zeile)
    {
        zeile = zeile - 1;
        int erg;

        erg = array[zeile][0];
        erg += array[zeile][1];
        erg += array[zeile][2];

        return erg;
    }
}
