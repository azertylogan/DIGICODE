import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class FenCon extends JFrame {

	private JPanel contentPane;
	private JTextField mailText;
	private JPasswordField mdpText;
	private FenSalles FenSalles;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenCon frame1 = new FenCon();
					frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FenCon() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel ConLab = new JLabel("Connexion");
		ConLab.setBackground(SystemColor.menu);
		ConLab.setForeground(Color.BLUE);
		ConLab.setHorizontalAlignment(SwingConstants.CENTER);
		ConLab.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
		contentPane.add(ConLab, BorderLayout.NORTH);
		
		JPanel panSasie = new JPanel();
		contentPane.add(panSasie, BorderLayout.CENTER);
		panSasie.setLayout(null);
		
		JLabel mailLab = new JLabel("Entrer votre adresse mail : ");
		mailLab.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
		mailLab.setBounds(0, 30, 200, 20);
		panSasie.add(mailLab);
		
		JLabel mdpLab = new JLabel("Entrer votre mot de passe : ");
		mdpLab.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
		mdpLab.setBounds(0, 80, 200, 20);
		panSasie.add(mdpLab);
		
		mailText = new JTextField();
		mailText.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
		mailText.setBounds(200, 30, 220, 30);
		panSasie.add(mailText);
		mailText.setColumns(10);
		
		mdpText = new JPasswordField();
		mdpText.setBounds(200, 80, 220, 30);
		panSasie.add(mdpText);
		
        JLabel label = new JLabel();
        label.setSize(100, 100);
        label.setLocation(200, 400);
        label.setIcon(new ImageIcon("test.JPG"));// your image here
        panSasie.add(label);
		
		
		JButton valBout = new JButton("Valider");
		valBout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String recupmail = mailText.getText();
				String recupmdp = String.valueOf(mdpText.getPassword());
				
				Connexion con = new Connexion();
				ResultSet res = con.executeRequete("select motdepasse, email from membres");
				
				
					try {
						while(res.next())
						{
							//System.out.println(recupmdp+"  "+res.getString(1)+" //  "+recupmail+"  "+res.getString(2));
							if (recupmdp.equals(res.getString(1)) && recupmail.equals(""+res.getString(2))) {
								System.out.println("connexion réussit");
								FenSalles frame= new FenSalles();
								frame.setVisible(true);
							}else {
								
							}
							
						}
					}catch(Exception e) {
						System.out.println(e.getMessage());
					}
				
				
				
				
				
			}
		});
		valBout.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 17));
		valBout.setBounds(120, 140, 200, 25);
		panSasie.add(valBout);
		
		
	}
}
