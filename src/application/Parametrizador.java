package application;

public class Parametrizador extends Pessoa {
	
	//Atributos
	private String 	username,
					password;
	
	private int codParametrizador;
	
	private boolean carimbo = false;
	
	//Contrutores
	public Parametrizador()	{
		
	}
	
	public Parametrizador(int codParametrizador, String password) {
		this.codParametrizador = codParametrizador;
		this.password = password;
	}
	
	public Parametrizador(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public Parametrizador(int codParametrizador, String username, String password) {
		this.codParametrizador = codParametrizador;
		this.username = username;
		this.password = password;
	}
	
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

	public int getCodParametrizador() {
		return codParametrizador;
	}

	public void setCodParametrizador(int codParametrizador) {
		this.codParametrizador = codParametrizador;
	}
	
	public boolean isCarimbo() {
		return carimbo;
	}

	public void setCarimbo(boolean carimbo) {
		this.carimbo = carimbo;
	}
	
}
