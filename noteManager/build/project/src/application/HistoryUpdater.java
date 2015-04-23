package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import settings.Settings;

public class HistoryUpdater {
	
	FileWriter fw;
	BufferedWriter bw;
	
	public void updateHistory(String newHistory){
		try{
			fw = new FileWriter(Settings.HISTORYPATH);
			bw = new BufferedWriter(fw);
			bw.write(newHistory);
			bw.close();
		}
		catch(IOException e){
			return;
		}
	}
}
