package Day18.IOStream;


import java.io.*;

class ByteStreamIODemo
{
	public static void main(String args[]) throws IOException
	{
		File f1 = new File("File.txt");
		// File f2 = new File("myoutfile.txt");

		if(f1.exists() == false)
		{
			System.out.println(f1.getName() + " does not exists !!");
			return;
		}

		//Reading from the file
		FileInputStream fis = new FileInputStream(f1) ;	//will read from myfile.txt
		//FileInputStream fis = new FileInputStream(f1);	//will read from myfile.txt
		//FileOutputStream fos = new FileOutputStream(f2); 	//will write to myoutfile.txt, does not append
		//FileOutputStream fos = new FileOutputStream(f2,true);	//will append to the file
									
		int ch;
		while((ch = fis.read()) != -1)
		{
			System.out.print((char)ch);	//console print
			// fos.write(ch);
		}	

		fis.close();
		// fos.close();
		System.out.println("I/O operation done sucessfully");
	}
}

