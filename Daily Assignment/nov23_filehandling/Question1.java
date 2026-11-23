package nov23_filehandling;

import java.io.*;

public class Question1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		File file=new File("D:\\Growskill\\Java\\paragraph.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String str;
		int wordcount =0;
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
			String[] words = str.split(" ");
			wordcount = wordcount + words.length;
		}
		System.out.println("Total Word Count : " +wordcount);
		

	}

}
