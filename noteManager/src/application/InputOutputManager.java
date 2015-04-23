package application;



import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class InputOutputManager {

	@FXML
	Button syncButton = new Button();
	@FXML 
	TextArea inputText = new TextArea();
	@FXML
	TextArea history = new TextArea();
	
	HistoryWriter hw = new HistoryWriter();
	HistoryReader hr = new HistoryReader();
	HistoryUpdater hu = new HistoryUpdater();
	

	
	public void getSyncedText() throws IOException{
		hw.writeNoteIntoHistory(inputText.getText());
		inputText.clear();
		history.setText(hr.readHistory());
	}
	
	public void updateHistory(KeyEvent t){
		if (t.getCode()==KeyCode.DELETE || t.getCode()==KeyCode.BACK_SPACE){
			hu.updateHistory(history.getText());
			history.setText(hr.readHistory());
		}
		
	}
	
	
}
