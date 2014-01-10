package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LabelPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private int X = 300; 
	private int Y = 150; 
	
	private boolean bonusNeeded = false; 
	
	private Font fHeader = new Font("Helvetica", Font.BOLD, 20);
	private Font fSubHeader = new Font("Helvetica", Font.ITALIC, 18);
	
	private JLabel lDate;  
	private JLabel lStdHours;
	private JLabel lStd;
	private JLabel lBonus;
	
	private JTextField tfDateD;
	private JTextField tfDateM;
	private JTextField tfDateY;
	private JTextField tfStdHours;
	
	private JCheckBox cbBonus; 
	
	public LabelPanel() {
		setSize(X, Y);
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		setLayout(null);
		
		setLabels();
		setTextFields();
		setCheckBox();
	}
	
	
	private void setLabels() {
		lStd = new JLabel("Dagsindtastning");
		
		
		lDate = new JLabel("Dag - Maaned - År"); 
		lStdHours = new JLabel("Timer");
		
		
		
		lStd.setFont(fHeader);
		lStd.setBounds(5,0,X,30);
		
		lDate.setFont(fSubHeader);
		lDate.setBounds(5, 30, X, 20);
		
		lStdHours.setFont(fSubHeader);
		lStdHours.setBounds(5, 90, X, 20);
		
		
		add(lStd); 
		add(lDate);
		add(lStdHours);
		
		
	}
	
	private void setTextFields() {
		
		// DATE TEXTFIELD //
		tfDateD = new JTextField("");
		tfDateM = new JTextField("");
		tfDateY = new JTextField("2013");
		
		tfDateD.setBounds(5, 50, 40, 20);
		tfDateM.setBounds(50, 50, 70, 20);
		tfDateY.setBounds(125, 50, 60, 20);
		
		
		add(tfDateD);
		add(tfDateM);
		add(tfDateY);
		
		// HRS FIELD //
		tfStdHours = new JTextField("");
		tfStdHours.setBounds(5, 110, 50, 20);
		add(tfStdHours);

	}
	
	private void setCheckBox() {
		lBonus = new JLabel("Tillaeg?");
		lBonus.setFont(new Font("Helvetica", Font.PLAIN, 15));
		lBonus.setBounds(180, 110, 100, 20);
		add(lBonus);
		
		cbBonus = new JCheckBox();
		cbBonus.setBounds(230, 110, 25, 25);
		cbBonus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				bonusNeeded = cbBonus.isSelected();
			}
		});
		add(cbBonus);
	}
	
}
