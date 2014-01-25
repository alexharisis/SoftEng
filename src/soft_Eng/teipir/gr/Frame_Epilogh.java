package soft_Eng.teipir.gr;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Frame_Epilogh extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame_Epilogh frame = new Frame_Epilogh();
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
	public Frame_Epilogh() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\u0394\u0399\u0391\u0398\u0395\u03A3\u0399\u039C\u0395\u03A3 \u0395\u03A0\u0399\u039B\u039F\u0393\u0395\u03A3 \u03A7\u03A1\u0397\u03A3\u03A4\u0397 ");
		lblNewLabel.setFont(lblNewLabel.getFont().deriveFont(lblNewLabel.getFont().getStyle() | Font.BOLD | Font.ITALIC));
		lblNewLabel.setBackground(Color.ORANGE);
		
		JButton btnNewButton = new JButton("\u039A\u0391\u03A4\u0391\u03A7\u03A9\u03A1\u0397\u03A3\u0397");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame_Kataxwrhseis kat =  new Frame_Kataxwrhseis();
				kat.setVisible(true);
			}
		});
		
		JButton button = new JButton("\u03A4\u03A1\u039F\u03A0\u039F\u03A0\u039F\u0399\u0397\u03A3\u0397");
		
		JButton button_1 = new JButton("\u0391\u039D\u0391\u0396\u0397\u03A4\u0397\u03A3\u0397");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
		JButton button_2 = new JButton("\u0399\u03A3\u03A4\u039F\u03A1\u0399\u039A\u039F");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
							.addGap(103))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(button_1, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)))
							.addGap(18)
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(20)
					.addComponent(lblNewLabel)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(36, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
