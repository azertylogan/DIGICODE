
public class UserCon {
	
	private int id,admin;
	private String motdepasse, email, nom, prenom;
	
	
	public UserCon(int id, int admin, String motdepasse, String email, String nom, String prenom) {
		this.id = id;
		this.admin = admin;
		this.motdepasse = motdepasse;
		this.email = email;
		this.nom = nom;
		this.prenom = prenom;
	}


	public UserCon(String motdepasse, String email) {
		this.motdepasse = motdepasse;
		this.email = email;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getAdmin() {
		return admin;
	}


	public void setAdmin(int admin) {
		this.admin = admin;
	}


	public String getMotdepasse() {
		return motdepasse;
	}


	public void setMotdepasse(String motdepasse) {
		this.motdepasse = motdepasse;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	@Override
	public String toString() {
		return "UserCon [id=" + id + ", admin=" + admin + ", motdepasse=" + motdepasse + ", email=" + email + ", nom="
				+ nom + ", prenom=" + prenom + "]";
	}
	
	
	
	

}
