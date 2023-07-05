package lineares;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Operacoes<T> {

	private JFrame frame;
	private JTextField tfCalculo;
	private JLabel resultadoLabel;

	/**
	 * Create the application.
	 */
	public Operacoes(Pilha<T> pilha) {
		initialize(pilha);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Pilha<T> pilha) {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Digite a operação:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(25, 30, 139, 20);
		frame.getContentPane().add(lblNewLabel);

		tfCalculo = new JTextField();
		tfCalculo.setBounds(170, 30, 234, 20);
		frame.getContentPane().add(tfCalculo);
		tfCalculo.setColumns(10);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(157, 75, 117, 29);
		frame.getContentPane().add(btnCalcular);
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculadora<T> calc = new Calculadora<T>();
				String expressao = tfCalculo.getText();
				try {
					String resultado = calc.calcular(expressao);
					resultadoLabel.setText("Resultado: " + resultado);
				} catch (ArithmeticException ex) {
					resultadoLabel.setText("Erro: " + ex.getMessage());
				}
			}
		});

		resultadoLabel = new JLabel("");
		resultadoLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		resultadoLabel.setBounds(25, 130, 379, 20);
		frame.getContentPane().add(resultadoLabel);

		frame.setVisible(true);
	}
}
