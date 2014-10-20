import java.util.HashMap;
import java.util.Map;


public class GestionEnregistrements {
	private Map<String, Enregistrement> enregistrements = null;

	public GestionEnregistrements() {
		enregistrements = new HashMap<String, Enregistrement>();
	}

	public Map<String, Enregistrement> getEnregistrements() {
		return enregistrements;
	}

	public void setEnregistrements(Map<String, Enregistrement> enregistrements) {
		this.enregistrements = enregistrements;
	}
	
	public Enregistrement getEnregistrement(String title) {
		return enregistrements.get(title);
	}
	
	public void setEnregistrement(String title, Enregistrement enregistrement) {
		if(title != null && !title.isEmpty() && !enregistrements.containsKey(title)){
			enregistrements.put(title, enregistrement);
		}
	}
}