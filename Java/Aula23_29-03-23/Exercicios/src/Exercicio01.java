import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
		
		Set<Integer> uniao = new TreeSet<>(a);
		uniao.addAll(b);
		System.out.println("União: " + uniao);
		
		Set<Integer> intersecao = new TreeSet<>(a);
		intersecao.retainAll(b);
		System.out.println("Interseção: " + intersecao);
		
		Set<Integer> diferencaAmenosB = new TreeSet<>(a);
		diferencaAmenosB.removeAll(b);
		System.out.println("Diferença (a-b): " + diferencaAmenosB);

		Set<Integer> diferencaBmenosA = new TreeSet<>(b);
		diferencaBmenosA.removeAll(a);
		System.out.println("Diferença (b-a): " + diferencaBmenosA);
	}
}
