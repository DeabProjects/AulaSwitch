package modelo;

public class PrincipalJava13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(escolherDiaSemana(2));

	}

	public static String escolherDiaSemana(int i) {

		return  switch (i) {
		case 1:
			yield "Domingo";
		case 2:
			yield "Segunda";
		case 3:
			yield "Terça";
		case 4:
			yield "Segunda";
		case 5:
			yield "Segunda";
		case 6:
			yield "Segunda";
		case 7:
			yield "Segunda";
		default:
			yield "Dia inválido";
		};
		
	}
}
