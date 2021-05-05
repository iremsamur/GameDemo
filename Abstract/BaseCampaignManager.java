import java.rmi.RemoteException;

//import java.rmi.RemoteException;

public abstract class BaseCampaignManager implements CampaignService{
	public void addCampaign(Player player)  {
		// TODO Auto-generated method stub
		System.out.println("Save to db "+player.FirstName);
		
	}
	public void deleteCampaign(Player player) {
		System.out.println("delete from db "+player.FirstName);
	}
	public void updateCampaign(Player player) {
		System.out.println("update in db "+player.FirstName);
	}

	
}
