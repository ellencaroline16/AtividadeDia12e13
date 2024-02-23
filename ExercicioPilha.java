package estruturaDeDados;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = -1; // para não ser igual a zero.
		Scanner ler = new Scanner(System.in);
		String livro;
		Stack<String> pilhaLivros = new Stack(); // nome da minha pilha - atributo

		System.out.println("*****************************************");
		System.out.println();
		System.out.println("1 - Adicionar livro na pilha");
		System.out.println("2 - Listar todos os livros ");
		System.out.println("3 - Retirar livro da pilha");
		System.out.println("0 - Sair ");
		System.out.println();
		System.out.println("*****************************************");

		while (numero != 0) { // aqui já declarei que se for 0 é p/ sair do programa

			System.out.println();
			System.out.println("Entre com a opção desejada: ");
			numero = ler.nextInt();

			switch (numero) {

			case 1: {
				System.out.println("Digite o nome do livro: ");
				ler.nextLine();
				livro = ler.nextLine(); // leu o nome
				pilhaLivros.push(livro);// adiciona o nome do livro
				System.out.println("Livro adicionado!");
				break;
			}

			case 2: {
				System.out.println("Lista de livros na pilha: ");
				Iterator<String> iteratorLivros = pilhaLivros.iterator();

				while (iteratorLivros.hasNext()) {
					System.out.println(iteratorLivros.next());
				}
				break;
			}

			case 3: {
				if (pilhaLivros.isEmpty()) { // verificar se a pilha está vazia ou não
					System.out.println("A pilha está vazia!");

				} else {
					pilhaLivros.pop(); // caso tenha, pode remover
					System.out.println("Um livro foi retirado da pilha!");
				}
				break;
			}
			}
		}

	}
}
