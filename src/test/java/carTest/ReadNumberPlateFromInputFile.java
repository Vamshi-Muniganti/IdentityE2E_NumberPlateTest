package carTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ReadNumberPlateFromInputFile {
	
	public List<String> numberPlate() {
	
	String regex = "\\b[A-Z]{2}\\d{2} ?[A-Z]{3}\\b";	
	Pattern p = Pattern.compile(regex);
	List<String> numberPlates = new ArrayList<>();
	
	String sCurrentLine;
	String Content ="";
	BufferedReader br = null;

        try {

            br = new BufferedReader(new FileReader("resources/car_input V4.txt"));

            while ((sCurrentLine = br.readLine()) != null) {
                Content = br.lines().collect(Collectors.joining(System.lineSeparator()));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
	 
	 Matcher m = p.matcher(Content);
      
    while (m.find()) {
        numberPlates.add(m.group());
    }

    for (String plate : numberPlates) {
       System.out.println(plate);
    }
    return numberPlates;
	}
	
}
