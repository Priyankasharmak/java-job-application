package filehandle;

import java.awt.Frame;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import src.update;

public class createFIle {
	public static JFrame fm;
	public static String id;
	
	public void createFile(
			
			String name ,
			String mail,
			String number,
			String qualif,
			String filename ,
			String exp,
			String status ,
			String age ,
			String comments,
			String parent ,
			String language ,
			String gender,
			boolean isnew ,
			String oldid
			) throws IOException {
		
		if(isnew) {
		    Random rnd = new Random();
		    String appid = String.valueOf(rnd.nextInt(10000));
		    File file = new File("forms/" + name + "-" + appid + ".txt");
		    enterfield(name,mail,number,qualif,exp,status,age,comments , parent ,language,gender , file);
		    id = appid;
		}
		else {
			File file = new File(filename);
			file.delete();
			File newfile = new File("forms/" + name + "-" + oldid + ".txt");
			FileWriter fw = new FileWriter(newfile);
			 enterfield(name,mail,number,qualif,exp,status,age,comments , parent ,language,gender , newfile);
			 id = oldid;
		}
		
	}
	
	public static void enterfield(
			String name,
			String mail,
			String number,
			String qualif,
			String exp,
			String status ,
			String age ,
			String comments,
			String parent ,
			String language ,
			String gender,
			File file  ) throws IOException {
		FileWriter fw = new FileWriter(file);
		
		fw.write("Name :" + name + "\n");
		fw.write("Gender :" + gender + "\n");
		fw.write("Number :" + number + "\n");
		fw.write("Mail :" + mail + "\n");
		fw.write("Age :" + age + "\n");
		fw.write("Languages known :" + language + "\n");
		fw.write("Experience :" + exp + "\n");
		fw.write("Status :" + status + "\n");
		fw.write("Qualification :" + qualif + "\n");
		fw.write("Parent name :" + parent + "\n");
		fw.write("Comments :" + comments + "\n");
		fw.close();
		
	}	
}
