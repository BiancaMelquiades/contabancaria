package conta_controller;

import java.util.ArrayList;

import conta_model.Conta;
import conta_repository.ContaRepository;

public class ContaController implements ContaRepository{
	
	public static final String cadastrar = null;
	private ArrayList<Conta> listaContas = new ArrayList<Conta>();
	int numero = 0;

	@Override
	public void procurarPorNumero(int numero) {
		// TODO Auto-generated method stub
	}
	

	public void listarTodas() {
		for (var conta : listaContas) {
			conta.visualizar();
		}
	
	}

	@Override
	public void cadastrar(Conta conta) {
		listaContas.add(conta);
		System.out.println("\nA Conta número: "+conta.getNumero() + " foi criada com sucesso!");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Conta conta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(int numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sacar(int numero, float valor) {
		
	}

	@Override
	public void depositar(int numero, float valor) {
		
	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {		
		
	}


	public int gerarNumero() {
		return ++ numero;
	}
}
