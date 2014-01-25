package soft_Eng.teipir.gr;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPasswordField;
import javax.swing.ListSelectionModel;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;

public class Frame_login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JComboBox comboBox_type;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame_login frame = new Frame_login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
			 
	   
	/**
	 * Create the frame.
	 */
	public Frame_login() {
		setTitle("Login as...");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 308, 207);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			
			}
		});
		textField.setColumns(10);
		
		JLabel Label1 = new JLabel("Username");
		
		JLabel Label2 = new JLabel("Password");
		
		passwordField = new JPasswordField();
		passwordField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		String type[] = {"Διαχειριστής","Υπάλληλος"};
		comboBox_type = new JComboBox(type);
		
		
		
		lblNewLabel = new JLabel("Type");
		
		JButton btnNewButton = new JButton("\u0395\u03AF\u03C3\u03BF\u03B4\u03BF\u03C2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Frame_Epilogh eis =  new Frame_Epilogh();
				eis.setVisible(true);
			}
			
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addGap(65))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(Label1)
							.addGap(39))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(Label2)
							.addGap(42)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(textField, Alignment.LEADING)
							.addComponent(passwordField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
						.addComponent(comboBox_type, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(75, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap(26, Short.MAX_VALUE)
							.addComponent(lblNewLabel)
							.addGap(20))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(22)
							.addComponent(comboBox_type, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(Label1)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(15)
							.addComponent(Label2)))
					.addGap(14)
					.addComponent(btnNewButton)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
