public class Account{
	private String user = "geminno";
	private String password = "1234";
	
	public void setPwd(String str){
		this.password = str;
	}
	
	public void info(){
		System.out.println("user:" + this.user +
		 "password" + this.password);
	
	}
}