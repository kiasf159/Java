package calculator;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
	private static final long serialVersionUID = 1L;
	private double number1 = 0;
	private double number2 = 0;
	private String result;
	private double tmp = 0;
	private double distinction = 0;
	private int operator;
	
	public Calculator(String title)
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		setTitle(title);
		
		setLayout(new BorderLayout());
		JTextField tf = new JTextField();
		tf.setText("0");
		tf.setHorizontalAlignment(JTextField.RIGHT);
		add(tf, BorderLayout.NORTH);
		
		JPanel cp = new JPanel(new GridLayout(4, 4, 15, 10));
		JButton seven = new JButton("7"); JButton eight = new JButton("8"); JButton nine = new JButton("9"); JButton div = new JButton("¡À");
		JButton four = new JButton("4"); JButton five = new JButton("5"); JButton six = new JButton("6"); JButton mul = new JButton("¡¿");
		JButton one = new JButton("1"); JButton two = new JButton("2"); JButton three = new JButton("3"); JButton sub = new JButton("-");
		JButton zero = new JButton("0"); JButton reset = new JButton("C"); JButton enter = new JButton("="); JButton ad = new JButton("+");
		cp.add(seven); cp.add(eight); cp.add(nine); cp.add(div);
		cp.add(four); cp.add(five); cp.add(six); cp.add(mul);
		cp.add(one); cp.add(two); cp.add(three); cp.add(sub);
		cp.add(zero); cp.add(reset); cp.add(enter); cp.add(ad);
		add(cp, BorderLayout.CENTER);
		
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				tf.setText("7");
				if(distinction == 0)
				{
					number1 = 7;
					distinction++;
				}
				if(distinction == 1)
				{
					number2 = 7;
				}
			}
		});
		
		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				tf.setText("8");
				if(distinction == 0)
				{
					number1 = 8;
					distinction++;
				}
				if(distinction == 1)
				{
					number2 = 8;
				}
			}
		});
		
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				tf.setText("9");
				if(distinction == 0)
				{
					number1 = 9;
					distinction++;
				}
				if(distinction == 1)
				{
					number2 = 9;
				}
			}
		});
		
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				tf.setText("4");
				if(distinction == 0)
				{
					number1 = 4;
					distinction++;
				}
				if(distinction == 1)
				{
					number2 = 4;
				}
			}
		});
		
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				tf.setText("5");
				if(distinction == 0)
				{
					number1 = 5;
					distinction++;
				}
				if(distinction == 1)
				{
					number2 = 5;
				}
			}
		});
		
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				tf.setText("6");
				if(distinction == 0)
				{
					number1 = 6;
					distinction++;
				}
				if(distinction == 1)
				{
					number2 = 6;
				}
			}
		});
		
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				tf.setText("1");
				if(distinction == 0)
				{
					number1 = 1;
					distinction++;
				}
				if(distinction == 1)
				{
					number2 = 1;
				}
			}
		});
		
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				tf.setText("2");
				if(distinction == 0)
				{
					number1 = 2;
					distinction++;
				}
				if(distinction == 1)
				{
					number2 = 2;
				}
			}
		});
		
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				tf.setText("3");
				if(distinction == 0)
				{
					number1 = 3;
					distinction++;
				}
				if(distinction == 1)
				{
					number2 = 3;
				}
			}
		});
		
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				tf.setText("0");
				if(distinction == 0)
				{
					number1 = 0;
					distinction++;
				}
				if(distinction == 1)
				{
					number2 = 0;
				}
			}
		});
		
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				tf.setText("0");
				distinction = 0;
				operator = 0;
				number1 = 0; number2 = 0;
				
			}
		});
		
		ad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				operator = 1;
			}
		});
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				operator = 2;
			}
		});
		
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				operator = 3;
			}
		});
		
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				operator = 4;
			}
		});
		enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				switch(operator)
				{
				case 1: 
					tmp = number1 + number2;
					result = Double.toString(tmp);
					tf.setText(result);
					number1 = tmp;
					break;
				case 2: 
					tmp = number1 - number2;
					result = Double.toString(tmp);
					tf.setText(result);
					number1 = tmp;
					break;
				case 3: 
					tmp = number1 * number2;
					result = Double.toString(tmp);
					tf.setText(result);
					number1 = tmp;
					break;
				case 4: 
					tmp = number1 / number2;
					result = Double.toString(tmp);
					tf.setText(result);
					number1 = tmp;
					break;
					default:
						tf.setText("Error, Try again");
				}
			}
		});
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		Calculator cal = new Calculator("calculator");
	}

}
