package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Frame extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JLabel lAddHours;
	private JLabel lAddPay;
	
	private JLabel lAdd;
	private JLabel lList;
	
	/*
	lAddHours = new JLabel("Timer");
		lAddPay = new JLabel("Tillaegssats");
		
		lAdd = new JLabel("Tillaegstimer");
		lList = new JLabel("Liste over timer");
		*/
	
	private JTextField tfAddHours; 
	private JTextField tfAddPay; 
	
	private JButton bSubmit; 
	private JButton bRemove; 
	
	private JList list;
	private JScrollPane scroll; 
	
	private LabelPanel pLabel;
	
	public Frame() {
		setFrame();
		setContent();
		
		setVisible(true);
		
		
	}
	
	private void setContent() {
		addPanels();
		/*setTextFields();
		setButtons();
		setList();*/
	}
	
	private void addPanels() {
		pLabel = new LabelPanel();
		pLabel.setBounds(10,10, pLabel.getWidth(), pLabel.getHeight());
		add(pLabel);
	}
	
	
	
	private void setButtons() {
		
	}
	
	private void setList() {
		
	}
	
	private void setFrame() {
		setSize(800,600);
		setTitle("Beregn din loen");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
	}
	
	
	
}
