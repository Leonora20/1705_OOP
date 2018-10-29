package pojo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		serialised();
		deserialised();
	}
	
	private static void serialised() {
		
		FileOutputStream fout = null;
		ObjectOutputStream oout = null;
		try {
			fout= new FileOutputStream(new File("student.txt"));
			oout= new ObjectOutputStream(fout);
			Student s= new Student(22,706,"Omkar",true);
			oout.writeObject(s);
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				fout.close();
				oout.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
private static void deserialised() {
		
		FileInputStream fin = null;
		ObjectInputStream oin = null;
		try {
			fin= new FileInputStream(new File("student.txt"));
			oin= new ObjectInputStream(fin);
			Student s= (Student) oin.readObject();
			System.out.println("Age-->" + s.getAge() + "\n Rollno-->" + s.getRollno() + "\n Name-->" + s.getName() +"\n Indian =" + s.getIsIndian());
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				fin.close();
				oin.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
