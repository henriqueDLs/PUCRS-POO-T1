import java.util.ArrayList;

public class Locacoes {

	private ArrayList<Aluguel> cadastroAlugueis = new ArrayList<Aluguel>();

	public void adicionaAluguel(Aluguel aluguel) {
		cadastroAlugueis.add(aluguel);
	}

	public ArrayList<Aluguel> pesquisaAluguel(String cpf) {
		ArrayList<Aluguel> listaCpfs = new ArrayList<Aluguel>();
		for(int i = 0; i<cadastroAlugueis.size(); i++) {
			Aluguel aluguel = cadastroAlugueis.get(i);
			if(aluguel.getCpf().equals(cpf))
				listaCpfs.add(aluguel);
		}
		if(listaCpfs.isEmpty()) {
			return null;
		}
		else{return listaCpfs;}
	}

	public ArrayList<Aluguel> pesquisaAluguelDeAlugavel(Alugavel alugavel){
		ArrayList<Aluguel> todosAlugueis = new ArrayList<Aluguel>();
		for(int i = 0; i<cadastroAlugueis.size();i++){
			Aluguel a1 = cadastroAlugueis.get(i);
			if (a1.getAlugavel() == alugavel){
				todosAlugueis.add(a1);
			}
		}
		return todosAlugueis;
	}

	public ArrayList<Aluguel> getCadastroAlugueis() {
		return cadastroAlugueis;
	}
}
