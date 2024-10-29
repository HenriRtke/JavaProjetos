package idiomaswing;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.SwingConstants;

public class IdiomaSwing extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IdiomaSwing  frame = new IdiomaSwing ();
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
	public IdiomaSwing () {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 424, 266);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Idioma do Sistema:");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblNewLabel.setBounds(221, 22, 144, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 62));
		lblNewLabel_1.setBounds(171, 47, 211, 97);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Mostrar Idioma");
		btnNewButton.setBackground(new Color(255, 255, 128));
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        String linguagemDoSistema = System.getProperty("user.language");
			    lblNewLabel_1.setText(linguagemDoSistema.toString());;
			}
		});
		btnNewButton.setBounds(221, 141, 144, 23);
		contentPane.add(btnNewButton);
		
		// Cria uma JLabel
        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setBounds(0, 11, 200, 171);

        // Carrega a imagem do arquivo (substitua o caminho pela localização real da sua imagem)
        ImageIcon originalIcon = new ImageIcon("C:\\Users\\higor\\OneDrive\\Imagens\\linguas.jpg");

        // Obtém a imagem do ImageIcon
        Image originalImage = originalIcon.getImage();

        // Redimensiona a imagem para a largura e altura desejadas
        int larguraDesejada = 200;
        int alturaDesejada = 150;
        Image novaImagem = originalImage.getScaledInstance(larguraDesejada, alturaDesejada, Image.SCALE_SMOOTH);

        // Atualiza o ImageIcon com a nova imagem redimensionada
        ImageIcon novoIcone = new ImageIcon(novaImagem);

        // Define o ImageIcon na JLabel
        lblNewLabel_2.setIcon(novoIcone);

        // Adiciona a JLabel ao JFrame
        getContentPane().add(lblNewLabel_2);

        // Configurações básicas do JFrame
        setSize(405, 265);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza o JFrame na tela
        setVisible(true);
	}
}

