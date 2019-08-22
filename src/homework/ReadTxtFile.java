package homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.sound.sampled.Line;

public class ReadTxtFile {
	public static void main(String[] args) throws Exception   {
		
		File fr = new File("C:\\Users\\bindu\\Desktop\\selenium\\textfile.txt");
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(fr));
			String line;
			ArrayList<String> usernames = new ArrayList<>();
			ArrayList<String> passwords = new ArrayList<>();
			while((line = br.readLine())!=null){
				String[] arrOfStr = line.split("\t");
				usernames.add(arrOfStr[0]);
				passwords.add(arrOfStr[1]);
			}
			br.close();
			for (int i=0; i<usernames.size(); i++){
				System.out.println(usernames.get(i));
			}
			
			for (String password : passwords){
				System.out.println(password);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Couldn't find the file");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Couldn't read from file");
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NullPointerException npe){
				npe.printStackTrace();
			}
		}
	}
}

		
