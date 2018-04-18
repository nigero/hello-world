package edu.ap.spring.view;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UI implements InitializingBean {
	
	@Autowired
	EventHandler eventHandler;
	
	private JFrame jFrame;
	private JLabel lblVraag, lblAntwoord;
	private JTextField txtQuestion;
	private JButton btn;
	private JPanel controlPanel;
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.setProperty("java.awt.headless", "false");
	}
	
	 public UI() {}
	 
	   
	    public void setupUI() {
		    	jFrame = new JFrame("Spring JFrame");
		    	jFrame.setLayout(new FlowLayout());
		    	
		    controlPanel = new JPanel();
		    controlPanel.setLayout(new GridLayout(2, 2));
		    
		    lblVraag = new JLabel("Geef een vraag");
		    lblAntwoord = new JLabel("");
		    
		    txtQuestion = new JTextField(15);
		    
		    btn = new JButton();
		    btn.setText("Vraag");
			btn.addActionListener(eventHandler::whenButtonClicked);
			
			controlPanel.add(lblVraag);
			controlPanel.add(txtQuestion);
			controlPanel.add(lblAntwoord);
			controlPanel.add(btn);
		    
			jFrame.add(controlPanel);
	        
			jFrame.setSize(400, 400);
			jFrame.setLocationRelativeTo(null);
			jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jFrame.pack();
			jFrame.setVisible(true);
	    }

		public String getTxtQuestion() {
			return txtQuestion.getText();
		}

		public String getLblAntwoord() {
			return lblAntwoord.getText();
		}

		public void setLblAntwoord(String string) {
			this.lblAntwoord.setText(string);
		}
	    
	    
		
	
	
}
