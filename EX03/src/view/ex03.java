package view;

public class ex03 {

public class Funcionario {
	public String cargo;
	public String nome;
	public double salario;
	
	
	public Funcionario(String cargo, String nome, double salario) {
		this.cargo = cargo;
		this.nome = nome;
		this.salario = salario;
	};

	public String getNome(){
		return nome;
	};
	public String getCargo(){
		return cargo;
	};
	public double getSalario(){
		return salario;
	};
	public void setNome(String nome){
		this.nome = nome;
	};
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	};
	
	public void setSalario(double salario) {
		if(salario> 1412) {
			this.salario = salario;
		}
	};
	public double getSalarioLiquido(double descontos, double beneficios) {
		return (this.salario + descontos + beneficios);
	};
	
	
}}