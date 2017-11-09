import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Window extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	JButton testButton, testButton1; 
	JLabel testLabel;
	
	DB_service db = new DB_service();

	public Window(int width, int heigh, String title) {
		/////////////////////////////////////////////////
		/////////////FRAME PARAMETERS////////////////////
		/////////////////////////////////////////////////
		JFrame frame = new JFrame(title);
		//frame.setLocationRelativeTo(null);
		frame.setPreferredSize(new Dimension(width, heigh));     // setting a size
		frame.setMaximumSize(new Dimension(width, heigh));			 
		frame.setMinimumSize(new Dimension(width, heigh));  
		frame.setResizable(false);		//means u can not resize window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true); 		//make window visible
		//////////////////////////////////////////////////
		
		// TEST BUTTON FOR SHOWING FILMS.
		testButton = new JButton("Show available films.");
		testButton.setBounds(50, 300, 190, 25);
		testButton.addActionListener(this);
		frame.add(testButton);
		
		testButton1 = new JButton("Show available films.");
		testButton1.setBounds(300, 300, 190, 25);
		testButton1.addActionListener(this);
		frame.add(testButton1);
		
		// TEST LABEL FOR SHOWING MYSQL QUERIES
		testLabel = new JLabel("here");
		testLabel.setBounds(20, 20, 190, 25);
		frame.add(testLabel);
	}
		
	
	
	
	
	public void actionPerformed(ActionEvent e) {
		
		Object buttonSource = e.getSource(); // przechowuje decyzje podj�t� w listenerze - czyli kt�ry button kliknelismy
		
		if(buttonSource == testButton) {
			testLabel.setText(db.array);
		} else if (buttonSource == testButton1) {
		}
	}
	
}
