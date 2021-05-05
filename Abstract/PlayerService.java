import java.rmi.RemoteException;

public interface PlayerService {
	void Save(Player player) throws NumberFormatException, RemoteException;
	void Delete(Player player);
	void Update(Player player);

}
