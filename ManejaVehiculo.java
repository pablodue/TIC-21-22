package MiCodigo;

public class ManejaVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculos miBarquito;
		Coche miCoche;
		CocheElectrico miCochePilas;
		miBarquito=new Vehiculos("Titanic2","acuatico");
		miCoche=new Coche("Delorean","terrestre");
		miCochePilas=new CocheElectrico("Tesla","terrestre");
		System.out.println("Mi coche es un"+miCochePilas.getIdentificador());


	}

}
