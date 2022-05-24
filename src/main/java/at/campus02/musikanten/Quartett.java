package at.campus02.musikanten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class Quartett {
	 private ArrayList<Musikant> musikants;

	public Quartett() {
		musikants = new ArrayList<Musikant>();
	}

	public Quartett(ArrayList<Musikant> musikants) {
		this.musikants = musikants;
	}

	public void add(Musikant m) {
		musikants.add(m);
	}
	public boolean istQuartett() {
		if (musikants.size() == 4){
			return true;
		}
		return false;
	}
	
	public int gemeinsamRaeuberVerscheucht(){
		int sum = 0;
		Iterator<Musikant> it = musikants.iterator();
		while (it.hasNext()){
			sum += it.next().verscheucheRaeuber();
		}
		return sum;
	}
	public double durchschnittlicheLautstaerke() {
		double erg = 0;
		for (Musikant m : musikants){
			erg += m.spieleMusik();
		}
		return (erg/musikants.size());
	}
	
	public ArrayList<Musikant> getMusikantenInLautstaerkeBereich(double von, double bis) {
		ArrayList<Musikant> arr = new ArrayList<Musikant>();
		for (Musikant m : musikants){
			double laut = m.spieleMusik();
			if (laut > von && laut< bis){
				arr.add(m);
			}
		}
		return arr;
	}
	
	public HashMap<Integer, Integer> getAnzahlMusikantenMitBeinAnzahl()
	{
		// TODO
		return null;
	}
	public void printLautStaerkeAbsteigend()
	{
		// TODO
	}
}
