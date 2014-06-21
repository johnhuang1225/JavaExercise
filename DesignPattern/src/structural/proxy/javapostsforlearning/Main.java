package structural.proxy.javapostsforlearning;

public class Main {

	public static void main(String[] args) {
		User user = new User("a0801","a0801");
		IFolder proxy = new FolderProxy(user);
		proxy.performOperations();
		
		System.out.println("###################");
		
		User wrong = new User("a0001","a0001");
		IFolder wrongProxy = new FolderProxy(wrong);
		wrongProxy.performOperations();
	}

}
