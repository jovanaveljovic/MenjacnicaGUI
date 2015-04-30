package menjacnica.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JSlider;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Font;

public class IzvrsiZamenuGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblKupovniKurs;
	private JLabel lblValuta;
	private JLabel lblProdajniKurs;
	private JTextField txtKupovniKurs;
	private JTextField txtProdajniKurs;
	private JComboBox comboBoxValuta;
	private JLabel lblIznos;
	private JTextField txtIznos;
	private JLabel lblVrstaTransakcije;
	private JRadioButton rdbtnKupovina;
	private JRadioButton rdbtnProdaja;
	private JButton btnIzvrsiZamenu;
	private JButton btnOdustani;
	private JSlider sliderIznos;
	

	private MenjacnicaGUI menjacnica;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	


	/**
	 * Create the frame.
	 */
	public IzvrsiZamenuGUI(MenjacnicaGUI menjacnica) {
		setResizable(false);
		setTitle("Izvrsi zamenu");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getLblValuta());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getTxtKupovniKurs());
		contentPane.add(getTxtProdajniKurs());
		contentPane.add(getComboBoxValuta());
		contentPane.add(getLblIznos());
		contentPane.add(getTxtIznos());
		contentPane.add(getLblVrstaTransakcije());
		contentPane.add(getRdbtnKupovina());
		contentPane.add(getRdbtnProdaja());
		contentPane.add(getBtnIzvrsiZamenu());
		contentPane.add(getBtnOdustani());
		contentPane.add(getSliderIznos());
	
		
		this.menjacnica = menjacnica;
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblKupovniKurs.setBounds(21, 24, 84, 14);
		}
		return lblKupovniKurs;
	}
	private JLabel getLblValuta() {
		if (lblValuta == null) {
			lblValuta = new JLabel("Valuta");
			lblValuta.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblValuta.setBounds(182, 24, 46, 14);
		}
		return lblValuta;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblProdajniKurs.setBounds(294, 24, 84, 14);
		}
		return lblProdajniKurs;
	}
	private JTextField getTxtKupovniKurs() {
		if (txtKupovniKurs == null) {
			txtKupovniKurs = new JTextField();
			txtKupovniKurs.setEditable(false);
			txtKupovniKurs.setBounds(19, 49, 109, 20);
			txtKupovniKurs.setColumns(10);
		}
		return txtKupovniKurs;
	}
	private JTextField getTxtProdajniKurs() {
		if (txtProdajniKurs == null) {
			txtProdajniKurs = new JTextField();
			txtProdajniKurs.setEditable(false);
			txtProdajniKurs.setBounds(294, 49, 117, 20);
			txtProdajniKurs.setColumns(10);
		}
		return txtProdajniKurs;
	}
	private JComboBox getComboBoxValuta() {
		if (comboBoxValuta == null) {
			comboBoxValuta = new JComboBox();
			comboBoxValuta.setModel(new DefaultComboBoxModel(new String[] {"EUR", "USD", "CHF"}));
			comboBoxValuta.setBounds(172, 49, 84, 22);
		}
		return comboBoxValuta;
	}
	private JLabel getLblIznos() {
		if (lblIznos == null) {
			lblIznos = new JLabel("Iznos");
			lblIznos.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblIznos.setBounds(24, 100, 46, 14);
		}
		return lblIznos;
	}
	private JTextField getTxtIznos() {
		if (txtIznos == null) {
			txtIznos = new JTextField(Integer.toString(getSliderIznos().getValue()));
			txtIznos.setBounds(19, 125, 144, 20);
			txtIznos.setColumns(10);
		}
		return txtIznos;
	}
	private JLabel getLblVrstaTransakcije() {
		if (lblVrstaTransakcije == null) {
			lblVrstaTransakcije = new JLabel("Vrsta transakcije");
			lblVrstaTransakcije.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblVrstaTransakcije.setBounds(242, 100, 136, 14);
		}
		return lblVrstaTransakcije;
	}
	private JRadioButton getRdbtnKupovina() {
		if (rdbtnKupovina == null) {
			rdbtnKupovina = new JRadioButton("Kupovina");
			rdbtnKupovina.setFont(new Font("Tahoma", Font.PLAIN, 13));
			buttonGroup.add(rdbtnKupovina);
			rdbtnKupovina.setBounds(241, 123, 109, 23);
		}
		return rdbtnKupovina;
	}
	private JRadioButton getRdbtnProdaja() {
		if (rdbtnProdaja == null) {
			rdbtnProdaja = new JRadioButton("Prodaja");
			rdbtnProdaja.setFont(new Font("Tahoma", Font.PLAIN, 13));
			buttonGroup.add(rdbtnProdaja);
			rdbtnProdaja.setBounds(242, 141, 109, 23);
		}
		return rdbtnProdaja;
	}
	private JButton getBtnIzvrsiZamenu() {
		if (btnIzvrsiZamenu == null) {
			btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
			btnIzvrsiZamenu.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnIzvrsiZamenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String selectedButton;
					if(getRdbtnKupovina().isSelected())
						selectedButton = rdbtnKupovina.getText();
					else
						selectedButton = rdbtnProdaja.getText();
					menjacnica.getTextArea_1().append("Valuta: "+getComboBoxValuta().getSelectedItem().toString()+
							" Iznos: "+txtIznos.getText()+" Vrsta transakcije: "+selectedButton+"\n");
					dispose();
				}
			});
			btnIzvrsiZamenu.setBounds(54, 230, 136, 23);
		}
		return btnIzvrsiZamenu;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.setFont(new Font("Tahoma", Font.PLAIN, 13));
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				dispose();
				}
			});
			btnOdustani.setBounds(259, 230, 130, 23);
		}
		return btnOdustani;
	}
	private JSlider getSliderIznos() {
		if (sliderIznos == null) {
			sliderIznos = new JSlider();
			sliderIznos.setValue(0);
			sliderIznos.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent arg0) {
					getTxtIznos().setText(Integer.toString(getSliderIznos().getValue()));
				}
			});
			sliderIznos.setSnapToTicks(true);
			sliderIznos.setMinorTickSpacing(5);
			sliderIznos.setPaintTicks(true);
			sliderIznos.setMajorTickSpacing(10);
			sliderIznos.setPaintLabels(true);
			sliderIznos.setBounds(21, 181, 402, 38);
		}
		return sliderIznos;
	}
	
	
}
