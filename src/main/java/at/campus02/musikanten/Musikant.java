package at.campus02.musikanten;

public abstract class Musikant {
    protected int anzahlBeine;
    protected Instrument instrument;

    public Musikant(int anzahlBeine, Instrument instrument) {
        this.anzahlBeine = anzahlBeine;
        this.instrument = instrument;
    }

    public int getAnzahlBeine() {
        return anzahlBeine;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public abstract double spieleMusik();

    public abstract int verscheucheRaeuber();

    @Override
    public String toString() {
        return "Verscheucht: " + verscheucheRaeuber() + " Musiziert: " + spieleMusik();
    }
}
