package astros;

public class Planeta extends Astro {
	
	// ATRIBUTOS
	private float distanciaSolar;
	private float orbitaSolar;
	private boolean tieneSatelite;

		
	// GETTERS Y SETTERS
	public float getDistanciaSolar() {
		return distanciaSolar;
	}
	public void setDistanciaSolar(float distanciaSolar) {
		this.distanciaSolar = distanciaSolar;
	}
	public float getOrbitaSolar() {
		return orbitaSolar;
	}
	public void setOrbitaSolar(float orbitaSolar) {
		this.orbitaSolar = orbitaSolar;
	}
	public boolean isTieneSatelite() {
		return tieneSatelite;
	}
	public void setTieneSatelite(boolean tieneSatelite) {
		this.tieneSatelite = tieneSatelite;
	}
	
	
	// CONSTRUCTORES
	Planeta() {
		super();
		this.distanciaSolar=0.0f;
		this.orbitaSolar=0.0f;
		this.tieneSatelite=false;
	}
	
	
	Planeta(String nombre, float radioEcuatorial, float masa, float periodoRotacion, float temperaturaMedia, float gravedad, float distanciaSolar, float orbitaSolar, boolean tieneSatelite) {
		super(nombre, radioEcuatorial, masa, periodoRotacion, temperaturaMedia, gravedad);
		this.distanciaSolar=distanciaSolar;
		this.orbitaSolar=orbitaSolar;
		this.tieneSatelite=tieneSatelite;
	}

	
	// MÉTODOS
	@Override
	public void muestra() {
		System.out.println();
		System.out.println("================");
		System.out.println("NOMBRE: " + getNombre());
		System.out.println("================");
		System.out.println("RADIO ECUATORIAL: " + getRadioEcuatorial() + " km");
		System.out.println("MASA: " + getMasa()+ " kg");
		System.out.println("PERIODO DE ROTACIÓN: " + getPeriodoRotacion()+ " h");
		System.out.println("TEMPERATURA MEDIA: " + getTemperaturaMedia()+ "K");
		System.out.println("GRAVEDAD: " + getGravedad()+ " m/s²");
		System.out.println("DISTANCIA SOLAR: " + getDistanciaSolar()+ " millones de km");
		System.out.println("ORBITA SOLAR: " + getOrbitaSolar()+ " millones de km");
		System.out.println("¿TIENE ALGUN SATÉLITE?: " + isTieneSatelite());
		System.out.println();

	}
	

}
