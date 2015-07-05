package application;

public class Recuperacao {
	
	//Atributos
	private String 	username,
					password;
	
	private int codJogador,
				codContaRec;
	
	private boolean carimbo = false;
	
	//Contrutores
	public Recuperacao() {
		
	}
	
	public Recuperacao(int codContaRec) {
		this.codContaRec = codContaRec;
	}
	
	public Recuperacao(int codContaRec, int codJogador) {
		this.codContaRec = codContaRec;
		this.codJogador = codJogador;
	}
	
	public Recuperacao(int codContaRec, int codJogador, String username) {
		this.codContaRec = codContaRec;
		this.codJogador = codJogador;
		this.username = username;
	}
	
	public Recuperacao(int codContaRec, int codJogador, String username, String password) {
		this.codContaRec = codContaRec;
		this.codJogador = codJogador;
		this.username = username;
		this.password = password;
	}
	
	//Métodos	
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

	public int getCodContaRec() {
		return codContaRec;
	}

	public void setCodContaRec(int codContaRec) {
		this.codContaRec = codContaRec;
	}
	
	public boolean isCarimbo() {
		return carimbo;
	}

	public void setCarimbo(boolean carimbo) {
		this.carimbo = carimbo;
	}

}
