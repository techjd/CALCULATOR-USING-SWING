package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class hellogui {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnAdd;
	private JButton btnSubtract;
	private JTextField textField_2;
	private JLabel lblAnswer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hellogui window = new hellogui();
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
	public hellogui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 891, 471);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 26));
		textField.setBackground(Color.GREEN);
		textField.setBounds(99, 21, 293, 97);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		textField_1.setBackground(Color.CYAN);
		textField_1.setBounds(450, 21, 293, 97);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1 , num2 , answer;
				
				try {
					num1 = Integer.parseInt(textField.getText());
					num2 = Integer.parseInt(textField_1.getText());
					
					answer = num1 + num2 ;
					textField_2.setText(Integer.toString(answer));
					
				        
				} 
				catch (Exception e1) {
					JOptionPane.showMessageDialog(null , "Please Enter a Valid Number");
				}
			}
		});
		btnAdd.setBackground(Color.YELLOW);
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnAdd.setBounds(230, 148, 188, 54);
		frame.getContentPane().add(btnAdd);
		
		btnSubtract = new JButton("Subtract");
		btnSubtract.setBackground(Color.YELLOW);
		btnSubtract.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                  int num1 , num2 , answer;
				
				try {
					num1 = Integer.parseInt(textField.getText());
					num2 = Integer.parseInt(textField_1.getText());
					
					answer = num1 - num2 ;
					textField_2.setText(Integer.toString(answer));
					
				        
				} 
				catch (Exception e1) {
					JOptionPane.showMessageDialog(null , "Please Enter a Valid Number");
				}
			}
		});
		btnSubtract.setBounds(442, 148, 188, 54);
		frame.getContentPane().add(btnSubtract);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 26));
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(322, 325, 228, 69);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		lblAnswer = new JLabel("Answer :");
		lblAnswer.setBackground(Color.LIGHT_GRAY);
		lblAnswer.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblAnswer.setBounds(203, 332, 109, 55);
		frame.getContentPane().add(lblAnswer);
		
		JButton btnMultiply = new JButton("Multiply");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                   int num1 , num2 , answer;
				
				try {
					num1 = Integer.parseInt(textField.getText());
					num2 = Integer.parseInt(textField_1.getText());
					
					answer = num1 * num2 ;
					textField_2.setText(Integer.toString(answer));
					
				        
				} 
				catch (Exception e1) {
					JOptionPane.showMessageDialog(null , "Please Enter a Valid Number");
				}
			}
		});
		btnMultiply.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnMultiply.setBackground(Color.YELLOW);
		btnMultiply.setBounds(230, 236, 188, 54);
		frame.getContentPane().add(btnMultiply);
		
		JButton btnDivide = new JButton("Divide");
		btnDivide.setBackground(Color.YELLOW);
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                  int num1 , num2 , answer;
				
				try {
					num1 = Integer.parseInt(textField.getText());
					num2 = Integer.parseInt(textField_1.getText());
					
					answer = num1 / num2 ;
					textField_2.setText(Integer.toString(answer));
					
				        
				} 
				catch (Exception e1) {
					JOptionPane.showMessageDialog(null , "Please Enter a Valid Number");
				}
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnDivide.setBounds(442, 236, 188, 54);
		frame.getContentPane().add(btnDivide);
	}
}
