package proyecto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class login extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario : ");
		lblUsuario.setFont(new Font("Traditional Arabic", Font.BOLD, 16));
		lblUsuario.setBounds(39, 76, 74, 14);
		panel.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a :");
		lblContrasea.setFont(new Font("Traditional Arabic", Font.BOLD, 15));
		lblContrasea.setBounds(39, 129, 92, 22);
		panel.add(lblContrasea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(130, 130, 92, 20);
		panel.add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(130, 73, 92, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblUsuarioOContrasea = new JLabel("Usuario o Contrase\u00F1a incorrecto");
		
		lblUsuarioOContrasea.setVisible(false);
		lblUsuarioOContrasea.setForeground(new Color(204, 0, 0));
		lblUsuarioOContrasea.setBounds(97, 208, 232, 14);
		panel.add(lblUsuarioOContrasea);
		
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(textField.getText().equals("Alfredo") && passwordField.getText().equals("LiderMachuca")) {
					principal p = new principal();
					p.setVisible(true);
					dispose();
				}else {
					System.out.println("Usuario o Contraseña incorrecto");			
				}
				lblUsuarioOContrasea.setVisible(true);
			}
		});
		btnAceptar.setBounds(130, 174, 89, 23);
		panel.add(btnAceptar);
		
		
	}
}
