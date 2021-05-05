
public class SaleManager extends BaseSaleManager {

	@Override
	public void sell(Player player, Game game,Campaign campaign) {
		System.out.println(game.gameName+"sold to"+player.FirstName+" with "+campaign.campaignName);
		
	}
	

}
