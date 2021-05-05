import java.rmi.RemoteException;

public class PlayerManager extends BasePlayerManager {

	private PlayerCheckService playerCheckService;
	//abstract class� extends ederek interface 'deki save dolayl� olarak miras alm�� oldu
	public PlayerManager(PlayerCheckService playerCheckService) {
		super();
		this.playerCheckService = playerCheckService;
	}
	
	@Override
	public void Save(Player player) throws NumberFormatException, RemoteException {
		if(playerCheckService.CheckIfRealPerson(player)) {
			super.Save(player);
		}
		else {
			System.out.println("Not a valid person"); 
			
		}
		
	}
	

}
