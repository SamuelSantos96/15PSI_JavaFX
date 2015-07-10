package application;

public class Jogo {
	
	//Atributos
	private String 	usernameJogador1,
					usernameJogador2,
					passwordJogador1,
					passwordJogador2,
					resultado;
	
	private int codJogo,
				codJogador1,
				codJogador2,
				nVitoriasJogador1,
				nVitoriasJogador2,
				nDerrotasJogador1,
				nDerrotasJogador2,
				nEmpatesJogador1,
				nEmpatesJogador2;
	
	private boolean carimbo = false;

	//Construtores
	public Jogo() {
		
	}
	
	public Jogo(int codJogo) {
		this.codJogo = codJogo;
	}
	
	public Jogo(int codJogo, int codJogador1, int codJogador2) {
		this.codJogo = codJogo;
		this.codJogador1 = codJogador1;
		this.codJogador2 = codJogador2;
	}
	
	public Jogo(int codJogo, int codJogador1, int codJogador2, String usernameJogador1, String usernameJogador2) {
		this.codJogo = codJogo;
		this.codJogador1 = codJogador1;
		this.codJogador2 = codJogador2;
		this.usernameJogador1 = usernameJogador1;
		this.usernameJogador2 = usernameJogador2;
	}
	
	public Jogo(int codJogo, int codJogador1, int codJogador2, String usernameJogador1, String usernameJogador2, String resultado) {
		this.codJogo = codJogo;
		this.codJogador1 = codJogador1;
		this.codJogador2 = codJogador2;
		this.usernameJogador1 = usernameJogador1;
		this.usernameJogador2 = usernameJogador2;
		this.resultado = resultado;
	}
	
	public Jogo(int codJogo, int codJogador1, int codJogador2, String usernameJogador1, String usernameJogador2, String passwordJogador1, String passwordJogador2, String resultado) {
		this.codJogo = codJogo;
		this.codJogador1 = codJogador1;
		this.codJogador2 = codJogador2;
		this.usernameJogador1 = usernameJogador1;
		this.usernameJogador2 = usernameJogador2;
		this.passwordJogador1 = passwordJogador1;
		this.passwordJogador2 = passwordJogador2;
		this.resultado = resultado;
	}
	
	//Getters e Setters
	public String getUsernameJogador1() {
		return usernameJogador1;
	}

	public void setUsernameJogador1(String usernameJogador1) {
		this.usernameJogador1 = usernameJogador1;
	}

	public String getUsernameJogador2() {
		return usernameJogador2;
	}

	public void setUsernameJogador2(String usernameJogador2) {
		this.usernameJogador2 = usernameJogador2;
	}

	public String getPasswordJogador1() {
		return passwordJogador1;
	}

	public void setPasswordJogador1(String passwordJogador1) {
		this.passwordJogador1 = passwordJogador1;
	}

	public String getPasswordJogador2() {
		return passwordJogador2;
	}

	public void setPasswordJogador2(String passwordJogador2) {
		this.passwordJogador2 = passwordJogador2;
	}
	
	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public int getCodJogo() {
		return codJogo;
	}

	public void setCodJogo(int codJogo) {
		this.codJogo = codJogo;
	}

	public int getCodJogador1() {
		return codJogador1;
	}

	public void setCodJogador1(int codJogador1) {
		this.codJogador1 = codJogador1;
	}

	public int getCodJogador2() {
		return codJogador2;
	}

	public void setCodJogador2(int codJogador2) {
		this.codJogador2 = codJogador2;
	}

	public int getnVitoriasJogador1() {
		return nVitoriasJogador1;
	}

	public void setnVitoriasJogador1(int nVitoriasJogador1) {
		this.nVitoriasJogador1 = nVitoriasJogador1;
	}

	public int getnVitoriasJogador2() {
		return nVitoriasJogador2;
	}

	public void setnVitoriasJogador2(int nVitoriasJogador2) {
		this.nVitoriasJogador2 = nVitoriasJogador2;
	}

	public int getnDerrotasJogador1() {
		return nDerrotasJogador1;
	}

	public void setnDerrotasJogador1(int nDerrotasJogador1) {
		this.nDerrotasJogador1 = nDerrotasJogador1;
	}

	public int getnDerrotasJogador2() {
		return nDerrotasJogador2;
	}

	public void setnDerrotasJogador2(int nDerrotasJogador2) {
		this.nDerrotasJogador2 = nDerrotasJogador2;
	}

	public int getnEmpatesJogador1() {
		return nEmpatesJogador1;
	}

	public void setnEmpatesJogador1(int nEmpatesJogador1) {
		this.nEmpatesJogador1 = nEmpatesJogador1;
	}

	public int getnEmpatesJogador2() {
		return nEmpatesJogador2;
	}

	public void setnEmpatesJogador2(int nEmpatesJogador2) {
		this.nEmpatesJogador2 = nEmpatesJogador2;
	}
	
	public boolean isCarimbo() {
		return carimbo;
	}

	public void setCarimbo(boolean carimbo) {
		this.carimbo = carimbo;
	}
	
}
