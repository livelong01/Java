
public class Main {

	public static void main(String[] args) {
		
		String original = "abcd FGHIJ ABC abc  DEFG    ";

		String s01 = original.toLowerCase(); // transforma a frase em letras minusculas
		String s02 = original.toUpperCase(); // transforma em letras maiusculas
		String s03	= original.trim();	// tira os espaços antes e dps
		String s04 = original.substring(2); // faz outra string a partir do carct 2.
		String s05 = original.substring(2,9); // faz corte em frase em dois pontos e seleciona entre
		String s06 = original.replace("a", "x"); //substitiu um caractere por outro na frase.
		String s07 = original.replace("abc", "xy"); // substi mais de uma letra por outra de tamanho diferente
		int i = original.indexOf("bc"); // encontra posicao da primeira aparicao do bc
		int j = original.lastIndexOf("bc"); // encontra ultima aparicao do bc
	
		
		
		System.out.println("Original: -" + original+"-");
		System.out.println("toLowerCase: -"+s01+"-");
		System.out.println("toUpperCase: -"+s02+"-");
		System.out.println("trim: -"+s03+"-");
		System.out.println("substring simples: -"+s04+"-");
		System.out.println("substring com dois -"+s05+"-");
		System.out.println("replace a por x: -"+s06+"-");
		System.out.println("replace a por de abc-xy: -"+s07+"-");
		System.out.println("indexOf 'bc': -"+i+"-");
		System.out.println("LastIndexOf 'bc': -"+j+"-");
		
	}

}
