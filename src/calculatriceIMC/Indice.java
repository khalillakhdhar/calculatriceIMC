package calculatriceIMC;

public class Indice {
	private double poids, taille;

	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}

	public double getTaille() {
		return taille;
	}

	public void setTaille(double taille) {
		this.taille = taille;
	}

	public Indice(double poids, double taille) {
		super();
		this.poids = poids;
		this.taille = taille;
	}

	public void sayHello() {
		System.out.println(" welcome to IMC calculator");

	}

	public Indice() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long calculer() {
		long imc = Math.round(this.poids / Math.pow(taille, 2));
		return imc;
	}
	public String interpretation()
	{
		
		if(this.calculer()<20)
		{
			return "maigre";
		}
		else if(this.calculer()<=25)
		{
			return "idéal";
		}
		else
			return "surpoid";
	}

	@Override
	public String toString() {
		return "Indice [poids=" + poids + ", taille=" + taille + ", IMC=" + calculer() + ", interpretation="
				+ interpretation() + "]";
	}

}
