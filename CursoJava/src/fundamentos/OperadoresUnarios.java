package fundamentos;

public class OperadoresUnarios {
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		
		// Incremento e decremento
		num1++;
		System.out.println(num1);
		--num1;
		System.out.println(num1);
		
		System.out.println(++num1 == num2--); // Não e boa pratica usar esse tipo de codigo
		System.out.println(num1 == num2);
		//System.out.println(num2);
		
		// Complemento binário
		System.out.println(Integer.toBinaryString(50));
		System.out.println(Integer.toBinaryString(~50));
		
		// Negacao logica
		System.out.println(!true);
	}

}
