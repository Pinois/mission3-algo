
public class Main {
	public static final int RANK = 0;
	public static final int TITLE = 1;
	public static final int FOR1 = 2;
	public static final int FOR1NAME = 3;
	public static final int FOR2 = 4;
	public static final int FOR2NAME = 5;
	public static final int FOR3 = 6;
	public static final int FOR3NAME = 7;
	
	public static void main(String[] args) {
		Fichier fichierR = new Fichier();
		fichierR.ouvrir("journals.csv", 'R');
		
		String ligneInput = null;
		GestionEnregistrements gestionEnregistrement = new GestionEnregistrements();
		
		while((ligneInput = fichierR.lire()) != null){
			String[] champs = ligneInput.split(",");
			Enregistrement enregistrement = null;
			switch (champs.length) {
			case 4:
				enregistrement = new Enregistrement(champs[RANK], champs[TITLE], champs[FOR1], champs[FOR1NAME]);
				break;
			case 6: 
				enregistrement = new Enregistrement(champs[RANK], champs[TITLE], champs[FOR1], champs[FOR1NAME], champs[FOR2], champs[FOR2NAME]);
				break;
			case 8:
				enregistrement = new Enregistrement(champs[RANK], champs[TITLE], champs[FOR1], champs[FOR1NAME], champs[FOR2], champs[FOR2NAME], champs[FOR3], champs[FOR3NAME]);
			default:
				break;
			}
			if(enregistrement != null)
				gestionEnregistrement.setEnregistrement(enregistrement.getTitle(), enregistrement);
			System.out.println(enregistrement.toString());
		}
		System.out.println("rank : "+(gestionEnregistrement.getEnregistrement("International Education Journal")).getRank());
	}
}
