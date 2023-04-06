package Eje3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;

public class WindowEje3 extends JFrame {

	private String sistema;
	private JPanel contentPane;
	public JCheckBox programacion, diseno, administracion;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public WindowEje3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Mac");
		rdbtnNewRadioButton.setBounds(6, 75, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Windows");
		rdbtnNewRadioButton_1.setBounds(6, 101, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Linux");
		rdbtnNewRadioButton_2.setBounds(6, 127, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JSlider horaslider = new JSlider();
		horaslider.setValue(5);
		horaslider.setMaximum(10);
		horaslider.setBounds(99, 224, 200, 26);
		contentPane.add(horaslider);
		
		JLabel lblNewLabel = new JLabel("0");
		lblNewLabel.setBounds(82, 213, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("10");
		lblNewLabel_1.setBounds(277, 213, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Horas que dedicas al pc");
		lblNewLabel_2.setBounds(135, 199, 162, 14);
		contentPane.add(lblNewLabel_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Programacion");
		programacion=chckbxNewCheckBox;
		chckbxNewCheckBox.setBounds(337, 75, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Diseño grafico");
		diseno=chckbxNewCheckBox_1;
		chckbxNewCheckBox_1.setBounds(337, 101, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Administracion");
		administracion=chckbxNewCheckBox_2;
		chckbxNewCheckBox_2.setBounds(337, 127, 97, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		JLabel lblNewLabel_3 = new JLabel("Que sistema usas? ");
		lblNewLabel_3.setBounds(10, 54, 118, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Elije tu especialidad");
		lblNewLabel_4.setBounds(306, 54, 118, 14);
		contentPane.add(lblNewLabel_4);
		
		ButtonGroup G= new ButtonGroup();
		G.add(rdbtnNewRadioButton);
		G.add(rdbtnNewRadioButton_1);
		G.add(rdbtnNewRadioButton_2);
		
		JButton btnNewButton = new JButton("Completar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Sistema operativo seleccionado: " + sistema
				+" especialidades seleccionadas" + getProfesion() 
				+" horas dedicadas: " + horaslider.getValue());

				
			}
		});
		
		btnNewButton.setBounds(350, 256, 118, 23);
		contentPane.add(btnNewButton);
		
		
		if(rdbtnNewRadioButton.isSelected())
		{
			rdbtnNewRadioButton_1.setSelected(false);
			rdbtnNewRadioButton_2.setSelected(false);
			sistema=rdbtnNewRadioButton.getText();
		}
		if(rdbtnNewRadioButton_1.isSelected())
		{
			rdbtnNewRadioButton.setSelected(false);
			rdbtnNewRadioButton_2.setSelected(false);
			sistema=rdbtnNewRadioButton_1.getText();
		}
		if(rdbtnNewRadioButton_2.isSelected())
		{
			rdbtnNewRadioButton_1.setSelected(false);
			rdbtnNewRadioButton.setSelected(false);
			sistema=rdbtnNewRadioButton_2.getText();
		}
		
		
	}
	public static String getProfesion()
	{
		
	}
}
