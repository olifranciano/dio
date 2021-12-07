public class AlgoritmoOperacoes{
	public static void main(String[] args){
		
		int a,b,c,somaAB,multiplicaBC,subtraiCA,somadivACB;
		a = 9;
		b = 17;
		c = 6;

		somaAB = a + b;
		multiplicaBC = b * c;
		subtraiCA = c - a;
		somadivACB = a + c / b;

		System.out.println("Soma= " + somaAB + "\n" + "Subtracao= " + subtraiCA + "\n" + "Multiplicacao= " + multiplicaBC + "\n" + "Soma e divisao= " + somadivACB + "\n");
	}
}
