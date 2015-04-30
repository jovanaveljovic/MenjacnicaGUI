package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;

public class ObrisiKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblSifra;
	private JLabel lblNaziv;
	private JTextField txtSifra;
	private JTextField txtNaziv;
	private JLabel lblProdajniKurs;
	private JLabel lblKupovniKurs;
	private JTextField txtProdajniKurs;
	private JTextField txtKupovniKurs;
	private JLabel lblSrednjiKurs;
	private JLabel lblSkraceniNaziv;
	private JTextField txtSrednjiKurs;
	private JTextField txtSkraceniNaziv;
	private JButton btnObrisi;
	private JButton btnOdustani;
	private JCheckBox chckbxZaistaObrisiKurs;
	
	

	
	
	
	private MenjacnicaGUI menjacnica;
	
	
	/**
	 * Create the frame.
	 */
	public ObrisiKursGUI(MenjacnicaGUI menjacnica) {
		setResizable(false);
		
		setTitle("Obrisi kurs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		contentPane.add(getLblSifra());
		contentPane.add(getLblnaziv());
		contentPane.add(getTxtSifra());
		contentPane.add(getTxtNaziv());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getTxtProdajniKurs());
		contentPane.add(getTxtKupovniKurs());
		contentPane.add(getLblSrednjiKurs());
		contentPane.add(getLblSkraceniNaziv());
		contentPane.add(getTxtSrednjiKurs());
		contentPane.add(getTxtSkraceniNaziv());
		contentPane.add(getBtnObrisi());
		contentPane.add(getBtnOdustani());
		contentPane.add(getChckbxZaistaObrisiKurs());
		
		this.menjacnica = menjacnica;
		
	}
		private JLabel getLblSifra() {
			if (lblSifra == null) {
				lblSifra = new JLabel("Sifra");
				lblSifra.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblSifra.setAlignmentX(Component.CENTER_ALIGNMENT);
				lblSifra.setBounds(10, 11, 200, 29);
			}
			return lblSifra;
		}
		private JLabel getLblnaziv() {
			if (lblNaziv == null) {
				lblNaziv = new JLabel("Naziv");
				lblNaziv.setPreferredSize(new Dimension(22, 14));
				lblNaziv.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblNaziv.setBounds(231, 11, 203, 29);
			}
			return lblNaziv;
		}
		private JTextField getTxtSifra() {
			if (txtSifra == null) {
				txtSifra = new JTextField();
				txtSifra.setEditable(false);
				txtSifra.setText("\r\n");
				txtSifra.setBounds(10, 45, 200, 25);
				txtSifra.setColumns(10);
			}
			return txtSifra;
		}
		private JTextField getTxtNaziv() {
			if (txtNaziv == null) {
				txtNaziv = new JTextField();
				txtNaziv.setEditable(false);
				txtNaziv.setBounds(231, 45, 203, 25);
				txtNaziv.setColumns(10);
			}
			return txtNaziv;
		}
		private JLabel getLblProdajniKurs() {
			if (lblProdajniKurs == null) {
				lblProdajniKurs = new JLabel("Prodajni kurs");
				lblProdajniKurs.setMaximumSize(new Dimension(22, 14));
				lblProdajniKurs.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblProdajniKurs.setPreferredSize(new Dimension(22, 14));
				lblProdajniKurs.setBounds(10, 81, 200, 29);
			}
			return lblProdajniKurs;
		}
		private JLabel getLblKupovniKurs() {
			if (lblKupovniKurs == null) {
				lblKupovniKurs = new JLabel("Kupovni kurs");
				lblKupovniKurs.setMinimumSize(new Dimension(22, 14));
				lblKupovniKurs.setMaximumSize(new Dimension(22, 14));
				lblKupovniKurs.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblKupovniKurs.setPreferredSize(new Dimension(22, 14));
				lblKupovniKurs.setBounds(231, 81, 200, 29);
			}
			return lblKupovniKurs;
		}
		private JTextField getTxtProdajniKurs() {
			if (txtProdajniKurs == null) {
				txtProdajniKurs = new JTextField();
				txtProdajniKurs.setEditable(false);
				txtProdajniKurs.setBounds(10, 107, 200, 25);
				txtProdajniKurs.setColumns(10);
			}
			return txtProdajniKurs;
		}
		private JTextField getTxtKupovniKurs() {
			if (txtKupovniKurs == null) {
				txtKupovniKurs = new JTextField();
				txtKupovniKurs.setEditable(false);
				txtKupovniKurs.setBounds(231, 107, 200, 25);
				txtKupovniKurs.setColumns(10);
			}
			return txtKupovniKurs;
		}
		private JLabel getLblSrednjiKurs() {
			if (lblSrednjiKurs == null) {
				lblSrednjiKurs = new JLabel("Srednji kurs");
				lblSrednjiKurs.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblSrednjiKurs.setPreferredSize(new Dimension(22, 14));
				lblSrednjiKurs.setBounds(10, 143, 200, 29);
			}
			return lblSrednjiKurs;
		}
		private JLabel getLblSkraceniNaziv() {
			if (lblSkraceniNaziv == null) {
				lblSkraceniNaziv = new JLabel("Skraceni naziv");
				lblSkraceniNaziv.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblSkraceniNaziv.setPreferredSize(new Dimension(22, 14));
				lblSkraceniNaziv.setBounds(234, 143, 200, 25);
			}
			return lblSkraceniNaziv;
		}
		private JTextField getTxtSrednjiKurs() {
			if (txtSrednjiKurs == null) {
				txtSrednjiKurs = new JTextField();
				txtSrednjiKurs.setEditable(false);
				txtSrednjiKurs.setText("\r\n\r\n");
				txtSrednjiKurs.setBounds(10, 171, 200, 25);
				txtSrednjiKurs.setColumns(10);
			}
			return txtSrednjiKurs;
		}
		private JTextField getTxtSkraceniNaziv() {
			if (txtSkraceniNaziv == null) {
				txtSkraceniNaziv = new JTextField();
				txtSkraceniNaziv.setEditable(false);
				txtSkraceniNaziv.setBounds(231, 171, 200, 25);
				txtSkraceniNaziv.setColumns(10);
			}
			return txtSkraceniNaziv;
		}
	private JButton getBtnObrisi() {
		if (btnObrisi == null) {
			btnObrisi = new JButton("Obrisi");
			btnObrisi.setEnabled(false);
			if(getChckbxZaistaObrisiKurs().isSelected())
				btnObrisi.setEnabled(true);
			btnObrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {							
					menjacnica.getTextArea_1().append("Sifra: "+txtSifra.getText()+" Naziv: "+txtNaziv.getText()+
							" Prodajni kurs: "+txtProdajniKurs.getText()+" Kupovni kurs :"+txtKupovniKurs.getText()+
							" Srednji kurs: "+txtSrednjiKurs.getText()+" Skraceni naziv :"+txtSkraceniNaziv.getText()+"\n");
					dispose();
				}
			});
			btnObrisi.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnObrisi.setBounds(10, 239, 200, 23);
		}
		return btnObrisi;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnOdustani.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnOdustani.setBounds(231, 239, 200, 23);
		}
		return btnOdustani;
	}
	private JCheckBox getChckbxZaistaObrisiKurs() {
		if (chckbxZaistaObrisiKurs == null) {
			chckbxZaistaObrisiKurs = new JCheckBox("Zaista obrisi kurs");
			chckbxZaistaObrisiKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(getChckbxZaistaObrisiKurs().isSelected())
						getBtnObrisi().setEnabled(true);
					else 
						getBtnObrisi().setEnabled(false);
				}
			});
			chckbxZaistaObrisiKurs.setBounds(10, 209, 151, 23);
			
			
			
		}
		return chckbxZaistaObrisiKurs;
	}
	
	
	
	
	}
	
	



