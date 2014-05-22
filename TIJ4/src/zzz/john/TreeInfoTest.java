package zzz.john;

import java.util.ArrayList;
import java.util.List;

public class TreeInfoTest {

	public static void main(String[] args) {
		TreeInfo a = new TreeInfo();
		TreeInfo b = new TreeInfo();
		
		a.files.add("a-file-1");
		a.files.add("a-file-2");
		a.dirs.add("a-dir-1");
		a.dirs.add("a-dir-2");
		
		b.files.add("b-file-1");
		b.files.add("b-file-2");
		b.dirs.add("b-dir-1");
		b.dirs.add("b-dir-2");
		
		System.out.println(a.files);
		System.out.println(a.dirs);
		
		a.addAll(b);
		
		System.out.println(a.files);
		System.out.println(a.dirs);		
	}

}

class TreeInfo {
	public List files = new ArrayList();
	public List dirs = new ArrayList();
	
	public void addAll(TreeInfo other) {
		files.addAll(other.files);
		dirs.addAll(other.dirs);
	}
	
	
	
	
}
