package Odev3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.SpinnerNumberModel;
import javax.swing.JComboBox;

public class panelSpinner extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					panelSpinner frame = new panelSpinner();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public panelSpinner() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 629, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSpinner WidthSpinner = new JSpinner();
		WidthSpinner.setModel(new SpinnerNumberModel(50, 50, 255, 5));
		WidthSpinner.setBounds(43, 40, 55, 35);
		contentPane.add(WidthSpinner);
		
		JSpinner HeigthSpinner = new JSpinner();
		HeigthSpinner.setModel(new SpinnerNumberModel(50, 50, 255, 5));
		HeigthSpinner.setBounds(205, 40, 55, 35);
		contentPane.add(HeigthSpinner);
		
		JSpinner xSpinner = new JSpinner();
		xSpinner.setModel(new SpinnerNumberModel(new Integer(0), null, null, new Integer(5)));
		xSpinner.setBounds(325, 122, 55, 35);
		contentPane.add(xSpinner);
		
		JSpinner ySpinner = new JSpinner();
		ySpinner.setModel(new SpinnerNumberModel(new Integer(0), null, null, new Integer(5)));
		ySpinner.setBounds(325, 315, 55, 35);
		contentPane.add(ySpinner);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 83, 305, 313);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton Button = new JButton("New button");
		Button .setBounds(106, 282, 85, 21);
		panel.add(Button );
		
		JLabel lblNewLabel = new JLabel("GEN\u0130\u015EL\u0130K\r\n");
		lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(31, 6, 75, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblYkseklik = new JLabel("Y\u00DCKSEKL\u0130K\r\n");
		lblYkseklik.setHorizontalAlignment(SwingConstants.CENTER);
		lblYkseklik.setFont(new Font("Impact", Font.PLAIN, 14));
		lblYkseklik.setBounds(195, 6, 75, 24);
		contentPane.add(lblYkseklik);
		
		JLabel lblNewLabel_1 = new JLabel("X");
		lblNewLabel_1.setFont(new Font("Impact", Font.PLAIN, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(325, 83, 55, 35);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Y");
		lblNewLabel_1_1.setToolTipText("Y");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Impact", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(325, 276, 55, 35);
		contentPane.add(lblNewLabel_1_1);
		
		JSpinner gSpinner = new JSpinner();
		gSpinner.setModel(new SpinnerNumberModel(0, null, 255, 5));
		gSpinner.setBounds(504, 184, 64, 43);
		contentPane.add(gSpinner);
		
		JSpinner bSpinner = new JSpinner();
		bSpinner.setModel(new SpinnerNumberModel(0, null, 255, 5));
		bSpinner.setBounds(504, 285, 64, 43);
		contentPane.add(bSpinner);
		
		JSpinner rSpinner = new JSpinner();
		rSpinner.setModel(new SpinnerNumberModel(0, null, 255, 5));
		rSpinner.setBounds(504, 83, 64, 43);
		contentPane.add(rSpinner);
		
		JLabel lblNewLabel_2 = new JLabel("R");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Impact", Font.PLAIN, 19));
		lblNewLabel_2.setBounds(445, 62, 64, 26);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("G");
		lblNewLabel_2_1.setFont(new Font("Impact", Font.PLAIN, 19));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(445, 151, 64, 26);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("B");
		lblNewLabel_2_2.setFont(new Font("Impact", Font.PLAIN, 19));
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setBounds(445, 250, 64, 26);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3 = new JLabel("Onur Emircan S\u00F6nmez 20410051508\r\n\r\n\r\n\r\n");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(366, 361, 249, 35);
		contentPane.add(lblNewLabel_3);
	
	
	//spinners change events 
		
		int w=50;
		int h =50;
		int x=50;
		int y=50;
		
		WidthSpinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
				int y= (int) ySpinner.getValue();
				int h= (int) HeigthSpinner.getValue();
				int w= (int) WidthSpinner.getValue();
				int	x=(int)xSpinner.getValue();
				
				 Button.setBounds(x,y,w,h);
				
			}
		});
		
		HeigthSpinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
				int y= (int) ySpinner.getValue();
				int h= (int) HeigthSpinner.getValue();
				int w= (int) WidthSpinner.getValue();
				int	x=(int)xSpinner.getValue();
				
				 Button.setBounds(x,y,w,h);
			}
		});
		
		
		xSpinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				
				int y= (int) ySpinner.getValue();
				int h= (int) HeigthSpinner.getValue();
				int w= (int) WidthSpinner.getValue();
				int	x=(int)xSpinner.getValue();
				
		Button.setBounds(x,y,w,h);
			}
		});
		
		
		ySpinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
			
				int y= (int) ySpinner.getValue();
				int h= (int) HeigthSpinner.getValue();
				int w= (int) WidthSpinner.getValue();
				int	x=(int)xSpinner.getValue();
				
				Button.setBounds(x,y,w,h);
				

			
			}
		});
		
		
		
	int r =0;
	int	g=0;
	int	b=0;

		rSpinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
			
				int r= (int)  rSpinner.getValue();
				int g = (int) gSpinner.getValue();
				int b = (int) bSpinner.getValue();
				
				Button.setBackground(new Color(r,g,b));
				

			
			}
		});
		
		
		gSpinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
			
				int g= (int) gSpinner.getValue();
				int r = (int) rSpinner.getValue();
				int b = (int) bSpinner.getValue();
				Button.setBackground(new Color(r,g,b));
				

			
			}
		});
		
		
		
		bSpinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
			
				int b= (int) bSpinner.getValue();
				int g = (int) gSpinner.getValue();
				int r = (int) rSpinner.getValue();
				
				Button.setBackground(new Color(r,g,b));
				

			
			}
		});
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	}
}
