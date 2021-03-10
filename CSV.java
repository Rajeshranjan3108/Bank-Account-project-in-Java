package Readfile;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class CSV {
	public static List<String[]> read(String file){
		List<String[]> data=new LinkedList<String[]>();
		try {
			String readrow;
			BufferedReader bf=new BufferedReader(new FileReader(file));
			while((readrow=bf.readLine())!=null) {
//			readrow=bf.readLine();
//			System.out.println(readrow);
			String[] split=readrow.split(",");
			data.add(split);
			}
			bf.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("could not find file");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("could not read file");
			e.printStackTrace();
		}
		
		return data;
	}
}
