
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StringOccurrence {
	
	public static int getOccurrenceCount(String toSearch, InputStream stream)  {
    	
		int count = 0;
	
		InputStreamReader inputStreamReader = new InputStreamReader(stream);
		BufferedReader buffReader = new BufferedReader(inputStreamReader);
		
	    try {
			while (buffReader.ready()) {
			  String line =buffReader.readLine();
			  if(line.contains(toSearch)) {
				  count++;
			  }
			}
		} catch (IOException e) {
			throw new UnsupportedOperationException("Waiting to be implemented.");
		}  
        
	    return count;
       
    }

	public static void main(String[] args) throws Exception {
		String msg = "Hey! How are you?\nI am good, how about you?\nI am good too.";

		try (InputStream stream = new ByteArrayInputStream(msg.getBytes())) {
			System.out.println(StringOccurrence.getOccurrenceCount("good", stream));
		}
	}
}