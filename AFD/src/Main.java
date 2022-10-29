import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) throws Exception {
		Automat M = new Automat("D:\\test\\automat.txt");	
		
		System.out.println(M.analizeazaCuvant("abba"));
		JOptionPane.showMessageDialog(null, M.toString());	
	}
}
