import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class TestPanel extends JPanel implements ActionListener{
	JButton calculate;
	JLabel binaryLabel;
	JLabel octalLabel;
	JLabel decimalLabel;
	JLabel hexLabel;
	JLabel binaryNum;
	JLabel octalNum;
	JLabel decimalNum;
	JLabel hexNum;
	JTextField numToConvert;
	JComboBox<String> dropdown;
	
	public TestPanel(){
		binaryLabel = new JLabel("Binary");
		octalLabel = new JLabel("Octal");
		decimalLabel = new JLabel("Decimal");
		hexLabel = new JLabel("Hexadecimal");
		binaryNum = new JLabel();
		octalNum = new JLabel();
		decimalNum = new JLabel();
		hexNum = new JLabel();
		numToConvert = new JTextField("0");
		String[] array = {"Binary", "Octal", "Decimal", "Hexadecimal"};
		dropdown = new JComboBox<String>(array);
		dropdown.addActionListener(this);
		setLayout(new GridLayout(6,2));
		add(numToConvert);
		add(dropdown);
		add(binaryNum);
		add(binaryLabel);
		add(octalNum);
		add(octalLabel);
		add(decimalNum);
		add(decimalLabel);
		add(hexNum);
		add(hexLabel);
		
		
	}
	public void actionPerformed(ActionEvent e) {
		String stringConvert = "";
		stringConvert = numToConvert.getText();
		if (stringConvert.equals("")) {stringConvert = "0";}
		String stringBase = (String)dropdown.getSelectedItem();
		int base = 0;
		if (stringBase.equals("Binary")) {base = 2;}
		else if (stringBase.equals("Octal")) {base = 8;}
		else if (stringBase.equals("Hexadecimal")) {base = 16;}
		else if (stringBase.equals("Decimal")) {base = 10;}
		int decimal = Integer.parseInt(stringConvert, base);
		Conversion con = new Conversion(decimal);
		hexNum.setText(con.getHexConversion());
		binaryNum.setText(con.getBinConversion());
		octalNum.setText(con.getOctConversion());
		decimalNum.setText(con.getDecConversion());
		
		//getSelctedItem
	}
}