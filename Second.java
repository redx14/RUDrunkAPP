package RUDRUNK;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Second extends JFrame {

	private JPanel contentPane;
	private JTextField txtRUDrunk;
	private JTextField txtBac;
	Second obj1 = new Second();


	public Second() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtRUDrunk = new JTextField();
		txtRUDrunk.setText("R U Drunk??");
		txtRUDrunk.setEditable(false);
		txtRUDrunk.setFont(new Font("Stencil", Font.PLAIN, 18));
		txtRUDrunk.setBounds(10, 190, 128, 60);
		contentPane.add(txtRUDrunk);
		txtRUDrunk.setColumns(10);
		
		txtBac = new JTextField();
		txtBac.setText("        B.A.C");
		txtBac.setFont(new Font("Stencil", Font.PLAIN, 18));
		txtBac.setEditable(false);
		txtBac.setColumns(10);
		txtBac.setBounds(148, 190, 128, 60);
		contentPane.add(txtBac);
		
		JButton btnNewButton = new JButton("CALCULATE");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//BAC = obj1.getBAC();
			}
		});
		btnNewButton.setFont(new Font("Stencil Std", Font.PLAIN, 17));
		btnNewButton.setBounds(286, 190, 138, 60);
		contentPane.add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"CHOOSE YOUR BEVERAGE", "Stoly", "Grey Goose", "New Amsterdam", "Ciroc", "Smirnof"}));
		comboBox.setBounds(10, 11, 414, 78);
		contentPane.add(comboBox);
	}
}
