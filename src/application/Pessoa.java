package application;

public class Pessoa {
	
	//Atributos
	private String 	nome,
					dataNascimento,
					email,
					fax,
					estadoCivil,
					genero,
					nacionalidade,
					naturalidade,
					nomePai,
					nomeMae;
	
	private int codCivil,
				nib,
				niss,
				nuss,
				nTelefone,
				nTelemovel,
				nTelemovel2,
				nif;
	
	//Construtores
	public Pessoa() {
		
	}
	
	public Pessoa(int codCivil) {
		this.codCivil = codCivil;
	}
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public Pessoa(int codCivil, String nome) {
		this.codCivil = codCivil;
		this.nome = nome;
	}
		
	//Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	
	public int getCodCivil() {
		return codCivil;
	}

	public void setCodCivil(int codCivil) {
		this.codCivil = codCivil;
	}

	public int getNib() {
		return nib;
	}

	public void setNib(int nib) {
		this.nib = nib;
	}

	public int getNiss() {
		return niss;
	}

	public void setNiss(int niss) {
		this.niss = niss;
	}

	public int getNuss() {
		return nuss;
	}

	public void setNuss(int nuss) {
		this.nuss = nuss;
	}

	public int getnTelefone() {
		return nTelefone;
	}

	public void setnTelefone(int nTelefone) {
		this.nTelefone = nTelefone;
	}

	public int getnTelemovel() {
		return nTelemovel;
	}

	public void setnTelemovel(int nTelemovel) {
		this.nTelemovel = nTelemovel;
	}

	public int getnTelemovel2() {
		return nTelemovel2;
	}

	public void setnTelemovel2(int nTelemovel2) {
		this.nTelemovel2 = nTelemovel2;
	}

	public int getNif() {
		return nif;
	}

	public void setNif(int nif) {
		this.nif = nif;
	}
	
}
