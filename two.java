package test2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class two {
 
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("lib/1.txt");
		BufferedReader breader=new BufferedReader(reader);
		Writer writer=new FileWriter("lib/2.txt");	
		BufferedWriter bwriter=new BufferedWriter(writer);
		String str;
		while (((str=breader.readLine())!=null)) {
			bwriter.write(str);	
			bwriter.write("\r\n");
		}
		breader.close();
		bwriter.close();
	}

}	
