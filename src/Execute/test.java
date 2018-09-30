package Execute;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.jar.Attributes.Name;

public class test {

	public static void main(String[] args) {

    BufferedReader br = null;
    ArrayList<Person> members = new ArrayList<>();
        try {
            br = new BufferedReader(new FileReader("/Users/Dini/github/CS_challenge/src/Util/superstar1.txt"));
            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
            	System.out.println(line);
            	if (i == 0) {
            		String[] names = line.split(" ");
            		for (int j = 0; j < names.length; j++) {
            			members.add(new Person(names[j]));
            		}
            	}
            	else {
            		String[] nextline = line.split(" "); 
            		for (int w = 0; w < members.size(); w++) {
            			if (members.get(w).getName().equals(nextline[0])) {
            				for (int x = 0; x < members.size(); x++) {
                    			if (members.get(x).getName().equals(nextline[1])) {
                    				members.get(x).setFollower(members.get(w));
                    			}
            				
            			}
            			
            		}
            	}
            	
            	}
            	}
            for (int x = 0; x < members.size(); x++) {
            		System.out.println(members.get(x).followersString());
            }
        }
            
         catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
  }
}

