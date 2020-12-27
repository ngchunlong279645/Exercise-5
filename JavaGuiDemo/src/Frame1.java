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

public class Frame1 {

	private JFrame frame;
	private JTextField Num1;
	private JTextField Num2;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
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
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 358);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Num1 = new JTextField();
		Num1.setBounds(30, 30, 170, 40);
		frame.getContentPane().add(Num1);
		Num1.setColumns(10);
		
		Num2 = new JTextField();
		Num2.setBounds(226, 30, 170, 40);
		frame.getContentPane().add(Num2);
		Num2.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int num1,num2,ans;
					try {
						num1=Integer.parseInt(Num1.getText());
						num2=Integer.parseInt(Num2.getText());
						ans=num1+num2;
						textField.setText(Integer.toString(ans));
						
					}catch(Exception e){
						JOptionPane.showMessageDialog(null, "PLEASE ENTER VALID NUMBER!");
					}
			}
		});
		btnNewButton.setBounds(30, 100, 170, 40);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("MINUS");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try {
					num1=Integer.parseInt(Num1.getText());
					num2=Integer.parseInt(Num2.getText());
					ans=num1-num2;
					textField.setText(Integer.toString(ans));
					
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, "PLEASE ENTER VALID NUMBER!");
				}
			}
		});
		btnNewButton_1.setBounds(226, 100, 170, 40);
		frame.getContentPane().add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(226, 236, 170, 60);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("The Answer :");
		lblNewLabel.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 14));
		lblNewLabel.setBounds(69, 245, 131, 40);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("MULTIPLY");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1,num2,ans;
				try {
					num1=Integer.parseInt(Num1.getText());
					num2=Integer.parseInt(Num2.getText());
					ans=num1*num2;
					textField.setText(Integer.toString(ans));
					
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, "PLEASE ENTER VALID NUMBER!");
				}
				
			}
		});
		btnNewButton_2.setBounds(30, 151, 170, 40);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("DIVIDE");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try {
					num1=Integer.parseInt(Num1.getText());
					num2=Integer.parseInt(Num2.getText());
					ans=num1/num2;
					textField.setText(Integer.toString(ans));
					
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, "PLEASE ENTER VALID NUMBER!");
				}
			}
		});
		btnNewButton_3.setBounds(226, 151, 170, 40);
		frame.getContentPane().add(btnNewButton_3);
	}
}
