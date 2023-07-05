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

public class CalculadoraDinamica {

	private JFrame frame;
	private JTextField txtExpressao;
	Calculadora<PilhaDinamica> calculadora = new Calculadora<PilhaDinamica>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraDinamica window = new CalculadoraDinamica();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * 
	 * @param <T>
	 */
	public <T> CalculadoraDinamica() {

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 493, 330);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton botaoExecutar = new JButton("Executar");
		botaoExecutar.setFont(new Font("Tahoma", Font.BOLD, 16));
		botaoExecutar.setForeground(Color.WHITE);
		botaoExecutar.setBackground(Color.BLACK);
		botaoExecutar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = "";
				
				try {
					str += txtExpressao.getText().trim();
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
		botaoExecutar.setToolTipText("");
		botaoExecutar.setBounds(344, 210, 93, 29);
		frame.getContentPane().add(botaoExecutar);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str= txtExpressao.getText();
				txtExpressao.setText(str+= "7");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(28, 100, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnSpace = new JButton("Space");
		btnSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str= txtExpressao.getText();
				txtExpressao.setText(str+= " ");
			}
		});
		btnSpace.setFont(new Font("Script MT Bold", Font.BOLD, 16));
		btnSpace.setBounds(139, 218, 195, 23);
		frame.getContentPane().add(btnSpace);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setBounds(0, 80, 464, 9);
		frame.getContentPane().add(separator);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str= txtExpressao.getText();
				txtExpressao.setText(str+= "8");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(139, 102, 82, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("9");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str= txtExpressao.getText();
				txtExpressao.setText(str+= "9");
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBounds(245, 100, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str= txtExpressao.getText();
				txtExpressao.setText(str+= "4");
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4.setBounds(28, 134, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("1");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str= txtExpressao.getText();
				txtExpressao.setText(str+= "1");
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_5.setBounds(28, 168, 89, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("0");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str= txtExpressao.getText();
				txtExpressao.setText(str+= "0");
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_6.setBounds(28, 216, 89, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("5");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str= txtExpressao.getText();
				txtExpressao.setText(str+= "5");
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_7.setBounds(139, 136, 82, 23);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("2");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str= txtExpressao.getText();
				txtExpressao.setText(str+= "2");
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_8.setBounds(139, 168, 82, 23);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("6");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str= txtExpressao.getText();
				txtExpressao.setText(str+= "6");
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_9.setBounds(245, 134, 89, 23);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("3");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str= txtExpressao.getText();
				txtExpressao.setText(str+= "3");
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_10.setBounds(245, 168, 89, 23);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("*");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str= txtExpressao.getText();
				txtExpressao.setText(str+= "*");
			}
		});
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_11.setBounds(408, 100, 56, 23);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton(".");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str= txtExpressao.getText();
				txtExpressao.setText(str+= ".");
			}
		});
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_12.setBounds(349, 168, 47, 23);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_11_1 = new JButton("/");
		btnNewButton_11_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str= txtExpressao.getText();
				txtExpressao.setText(str+= "/");
			}
		});
		btnNewButton_11_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_11_1.setBounds(349, 102, 47, 23);
		frame.getContentPane().add(btnNewButton_11_1);
		
		JButton btnNewButton_11_2 = new JButton("-");
		btnNewButton_11_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str= txtExpressao.getText();
				txtExpressao.setText(str+= "-");
			}
		});
		btnNewButton_11_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_11_2.setBounds(349, 136, 47, 23);
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
		btnNewButton_11_3.setBounds(406, 134, 58, 23);
		frame.getContentPane().add(btnNewButton_11_3);
		
				txtExpressao = new JTextField();
				txtExpressao.setHorizontalAlignment(SwingConstants.RIGHT);
				txtExpressao.setFont(new Font("Tahoma", Font.BOLD, 20));
				txtExpressao.setBounds(68, 13, 326, 40);
				frame.getContentPane().add(txtExpressao);
				txtExpressao.setColumns(10);
						
						JButton btnNewButton_12_1 = new JButton("<-");
						btnNewButton_12_1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								String str= txtExpressao.getText();
								if(str.length() != 0) {
								str = str.substring(0, str.length()-1);
								}
								txtExpressao.setText(str);
							}
						});
						btnNewButton_12_1.setVerticalAlignment(SwingConstants.TOP);
						btnNewButton_12_1.setFont(new Font("Tahoma", Font.BOLD, 10));
						btnNewButton_12_1.setBounds(405, 171, 59, 23);
						frame.getContentPane().add(btnNewButton_12_1);
						
						JLabel lblCalculadoraDinamica = new JLabel("Calculadora Dinamica");
						lblCalculadoraDinamica.setVerticalAlignment(SwingConstants.BOTTOM);
						lblCalculadoraDinamica.setForeground(new Color(128, 0, 0));
						lblCalculadoraDinamica.setFont(new Font("Viner Hand ITC", Font.BOLD, 14));
						lblCalculadoraDinamica.setBounds(28, 51, 241, 28);
						frame.getContentPane().add(lblCalculadoraDinamica);
	}
}
