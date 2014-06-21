package structural.proxy.javapostsforlearning;

public class FolderProxy implements IFolder {

	Folder folder;
	User user;

	public FolderProxy(User user){
		this.user = user;
	}

	public void performOperations(){
		if(isAdmin()){
			folder = new Folder();
			folder.performOperations();
		}else{
			System.out.println("你沒有在此資料夾中操作的權限!!");
		}
	}

	public boolean isAdmin(){
		if(user.getName().equalsIgnoreCase("a0801") 
			&& user.getPassword().equalsIgnoreCase("a0801")){
			return true;
		}
		return false;
	}

}
