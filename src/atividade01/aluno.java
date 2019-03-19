package atividade01;

public class aluno {
	String aluno;
	private double Nota1;
	private double Nota2;
	private double Nota3;
	private double Nota4;
	private double Media;
	
	

	void Aluno(){}
	public void setaluno (String aluno) {
		this.aluno = aluno;
	}
	public void setNota1(double Nota1) {
		this.Nota1 = Nota1;
	}
	public void setNota2(double Nota2) {
		this.Nota2 = Nota2;
	}
	public void setNota3(double Nota3) {
		this.Nota3 = Nota3;
	}
	public void setNota4(double Nota4) {
		this.Nota4 = Nota4;
	}
	public void setMedia(double Nota1, double Nota2, double Nota3, double Nota4) {
		this.Media = ((Nota1+Nota2+Nota3+Nota4)/4);
	}
	public String getaluno(String aluno) {
		return this.aluno = aluno;
	}
	public double getNota1() {
		return this.Nota1;
	}
	public double getNota2() {
		return this.Nota2;
	}
	public double getNota3() {
		return this.Nota3;
	}
	public double getNota4() {
		return this.Nota4;
	}
	public double getMedia() {
		return this.Media;
	}
}
