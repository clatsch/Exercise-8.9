import Prog1Tools.IOTools;

public class TestMensch {

    public static void main(String [] args) {
        String vorname;
        String nachname;
        int alter;
        boolean maennlich;
        Mensch pers1, pers2;

        System.out.println("Daten fuer pers1 eingeben");
        vorname   = IOTools.readLine("Vorname: " );
        nachname  = IOTools.readLine("Nachname: ");
        alter     = IOTools.readInteger("Alter: ");
        maennlich = IOTools.readBoolean("Maennlich (true/false): ");
        pers1 = new Mensch(alter, maennlich, vorname, nachname);

        System.out.println("Daten fuer pers2 eingeben");
        vorname   = IOTools.readLine("Vorname: ");
        nachname  = IOTools.readLine("Nachname: ");
        alter     = IOTools.readInteger("Alter: ");
        maennlich = IOTools.readBoolean("Maennlich (true/false): ");
        pers2     = new Mensch(alter, maennlich, vorname, nachname);

        System.out.println("pers1.getIstMaennlich() liefert " + pers1.getIstMaennlich());
        System.out.println("pers2.getIstMaennlich() liefert " + pers2.getIstMaennlich());
        System.out.println("pers1.getAlter() liefert " + pers1.getAlter());
        System.out.println("pers2.getAlter() liefert " + pers2.getAlter());
        System.out.println("pers1.aelterAls(pers2) liefert " + pers1.aelterAls(pers2));
        System.out.println("pers2.aelterAls(pers1) liefert " + pers2.aelterAls(pers1));
        pers1.setAlter(100);
        pers2.setAlter(200);
        System.out.println("pers1.getAlter() liefert " + pers1.getAlter());
        System.out.println("pers2.getAlter() liefert " + pers2.getAlter());
        System.out.println("pers1.aelterAls(pers2) liefert " + pers1.aelterAls(pers2));
        System.out.println("pers2.aelterAls(pers1) liefert " + pers2.aelterAls(pers1));
        System.out.println("pers1 = " + pers1);
        System.out.println("pers2 = " + pers2);

        //pers1.vorname = "Heinrich";  // Zugriff auf private Instanz-Variable: Compiler-Fehler!
        //E:\hiwi\temp>javac TestMensch.java
        //TestMensch.java:100: vorname has private access in Mensch
        //pers1.vorname = "Heinrich";
        //     ^
        // 1 error

        System.out.println("Nochmal pers1:");
        System.out.println( pers1 );
    }

}