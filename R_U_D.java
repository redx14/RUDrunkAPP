package RUDRUNK;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Window;

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

import java.awt.CardLayout;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

import javax.swing.JLabel;

import org.w3c.dom.events.EventException;

public class R_U_D extends JFrame {
	private JTextField txtEnterYourWeight;
	private JTextField txtEnterAmountOf;
	private JTextField txtShots;
	private JTextField txtBeers;
	private JTextField txtGlassesOfWine;
	private JTextField txtRUDrunk;
	private JTextField txtBac;
	private JPanel Panel1;
	private JPanel Panel2;
	private JButton btnNewButton;
	private JComboBox comboBox_1;
	/**
	 * Connect to local server.
	 */
	//Class.forName("com.mysql.jdbc.Driver");
			//System.out.println("Connecting To Local...");
			//Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/alcdata","root","redaxe1212");
			
			//jdbc:mysql://localhost:3306/alcdata ---------> This is the data base your connection too
			//root 1 is database user
			//root 2 is password
			//PreparedStatement statement = (PreparedStatement) con.prepareStatement("select * from alc_data"); 
			//ResultSet result = statement.executeQuery();
			//while(result.next()){
			//System.out.println(result.getString(1) + " " + result.getString(2));}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					System.out.println("Connecting To Local...");
					R_U_D frame = new R_U_D();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the frame.
	 */
	public R_U_D() {
		initialize();
	}
		public void initialize(){
		
		setTitle("RUDRUNK");
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 564, 398);
		getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel Panel1 = new JPanel();
		getContentPane().add(Panel1, "name_1620359887843911");
		Panel1.setLayout(null);
		Panel1.setVisible(true);
		
		JPanel Panel2 = new JPanel();
		getContentPane().add(Panel2, "name_1620363432245549");
		Panel2.setLayout(null);
		Panel2.setVisible(false);
		
