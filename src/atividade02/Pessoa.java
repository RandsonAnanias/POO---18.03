package atividade02;

public class Pessoa {
	String Nome;
	int idade;
	String Sexo;

	Pessoa(){}
	public void setNome (String Nome) {
		this.Nome = Nome;
	}
	public void setidade (int idade) {
		this.idade = idade;
	}
	public void setSexo (String Sexo) {
		this.Sexo = Sexo;
	}
	public String getNome() {
		return this.Nome;
	}
	public int getidade() {
		return this.idade;
	}
	public String getSexo() {
		return this.Sexo;
	}
	
}
