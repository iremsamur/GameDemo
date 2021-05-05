import java.rmi.RemoteException;

public abstract class BasePlayerManager implements PlayerService{
	public void Save(Player player) throws NumberFormatException, RemoteException  {
		// TODO Auto-generated method stub
		System.out.println("Save to db "+player.FirstName);
		
	}
	public void Delete(Player player) {
		System.out.println("delete from db "+player.FirstName);
	}
	public void Update(Player player) {
		System.out.println("update in db "+player.FirstName);
	}

}
