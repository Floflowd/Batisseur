package Interface;

import Modele.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Plateau extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField O1C1;
	private JTextField O1C2;
	private JTextField O1C3;
	private JTextField O2C1;
	private JTextField O2C2;
	private JTextField O2C3;
	private JTextField O3C1;
	private JTextField O3C2;
	private JTextField O3C3;

	//private Ouvrier[] ListOuvrier = new Ouvrier[5];
	private ArrayList<Ouvrier> ListOuvrier=new ArrayList<Ouvrier>();
	private Ouvrier[] ListOuvrierDispo = new Ouvrier[4];
	private ArrayList<Chantier> ListChantier = new ArrayList<Chantier>();

	// variable global
	protected PanelImage panelChantier = new PanelImage();
	protected PanelImage panelOuvrier1 = new PanelImage();
	protected PanelImage panelOuvrier2 = new PanelImage();
	protected PanelImage panelOuvrier3= new PanelImage();
	private JTextField ChantierNecBois;
	private JTextField ChantierNecPierre;
	private JTextField ChantierNecCeramique;
	private JTextField ChantierDispoBois;
	private JTextField ChantierDispoPierre;
	private JTextField ChantierDispoCeramique;
	private JTextField score ;
	private Chantier currentChantier;
	private JButton btnSelect1;
	private JButton btnSelect2;
	private JButton btnSelect3;
	private Ouvrier ovide;
	
	
	
	
	
	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public Plateau() throws IOException {
		/*********************CREATION DE LA PARTIE GRAPHIQUE*****************************************/
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow][][grow][][grow][]", "[grow][][grow][][]"));
		

		
		// INIT Image :
		
		String currentpath=new java.io.File(".").getCanonicalPath();
		
		panelOuvrier1.setImage(currentpath + "\\image\\Ouvrier\\iapprenti.png");
		contentPane.add(panelOuvrier1, "cell 0 2,grow");
		
		panelOuvrier2.setImage(currentpath + "\\image\\Ouvrier\\iapprenti.png");
		contentPane.add(panelOuvrier2, "cell 2 2,grow");
		
		panelOuvrier3.setImage(currentpath + "\\image\\Ouvrier\\iapprenti.png");
		contentPane.add(panelOuvrier3, "cell 4 2,grow");
		
		
		
		panelChantier.setImage(currentpath + "\\image\\batiment\\chateau-fort.png");
		contentPane.add(panelChantier, "cell 1 0,grow");
		
		
		JLabel lblTextChantNec = new JLabel("Comp\u00E9tences n\u00E9cessaire :");
		contentPane.add(lblTextChantNec, "flowy,cell 2 0");
		
		JLabel lblComptencesDisponible = new JLabel("Comp\u00E9tences Disponible :");
		contentPane.add(lblComptencesDisponible, "flowy,cell 3 0");
		
		JLabel lblScore = new JLabel("Score : ");
		lblScore.setVerticalAlignment(SwingConstants.TOP);
		contentPane.add(lblScore, "flowx,cell 5 0,aligny top");

		
		
		JLabel lblNewLabel_4 = new JLabel("Comp\u00E9tence Bois :");
		contentPane.add(lblNewLabel_4, "flowy,cell 1 2");
		
		O1C1 = new JTextField();
		O1C1.setEditable(false);
		contentPane.add(O1C1, "cell 1 2,alignx leading");
		O1C1.setColumns(10);		
				
		
		JLabel lblNewLabel_4_1 = new JLabel("Comp\u00E9tence Bois :");
		contentPane.add(lblNewLabel_4_1, "flowy,cell 3 2");
		
		JLabel lblComptencePierre = new JLabel("Comp\u00E9tence Pierre :");
		contentPane.add(lblComptencePierre, "cell 1 2");
		
		O1C2 = new JTextField();
		O1C2.setEditable(false);
		contentPane.add(O1C2, "cell 1 2");
		O1C2.setColumns(10);
		
		JLabel lblComptenceCramique = new JLabel("Comp\u00E9tence C\u00E9ramique :");
		contentPane.add(lblComptenceCramique, "cell 1 2");
		
		O1C3 = new JTextField();
		O1C3.setEditable(false);
		contentPane.add(O1C3, "cell 1 2");
		O1C3.setColumns(10);
		
		O2C1 = new JTextField();
		O2C1.setEditable(false);
		O2C1.setColumns(10);
		contentPane.add(O2C1, "cell 3 2,alignx left");
		
		JLabel lblComptencePierre_1 = new JLabel("Comp\u00E9tence Pierre :");
		contentPane.add(lblComptencePierre_1, "cell 3 2");
		
		O2C2 = new JTextField();
		O2C2.setEditable(false);
		O2C2.setColumns(10);
		contentPane.add(O2C2, "cell 3 2,alignx left");
		
		JLabel lblComptenceCramique_1 = new JLabel("Comp\u00E9tence C\u00E9ramique :");
		contentPane.add(lblComptenceCramique_1, "cell 3 2");
		
		O2C3 = new JTextField();
		O2C3.setEditable(false);
		O2C3.setColumns(10);
		contentPane.add(O2C3, "cell 3 2,alignx left");
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Comp\u00E9tence Bois :");
		contentPane.add(lblNewLabel_4_1_1, "flowy,cell 5 2");
		
		O3C1 = new JTextField();
		O3C1.setEditable(false);
		contentPane.add(O3C1, "cell 5 2");
		O3C1.setColumns(10);
		
		JLabel lblComptencePierre_1_1 = new JLabel("Comp\u00E9tence Pierre :");
		contentPane.add(lblComptencePierre_1_1, "cell 5 2");
		
		O3C2 = new JTextField();
		O3C2.setEditable(false);
		O3C2.setColumns(10);
		contentPane.add(O3C2, "cell 5 2");
		
		JLabel lblComptenceCramique_1_1 = new JLabel("Comp\u00E9tence C\u00E9ramique :");
		contentPane.add(lblComptenceCramique_1_1, "cell 5 2");
		
		O3C3 = new JTextField();
		O3C3.setEditable(false);
		O3C3.setColumns(10);
		contentPane.add(O3C3, "cell 5 2");
	
		btnSelect1 = new JButton("S\u00E9lectionner");
		btnSelect1.setEnabled(true);
		btnSelect1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currentChantier.addOuvrier(ListOuvrierDispo[0]);
				try {
					refresh_Chantier();
					newOuvrierDispo(0);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		contentPane.add(btnSelect1, "cell 0 4");
		
		btnSelect2 = new JButton("S\u00E9lectionner");
		btnSelect2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currentChantier.addOuvrier(ListOuvrierDispo[1]);							
				try {
					refresh_Chantier();
					newOuvrierDispo(1);	
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		contentPane.add(btnSelect2, "cell 2 4");
		
		btnSelect3 = new JButton("S\u00E9lectionner");
		btnSelect3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				currentChantier.addOuvrier(ListOuvrierDispo[2]);				
				try {
					refresh_Chantier();
					newOuvrierDispo(2);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		contentPane.add(btnSelect3, "cell 4 4");
		
		JLabel lblCnecBois = new JLabel("Bois :");
		contentPane.add(lblCnecBois, "cell 2 0");
		
		ChantierNecBois = new JTextField();
		ChantierNecBois.setText("0");
		ChantierNecBois.setEditable(false);
		ChantierNecBois.setColumns(10);
		contentPane.add(ChantierNecBois, "cell 2 0");
		
		JLabel lblPierre = new JLabel("Pierre :");
		contentPane.add(lblPierre, "cell 2 0");
		
		ChantierNecPierre = new JTextField();
		ChantierNecPierre.setText("0");
		ChantierNecPierre.setEditable(false);
		ChantierNecPierre.setColumns(10);
		contentPane.add(ChantierNecPierre, "cell 2 0");
		
		JLabel lblCeramique = new JLabel("C\u00E9ramique :");
		contentPane.add(lblCeramique, "cell 2 0");
		
		ChantierNecCeramique = new JTextField();
		ChantierNecCeramique.setText("0");
		ChantierNecCeramique.setEditable(false);
		ChantierNecCeramique.setColumns(10);
		contentPane.add(ChantierNecCeramique, "cell 2 0");
		
		JLabel lblCdispoBois_1 = new JLabel("Bois :");
		contentPane.add(lblCdispoBois_1, "cell 3 0");
		
		ChantierDispoBois = new JTextField();
		ChantierDispoBois.setText("0");
		ChantierDispoBois.setEditable(false);
		ChantierDispoBois.setColumns(10);
		contentPane.add(ChantierDispoBois, "cell 3 0");
		
		JLabel lblCdispoPierre = new JLabel("Pierre :");
		contentPane.add(lblCdispoPierre, "cell 3 0");
		
		ChantierDispoPierre = new JTextField();
		ChantierDispoPierre.setText("0");
		ChantierDispoPierre.setEditable(false);
		ChantierDispoPierre.setColumns(10);
		contentPane.add(ChantierDispoPierre, "cell 3 0");
		
		JLabel lblCdispoCeramique = new JLabel("C\u00E9ramique :");
		contentPane.add(lblCdispoCeramique, "cell 3 0");
		
		ChantierDispoCeramique = new JTextField();
		ChantierDispoCeramique.setText("0");
		ChantierDispoCeramique.setEditable(false);
		ChantierDispoCeramique.setColumns(10);
		contentPane.add(ChantierDispoCeramique, "cell 3 0");
		
		score = new JTextField();
		score.setHorizontalAlignment(SwingConstants.CENTER);
		score.setText("0");
		score.setEditable(false);
		contentPane.add(score, "cell 5 0,alignx center,aligny top");
		score.setColumns(10);
		
		
		
		
		/***********************Game***************************************/
		initGame();
	}

	
	//TODO end game quand plus de perso dans listdispo
	private void newOuvrierDispo(int index) throws IOException {
		
		if(ListOuvrier.size()>0) {
			int alea = (int)(Math.random() * (ListOuvrier.size()-1)) ;
			ListOuvrierDispo[index] = ListOuvrier.get(alea);
			ListOuvrier.remove(alea);
			refresh_Ouvrier();
		}
		else {
			ListOuvrierDispo[index] = null;
			if(index == 0) {
				contentPane.remove(btnSelect1);
				btnSelect1.setEnabled(false);
				contentPane.add(btnSelect1, "cell 0 4");
				ListOuvrierDispo[index]=ovide;
				refresh_Ouvrier();
			}
			else if(index == 1) {
				contentPane.remove(btnSelect2);
				btnSelect2.setEnabled(false);
				contentPane.add(btnSelect2, "cell 2 4");
				ListOuvrierDispo[index]=ovide;
				refresh_Ouvrier();
			}
			else {
				contentPane.remove(btnSelect3);
				btnSelect3.setEnabled(false);
				contentPane.add(btnSelect3, "cell 4 4");
				ListOuvrierDispo[index]=ovide;
				refresh_Ouvrier();
			}			
		}
		int comptNull =0;
		for(int i=0;i<4;i++) {
			if(ListOuvrierDispo[i]==ovide) {
				comptNull++;
			}
		}
		System.out.println(comptNull);
		if(comptNull ==3) {
			endGame();
		}

	}

	private void newChantier() throws IOException {
		
		if(ListChantier.size()>0) {
			int alea = (int)(Math.random() * (ListChantier.size()-1));
			currentChantier = ListChantier.get(alea);
			ListChantier.remove(alea);
			
			panelChantier.setImage(currentChantier.getPathImage());
			contentPane.remove(panelChantier);
			contentPane.add(panelChantier, "cell 1 0,grow");
			refresh_Chantier();
		}
		else {
			System.out.print("Fin de la partie");
			endGame();
			
		}
		

	}

	private void initGame() throws IOException {
		
		ListOuvrier.add(new Apprenti(0,1,1));
		ListOuvrier.add(new Apprenti(0,0,2));
		ListOuvrier.add(new Compagnon(1,0,2));
		ListOuvrier.add(new Compagnon(1,1,1));
		/*ListOuvrier.add(new Compagnon(0,0,3));
		ListOuvrier.add(new Manoeuvre(1,2,1));
		ListOuvrier.add(new Manoeuvre(1,3,0));
		ListOuvrier.add(new Maitre(2,1,2));
		ListOuvrier.add(new Maitre(1,2,2));
		ListOuvrier.add(new Maitre(3,1,1));
		ListOuvrier.add(new Maitre(5,0,0));*/
		ovide = new Ouvrier(0,0,0);
		
		ListChantier.add(new Chantier(3,0,1,"Halles.png"));
		ListChantier.add(new Chantier(1,1,1,"Moulin.png"));
		//ListChantier.add(new Chantier(0,5,3,"Chateau-fort.png"));
		//ListChantier.add(new Chantier(5,0,0,"Relais-Postal.png"));


		
		//actualisation de la premier liste d ouvrier dispo
		for(int i=0; i<3;i++){
			int alea = (int)(Math.random() * (ListOuvrier.size()-1)) ;
			ListOuvrierDispo[i] = ListOuvrier.get(alea);
			ListOuvrier.remove(alea);			
		}
		
		//choisi un chantier de manière aléatoire
		newChantier();
		
		refresh_Ouvrier();	
		refresh_Chantier();
		
	}
	
	private void refresh_Ouvrier() throws IOException {
		//System.out.println(contentPane.toString());
		
		
		panelOuvrier1.setImage(ListOuvrierDispo[0].getPathImage());
		contentPane.remove(panelOuvrier1);
		contentPane.add(panelOuvrier1, "cell 0 2,grow");
		
		
		O1C1.setText(String.valueOf(ListOuvrierDispo[0].getcBois()));
		O1C2.setText(String.valueOf(ListOuvrierDispo[0].getcPierre()));
		O1C3.setText(String.valueOf(ListOuvrierDispo[0].getcCeramique()));
		
		panelOuvrier2.setImage(ListOuvrierDispo[1].getPathImage());
		contentPane.remove(panelOuvrier2);
		contentPane.add(panelOuvrier2, "cell 2 2,grow");
		O2C1.setText(String.valueOf(ListOuvrierDispo[1].getcBois()));
		O2C2.setText(String.valueOf(ListOuvrierDispo[1].getcPierre()));
		O2C3.setText(String.valueOf(ListOuvrierDispo[1].getcCeramique()));
		
		panelOuvrier3.setImage(ListOuvrierDispo[2].getPathImage());
		contentPane.remove(panelOuvrier3);
		contentPane.add(panelOuvrier3, "cell 4 2,grow");
		O3C1.setText(String.valueOf(ListOuvrierDispo[2].getcBois()));
		O3C2.setText(String.valueOf(ListOuvrierDispo[2].getcPierre()));
		O3C3.setText(String.valueOf(ListOuvrierDispo[2].getcCeramique()));
	}

	private void endGame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Acceuil frame = new Acceuil();
					frame.setVisible(true);
					setVisible(false);
					frame.setScore(score.getText());
				} catch (Exception e) {
					e.printStackTrace();
    			}
    		}
    	});
	}
	
	private void refresh_Chantier() throws IOException {
		
		ChantierNecBois.setText(String.valueOf(currentChantier.getcBois()));
		ChantierNecPierre.setText(String.valueOf(currentChantier.getcPierre()));
		ChantierNecCeramique.setText(String.valueOf(currentChantier.getcCeramique()));
		
		ChantierDispoBois.setText(String.valueOf(currentChantier.getTotalBoisDispo()));
		ChantierDispoPierre.setText(String.valueOf(currentChantier.getTotalPierreDispo()));
		ChantierDispoCeramique.setText(String.valueOf(currentChantier.getTotalCeramiqueDispo()));
		
		if(currentChantier.isBatimentEnd()) {
			System.out.println("New chantier");
			newChantier();
			int val_score = Integer.parseInt(score.getText())+1;
			score.setText(String.valueOf(val_score));
		}
		
	}
	
}
