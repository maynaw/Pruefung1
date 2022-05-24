package at.campus02.musikanten;

public class Katze extends Musikant {
    protected double kratzKraft;

    public Katze(int aB, Instrument i, double kratzKraft) {
        super(aB, i);
        this.kratzKraft = kratzKraft;
    }

    public double getKratzKraft() {
        return kratzKraft;
    }

    @Override
    public double spieleMusik() {
        return instrument.getLautstaerke();
    }

    @Override
    public int verscheucheRaeuber() {
        if (anzahlBeine >= 4) {
            return (int) kratzKraft;
        } else if (anzahlBeine == 3) {
            return (int) (kratzKraft / 2);
        } else return 1;

    }

    @Override
    public String toString() {
        return "Katze" + kratzKraft + super.toString();
    }
}
