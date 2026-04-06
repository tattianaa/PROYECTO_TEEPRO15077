package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaSubirPrenda extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtStock;
	private JTextField txtPrecio;
	private JTextField txtNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VentanaSubirPrenda dialog = new VentanaSubirPrenda();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VentanaSubirPrenda() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Nombre: ");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNewLabel.setBounds(10, 34, 68, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Precio S/.:");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNewLabel_1.setBounds(10, 68, 68, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Stock: ");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNewLabel_2.setBounds(10, 96, 46, 14);
			contentPanel.add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("Categoría: ");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
			lblNewLabel_3.setBounds(10, 130, 68, 14);
			contentPanel.add(lblNewLabel_3);
		}
		
		JComboBox cbxCategoria = new JComboBox();
		cbxCategoria.setModel(new DefaultComboBoxModel(new String[] {"PANTALONES", "CASACAS"}));
		cbxCategoria.setBounds(76, 122, 95, 22);
		contentPanel.add(cbxCategoria);
		
		txtStock = new JTextField();
		txtStock.setBounds(76, 93, 95, 20);
		contentPanel.add(txtStock);
		txtStock.setColumns(10);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(76, 59, 95, 20);
		contentPanel.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(76, 32, 95, 20);
		contentPanel.add(txtNombre);
		txtNombre.setColumns(10);
		
		JButton btnSeleccionarImagen = new JButton("Seleccionar Imagen");
		btnSeleccionarImagen.setBounds(270, 31, 154, 23);
		contentPanel.add(btnSeleccionarImagen);
		
		JLabel lblVistaPrevia = new JLabel("");
		lblVistaPrevia.setBorder(new LineBorder(new Color(215, 210, 208), 1, true));
		lblVistaPrevia.setBounds(270, 58, 154, 65);
		contentPanel.add(lblVistaPrevia);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnGuardar = new JButton("GUARDAR");
				btnGuardar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(txtNombre.getText().isEmpty()||txtPrecio.getText().isEmpty()) {
							JOptionPane.showMessageDialog(null, "Por favor, completa los campos");
						} 
						else {
							JOptionPane.showMessageDialog(null, "Producto " + txtNombre.getText()+ " registrado en la categoría" + cbxCategoria.getSelectedItem());
							dispose();
						}
					}
				});
				btnGuardar.setBackground(new Color(198, 232, 219));
				btnGuardar.setActionCommand("OK");
				buttonPane.add(btnGuardar);
				getRootPane().setDefaultButton(btnGuardar);
			}
			{
				JButton btnCancelar = new JButton("CANCELAR");
				btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				btnCancelar.setBackground(new Color(224, 200, 230));
				btnCancelar.setActionCommand("Cancel");
				buttonPane.add(btnCancelar);
			}
		}
	}
}
