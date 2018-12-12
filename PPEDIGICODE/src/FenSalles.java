import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class FenSalles extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBox;
	private AfficheSalle fenSalle;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenSalles frame = new FenSalles();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ArrayList<Salles> alimJCombo()
	{
		Connexion con = new Connexion();
		ArrayList<Salles> liste = new ArrayList<Salles>();
		ResultSet res = con.executeRequete("select * from salles");
		
		try{
		while(res.next())
		{
			Salles sal = new Salles(res.getInt(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8));
			liste.add(sal);
		}
		
		return liste;
		}catch(Exception e){System.out.println(e.getMessage());return null;}
		
	}
	
	
	/**
	 * Create the frame.
	 */
	public FenSalles() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Liste des salles");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
		lblNewLabel.setBounds(115, 11, 278, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Selectionnez : ");
		lblNewLabel_1.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(70, 90, 100, 20);
		contentPane.add(lblNewLabel_1);
		
		
		
		comboBox = new JComboBox(alimJCombo().toArray());
		
		comboBox.setBounds(170, 90, 217, 20);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Afficher");
		btnNewButton.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 17));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Salles s = (Salles)comboBox.getSelectedItem();
				//JOptionPane.showMessageDialog(null, m.toString2());
				fenSalle = new AfficheSalle(s);
			}
		});
		btnNewButton.setBounds(120, 180, 200, 25);
		contentPane.add(btnNewButton);
	}
}
