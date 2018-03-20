package calculadora;

public class Programa {
	
	//TODO: Crear un programa principal que 
	//utilice todas las funciones de la calculadora
	//Incluida las operaciones toString y la potencia
	//que habr�is a�adido.
	//Ejecutadlo.
	public static void main(String[] args) {
		
		Calculadora c1 = new Calculadora(4, 2);
		System.out.println(c1.suma());
		System.out.println(c1.resta());
		System.out.println(c1.division());
		System.out.println(c1.potencia());
		System.out.println(c1);
	}

}
