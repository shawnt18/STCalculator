/* SThai_Calculator.java
 * An implementation of a simple calculator for educational purposes.
 * Author: Shawn Thai */

/* REQUIREMENTS:
 * - Digit buttons from 0-9
 * - Basic operations: +, -, /, *, =
 * - Clear button: C
 * - Backspace button: Back */

/* PLAN:
 * 1) Draw out the shapes and make clickable
 * 2) Functionality of number buttons
 * 3) Functionality of clear button
 * 4) Functionality of operation buttons
 * 5) Functionality of backspace button */

import javax.swing.*;
import java.awt.*;
	
public class STCalculator extends JFrame {

	private JPanel p;
	private JButton b1;
	private JLabel lab;

	public STCalculator() {
		super("Frame Test"); // calls JFrame constructor

		p = new JPanel();
		p.setBackground(Color.YELLOW);

		b1 = new JButton("Test");
		lab = new JLabel("This is a test label");

		p.add(b1);
		p.add(lab);

		add(p);	// adds to current object (SThai_Calculator calc)
	}

	public static void main(String []args) {
		STCalculator calc = new STCalculator();
		calc.setVisible(true);
		calc.setSize(500,700);
        calc.setLocationRelativeTo(null);	// sets window to center of screen
		calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // enables close operation
	}
}	