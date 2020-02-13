import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.MatteBorder;

public class calculator {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField lableans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
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
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 705, 442);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(271, 88, 138, 34);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterYourFirst = new JLabel("Enter your first number");
		lblEnterYourFirst.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEnterYourFirst.setBounds(28, 89, 210, 24);
		frame.getContentPane().add(lblEnterYourFirst);
		
		JLabel lblEnterYourSecond = new JLabel("Enter your second number");
		lblEnterYourSecond.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEnterYourSecond.setBounds(28, 170, 219, 34);
		frame.getContentPane().add(lblEnterYourSecond);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(271, 170, 138, 34);
		frame.getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int num1,num2,reslt;
					num1=Integer.parseInt(textField.getText());
					num2=Integer.parseInt(textField_1.getText());
					reslt=(num1+num2);
					lableans.setText(Integer.toString(reslt));
					
				}catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null,"Eneter Valid Number");
				}
			}
		});
		btnNewButton.setBounds(64, 262, 85, 34);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("*");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int num1,num2,reslt;
					num1=Integer.parseInt(textField.getText());
					num2=Integer.parseInt(textField_1.getText());
					reslt=(num1*num2);
					lableans.setText(Integer.toString(reslt));
					
				}catch(Exception e2)
				{
					JOptionPane.showMessageDialog(null,"Eneter Valid Number");
				}
			}
			
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(213, 262, 85, 34);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("-");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int num1,num2,reslt;
					num1=Integer.parseInt(textField.getText());
					num2=Integer.parseInt(textField_1.getText());
					reslt=(num1-num2);
					lableans.setText(Integer.toString(reslt));
					
				}catch(Exception e3)
				{
					JOptionPane.showMessageDialog(null,"Eneter Valid Number");
				}
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnNewButton_2.setBounds(351, 262, 85, 34);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int num1,num2,reslt;
					num1=Integer.parseInt(textField.getText());
					num2=Integer.parseInt(textField_1.getText());
					reslt=(num1/num2);
					lableans.setText(Integer.toString(reslt));
					
				}catch(Exception e4)
				{
					JOptionPane.showMessageDialog(null,"Eneter Valid Number");
				}
			}
		
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_3.setBounds(487, 262, 85, 34);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblResult = new JLabel("Result:");
		lblResult.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblResult.setBounds(28, 318, 85, 41);
		frame.getContentPane().add(lblResult);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.PINK);
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(28, 10, 641, 68);
		frame.getContentPane().add(panel);
		
		JLabel lblCalculator = new JLabel("Calculator");
		lblCalculator.setForeground(Color.GREEN);
		lblCalculator.setFont(new Font("Tahoma", Font.BOLD, 50));
		panel.add(lblCalculator);
		
		lableans = new JTextField();
		lableans.setBounds(112, 330, 76, 24);
		frame.getContentPane().add(lableans);
		lableans.setColumns(10);
		
		JButton btnClearAll = new JButton("Clear All");
		btnClearAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					textField.setText(null);
					textField_1.setText(null);
					lableans.setText(null);
					
			}
		});
		btnClearAll.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnClearAll.setBounds(213, 325, 103, 34);
		frame.getContentPane().add(btnClearAll);
	}
}
