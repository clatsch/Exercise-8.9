public class Mensch {
    private static int gesamtZahl = 0;          //Zähler auf 0 setzen
    private int nummer;
    private int alter;
    private String vorname;
    private String nachname;
    private boolean istMaennlich;


    // Konstruktor
    public Mensch(int alter, String vorname, String nachname, boolean istMaennlich) {
        nummer = ++gesamtZahl;
        this.alter = alter;
        this.vorname = vorname;
        this.nachname = nachname;
        this.istMaennlich = istMaennlich;
    }

    // Getter
    public int getAlter() {
        return alter;
    }

    public boolean getIstMaennlich() {
       return true;
    }


    // Setter
    public void setAlter(int neuesAlter) {
        this.alter = neuesAlter;
    }

    public boolean aelterAls(Mensch m) {
        return (alter > m.alter);
    }

    @Override
    public String toString() {

        String gesch = "Männlich";
        return vorname + " " + nachname + " " + alter + " " + istMaennlich;
    }
}
