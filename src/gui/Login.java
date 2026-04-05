package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 314);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 251, 217));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ACCESO ADMINISTRATIVO ");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(115, 11, 258, 36);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(209, 209, 209)));
		panel.setBackground(new Color(255, 253, 240));
		panel.setBounds(92, 46, 229, 204);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setBounds(10, 34, 46, 14);
		panel.add(lblNewLabel_1);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(10, 50, 172, 20);
		panel.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Contraseña");
		lblNewLabel_2.setBounds(10, 81, 103, 14);
		panel.add(lblNewLabel_2);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(10, 106, 172, 20);
		panel.add(txtPassword);
		
		JButton btnIniciar = new JButton("INICIAR SESIÓN");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
			
		});
		btnIniciar.setBackground(new Color(188, 180, 214));
		btnIniciar.setBounds(42, 144, 124, 23);
		panel.add(btnIniciar);
		
		JLabel lblNewLabel_3 = new JLabel("<html><u>Regresar a tienda</u></html>");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PantallaBienvenida principal = new PantallaBienvenida();
				principal.setVisible(true);
				principal.setLocationRelativeTo(null);
				dispose();
			}
		});
		lblNewLabel_3.setForeground(new Color(0, 102, 204));
		lblNewLabel_3.setBounds(58, 179, 124, 14);
		lblNewLabel_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		panel.add(lblNewLabel_3);

	}
}
