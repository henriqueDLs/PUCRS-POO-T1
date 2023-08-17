import java.util.Scanner;
import java.util.ArrayList;

public class ACMERental {

	private Acervo acervo;

	private Locacoes locacoes;

	private Scanner entrada;
	public void preCadastra() {
		Alugavel alugavel;
		Aluguel aluguel;
		alugavel = new Alugavel(3687, "Camiseta Nike",15.00,42,"Preta");
		acervo.adicionaAlugavel(alugavel);
		aluguel = new Aluguel("15/06/2020",12,"320.730.150-15","Maria Lisa",0,alugavel);
		aluguel.setValorFinal(aluguel.calculaValorFinal());
		locacoes.adicionaAluguel(aluguel);
		aluguel = new Aluguel("31/07/2020",4,"442.623.984-50","Pedro Augusto",0,alugavel);
		aluguel.setValorFinal(aluguel.calculaValorFinal());
		locacoes.adicionaAluguel(aluguel);
		aluguel = new Aluguel("22/09/2020",23,"128.224.618-83","Antonio Flores",0,alugavel);
		aluguel.setValorFinal(aluguel.calculaValorFinal());
		locacoes.adicionaAluguel(aluguel);
		alugavel = new Alugavel(4776, "Calca Puma",32.00,36,"Cinza claro");
		acervo.adicionaAlugavel(alugavel);
		aluguel = new Aluguel("22/02/2021",14,"212.342.863-76","Ana Maria",0,alugavel);
		aluguel.setValorFinal(aluguel.calculaValorFinal());
		locacoes.adicionaAluguel(aluguel);
		alugavel = new Alugavel(2198, "Camiseta social Exclusive",60.00,44,"Branco");
		acervo.adicionaAlugavel(alugavel);
		aluguel = new Aluguel("14/07/2020",2,"512.314.220-97","Joao Vitor",0,alugavel);
		aluguel.setValorFinal(aluguel.calculaValorFinal());
		locacoes.adicionaAluguel(aluguel);
		aluguel = new Aluguel("29/12/2020",5,"442.623.984-50","Pedro Augusto",0,alugavel);
		aluguel.setValorFinal(aluguel.calculaValorFinal());
		locacoes.adicionaAluguel(aluguel);
	}

	public ACMERental(){
		entrada = new Scanner(System.in);
		acervo = new Acervo();
		locacoes = new Locacoes();
	}

	public void executa() {
		int opcao;
		do {
			menu();
			opcao = entrada.nextInt();
			entrada.nextLine();
			switch(opcao) {
				case 1:
					mostrarDados();
					break;
				case 2:
					pesquisarItemAluCodigo();
					break;
				case 3:
					pesquisarItemAluNome();
					break;
				case 4:
					pesquisarAlugueisCliente();
					break;
				case 5:
					break;
				default:
					System.out.println("Opcao invalida.");
					break;
			}
		}
		while(opcao != 5);
	}

	private void menu(){
		System.out.println("=======================");
		System.out.println("Opcoes:");
		System.out.println("[1] Mostrar todos os dados cadastrados");
		System.out.println("[2] Pesquisar item alugavel pelo codigo");
		System.out.println("[3] Pesquisar item alugavel pelo nome");
		System.out.println("[4] Pesquisar alugueis de um cliente");
		System.out.println("[5] Sair do sistema");
	}

	private void mostrarDados(){
		ArrayList<Alugavel> todosAlugaveis = acervo.getCadastroAlugaveis();
		ArrayList<Aluguel> todosAlugueis = locacoes.getCadastroAlugueis();
		if(todosAlugaveis.isEmpty()){System.out.println("Nenhum item alugavel encontrado no sistema!");}
		else{
			System.out.println("Dados dos alugaveis cadastrados no sistema:");
			System.out.println("=======================================");
			for(int i=0;i<todosAlugaveis.size();i++){
				Alugavel alugavel = todosAlugaveis.get(i);
				System.out.println("Codigo: " + alugavel.getCodigo());
				System.out.println("Nome: " + alugavel.getNome());
				System.out.println("Preco diario  : " + alugavel.getPrecoDiario());
				System.out.println("Cor: " + alugavel.getCorRoupa());
				System.out.println("Tamanho: " + alugavel.getTamanhoRoupa());
				System.out.println("=======================================");
			}
			System.out.println("Dados de alugueis cadastrados no sistema:");
			System.out.println("=======================================");
			for(int j = 0;j<todosAlugueis.size();j++) {
				Aluguel a1 = todosAlugueis.get(j);
				System.out.println("Item alugado: " + a1.getAlugavel().getNome());
				System.out.println("Nome: " + a1.getNome());
				System.out.println("Cpf: " + a1.getCpf());
				System.out.println("Data de locacao: " + a1.getData());
				System.out.println("Periodo de locacao: " + a1.getPeriodo());
				System.out.println("Valor total da locacao: " + a1.getValorFinal());
				System.out.println("=======================================");
			}
		}
	}

