package MiCodigo;

public class Fecha2 {
	private int dia;
	private int mes;
	private int anio;
	
	public Fecha2(int dia, int mes, int anio) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	/**
	 * @return the dia
	 */
	public int getDia() {
		return dia;
	}
	
	/**
	 * @param dia the dia to set
	 */
	public void setDia(int dia) {
		this.dia = dia;
	}

	/**
	 * @return the mes
	 */
	public int getMes() {
		return mes;
	}
	public String getMes(int modo) {
		String nombreMes = " ";
		if(modo==0) {
			if(this.mes==1) nombreMes="Enero";
			if(this.mes==2) nombreMes="Febrero";
			if(this.mes==3) nombreMes="Marzo";
			if(this.mes==4) nombreMes="Abril";
			if(this.mes==5) nombreMes="Mayo";
			if(this.mes==6) nombreMes="Junio";
			if(this.mes==7) nombreMes="Julio";
			if(this.mes==8) nombreMes="Agosto";
			if(this.mes==9) nombreMes="Septiembre";
		}
		return nombreMes;
	}

	/**
	 * @param mes the Ames to set
	 */
	public void setMes(int mes) {
		this.mes = mes;
	}
	public void setMes(String nombreMes) {
		if(nombreMes=="Enero") this.mes=1;
		if(nombreMes=="Febrero") this.mes=2;
		if(nombreMes=="Marzo") this.mes=3;
		if(nombreMes=="Abril") this.mes=4;
		if(nombreMes=="Mayo") this.mes=5;
		if(nombreMes=="Junio") this.mes=6;
		if(nombreMes=="Julio") this.mes=7;
		if(nombreMes=="Agosto") this.mes=8;
		if(nombreMes=="Septiembre") this.mes=9;
				
	}
	/**
	 * @return the anio
	 */
	public int getAnio() {
		return anio;
	}

	/**
	 * @param anio the anio to set
	 */
	public void setAnio(int anio) {
		this.anio = anio;
	}
	boolean esPosterior(Fecha2 nuevaFecha){
		boolean loEs;
		loEs=false;
		if(this.getAnio()>nuevaFecha.getAnio()) loEs=true;
		else 
			if(this.getAnio()==nuevaFecha.getAnio()) 
				if(this.getMes()>nuevaFecha.getMes()) 
					loEs=true;
				
				else 
					if(this.getMes()==nuevaFecha.getMes()) 
						if(this.getDia()>nuevaFecha.getDia()) 
							loEs=true;
				
			
		
		
		
		return loEs;
	}
	
	 
}
