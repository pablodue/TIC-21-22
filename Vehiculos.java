package MiCodigo;

public class Vehiculos {
	private String identificador;
	private String medio;
	private Double velocidad;
	private int capacidad;
	private int ruedas;
	private int puertas;
	public Vehiculos(String identificador, String medio) {
		super();
		this.identificador = identificador;
		this.medio = medio;
	}
	/**
	 * @return the identificador
	 */
	public String getIdentificador() {
		return identificador;
	}
	/**
	 * @param identificador the identificador to set
	 */
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	/**
	 * @return the medio
	 */
	public String getMedio() {
		return medio;
	}
	/**
	 * @param medio the medio to set
	 */
	public void setMedio(String medio) {
		this.medio = medio;
	}
	/**
	 * @return the velocidad
	 */
	public Double getVelocidad() {
		return velocidad;
	}
	/**
	 * @param velocidad the velocidad to set
	 */
	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;
	}
	/**
	 * @return the capacidad
	 */
	public int getCapacidad() {
		return capacidad;
	}
	/**
	 * @param capacidad the capacidad to set
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	/**
	 * @return the ruedas
	 */
	public int getRuedas() {
		return ruedas;
	}
	/**
	 * @param ruedas the ruedas to set
	 */
	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	/**
	 * @return the puertas
	 */
	public int getPuertas() {
		return puertas;
	}
	/**
	 * @param puertas the puertas to set
	 */
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
	
}
