public class Main{
	public static void main(String[] args){
		//User user = new User("Bob");
		//user.report();
		//user.save();

		Persister user = new Persister("Ekaterina");
		user.report();
		user.save();
	}
}