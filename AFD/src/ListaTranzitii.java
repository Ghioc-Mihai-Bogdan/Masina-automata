import java.util.*;
import javax.swing.JOptionPane;

public class ListaTranzitii {
	
	private ArrayList<Tranzitie> lista = new ArrayList<Tranzitie>();
	
	void adaugaTranzitie (Tranzitie tr) {
		this.lista.add(tr);
	}
	Tranzitie gasesteTranzitie(String stare, char simbol) {
		for (int i = 0;i<this.lista.size();i++) {
			Tranzitie tr = this.lista.get(i);
			if(tr.spuneStInceput().equals(stare) && tr.spuneSimbol() == simbol) {
				return tr;
			}			
		}
		return null;
	}
	void afiseazaAlfabet() {
		Set s = Collections.synchronizedSet(new HashSet());
		for (int i = 0; i<this.lista.size();i++) {
			Tranzitie tr = this.lista.get(i);
			s.add(tr.spuneSimbol());
		}
		JOptionPane.showMessageDialog(null,"\u03B5="+s);				
	}
	
	public String toString() {
		String iesire = "";
		for (int i = 0;i<this.lista.size();i++) {
			Tranzitie tr = this.lista.get(i);
			iesire+="\u03B4("+tr.spuneStInceput()+","+tr.spuneSimbol()+")="+"{"+tr.spuneStSfarsit()+"}\n";			
		}
		return iesire;
	}
	
	
}
