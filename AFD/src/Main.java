import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) throws Exception {
		Automat M = new Automat("D:\\test\\automat.txt");	
		
		JOptionPane.showMessageDialog(null, M.analizeazaCuvant("abbaaa"));
		JOptionPane.showMessageDialog(null, M.toString());
			
	}
}
