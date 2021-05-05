import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PlayerCheckService {

	@Override
	public boolean CheckIfRealPerson(Player player) throws NumberFormatException, RemoteException {
		// TODO Auto-generated method stub
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		return client.TCKimlikNoDogrula(Long.parseLong(player.NationalityId),player.FirstName,player.LastName.toUpperCase(),player.DateOfBirth.getYear());
	}

}
