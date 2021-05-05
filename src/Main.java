import java.rmi.RemoteException;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		// TODO Auto-generated method stub
		BasePlayerManager basePlayerManager = new PlayerManager(new MernisServiceAdapter());
	
		Date d1 = new Date(2002,8,7);
		basePlayerManager.Save(new Player(1,d1,"Ýrem Samur","","12345678956"));
		
		basePlayerManager.Delete(new Player(1,d1,"Mine","Keskin","12348778956"));
		basePlayerManager.Update(new Player(1,d1,"Mine","Keskin","12348778956"));
		BaseSaleManager baseSaleManager = new SaleManager();
		Player player1=new Player(1,d1,"Ýrem Samur","","12345678956");
		Campaign campaign1 = new Campaign();
		campaign1.campaignName="Bir alana bir bedava";
		
		Game game1=new Game();
		game1.gameName="Sudoku";
		baseSaleManager.sellCampaign(player1,game1,campaign1);
		

	}

}
