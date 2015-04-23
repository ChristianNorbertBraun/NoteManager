package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import settings.Settings;

public class HistoryReader {

	FileReader fr;
	BufferedReader br;
	
	public String readHistory() {
		
		try {
			fr = new FileReader(Settings.HISTORYPATH);
			br = new BufferedReader(fr);
			String current = br.readLine();
			String fullContent = "";
			
			while(current!=null){
				fullContent = fullContent + "\n"+current;
				current = br.readLine();
			}
			
			br.close();
			return fullContent;
		} catch (IOException e) {
			return null;
		}
		
		
	}
}
