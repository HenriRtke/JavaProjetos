package pacotesomaswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import java.awt.Font;

public class TelaSoma extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textN1;
	private JTextField textN2;
	private JTextField textN3;
	private JTextField textN4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaSoma frame = new TelaSoma();
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
	public TelaSoma() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\higor\\OneDrive\\Imagens\\eusabo.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 473, 481);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("MULTIPLICAÇÃO");
		lblNewLabel_6.setFont(new Font("Goudy Stout", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_6.setBounds(46, 57, 269, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_5 = new JLabel("0");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Goudy Stout", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_5.setBounds(339, 82, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		textN3 = new JTextField();
		textN3.setHorizontalAlignment(SwingConstants.CENTER);
		textN3.setBounds(48, 79, 86, 20);
		contentPane.add(textN3);
		textN3.setColumns(10);
		
		textN4 = new JTextField();
		textN4.setHorizontalAlignment(SwingConstants.CENTER);
		textN4.setBounds(144, 79, 86, 20);
		contentPane.add(textN4);
		textN4.setColumns(10);
		
		textN1 = new JTextField();
		textN1.setHorizontalAlignment(SwingConstants.CENTER);
		textN1.setBounds(48, 37, 86, 20);
		contentPane.add(textN1);
		textN1.setColumns(10);
		
		textN2 = new JTextField();
		textN2.setHorizontalAlignment(SwingConstants.CENTER);
		textN2.setBounds(144, 37, 86, 20);
		contentPane.add(textN2);
		textN2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("+");
		lblNewLabel.setBounds(134, 40, 26, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("0");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Goudy Stout", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1.setBounds(339, 40, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("=");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(textN1.getText()); //pegar inteiro dentro do caixa de texto
				int n2 = Integer.parseInt(textN1.getText());
				int s = n1 + n2;
				lblNewLabel_1.setText(Integer.toString(s));
			}
		});
		btnNewButton.setBounds(240, 36, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("SOMA");
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setFont(new Font("Goudy Stout", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_3.setBounds(48, 12, 95, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("*");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(114, 82, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton_1 = new JButton("=");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n3 = Integer.parseInt(textN1.getText()); //pegar inteiro dentro do caixa de texto
				int n4 = Integer.parseInt(textN1.getText());
				int s = n3 * n4;
				lblNewLabel_5.setText(Integer.toString(s));
			}
		});
		btnNewButton_1.setBounds(240, 78, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBackground(new Color(0, 64, 0));
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\higor\\OneDrive\\Imagens\\eusabo.jpg"));
		lblNewLabel_2.setBounds(0, 0, 464, 442);
		contentPane.add(lblNewLabel_2);
	}
}