		JButton nexT = new JButton("--NEXT-->");
		nexT.setFont(new Font("Tahoma", Font.BOLD, 17));
		nexT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panel1.setVisible(false);
				Panel2.setVisible(true);
			}
		});
		nexT.setBackground(Color.WHITE);
		nexT.setBounds(414, 283, 124, 65);
		Panel1.add(nexT);
		
		JComboBox typeOfDrink = new JComboBox();
		typeOfDrink.setFont(new Font("Tahoma", Font.BOLD, 17));
		typeOfDrink.setModel(new DefaultComboBoxModel(new String[] {"Vodka", "Gin", "Scotch", "Champagne", "Cognac", "Wine", "Beer", "Rum", "Tequila", "Malt", "Whiskey"}));
		typeOfDrink.setBounds(414, 79, 124, 117);
		Panel1.add(typeOfDrink);
		
		txtEnterYourWeight = new JTextField("Enter Your Weight");
		txtEnterYourWeight.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterYourWeight.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtEnterYourWeight.setBounds(10, 11, 302, 76);
		Panel1.add(txtEnterYourWeight);
		txtEnterYourWeight.setColumns(10);
		
		txtEnterAmountOf = new JTextField("Enter Amount of Time Passed");
		txtEnterAmountOf.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterAmountOf.setFont(new Font("Tahoma", Font.BOLD, 19));
		txtEnterAmountOf.setBounds(10, 120, 302, 76);
		Panel1.add(txtEnterAmountOf);
		txtEnterAmountOf.setColumns(10);
		
		txtShots = new JTextField("Shots?");
		txtShots.setFont(new Font("Tahoma", Font.BOLD, 22));
		txtShots.setHorizontalAlignment(SwingConstants.CENTER);
		txtShots.setBounds(10, 283, 86, 65);
		Panel1.add(txtShots);
		txtShots.setColumns(10);
		
		txtBeers = new JTextField("Beers?");
		txtBeers.setHorizontalAlignment(SwingConstants.CENTER);
		txtBeers.setFont(new Font("Tahoma", Font.BOLD, 22));
		txtBeers.setBounds(106, 283, 86, 65);
		Panel1.add(txtBeers);
		txtBeers.setColumns(10);
		
		txtGlassesOfWine = new JTextField("Glasses of Wine?");
		txtGlassesOfWine.setHorizontalAlignment(SwingConstants.CENTER);
		txtGlassesOfWine.setFont(new Font("Tahoma", Font.BOLD, 19));
		txtGlassesOfWine.setBounds(202, 283, 172, 65);
		Panel1.add(txtGlassesOfWine);
		txtGlassesOfWine.setColumns(10);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Hr.", "Min."}));
		comboBox_1.setBounds(322, 120, 82, 76);
		Panel1.add(comboBox_1);
		
		JLabel lblNewLabel = new JLabel("Type of Drank");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(368, 16, 127, 93);
		Panel1.add(lblNewLabel);
		
		JButton Calculate = new JButton("Calculate");
		Calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double alcP = 40;
				String timeCB = comboBox_1.getSelectedItem().toString();
				//String Drnk = typeOfDrink.getSelectedItem().toString();
				//String Bvrg = comboBox.getSelectedItem().toString();
				
				String W = txtEnterYourWeight.getText();
				Double Wght = Double.parseDouble(W);
				
				String T = txtEnterAmountOf.getText();
				Double Time = Double.parseDouble(T);
				
				String S = txtShots.getText();
				Double Sht = Double.parseDouble(S);
				
				String B = txtBeers.getText();
				Double Brs = Double.parseDouble(B);
				
				String G = txtGlassesOfWine.getText();
				Double Gls = Double.parseDouble(G);
				
				if(timeCB == "Hr."){
					Time = Double.parseDouble(T)*60;
				}else{
					System.out.println("Suhh Dudee...");
				}
				
				double BAC = ((((Sht*1.5)+(Brs*12)+(Gls*5))*alcP*.0789)/Wght)-(Time*.015);
				BAC = Math.round(BAC*1000.0)/1000.0;
				
				if(BAC>0.079){
					
					txtRUDrunk.setText("No You Are Sober");
					txtBac.setText("Your BAC is: " + (BAC*-1));
					
				}else{
					
					txtRUDrunk.setText("You Are Drunk");
					txtBac.setText("Your BAC is: " + (BAC*-1));
					
				}
			}

			private String toString(double bAC) {
				return null;
			}
		});
		Calculate.setFont(new Font("Tahoma", Font.BOLD, 33));
		Calculate.setBounds(10, 11, 528, 58);
		Panel2.add(Calculate);
		
		txtRUDrunk = new JTextField();
		txtRUDrunk.setEditable(false);
		txtRUDrunk.setFont(new Font("Tahoma", Font.PLAIN, 40));
		txtRUDrunk.setHorizontalAlignment(SwingConstants.CENTER);
		txtRUDrunk.setText("R U DRUNK??");
		txtRUDrunk.setBounds(10, 80, 528, 58);
		Panel2.add(txtRUDrunk);
		txtRUDrunk.setColumns(10);
		
		txtBac = new JTextField();
		txtBac.setEditable(false);
		txtBac.setFont(new Font("Tahoma", Font.BOLD, 50));
		txtBac.setText("B.A.C");
		txtBac.setHorizontalAlignment(SwingConstants.CENTER);
		txtBac.setBounds(10, 149, 528, 58);
		Panel2.add(txtBac);
		txtBac.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Smirnoff", "Absolut", "Grey Goose", "Ciroc", "SKYY", "Pinnacle", "Svedka", "Stolichnaya", "Russian Standard", "Ketel One", "P.I.N.K", "Clique", "Artic", "New Amsterdam", "Eristoff", "Kors", "Polar Ice", "Crystal Head"}));
		comboBox.setBounds(10, 218, 528, 58);
		Panel2.add(comboBox);
		
		btnNewButton = new JButton("RETURN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panel1.setVisible(true);
				Panel2.setVisible(false);
				txtGlassesOfWine.setText("Glasses of Wine?");
				txtShots.setText("Shots?");
				txtBeers.setText("Beers?");
				txtEnterAmountOf.setText("Enter Amount Of Time Passed");
				txtEnterYourWeight.setText("Enter Your Weight");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 50));
		btnNewButton.setBounds(10, 287, 528, 61);
		Panel2.add(btnNewButton);
	}
}
