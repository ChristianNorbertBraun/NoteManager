package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.util.GregorianCalendar;

import settings.Settings;

public class HistoryWriter {

	DateFormat dayMonthYear;
	DateFormat time;
	GregorianCalendar now = new GregorianCalendar();
	String date;
	FileWriter fw;
	BufferedWriter bw;
	
	public  void writeNoteIntoHistory(String note) throws IOException{
		fw =new FileWriter(Settings.HISTORYPATH, true);

		bw = new BufferedWriter(fw);
		dayMonthYear = DateFormat.getDateInstance(DateFormat.LONG);
		time = DateFormat.getTimeInstance(DateFormat.SHORT);
		date = dayMonthYear.format(now.getTime())+" "+time.format(now.getTime());
		
		if(note.equals("")){
			System.out.println("Leerer String");
		}
		else{
			bw.newLine();
			bw.write("-------------------------------------------------------");
			bw.newLine();
			bw.write(date);
			bw.newLine();
			bw.write(note);
		}
		bw.close();
		
		
	}
	
}
