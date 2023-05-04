package astros;

public class Satelite extends Astro {
	
	// ATRIBUTOS
	private float distanciaPlanetaria;
	private float orbitaPlanetaria;
	private String planetaOrbitado;

		
	// GETTERS Y SETTERS
	public float getdistanciaPlanetaria() {
		return distanciaPlanetaria;
	}
	public void setdistanciaPlanetaria(float distanciaPlanetaria) {
		this.distanciaPlanetaria = distanciaPlanetaria;
	}
	public float getorbitaPlanetaria() {
		return orbitaPlanetaria;
	}
	public void setorbitaPlanetaria(float orbitaPlanetaria) {
		this.orbitaPlanetaria = orbitaPlanetaria;
	}
	public String getplanetaOrbitado() {
		return planetaOrbitado;
	}
	public void setplanetaOrbitado(String planetaOrbitado) {
		this.planetaOrbitado = planetaOrbitado;
	}
	
	
	// CONSTRUCTORES
	Satelite() {
		super();
		this.distanciaPlanetaria=0.0f;
		this.orbitaPlanetaria=0.0f;
		this.planetaOrbitado="";
	}
	
	
	Satelite(String nombre, float radioEcuatorial, float masa, float periodoRotacion, float temperaturaMedia, float gravedad, float distanciaPlanetaria, float orbitaPlanetaria, String planetaOrbitado) {
		super(nombre, radioEcuatorial, masa, periodoRotacion, temperaturaMedia, gravedad);
		this.distanciaPlanetaria=distanciaPlanetaria;
		this.orbitaPlanetaria=orbitaPlanetaria;
		this.planetaOrbitado=planetaOrbitado;
	}

	
	// MÉTODOS
	@Override
	public void muestra() {
		System.out.println();
		System.out.println("=====================");
		System.out.println("NOMBRE: " + getNombre());
		System.out.println("=====================");
		System.out.println("RADIO ECUATORIAL: " + getRadioEcuatorial() + " km");
		System.out.println("MASA: " + getMasa() + " kg");
		System.out.println("PERIODO DE ROTACIÓN: " + getPeriodoRotacion() + " h");
		System.out.println("TEMPERATURA MEDIA: " + getTemperaturaMedia() + "K");
		System.out.println("GRAVEDAD: " + getGravedad() + " m/s²");
		System.out.println("DISTANCIA PLANETARIA: " + getdistanciaPlanetaria()+ " km");
		System.out.println("ORBITA PLANETARIA: " + getorbitaPlanetaria() + " km");
		System.out.println("PLANETA ORBITADO " + getplanetaOrbitado());
		System.out.println();

		
	}
	

}
