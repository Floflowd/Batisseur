package Interface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class Acceuil extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Acceuil() {
		setTitle("Les Batisserus");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\flori\\Desktop\\cours confinement\\UML_Java\\Batisseurs\\image\\imaitre.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 478, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Plateau jeu = new Plateau();
							jeu.setVisible(true);
							setVisible(false);
						} catch (Exception e) {
							e.printStackTrace();
		    			}
		    		}
		    	});				
			}
		});
		sl_contentPane.putConstraint(SpringLayout.WEST, btnStart, 165, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnStart, -10, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnStart, -170, SpringLayout.EAST, contentPane);
		contentPane.add(btnStart);
		
		JLabel lblTitre = new JLabel("Les Batisseurs");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblTitre, 125, SpringLayout.WEST, contentPane);
		lblTitre.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitre.setForeground(Color.RED);
		lblTitre.setFont(new Font("Tahoma", Font.PLAIN, 32));
		contentPane.add(lblTitre);
		
		JLabel lblBackGround = new JLabel("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblBackGround, 0, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblBackGround, 0, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblBackGround, 0, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblBackGround, 0, SpringLayout.EAST, contentPane);
		lblBackGround.setIcon(new ImageIcon("C:\\Users\\flori\\Desktop\\cours confinement\\UML_Java\\Batisseurs\\image\\medieval_city.jpg"));
		contentPane.add(lblBackGround);
	}

}
