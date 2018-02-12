package Practice;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class runBmi implements Runnable {

	public void run() {
	bmi h = new bmi();
	h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	h.setSize(500,500);
	h.setVisible(true);
}

	public static void main(String[] args) { 
		SwingUtilities.invokeLater(new runBmi());
	}
}