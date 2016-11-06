import Prog1Tools.IOTools;

class Mensch {

    private static int gesamtZahl = 0;
    private int lfdnr;
    private int alter;
    private boolean istMaennlich;
    private String vorname;
    private String nachname;

    public Mensch (int alter, boolean istMaennlich,
                   String vorname, String nachname) {
        lfdnr = ++gesamtZahl;
        this.alter = alter;
        this.istMaennlich = istMaennlich;
        this.vorname = vorname;
        this.nachname = nachname;
    }

    // a)
    public int getAlter() {
        return alter;
    }

    // b)
    public void setAlter(int neuesAlter) {
        alter = neuesAlter;
    }

    // c)
    public boolean getIstMaennlich() {
        return istMaennlich;
    }

    // d)
    public boolean aelterAls(Mensch m) {
        return (alter > m.alter);
    }

    // e)
    public String toString() {
        String s = vorname + " " + nachname + ", " + alter + " Jahre, ";
        if (istMaennlich)
            s = s + "maennlich, ";
        else
            s = s + "weiblich, ";
        s = s + "lfd. Nr. " + lfdnr;
        return s;
    }

}