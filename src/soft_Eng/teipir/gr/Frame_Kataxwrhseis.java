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
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTree;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JSlider;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame_Kataxwrhseis extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame_Kataxwrhseis frame = new Frame_Kataxwrhseis();
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
	public Frame_Kataxwrhseis() {
		setTitle("\u039A\u03B1\u03C4\u03B1\u03C7\u03CE\u03C1\u03B7\u03C3\u03B7 \u03B5\u03B3\u03B3\u03C1\u03B1\u03C6\u03AE\u03C2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 634, 524);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\u03A0\u03B5\u03C1\u03B9\u03BF\u03C7\u03AE");
		
		JLabel lblNewLabel_1 = new JLabel("\u0395\u03AF\u03B4\u03BF\u03C2");
		
		JLabel lblNewLabel_2 = new JLabel("\u0395\u03BC\u03B2\u03B1\u03B4\u03CC\u03BD");
		
		JLabel lblNewLabel_3 = new JLabel("\u038C\u03C1\u03BF\u03C6\u03BF\u03C2");
		
		JLabel lblNewLabel_4 = new JLabel("\u0388\u03C4\u03BF\u03C2 \u039A\u03B1\u03C4\u03B1\u03C3\u03BA\u03B5\u03C5\u03AE\u03C2");
		
		JLabel lblNewLabel_5 = new JLabel("\u03A5\u03C0\u03BD\u03BF\u03B4\u03C9\u03BC\u03AC\u03C4\u03B9\u03B1");
		
		JLabel lblNewLabel_6 = new JLabel("\u039C\u03C0\u03AC\u03BD\u03B9\u03B1");
		
		JLabel lblNewLabel_7 = new JLabel("\u0395\u03C0\u03B9\u03C0\u03BB\u03AD\u03BF\u03BD");
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("\u03A0\u03AC\u03C1\u03BA\u03B9\u03BD\u03B3\u03BA");
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("\u03A4\u03B6\u03AC\u03BA\u03B9");
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("\u0397\u03BB\u03B9\u03B1\u03BA\u03CC\u03C2");
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("\u039A\u03AE\u03C0\u03BF\u03C2");
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("\u0391\u03C0\u03BF\u03B8\u03AE\u03BA\u03B7");
		
		textField_1 = new JTextField();
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		String orofos[] = {"Ισόγειο", "1ος όροφος", "2ος όροφος", "3ος όροφος", "4ος όροφος", "5ος όροφος", "6ος όροφος"};
		JComboBox comboBox_orofos = new JComboBox(orofos);
		
		String eidos[] = {"Μεζονέτα","Πολυκατοικία","Οικόπεδο"};
		JComboBox comboBox_eidos = new JComboBox(eidos);
		
		String ar_dwmatiwn[] = {"-","1","2","3","4","5","6","7","8","9"};
		JComboBox comboBox_dwmatia = new JComboBox(ar_dwmatiwn);
		
		String ar_mpaniwn[] = {"-","1","2","3","4","5","6","7","8","9"};
		JComboBox comboBox_mpania = new JComboBox(ar_mpaniwn);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JLabel label = new JLabel("\u0391\u03C1\u03B9\u03B8\u03BC\u03CC\u03C2 \u03BA\u03B1\u03C4\u03B1\u03C7\u03CE\u03C1\u03B7\u03C3\u03B7\u03C2");
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("\u039F\u03BD\u03BF\u03BC\u03B1\u03C4\u03B5\u03C0\u03CE\u03BD\u03C5\u03BC\u03BF");
		
		JLabel lblNewLabel_8 = new JLabel("\u03A4\u03B7\u03BB\u03AD\u03C6\u03C9\u03BD\u03BF");
		
		JLabel lblNewLabel_10 = new JLabel("\u03A6\u03CD\u03C3\u03B7 \u03B5\u03B3\u03B3\u03C1\u03B1\u03C6\u03AE\u03C2");
		
		JLabel lblNewLabel_11 = new JLabel("\u03A3\u03A4\u039F\u0399\u03A7\u0395\u0399\u0391 \u03A0\u0395\u039B\u0391\u03A4\u0397");
		
		String fysh[] = {"Ενοικίαση","Πώληση","Αντιπαροχή","Πλειστηριασμός"};
		JComboBox comboBox = new JComboBox(fysh);
		
		JLabel lblNewLabel_12 = new JLabel("\u0391\u03C1\u03B9\u03B8\u03BC\u03CC\u03C2 \u039A\u03B1\u03C4\u03B1\u03C7\u03CE\u03C1\u03B7\u03C3\u03B7\u03C2");
		
		textField = new JTextField();
		textField.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_12)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_7)
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(chckbxNewCheckBox_4)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(chckbxNewCheckBox)
										.addComponent(chckbxNewCheckBox_2))
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(chckbxNewCheckBox_3)
										.addComponent(chckbxNewCheckBox_1)))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_4)
								.addComponent(lblNewLabel)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel_2)
								.addComponent(lblNewLabel_3)
								.addComponent(lblNewLabel_5)
								.addComponent(lblNewLabel_6)
								.addComponent(lblNewLabel_10))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBox_dwmatia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_mpania, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(comboBox_eidos, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(comboBox_orofos, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addComponent(textField, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(comboBox, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_8)
						.addComponent(lblNewLabel_9))
					.addGap(50)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(34)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(lblNewLabel_11)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(296)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(139)
							.addComponent(label))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_12)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(17)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_10)
						.addComponent(label)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1)
								.addComponent(comboBox_eidos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(20)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_2)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBox_orofos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_3))
							.addGap(15)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_4)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_5)
									.addGap(18)
									.addComponent(lblNewLabel_6))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(comboBox_dwmatia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(comboBox_mpania, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGap(5))
						.addComponent(lblNewLabel_11))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(29)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(chckbxNewCheckBox)
								.addComponent(chckbxNewCheckBox_1)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblNewLabel_8))
								.addComponent(lblNewLabel_7))))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxNewCheckBox_2)
						.addComponent(chckbxNewCheckBox_3)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_9))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(chckbxNewCheckBox_4))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
