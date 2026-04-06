package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GestorAdministrativo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestorAdministrativo frame = new GestorAdministrativo();
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
	public GestorAdministrativo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(150, 10));
		panel.setBackground(new Color(255, 248, 223));
		contentPane.add(panel, BorderLayout.WEST);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\bonitathebrand\\35oremoe.png"));
		lblNewLabel.setBounds(-93, 11, 233, 37);
		panel.add(lblNewLabel);
		
		JButton btnPantalones = new JButton("Pantalones & Jeans");
		btnPantalones.setBounds(10, 69, 130, 23);
		panel.add(btnPantalones);
		
		JButton btnCasacas = new JButton("Casacas");
		btnCasacas.setBounds(10, 96, 130, 23);
		panel.add(btnCasacas);
		
		JButton btnPedidos = new JButton("Gestión de Pedidos");
		btnPedidos.setBounds(10, 123, 130, 23);
		panel.add(btnPedidos);
		
		JButton btnConfiguracion = new JButton("Configuración");
		btnConfiguracion.setBounds(10, 157, 130, 23);
		panel.add(btnConfiguracion);
		
		JPanel panelContenido = new JPanel();
		panelContenido.setBackground(new Color(255, 255, 255));
		contentPane.add(panelContenido, BorderLayout.CENTER);
		panelContenido.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("GESTIÓN DE PRODUCTOS");
		lblNewLabel_1.setFont(new Font("Agency FB", Font.BOLD, 12));
		lblNewLabel_1.setBounds(73, 11, 145, 14);
		panelContenido.add(lblNewLabel_1);
		
		JButton btnNuevaPrenda = new JButton("+Nueva Prenda");
		btnNuevaPrenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaSubirPrenda formulario= new VentanaSubirPrenda();
				formulario.setLocationRelativeTo(null);
				formulario.setVisible(true);
			}
		});
		btnNuevaPrenda.setBackground(new Color(225, 251, 206));
		btnNuevaPrenda.setBounds(251, 8, 123, 23);
		panelContenido.add(btnNuevaPrenda);

	}
}
