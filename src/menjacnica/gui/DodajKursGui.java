package menjacnica.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Component;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class DodajKursGui extends JFrame {

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
	private JButton btnDodaj;
	private JButton btnOdustani;

	private MenjacnicaGUI menjacnica;

	

	/**
	 * Create the frame.
	 */
	public DodajKursGui(MenjacnicaGUI menjacnica) {
		setTitle("Dodaj kurs\r\n");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLabel_1());
		contentPane.add(getLabel_2());
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
		contentPane.add(getBtnDodaj());
		contentPane.add(getBtnOdustani());
		
		this.menjacnica = menjacnica;

	}
	
	private JLabel getLabel_1() {
		if (lblSifra == null) {
			lblSifra = new JLabel("Sifra");
			lblSifra.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblSifra.setAlignmentX(Component.CENTER_ALIGNMENT);
			lblSifra.setBounds(10, 11, 200, 29);
		}
		return lblSifra;
	}
	private JLabel getLabel_2() {
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
			txtSifra.setText("\r\n");
			txtSifra.setBounds(10, 45, 200, 25);
			txtSifra.setColumns(10);
		}
		return txtSifra;
	}
	private JTextField getTxtNaziv() {
		if (txtNaziv == null) {
			txtNaziv = new JTextField();
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
			txtProdajniKurs.setBounds(10, 118, 200, 25);
			txtProdajniKurs.setColumns(10);
		}
		return txtProdajniKurs;
	}
	private JTextField getTxtKupovniKurs() {
		if (txtKupovniKurs == null) {
			txtKupovniKurs = new JTextField();
			txtKupovniKurs.setBounds(231, 118, 200, 25);
			txtKupovniKurs.setColumns(10);
		}
		return txtKupovniKurs;
	}
	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
			lblSrednjiKurs.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblSrednjiKurs.setPreferredSize(new Dimension(22, 14));
			lblSrednjiKurs.setBounds(10, 154, 200, 29);
		}
		return lblSrednjiKurs;
	}
	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skraceni naziv");
			lblSkraceniNaziv.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblSkraceniNaziv.setPreferredSize(new Dimension(22, 14));
			lblSkraceniNaziv.setBounds(234, 156, 200, 25);
		}
		return lblSkraceniNaziv;
	}
	private JTextField getTxtSrednjiKurs() {
		if (txtSrednjiKurs == null) {
			txtSrednjiKurs = new JTextField();
			txtSrednjiKurs.setText("\r\n\r\n");
			txtSrednjiKurs.setBounds(10, 186, 200, 25);
			txtSrednjiKurs.setColumns(10);
		}
		return txtSrednjiKurs;
	}
	private JTextField getTxtSkraceniNaziv() {
		if (txtSkraceniNaziv == null) {
			txtSkraceniNaziv = new JTextField();
			txtSkraceniNaziv.setBounds(231, 186, 200, 25);
			txtSkraceniNaziv.setColumns(10);
		}
		return txtSkraceniNaziv;
	}
	private JButton getBtnDodaj() {
		if (btnDodaj == null) {
			btnDodaj = new JButton("Dodaj");
			btnDodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					menjacnica.getTextArea_1().append("Sifra: "+txtSifra.getText()+" Naziv: "+txtNaziv.getText()+
							" Prodajni kurs: "+txtProdajniKurs.getText()+" Kupovni kurs :"+txtKupovniKurs.getText()+
							" Srednji kurs: "+txtSrednjiKurs.getText()+" Skraceni naziv :"+txtSkraceniNaziv.getText()+"\n");
					dispose();
				}
			});
			btnDodaj.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnDodaj.setPreferredSize(new Dimension(6, 20));
			btnDodaj.setBounds(10, 235, 200, 29);
		}
		return btnDodaj;
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
			btnOdustani.setPreferredSize(new Dimension(6, 20));
			btnOdustani.setBounds(234, 235, 200, 29);
		}
		return btnOdustani;
	}
	
}

	
	


