package Practice;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener; import java.awt.event.ActionEvent; import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;

public class bmi extends JFrame implements ActionListener{
	private final JLabel label;
	private final JLabel label2;
	private final JButton button;
	private final JTextField textField;
	private final JTextField textField2;
	private final JList<String> wordList;
	
	public bmi() {
		super("Bmi Calculator");
		setLayout(new FlowLayout());
		setSize(500, 800);
		
		Font font = new Font ("Sans-serif", Font.PLAIN, 20);
		label = new JLabel("Please enter your height in cm");
		label.setFont(font);
		add(label);
		textField = new JTextField(10);
		textField.setFont(font);
		add(textField);
		label2 = new JLabel("Please enter your weight in kg");
		label2.setFont(font);
		add(label2);
		textField2 = new JTextField(10);
		textField2.setFont(font);
		add(textField2);
		button = new JButton("Enter");
		button.addActionListener(this);
		add(button);
		wordList = new JList<String>(new DefaultListModel<String>()); 
		wordList.setFont(font);
		wordList.setVisibleRowCount(25);
		wordList.setFixedCellHeight(25); 
		wordList.setFixedCellWidth(500);
		add(new JScrollPane(wordList)); 
		
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent event) { 
		
		label.setText("Thanks!");
		double height = Integer.parseInt(textField.getText()); 
		int weight = Integer.parseInt(textField2.getText()); 
		System.out.println(height);
		System.out.println(weight);
		double bmi =  Math.round(((weight / ((height / 100) * (height / 100))) * 100) / 100);
		System.out.printf("Your bmi is %.2f", (weight / ((height / 100) * (height / 100))));
		((DefaultListModel)(wordList.getModel())).addElement("Your bmi is: " + bmi);
		if (bmi < 18.5){
			((DefaultListModel)(wordList.getModel())).addElement("You are underweight! Please go eat a cheeseburger");
			((DefaultListModel)(wordList.getModel())).addElement("You should aim for 3 cheatmeals a week!");
			
		}else if(18.5 < bmi && bmi < 24.9 ){
			((DefaultListModel)(wordList.getModel())).addElement("You are at a healthy weight. Please keep this up and maintain a healthy diet and exercise");
			((DefaultListModel)(wordList.getModel())).addElement("You should aim for 3 cheatmeals a week!");
		}else{
			((DefaultListModel)(wordList.getModel())).addElement("You are overweight. This is significantly bad for your health  and you should you use github repository to help you with your lifestyle");
			((DefaultListModel)(wordList.getModel())).addElement("You should aim for 1 cheatmeal a week!");
		}
		
		
		
	}
	
}
