package estruturaDeDados;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila {

	public static void main(String[] args) {

//		//Escreva um programa Java contendo uma Collection Queue (Fila) de Objetos da Classe String, para organizar a ordem de chegada dos Clientes de um Banco. 
		// O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
//		1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
//		2: Listar todos os Clientes na fila
//		3: Chamar (retirar) uma pessoa da fila 
//		0: O programa deve ser finalizado. 
//		Caso a fila esteja vazia, o programa deverá informar que a fila está vazia ao tentar retirar (chamar) um cliente da fila..

		// variaveis

		int numero = -1; // para não ser igual a zero.
		Scanner ler = new Scanner(System.in);
		String nome;
		Queue<String> listaClientes = new LinkedList<>(); // nome da minha lista - atributo

		System.out.println("*****************************************");
		System.out.println();
		System.out.println("1 - Adicionar cliente na fila");
		System.out.println("2 - Listar todos os clientes ");
		System.out.println("3 - Retirar cliente da fila");
		System.out.println("0 - Sair ");
		System.out.println();
		System.out.println("*****************************************");

		while (numero != 0) { // aqui já declarei que se for 0 é p/ sair do programa

			System.out.println();
			System.out.println("Entre com a opção desejada: ");
			numero = ler.nextInt();

			switch (numero) {

			case 1: {
				System.out.println("Digite o nome do cliente: ");
				ler.nextLine();
				nome = ler.nextLine(); // leu o nome
				listaClientes.add(nome);// adiciona o nome do cliente
				System.out.println("Cliente adicionado!");
				break;
			}

			case 2: {
				System.out.println("Lista de clientes na fila: ");
				Iterator<String> iteratorClientes = listaClientes.iterator();

				while (iteratorClientes.hasNext()) {
					System.out.println(iteratorClientes.next());
				}
				break;
			}

			case 3: {
				if (listaClientes.isEmpty()) { // verificar se a lista está vazia ou não
					System.out.println("A fila está vazia!");

				} else {
					listaClientes.remove(); // caso tenha, pode remover
					System.out.println("O cliente foi chamado!");
				}
				break;
			}
			}
		}

	}

}
