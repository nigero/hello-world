package edu.ap.spring.view;

import java.awt.event.ActionEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ap.spring.jpa.Question;


@Service
public class EventHandler {
	private UI ui;
	private Question ques;
	
	@Autowired
    public void setUI(UI ui) {
    		this.ui = ui;
    }
	
	 public void whenButtonClicked(ActionEvent actionEvent) {
 		
 		String question = ui.getTxtQuestion();
 		ui.setLblAntwoord(ques.getAnswer());
 		
 }

}
