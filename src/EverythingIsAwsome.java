import javax.swing.JOptionPane;

public class EverythingIsAwsome {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {

			String somethang = JOptionPane.showInputDialog("Name somethang");
			JOptionPane.showMessageDialog(null, somethang + " is awesome");
		}

	}

}
