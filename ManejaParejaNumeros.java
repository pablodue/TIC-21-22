package MiCodigo;

public class ManejaParejaNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiParejaNumeros misNumeros;
		int num1=3;
		int num2=5;
		misNumeros= new MiParejaNumeros(num1,num2);
		System.out.print("La suma vale ");
		System.out.println(misNumeros.devuelveSuma());
		
		System.out.print("La resta vale ");
		System.out.println(misNumeros.devuelveResta());
		
		System.out.print("La suma del numero ");
		System.out.print(num1);
		
		System.out.print(" y del numero ");
		System.out.print(num2);
		
		System.out.print(" es igual a ");
		System.out.print(misNumeros.devuelveSuma());
		
		
	}

}