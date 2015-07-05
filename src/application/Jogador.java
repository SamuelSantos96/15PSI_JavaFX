package application;

public class Jogador extends Pessoa {
	
	//Atributos	
	private	String 	username,
					password;

	private	int codJogador,
				numVitorias = 0,
				numDerrotas = 0,
				numEmpates = 0;
	
	private boolean carimbo = false;
	
	//Construtores
	public Jogador() {
		
	}
	
	public Jogador(int codJogador, String password) {
		this.codJogador = codJogador;
		this.password = password;
	}
	
	public Jogador(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public Jogador(int codJogador, String username, String password) {
		this.codJogador = codJogador;
		this.username = username;
		this.password = password;
	}
	
	public Jogador(int codJogador, String username, String password, int numVitorias, int numDerrotas, int numEmpates) {
		this.codJogador = codJogador;
		this.username = username;
		this.password = password;
		this.numVitorias = numVitorias;
		this.numDerrotas = numDerrotas;
		this.numEmpates = numEmpates;
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
	
	public int getCodJogador() {
		return codJogador;
	}

	public void setCodJogador(int codJogador) {
		this.codJogador = codJogador;
	}

	public int getNumVitorias() {
		return numVitorias;
	}

	public void setNumVitorias(int numVitorias) {
		this.numVitorias = numVitorias;
	}	

	public int getNumDerrotas() {
		return numDerrotas;
	}

	public void setNumDerrotas(int numDerrotas) {
		this.numDerrotas = numDerrotas;
	}
	
	public int getNumEmpates() {
		return numEmpates;
	}

	public void setNumEmpates(int numEmpates) {
		this.numEmpates = numEmpates;
	}
	
	public boolean isCarimbo() {
		return carimbo;
	}

	public void setCarimbo(boolean carimbo) {
		this.carimbo = carimbo;
	}
	
}
