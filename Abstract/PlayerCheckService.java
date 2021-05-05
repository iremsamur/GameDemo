import java.rmi.RemoteException;

public interface PlayerCheckService {

	boolean CheckIfRealPerson(Player player) throws NumberFormatException, RemoteException;
}
