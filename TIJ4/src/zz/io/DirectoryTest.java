package zz.io;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.mindview.util.PPrint;

public class DirectoryTest {

	public static class TreeInfo implements Iterable {
		public List<File> files = new ArrayList<File>();
		public List<File> dirs = new ArrayList<File>();

		@Override
		public Iterator<File> iterator() {
			return files.iterator();
		}

		public void addAll(TreeInfo other) {
			files.addAll(other.files);
			dirs.addAll(other.dirs);
		}

		@Override
		public String toString() {
			return "result dirs:" + PPrint.pformat(dirs) + "\n result files:"
					+ PPrint.pformat(files);
		}

	}

	public static TreeInfo walk(String start, String regex) {
		return recurseDirs(new File(start), regex);
	}

	public static TreeInfo walk(File start, String regex) {
		return recurseDirs(start, regex);
	}

	public static TreeInfo walk(String start) {
		return recurseDirs(new File(start), ".*");
	}

	public static TreeInfo walk(File start) {
		return recurseDirs(start, ".*");
	}

	static TreeInfo recurseDirs(File startDir, String regex) {
		TreeInfo result = new TreeInfo();
		for (File item : startDir.listFiles()) {
			if (item.isDirectory()) {
				result.dirs.add(item);
				result.addAll(recurseDirs(item, regex));
			} else {
				if (item.getName().matches(regex)) {
					result.files.add(item);
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// if(args.length==0)
		// System.out.println(walk("."));

		TreeInfo result = walk("D:\\Java", ".*\\.java");
		System.out.println(result.files.size());
	}

}
