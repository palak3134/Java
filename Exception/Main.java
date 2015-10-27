package Exception;

import java.io.*;

public class Main {
	
	public static void main(String args[]) throws IOException
	{
		TryException te = new TryException();
		String s = te.readFirstLineFromFile("/home/palak/Desktop/training.txt");
		String r = te.readFirstLineFromFileWithFinallyBlock("/home/palak/Desktop/training.txt");
		System.out.println(s);
		System.out.println(r);
	}

}
