package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Window.Type;
import java.awt.Color;
import java.awt.SystemColor;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField input;
	private JTextField label1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	
	private double answer, number;
	int operation;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void addInput(String string) {
		input.setText(input.getText() + string);
	
	}
	
	public void calculate() {
		switch (operation) {
		case 1: answer = number + Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
			
		case 2: answer = number - Double.parseDouble(input.getText());
		input.setText(Double.toString(answer));
		break;
		
		case 3: answer = number * Double.parseDouble(input.getText());
		input.setText(Double.toString(answer));
		break;
		
		case 4: answer = number / Double.parseDouble(input.getText());
		input.setText(Double.toString(answer));
		break;

		
		}
		
	}
	
	

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setForeground(Color.LIGHT_GRAY);
		setType(Type.UTILITY);
		setTitle("HESAP MAKİNESİ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 429, 470);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel screen = new JPanel();
		screen.setBounds(10, 11, 393, 69);
		contentPane.add(screen);
		screen.setLayout(null);
		
		input = new JTextField();
		input.setBackground(new Color(0, 255, 255));
		input.setFont(new Font("Tahoma", Font.BOLD, 25));
		input.setHorizontalAlignment(SwingConstants.RIGHT);
		input.setBounds(0, 27, 393, 42);
		screen.add(input);
		input.setColumns(10);
		
		label1 = new JTextField();
		label1.setBackground(new Color(192, 192, 192));
		label1.setHorizontalAlignment(SwingConstants.RIGHT);
		label1.setFont(new Font("Tahoma", Font.BOLD, 20));
		label1.setBounds(0, 0, 393, 28);
		screen.add(label1);
		label1.setColumns(10);
		
		JPanel control = new JPanel();
		control.setBackground(Color.DARK_GRAY);
		control.setBounds(10, 91, 393, 329);
		contentPane.add(control);
		control.setLayout(new GridLayout(4, 4, 20, 20));
		
		btnNewButton_1 = new JButton("7");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		control.add(btnNewButton_1);
		
		btnNewButton_4 = new JButton("8");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		control.add(btnNewButton_4);
		
		btnNewButton_2 = new JButton("9");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		control.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("+");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation =1;
				input.setText("");
				label1.setText(number + e.getActionCommand());
			
			}
		});
		control.add(btnNewButton_3);
		
		JButton btnNewButton_8 = new JButton("4");
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		control.add(btnNewButton_8);
		
		btnNewButton = new JButton("5");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		control.add(btnNewButton);
		
		btnNewButton_6 = new JButton("6");
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		control.add(btnNewButton_6);
		
		JButton btnNewButton_12 = new JButton("-");
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation =2;
				input.setText("");
				label1.setText(number + e.getActionCommand());
			
			}
		});
		control.add(btnNewButton_12);
		
		JButton btnNewButton_9 = new JButton("1");
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		control.add(btnNewButton_9);
		
		JButton btnNewButton_13 = new JButton("2");
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		control.add(btnNewButton_13);
		
		btnNewButton_5 = new JButton("3");
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		control.add(btnNewButton_5);
		
		JButton btnNewButton_7 = new JButton("*");
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation =3;
				input.setText("");
				label1.setText(number + e.getActionCommand());
			
			}
		});
		control.add(btnNewButton_7);
		
		JButton btnNewButton_10 = new JButton("0");
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		control.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("=");
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
			}
		});
		control.add(btnNewButton_11);
		
		JButton btnC = new JButton("c");
		btnC.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText("");
			}
		});
		control.add(btnC);
		
		JButton btnNewButton_15 = new JButton("%");
		btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation =4;
				input.setText("");
				label1.setText(number + e.getActionCommand());
			
			}
		});
		control.add(btnNewButton_15);
	}
}
