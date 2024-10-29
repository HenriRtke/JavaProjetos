package cursoemvideo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class TelaRelogio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaRelogio frame = new TelaRelogio();
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
	public TelaRelogio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 349);
		contentPane = new JPanel();
		FlowLayout flowLayout = (FlowLayout) contentPane.getLayout();
		flowLayout.setVgap(17);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Data e Hora para Ao mossar");
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblNewLabel.setForeground(new Color(255, 128, 64));
		lblNewLabel.setBackground(new Color(64, 128, 128));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\higor\\OneDrive\\Imagens\\image.gif"));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Clique no botão para saber Data e Hora se ja pode Ao mossar");
		lblNewLabel_1.setFont(new Font("Cooper Black", Font.PLAIN, 13));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		contentPane.add(lblNewLabel_1);
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Ja pode Ao mossar?");
		btnNewButton.setForeground(new Color(255, 128, 0));
		btnNewButton.setBackground(new Color(255, 203, 179));
		btnNewButton.setFont(new Font("Segoe Print", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setText("PODE !!");
				Date relogio = new Date();
				lblNewLabel_2.setText(relogio.toString());
			}
			
			
			
		});
		contentPane.add(btnNewButton);


	}

}
