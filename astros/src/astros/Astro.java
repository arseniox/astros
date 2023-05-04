package astros;

import java.util.Scanner;

public abstract class Astro {
	
	//ATRIBUTOS
	private String nombre;
	private float radioEcuatorial;
	private float masa;
	private float periodoRotacion;
	private float temperaturaMedia;
	private float gravedad;
	
	
	// GETTERS Y SETTERS

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public float getRadioEcuatorial() {
		return radioEcuatorial;
	}

	public void setRadioEcuatorial(float radioEcuatorial) {
		this.radioEcuatorial = radioEcuatorial;
	}

	public float getMasa() {
		return masa;
	}

	public void setMasa(float masa) {
		this.masa = masa;
	}

	public float getPeriodoRotacion() {
		return periodoRotacion;
	}

	public void setPeriodoRotacion(float periodoRotacion) {
		this.periodoRotacion = periodoRotacion;
	}

	public float getTemperaturaMedia() {
		return temperaturaMedia;
	}

	public void setTemperaturaMedia(float temperaturaMedia) {
		this.temperaturaMedia = temperaturaMedia;
	}

	public float getGravedad() {
		return gravedad;
	}

	public void setGravedad(float gravedad) {
		this.gravedad = gravedad;
	}
	
	
	// CONSTRUCTORES
	public Astro() {
		this.nombre = "";
		this.radioEcuatorial = 0.0f;
		this.masa = 0.0f;
		this.periodoRotacion = 0.0f;
		this.temperaturaMedia = 0.0f;
		this.gravedad = 0.0f;
	}

	public Astro(String nombre, float radioEcuatorial, float masa, float periodoRotacion, float temperaturaMedia, float gravedad) {
		this.nombre = nombre;
		this.radioEcuatorial = radioEcuatorial;
		this.masa = masa;
		this.periodoRotacion = periodoRotacion;
		this.temperaturaMedia = temperaturaMedia;
		this.gravedad = gravedad;
	}
	
	
	// MÉTODOS
	public abstract void muestra();
	
	
	// MAIN
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int opcion = 0;
        
        while (opcion != 3) {
    		System.out.println();
            System.out.println("Seleccione un planeta o satélite:");
            System.out.println("1. Ver información de los planetas");
            System.out.println("2. Ver información de los satélites");
            System.out.println("3. Salir");
    		System.out.println();

            
            opcion = input.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Información de los planetas:");
            		Planeta mercurio = new Planeta("Mercurio", 2439.7f, 0.330f, 1407.6f, 440.0f, 3.7f, 57.9f, 87.97f, false);
                    mercurio.muestra();
            		Planeta venus = new Planeta("Venus", 6051.8f, 4.87f, -5832.5f, 737.0f, 8.87f, 108.2f, 224.7f, false);
                    venus.muestra();
            		Planeta tierra = new Planeta("Tierra", 6371.0f, 5.97f, 23.9f, 288.0f, 9.81f, 149.6f, 365.2f, true);
                    tierra.muestra();
            		Planeta marte = new Planeta("Marte", 3389.5f, 0.642f, 24.6f, 210.0f, 3.71f, 227.9f, 687.0f, true);
                    marte.muestra();
            		Planeta jupiter = new Planeta("Júpiter", 69911.0f, 1898.0f, 9.9f, 165.0f, 24.79f, 778.6f, 4331.0f, true);
                    jupiter.muestra();
            		Planeta saturno = new Planeta("Saturno", 58232.0f, 568.0f, 10.7f, -140.0f, 10.44f, 1433.5f, 10747.0f, true);
                    saturno.muestra();
            		Planeta urano = new Planeta("Urano", 25362.0f, 86.8f, -17.2f, -195.0f, 8.69f, 2872.5f, 30589.0f, true);
                    urano.muestra();
            		Planeta neptuno = new Planeta("Neptuno", 24622.0f, 102.0f, 16.1f, -200.0f, 11.15f, 4495.1f, 59800.0f, true);
                    neptuno.muestra();                    
                    break;
                case 2:
                    System.out.println("Información de los satélites:");
            		Satelite luna = new Satelite("Luna", 1737.1f, 7.342e22f, -20.0f, 1.62f, 9.81f, 384400.0f, 27.3f, "Tierra");
                    luna.muestra();
            		Satelite phobos = new Satelite("Phobos", 11.1f, 1.07e16f, -100.0f, 0.008f, 0.0057f, 9378.0f, 0.319f, "Marte");
                    phobos.muestra();
            		Satelite deimos = new Satelite("Deimos", 6.2f, 2.4e15f, -75.0f, 0.003f, 0.003f, 23460.2f, 1.263f, "Marte");
            		deimos.muestra();
            		Satelite io = new Satelite("Io", 1821.6f, 8.93e22f, -143.0f, 1.796f, 1.796f, 421700.0f, 1.769f, "Júpiter");
            		io.muestra();
            		Satelite europa = new Satelite("Europa", 1560.8f, 4.8e22f, -160.0f, 1.314f, 1.314f, 671100.0f, 3.551f, "Júpiter");
            		europa.muestra();
            		Satelite ganimedes = new Satelite("Ganimedes", 2634.1f, 1.48e23f, -163.0f, 1.428f, 1.428f, 1070400.0f, 7.155f, "Júpiter");
            		ganimedes.muestra();
            		Satelite calisto = new Satelite("Calisto", 2410.3f, 1.08e23f, -140.0f, 1.235f, 1.235f, 1882700.0f, 16.689f, "Júpiter");
            		calisto.muestra();
            		Satelite titan = new Satelite("Titan", 2575.5f, 1.35e23f, -179.0f, 1.354f, 1.354f, 1221870.0f, 15.945f, "Saturno");
            		titan.muestra();
            		Satelite encelado = new Satelite("Encélado", 504.2f, 1.08e20f, -201.0f, 0.111f, 0.111f, 238020.0f, 1.37f, "Saturno");
            		encelado.muestra();
            		Satelite miranda = new Satelite("Miranda", 235.8f, 6.59e19f, 1.413f, 73.0f, -1.35f, 129390.0f, 1.413f, "Urano");
            		miranda.muestra();
            		Satelite ariel = new Satelite("Ariel", 578.9f, 1.35e21f, 2.52f, 60.0f, -1.59f, 191240.0f, 2.52f, "Urano");
            		ariel.muestra();
            		Satelite umbriel = new Satelite("Umbriel", 584.7f, 1.27e21f, 4.14f, 75.0f, -1.40f, 266000.0f, 4.14f, "Urano");
            		umbriel.muestra();
            		Satelite titania = new Satelite("Titania", 788.4f, 3.49e21f, 8.71f, 70.0f, -1.47f, 436300.0f, 8.71f, "Urano");
            		titania.muestra();
            		Satelite oberon = new Satelite("Oberon", 761.4f, 3.01e21f, 13.46f, 69.0f, -1.48f, 583520.0f, 13.46f, "Urano");
            		oberon.muestra();
            		Satelite triton = new Satelite("Tritón", 1353.4f, 2.14e22f, -5.88f, 38.0f, -0.78f, 354800.0f, -5.88f, "Neptuno");
            		triton.muestra();
            		Satelite nereida = new Satelite("Nereida", 170.0f, 3.0e19f, 360.0f, 50.0f, -0.3f, 5513813.0f, 360.0f, "Neptuno");
            		nereida.muestra();
            		break;
                case 3:
                    System.out.println("Ha salido del menú");
                    break;
                default:
                    System.out.println("Opción inválida. Seleccione otra opción.");
                    break;
            }
        }
		
		
	}

	
}
