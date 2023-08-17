import java.util.ArrayList;

public class Acervo {

	private ArrayList<Alugavel> cadastroAlugaveis = new ArrayList<Alugavel>();

	public boolean adicionaAlugavel(Alugavel alugavel) {
		for(int i = 0; i< cadastroAlugaveis.size(); i++) {
			Alugavel alugavelAdicionado = cadastroAlugaveis.get(i);
			if(alugavelAdicionado.getCodigo() == alugavel.getCodigo())
				return false;
		}
		return cadastroAlugaveis.add(alugavel);
	}

	public Alugavel pesquisaAlugavel(int codigo) {
		for(int i = 0; i< cadastroAlugaveis.size(); i++) {
			Alugavel alugavel = cadastroAlugaveis.get(i);
			if(alugavel.getCodigo() == codigo)
				return alugavel;
		}
		return null;
	}

	public ArrayList<Alugavel> pesquisaAlugavel(String nome) {
		ArrayList<Alugavel> alugavelsNomes = new ArrayList<Alugavel>();
		for(int i = 0; i< cadastroAlugaveis.size(); i++) {
			Alugavel alugavel = cadastroAlugaveis.get(i);
			if(alugavel.getNome().equals(nome))
				alugavelsNomes.add(alugavel);
		}
		if(alugavelsNomes.isEmpty()) {
			return null;
		}
		else{
			return alugavelsNomes;
		}
	}

	public ArrayList<Alugavel> pesquisaAlugaveldeAluguel(Aluguel aluguel){
		ArrayList<Alugavel> todosAlugaveis = new ArrayList<Alugavel>();
		for(int i = 0; i<cadastroAlugaveis.size();i++){
			Alugavel a1 = cadastroAlugaveis.get(i);
			if (a1.getAluguel().equals(aluguel)){
				todosAlugaveis.add(a1);
			}
		}
		return todosAlugaveis;
	}
	public Acervo() {}

	public Acervo(ArrayList<Alugavel> cadastroAlugaveis) {
		this.cadastroAlugaveis = cadastroAlugaveis;
	}

	public ArrayList<Alugavel> getCadastroAlugaveis(){
		return cadastroAlugaveis;
	}
}
