package application;

public abstract class Conta {
	
	//Atributos
	private String 	username,
					password;
	
	private int	codUtilizador;	
	
	//Getters e Setters
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getCodUtilizador() {
		return codUtilizador;
	}

	public void setCodUtilizador(int codUtilizador) {
		this.codUtilizador = codUtilizador;
	}	
	
	//Métodos
	public void criarContaJogador() {
		
	}
	
	public void alterarContaJogador() {
		
	}

	public void anularContaJogador() {
		
	}
	
	public void criarContaParametrizador() {
		
	}
	
	public void alterarContaParametrizador() {
		
	}

	public void anularContaParametrizador() {
		
	}

}
