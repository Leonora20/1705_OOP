import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=null;
		Writer wr=null;
		/*To read and write to another file>>>*/
		try {
			sc=new Scanner(new File("file1.lst"));
			wr=new FileWriter(new File("file2.lst"));
			while(sc.hasNext()) {
				String nextLine=sc.nextLine();
				wr.write(nextLine + "\n");
				System.out.println(nextLine);
			}
			sc.close();
			wr.flush();
			wr.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}


/* Only to read...>>>>
   public static void main(String[] args) {
		Scanner sc=null;
		try {
			sc=new Scanner(new File("file1.lst"));
			while(sc.hasNext()) {
				System.out.println(sc.next());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
 */
