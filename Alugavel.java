import java.util.ArrayList;
public class Alugavel {

	private int codigo;

	private String nome;

	private double precoDiario;

	private int tamanhoRoupa;

	private String corRoupa;

	private ArrayList<Aluguel> aluguels;

	public boolean adicionaAluguel(Aluguel aluguel) {
		return aluguels.add(aluguel);
	}

	public double getPrecoDiario() {return precoDiario;}

	public double getTamanhoRoupa() {return tamanhoRoupa;}

	public int getCodigo(){return codigo;}

	public String getNome(){return nome;}

	public String getCorRoupa() {return corRoupa;}

	public ArrayList<Aluguel> getAluguel() {return aluguels;}

	public Alugavel(){
		aluguels = new ArrayList<Aluguel>();
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPrecoDiario(double precoDiario) {
		this.precoDiario = precoDiario;
	}

	public void setTamanhoRoupa(int tamanhoRoupa) {
		this.tamanhoRoupa = tamanhoRoupa;
	}

	public void setCorRoupa(String corRoupa) {
		this.corRoupa = corRoupa;
	}

	public void setAluguel(ArrayList<Aluguel> aluguel) {
		aluguels = aluguel;
	}

	public Alugavel(int codigo, String nome, double precoDiario, int tamanhoRoupa, String corRoupa) {
		aluguels = new ArrayList<Aluguel>();
		this.codigo = codigo;
		this.nome = nome;
		this.precoDiario = precoDiario;
		this.tamanhoRoupa = tamanhoRoupa;
		this.corRoupa = corRoupa;
	}

}
