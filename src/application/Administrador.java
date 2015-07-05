package application;

public class Administrador extends Pessoa {
	
	//Atributos
	private String 	username,
					password;
	
	private int	codAdmin,
				numVitorias = 0,
				numDerrotas = 0,
				numEmpates = 0;
	
	private boolean carimbo = false;

	//Construtores
	public Administrador() {
		
	}
	
	public Administrador(int codAdmin, String password) {
		this.codAdmin = codAdmin;
		this.password = password;
	}
	
	public Administrador(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public Administrador(int codAdmin, String username, String password) {
		this.codAdmin = codAdmin;
		this.username = username;
		this.password = password;
	}
	
	public Administrador(int codAdmin, String username, String password, int numVitorias, int numDerrotas, int numEmpates) {
		this.codAdmin = codAdmin;
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

	public int getCodAdmin() {
		return codAdmin;
	}

	public void setCodAdmin(int codAdmin) {
		this.codAdmin = codAdmin;
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