	private void pesquisarItemAluCodigo(){
		System.out.println("Digite o codigo do produto:");
		int codigo = entrada.nextInt();
		Alugavel alugavel = acervo.pesquisaAlugavel(codigo);
		ArrayList<Aluguel> aluguel = locacoes.pesquisaAluguelDeAlugavel(alugavel);
		if(alugavel == null){System.out.println("Nenhum item alugavel encontrado com este codigo!");}
		else{
			System.out.println("Dados do respectivo item:");
			System.out.println("Codigo: " + alugavel.getCodigo());
			System.out.println("Nome: " + alugavel.getNome());
			System.out.println("Preco diario  : " + alugavel.getPrecoDiario());
			System.out.println("Cor: " + alugavel.getCorRoupa());
			System.out.println("Tamanho: " + alugavel.getTamanhoRoupa());
			System.out.println("=======================================");
			System.out.println("Dados de alugueis passados ou vigentes:");
			System.out.println("=======================================");
			for(int i = 0;i<aluguel.size();i++) {
				Aluguel a1 = aluguel.get(i);
				System.out.println("Nome: " + a1.getNome());
				System.out.println("Cpf: " + a1.getCpf());
				System.out.println("Data de locacao: " + a1.getData());
				System.out.println("Periodo de locacao: " + a1.getPeriodo());
				System.out.println("Valor total da locacao: " + a1.getValorFinal());
				System.out.println();
			}
		}
	}

	private void pesquisarItemAluNome(){
		System.out.println("Digite o nome do produto:");
		String nome = entrada.nextLine();
		ArrayList<Alugavel> alugavel = acervo.pesquisaAlugavel(nome);
		if(alugavel == null){System.out.println("Nenhum item alugavel encontrado com este nome!");}
		else{
			ArrayList<Aluguel> aluguel = locacoes.pesquisaAluguelDeAlugavel(alugavel.get(0));
			Alugavel a1 = alugavel.get(0);
			System.out.println("Dados do respectivo item:");
			System.out.println("Codigo: " + a1.getCodigo());
			System.out.println("Nome: " + a1.getNome());
			System.out.println("Preco diario  : " + a1.getPrecoDiario());
			System.out.println("Cor: " + a1.getCorRoupa());
			System.out.println("Tamanho: " + a1.getTamanhoRoupa());
			System.out.println("=======================================");
			System.out.println("Dados de alugueis passados ou vigentes:");
			System.out.println("=======================================");
			for(int i = 0;i<aluguel.size();i++) {
				Aluguel a2 = aluguel.get(i);
				System.out.println("Nome: " + a2.getNome());
				System.out.println("Cpf: " + a2.getCpf());
				System.out.println("Data de locacao: " + a2.getData());
				System.out.println("Periodo de locacao: " + a2.getPeriodo());
				System.out.println("Valor total da locacao: " + a2.getValorFinal());
				System.out.println();
			}
		}
	}

	private void pesquisarAlugueisCliente(){
		System.out.println("Digite o cpf do cliente utilizando pontuacao:");
		String cpf = entrada.nextLine();
		if(cpf.length() != 14){System.out.println("Formato de cpf invalido!");}
		ArrayList<Aluguel> a1 = locacoes.pesquisaAluguel(cpf);
		if(a1==null){System.out.println("Nenhum aluguel encontrado com este cpf!");}
		else{
			System.out.println("=======================================");
			System.out.println("Dados de alugueis passados ou vigentes: ");
			System.out.println("=======================================");
			for(int i=0;i<a1.size();i++){
				Aluguel a2 = a1.get(i);
				System.out.println("Nome: " + a2.getNome());
				System.out.println("Cpf: " + a2.getCpf());
				System.out.println("Data de locacao: " + a2.getData());
				System.out.println("Periodo de locacao: " + a2.getPeriodo());
				System.out.println("Valor total da locacao: " + a2.getValorFinal());
				System.out.println();
			}
			System.out.println("=======================================");
			System.out.println("Dados dos produtos ja alugados: ");
			System.out.println("=======================================");
			for(int j=0;j<a1.size();j++){
				Alugavel a3 = a1.get(j).getAlugavel();
				System.out.println("Codigo: " + a3.getCodigo());
				System.out.println("Nome: " + a3.getNome());
				System.out.println("Preco diario  : " + a3.getPrecoDiario());
				System.out.println("Cor: " + a3.getCorRoupa());
				System.out.println("Tamanho: " + a3.getTamanhoRoupa());
				System.out.println();
			}
		}

	}

}
