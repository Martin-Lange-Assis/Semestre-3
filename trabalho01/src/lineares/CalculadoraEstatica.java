// Andre Heller E Martin Lange de Assis
package lineares;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JLabel;

public class CalculadoraEstatica {
	
	private JFrame frame;
	Calculadora<PilhaVetor> calculadora = new Calculadora<PilhaVetor>();
	private JTextField txtExpressao;
	

	
	

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraEstatica window = new CalculadoraEstatica();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @param <T>
	 */
	public <T> CalculadoraEstatica() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 531, 340);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton botaoExecutar = new JButton("Executar");
		botaoExecutar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = "";
				try {
					str += txtExpressao.getText();
					String calculo = calculadora.calcular(str);
					txtExpressao.setText(calculo);
				} catch (ArithmeticException e1) {

					JOptionPane.showMessageDialog(botaoExecutar, e1);
				} catch (IllegalArgumentException e3) {
					JOptionPane.showMessageDialog(botaoExecutar, e3);
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(botaoExecutar, e2);
				}
			}
		});
		
		txtExpressao = new JTextField();
		txtExpressao.setHorizontalAlignment(SwingConstants.RIGHT);
		txtExpressao.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtExpressao.setColumns(10);
		txtExpressao.setBounds(30, 22, 470, 51);
		frame.getContentPane().add(txtExpressao);
		botaoExecutar.setToolTipText("");
		botaoExecutar.setForeground(Color.WHITE);
		botaoExecutar.setFont(new Font("Tahoma", Font.BOLD, 16));
		botaoExecutar.setBackground(Color.BLACK);
		botaoExecutar.setBounds(373, 236, 132, 46);
		frame.getContentPane().add(botaoExecutar);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str= txtExpressao.getText();
				txtExpressao.setText(str+= "7");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(30, 128, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnSpace = new JButton("Space");
		btnSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str= txtExpressao.getText();
				txtExpressao.setText(str+= " ");
			}
		});
		btnSpace.setFont(new Font("Script MT Bold", Font.BOLD, 16));
		btnSpace.setBounds(145, 248, 195, 23);
		frame.getContentPane().add(btnSpace);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setBounds(20, 106, 485, 9);
		frame.getContentPane().add(separator);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str= txtExpressao.getText();
				txtExpressao.setText(str+= "8");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(145, 128, 100, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("9");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str= txtExpressao.getText();
				txtExpressao.setText(str+= "9");
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBounds(266, 128, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str= txtExpressao.getText();
				txtExpressao.setText(str+= "4");
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4.setBounds(30, 162, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("1");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str= txtExpressao.getText();
				txtExpressao.setText(str+= "1");
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_5.setBounds(30, 196, 89, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("0");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str= txtExpressao.getText();
				txtExpressao.setText(str+= "0");
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_6.setBounds(30, 248, 89, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("5");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str= txtExpressao.getText();
				txtExpressao.setText(str+= "5");
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_7.setBounds(145, 162, 100, 23);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("2");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str= txtExpressao.getText();
				txtExpressao.setText(str+= "2");
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_8.setBounds(145, 196, 100, 23);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("6");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str= txtExpressao.getText();
				txtExpressao.setText(str+= "6");
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_9.setBounds(266, 162, 89, 23);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("3");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str= txtExpressao.getText();
				txtExpressao.setText(str+= "3");
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_10.setBounds(266, 196, 89, 23);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("*");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str= txtExpressao.getText();
				txtExpressao.setText(str+= "*");
			}
		});
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_11.setBounds(435, 128, 65, 23);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton(".");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str= txtExpressao.getText();
				txtExpressao.setText(str+= ".");
			}
		});
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_12.setBounds(367, 196, 57, 23);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_11_1 = new JButton("/");
		btnNewButton_11_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str= txtExpressao.getText();
				txtExpressao.setText(str+= "/");
			}
			
			
		});
		btnNewButton_11_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_11_1.setBounds(373, 128, 52, 23);
		frame.getContentPane().add(btnNewButton_11_1);
		
		JButton btnNewButton_11_2 = new JButton("-");
		btnNewButton_11_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str= txtExpressao.getText();
				txtExpressao.setText(str+= "-");
			}
		});
		btnNewButton_11_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_11_2.setBounds(373, 162, 56, 23);
		frame.getContentPane().add(btnNewButton_11_2);
		
		JButton btnNewButton_11_3 = new JButton("+");
		btnNewButton_11_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str= txtExpressao.getText();
				txtExpressao.setText(str+= "+");
			}
		});
		btnNewButton_11_3.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_11_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_11_3.setBounds(435, 159, 65, 23);
		frame.getContentPane().add(btnNewButton_11_3);
		
		JButton btnNewButton_11_3_1 = new JButton("<-");
		btnNewButton_11_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str= txtExpressao.getText();
				if(str.length() != 0) {
				str = str.substring(0, str.length()-1);
				}
				txtExpressao.setText(str);
			}
		});
		btnNewButton_11_3_1.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_11_3_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_11_3_1.setBounds(435, 193, 65, 23);
		frame.getContentPane().add(btnNewButton_11_3_1);
		
		JLabel lblNewLabel = new JLabel("Calculadora Estática");
		lblNewLabel.setFont(new Font("Viner Hand ITC", Font.BOLD, 14));
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setBounds(20, 73, 241, 28);
		frame.getContentPane().add(lblNewLabel);
	}
}
