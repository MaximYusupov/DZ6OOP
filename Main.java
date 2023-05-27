import model.DumbReport;
import model.DumbSave;
import model.User;

public class Main
{
	public static void main(String[] args)
	{
		User user = new User("Jon");
		user.report(new DumbReport());
		user.save(new DumbSave());
	}
}