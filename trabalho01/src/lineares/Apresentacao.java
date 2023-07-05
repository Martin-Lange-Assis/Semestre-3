// Andre Heller E Martin Lange de Assis

package lineares;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Closeable;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Component;

import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;

public class Apresentacao<T> {

	private JFrame frame;
	private Pilha<T> pilha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Apresentacao<?> window = new Apresentacao();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Apresentacao() {

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 405, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel("Selecione o tipo de pilha (Estática ou Dinâmica):");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(23, 44, 361, 65);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().add(lblNewLabel);

		JComboBox<String> cbPilha = new JComboBox<String>();
		cbPilha.setFont(new Font("Tahoma", Font.BOLD, 14));
		cbPilha.setBounds(44, 108, 272, 55);
		cbPilha.setModel(new DefaultComboBoxModel(new String[] {"Dinâmica", "Estática"}));
		cbPilha.setForeground(Color.BLACK);
		cbPilha.setBackground(new Color(192, 192, 192));
		cbPilha.setToolTipText("");
		frame.getContentPane().add(cbPilha);

		JButton btnNewButton = new JButton("Enter");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(123, 175, 112, 35);
		frame.getContentPane().add(btnNewButton);

		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (cbPilha.getSelectedIndex() == 0) {
					CalculadoraDinamica.main(null);
					frame.setVisible(false);

				} else if (cbPilha.getSelectedIndex() == 1) {
					CalculadoraEstatica.main(null);
					frame.setVisible(false);
				}
			}
		});
	}
}