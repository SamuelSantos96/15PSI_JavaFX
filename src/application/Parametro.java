package application;

public class Parametro {
	
	//Atributos
	private String 	variavel,
					tipoVar,
					limiteMin,
					limiteMax;
	
	private int codParametro,
				codVar;
	
	private boolean carimbo = false;

	//Contrutores
	public Parametro() {
		
	}
	
	public Parametro(int codParametro, int codVar) {
		this.codParametro = codParametro;
		this.codVar = codVar;
	}
	
	public Parametro(int codParametro, int codVar, String variavel) {
		this.codParametro = codParametro;
		this.codVar = codVar;
		this.variavel = variavel;
	}
	
	public Parametro(int codParametro, int codVar, String variavel, String tipoVar) {
		this.codParametro = codParametro;
		this.codVar = codVar;
		this.variavel = variavel;
		this.tipoVar = tipoVar;
	}
	
	public Parametro(int codParametro, int codVar, String variavel, String tipoVar, String limiteMax, String limiteMin) {
		this.codParametro = codParametro;
		this.codVar = codVar;
		this.variavel = variavel;
		this.tipoVar = tipoVar;
		this.limiteMax = limiteMax;
		this.limiteMin = limiteMin;
	}


	//Getters e Setters
	public String getVariavel() {
		return variavel;
	}

	public void setVariavel(String variavel) {
		this.variavel = variavel;
	}

	public String getTipoVar() {
		return tipoVar;
	}

	public void setTipoVar(String tipoVar) {
		this.tipoVar = tipoVar;
	}

	public String getLimiteMin() {
		return limiteMin;
	}

	public void setLimiteMin(String limiteMin) {
		this.limiteMin = limiteMin;
	}

	public String getLimiteMax() {
		return limiteMax;
	}

	public void setLimiteMax(String limiteMax) {
		this.limiteMax = limiteMax;
	}

	public int getCodParametro() {
		return codParametro;
	}

	public void setCodParametro(int codParametro) {
		this.codParametro = codParametro;
	}

	public int getCodVar() {
		return codVar;
	}

	public void setCodVar(int codVar) {
		this.codVar = codVar;
	}
	
	//Métodos
	public void inserirVarDeAlerta() {
		
	}
	
	public void alterarVarDeAlerta() {
		
	}

	public void anularVarDeAlerta() {
		
	}

	public void inserirVarFuncional() {
		
	}

	public void alterarVarFuncional() {
		
	}

	public void anularVarFuncional() {
		
	}
	
	public void inserirVarLimite() {
		
	}
	
	public void alterarVarLimite() {
		
	}

	public void anularVarLimite() {
		
	}
	
	public boolean isCarimbo() {
		return carimbo;
	}

	public void setCarimbo(boolean carimbo) {
		this.carimbo = carimbo;
	}

}
