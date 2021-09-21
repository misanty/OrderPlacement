import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import java.awt.FlowLayout;

public class PlaceOrder {

	private JFrame frame = new JFrame();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	//************
	 JPanel panel = new JPanel();
     JPanel panel1 = new JPanel();
     JPanel panel2 = new JPanel();
     JPanel panel3 = new JPanel();
     JPanel panel4 = new JPanel();
     JPanel panel5 = new JPanel();
     CardLayout cardLayout = new CardLayout();
     
	
	///**********
	
	
	JPanel panelCont ;
	JPanel panelFirst ;
	JPanel panelSecond ;
	JButton buttonOne ;
	JButton buttonSecond ;
	CardLayout 	cl;
	private JTextField textField_3;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//PlaceOrder window = new PlaceOrder();
					//OrderFrame  window = new OrderFrame();
					MyFrame window = new MyFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PlaceOrder() {
		//initialize();
			//initCardLayout();
		initCard2();
		//init2();
		//init2();
	
		
	}
	
	
	
	
	
	private void initCard2() {
		
	 frame.setBounds(100, 100, 730, 489);
	
	      JPanel btnPanel = new JPanel();
	      JLabel label1 = new JLabel("Content of Card 1 is visible now!");
	      JLabel label2 = new JLabel("Content of Card 2 is visible now!");
	      JLabel label3 = new JLabel("Content of Card 3 is visible now!");
	      JLabel label4 = new JLabel("Content of Card 4 is visible now!");
	      JLabel label5 = new JLabel("Content of Card 5 is visible now!");
	      JButton btn1 = new JButton("Display Card 1");
	      JButton btn2 = new JButton("Display Card 2");
	      JButton btn3 = new JButton("Display Card 3");
	      JButton btn4 = new JButton("Display Card 4");
	      JButton btn5 = new JButton("Display Card 5");
	      
	      panel.setLayout(cardLayout);
	      FlowLayout flowLayout = (FlowLayout) panel1.getLayout();
	      flowLayout.setAlignOnBaseline(true);
	      panel1.add(label1);
			JTextField userText = new JTextField();
			userText.setBounds(100,20,165,25);
	      panel1.add(userText);
	      panel2.add(label2);
	      panel3.add(label3);
	      panel4.add(label4);
	      panel5.add(label5);
	      panel.add(panel1, "link1");
	      
	      textField_3 = new JTextField();
	      panel1.add(textField_3);
	      textField_3.setColumns(10);
	      panel.add(panel2, "link2");
	      panel.add(panel3, "link3");
	      panel.add(panel4, "link4");
	      panel.add(panel5, "link5");
	      panel1.setLayout(new BorderLayout());
	      panel1.setDefaultLocale(null);
	      textField_3.setLocation(0, 0);
	      btn1.addActionListener(e -> cardLayout.show(panel, "link1"));
	      btn2.addActionListener(e -> cardLayout.show(panel, "link2"));
	      btn3.addActionListener(e -> cardLayout.show(panel, "link3"));
	      btn4.addActionListener(e -> cardLayout.show(panel, "link4"));
	      btn5.addActionListener(e -> cardLayout.show(panel, "link5"));
	      btnPanel.add(btn1);
	      btnPanel.add(btn2);
	      btnPanel.add(btn3);
	      btnPanel.add(btn4);
	      btnPanel.add(btn5);
	 
	      frame.getContentPane().add(panel, BorderLayout.NORTH);
	      frame.getContentPane().add(btnPanel, BorderLayout.SOUTH);
	      frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	      frame.setVisible(true);
	}
	
	private void initCardLayout( ) {
		
		frame = new JFrame();
		panelCont = new JPanel();
		panelFirst = new JPanel();
		panelSecond = new JPanel();
		buttonOne = new JButton("Switch to second panel/workspace");
		buttonSecond = new JButton("Switch to first panel/workspace");
		cl = new CardLayout();
		
		
		
		panelCont.setLayout(cl);

		panelFirst.add(buttonOne);
		panelSecond.add(buttonSecond);
		panelFirst.setBackground(Color.darkGray);
		panelSecond.setBackground(Color.blue);

		panelCont.add(panelFirst, "1");
		panelCont.add(panelSecond, "2");
		cl.show(panelCont, "1");
		
		buttonOne.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cl.show(panelCont, "2");
			}
		});
		
		buttonSecond.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cl.show(panelCont, "1");
			}
		});
		
		frame.getContentPane().add(panelCont);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
	}
	
	
	private void init2() {
		JPanel panel = new JPanel();
		frame = new JFrame();
		frame.setBounds(100, 100, 730, 489);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		//frame.add(panel);
		frame.getContentPane().add(panel);
		//frame.add(panelCont);
	
		
	
		
		panel.setLayout(null);
		
		
		JLabel label = new JLabel("Test");
		label.setBounds(10,20,80,25);
		panel.add(label);
		
		
		JTextField userText = new JTextField();
		userText.setBounds(100,20,165,25);
		panel.add(userText);
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 730, 489);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	
		textField = new JTextField();
		textField.setBounds(90, 29, 149, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(12, 31, 86, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblPhone = new JLabel("Phone #");
		lblPhone.setBounds(12, 68, 99, 14);
		frame.getContentPane().add(lblPhone);
		
		textField_1 = new JTextField();
		textField_1.setBounds(100, 61, 149, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEmailId = new JLabel("Email Id");
		lblEmailId.setBounds(25, 113, 86, 14);
		frame.getContentPane().add(lblEmailId);
		
		textField_2 = new JTextField();
		textField_2.setBounds(110, 98, 149, 17);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(25, 162, 58, 15);
		frame.getContentPane().add(lblAddress);
				
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(90, 139, 212, 40);
		frame.getContentPane().add(textArea_1);
		
		
		
		JButton btnClear = new JButton("Clear");
		
		btnClear.setBounds(312, 387, 89, 23);
		frame.getContentPane().add(btnClear);
		
		
		JButton btnSubmit = new JButton("submit");
		
		btnSubmit.setBackground(Color.BLUE);
		btnSubmit.setForeground(Color.MAGENTA);
		btnSubmit.setBounds(65, 387, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*if(textField.getText().isEmpty()||(textField_1.getText().isEmpty())||(textField_2.getText().isEmpty())||(textArea_1.getText().isEmpty())||((radioButton_1.isSelected())&&(radioButton.isSelected()))||(comboBox.getSelectedItem().equals("Select")))
					JOptionPane.showMessageDialog(null, "Data Missing");
				else		
				JOptionPane.showMessageDialog(null, "Data Submitted");*/
			}
		});
		
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(null);
				textField_2.setText(null);
				textField.setText(null);
				textArea_1.setText(null);
				
				
				
			}
		});
		
	}
}