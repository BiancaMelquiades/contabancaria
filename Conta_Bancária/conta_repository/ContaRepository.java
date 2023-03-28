package conta_repository;

import conta_model.Conta;

public interface ContaRepository {

		/* CRUD da Conta
		* CRUD (Create, Read, Update e Delete)
		*/
		public void procurarPorNumero(int numero);
		public void listarTodas();
		public void cadastrar(Conta conta);
		public void atualizar(Conta conta);
		public void deletar(int numero);
		
		/* Métodos Bancários
		 * Operações Bancárias (Saque, Deposito e Transferencia)
		 */
		public void sacar(int numero, float valor);
		public void depositar(int numero, float valor);
		public void transferir(int numeroOrigem, int numeroDestino, float valor);
	
}
