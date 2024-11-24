package carTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ReadContentFromOutputFile {
	
	public String carOuput() {	
	String sCurrentLine;
	String Content ="";
	BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("resources/car_output V4.txt"));
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
    return Content;
	}	
}
