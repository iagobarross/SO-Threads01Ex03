/*3) Criar em java um projeto com uma Thread chamada ThreadVetor, que receba um valor
numérico e vetor como parâmetros. Caso o valor numérico seja par, a thread deve percorrer o
vetor utilizando uma estrutura for (int i = 0 ; i < vet.length; i++) e contar o tempo para
percorrer o vetor. Caso o valor numérico seja ímpar, a thread deve percorrer
o vetor utilizando uma estrutura foreach e contar o tempo para percorrer o vetor. No final,
ambas as possibilidades devem apresentar o tempo em segundos. A operação
main deve gerar um vetor de 1000 posições com valores aleatórios de 1 a
100. Deve iniciar 2 ThreadVetor e para uma passar o número 1 e o vetor e para a outra, passar o
número 2 e o mesmo vetor.3) Criar em java um projeto com uma Thread chamada ThreadVetor, que receba um valor
numérico e vetor como parâmetros. Caso o valor numérico seja par, a thread deve percorrer o
vetor utilizando uma estrutura for (int i = 0 ; i < vet.length; i++) e contar o tempo para
percorrer o vetor. Caso o valor numérico seja ímpar, a thread deve percorrer
o vetor utilizando uma estrutura foreach e contar o tempo para percorrer o vetor. No final,
ambas as possibilidades devem apresentar o tempo em segundos. A operação
main deve gerar um vetor de 1000 posições com valores aleatórios de 1 a
100. Deve iniciar 2 ThreadVetor e para uma passar o número 1 e o vetor e para a outra, passar o
número 2 e o mesmo vetor.
*/
package controller;

public class ThreadVetor extends Thread{
	
	private int [] vetor;
	private int valor;
	
	public ThreadVetor(int[] vetor, int valor) {
		this.vetor = vetor;
		this.valor = valor;
	}

	@Override
	public void run() {
		if(valor % 2 == 0) {
			double tempoInicial = System.nanoTime();
			for(int i = 0; i < vetor.length; i++) {

			}
			double tempoFinal = System.nanoTime();
			double tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, 9);
			System.out.println("Tempo total do valor par: " + tempoTotal + "s.");
		} else {
			double tempoInicial = System.nanoTime();
			for(int i: vetor) {

			}
			double tempoFinal = System.nanoTime();
			double tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, 9);
			System.out.println("Tempo total do valor ímpar: " + tempoTotal + "s.");
		}
	}
	

}
