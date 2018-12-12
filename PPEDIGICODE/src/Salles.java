
public class Salles {
	
	private int id;
	private String nom, code, typeSalle, adresse, codePostal, ville, etage;
	
	
	public Salles(int id, String nom, String code, String typeSalle, String adresse, String codePostal, String ville,
			String etage) {
		this.id = id;
		this.nom = nom;
		this.code = code;
		this.typeSalle = typeSalle;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.etage = etage;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getTypeSalle() {
		return typeSalle;
	}


	public void setTypeSalle(String typeSalle) {
		this.typeSalle = typeSalle;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getCodePostal() {
		return codePostal;
	}


	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public String getEtage() {
		return etage;
	}


	public void setEtage(String etage) {
		this.etage = etage;
	}


	@Override
	public String toString() {
		return nom;
	}
	
	

	
}
