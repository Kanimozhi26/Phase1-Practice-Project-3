package practiceproject3;

import java.io.BufferedWriter; 
import java.io.FileWriter; 
import java.io.IOException; 
import java.io.PrintWriter; 
public class appendfile{ 
	public static void main(String args[]) throws IOException { 
		// We have a file names.txt which already contain // two names, now we need to append couple of // more names onto it. // here is how it looks like now // names.txt // James // Hobert // In order to append text to a file, you need to open // file into append mode, you do it by using // FileReader and passing 
		FileWriter fw = null; 
		BufferedWriter bw = null; 
		PrintWriter pw = null; 
		try { 
			fw = new FileWriter("names.txt", true); 
			bw = new BufferedWriter(fw); 
			pw = new PrintWriter(bw); 
			pw.println("AAA"); 
			pw.println("BBB"); 
			pw.println("CCC"); 
			System.out.println("Data Successfully appended into file"); 
			pw.flush(); 
			} 
		finally { 
			try { 
				pw.close(); 
				bw.close(); 
				fw.close(); 
				} 
			catch (IOException io) {
			}
			}
				try (FileWriter f = new FileWriter("new.txt", true); 
						BufferedWriter b = new BufferedWriter(f); 
						PrintWriter p = new PrintWriter(b);) { 
					p.println(" appending text into file "); 
					p.println("DDD "); 
					p.println("EEE "); 
					} 
				catch (IOException i) { 
						i.printStackTrace(); 
						} 
				} 
			}
		
		
	

