public class Aluguel {

	private String data;

	private int periodo;

	private String cpf;

	private String nome;

	private double valorFinal;

	private Alugavel alugavel;

	public double calculaValorFinal() {
		double desconto;
		if(periodo > 7){
			desconto = (alugavel.getPrecoDiario()*periodo)*0.10;
			valorFinal = (alugavel.getPrecoDiario()*periodo)-desconto;
		}
		else{
			valorFinal = alugavel.getPrecoDiario()*periodo;
		}
		return valorFinal;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setValorFinal(double valorFinal) {
		this.valorFinal = valorFinal;
	}

	public void setAlugavel(Alugavel alugavel) {
		this.alugavel = alugavel;
	}

	public Aluguel(String data, int periodo, String cpf, String nome, double valorFinal, Alugavel alugavel) {
		this.data = data;
		this.periodo = periodo;
		this.cpf = cpf;
		this.nome = nome;
		this.valorFinal = valorFinal;
		this.alugavel = alugavel;
	}

	public String getData() {
		return data;
	}

	public int getPeriodo() {
		return periodo;
	}

	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public double getValorFinal() {
		return valorFinal;
	}

	public Alugavel getAlugavel() {
		return alugavel;
	}

}
