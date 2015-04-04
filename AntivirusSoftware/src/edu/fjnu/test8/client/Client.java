/**
 * 
 */
package edu.fjnu.test8.client;

import edu.fjnu.test8.antivirus.AntivirusSoftware;
import edu.fjnu.test8.elements.Folder;
import edu.fjnu.test8.elements.ImageFile;
import edu.fjnu.test8.elements.TextFile;
import edu.fjnu.test8.elements.VideoFile;

/**
 * @author guoyumei
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		AntivirusSoftware antivirus = new AntivirusSoftware();
		
		TextFile f1 = new TextFile();
		f1.setFileName("hello.txt");
		ImageFile f2 = new ImageFile();
		f2.setFileName("beauty.jpeg");
		VideoFile f3 = new VideoFile();
		f3.setFileName("magic.mp4");
		TextFile f4 = new TextFile();
		f4.setFileName("hi.txt");
		
		Folder folder1 = new Folder();
		folder1.setFileName("Love");
		folder1.addFile(f1);
		folder1.addFile(f2);
		Folder folder2 = new Folder();
		folder2.setFileName("All");
		folder2.addFile(f3);
		folder2.addFile(f4);
		folder2.addFile(folder1);
		
		antivirus.setElement(folder2);
		antivirus.antivirus();
		System.out.println();
		
		folder1.removeFile(f1);
		antivirus.setElement(folder1);
		antivirus.antivirus();
	}

}
