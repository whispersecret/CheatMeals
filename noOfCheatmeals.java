package Practice;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.Timer;


public class noOfCheatmeals extends JFrame implements ActionListener {
	private final JLabel label;
	public Timer timer = null;
	
	private final JButton button;
	private final JTextField textField;
	private final JList<String> wordList;
	public static String[] cheatmeals = new String[3];
	//static Thread thread = new Thread();
	//public static ArrayList<String> cheatmeals  = new ArrayList<String> ();
	public static int count = -1; 
	
	
	
	public noOfCheatmeals() {
		super("Your cheatmeals");
		setLayout(new FlowLayout());
		setSize(500, 800);
		Font font = new Font ("Sans-serif", Font.PLAIN, 20);
		label = new JLabel("Please enter your cheatmeal");
		label.setFont(font);
		add(label);
		textField = new JTextField(10);
		textField.setFont(font);
		add(textField);
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
		String newWord = textField.getText(); 
		count += 1; 
		//System.out.println(count);
		//cheatmeals.add(newWord);
		Timer timer = new Timer (1000, new ActionListener(){
            public void actionPerformed(ActionEvent e) {
            	for (int i = 60; i >=0; i-- ){
            		//System.out.println(i);
            	
            	}
            	
                
		
            
            }
        }); 
		
	
		try{
		cheatmeals[count] = newWord;
		

		((DefaultListModel)(wordList.getModel())).addElement(newWord);
		((DefaultListModel)(wordList.getModel())).addElement("Eat slowly in the time allocated");
		((DefaultListModel)(wordList.getModel())).addElement("Make sure to enjoy your food :)");
		timer.start();
		
		
		
			
		}
		catch(ArrayIndexOutOfBoundsException e){
			((DefaultListModel)(wordList.getModel())).addElement("You have reached your limit for the week");
			
		}
		
	
	}
	
	
	

}
