package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Globais {
	
	//Atributos
	private static int jogadorAtivo = 0;

	private static int vencedor;
	
	private static int codUtilizadorAtivo;	

	private static String usernameUtilizadorAtivo;
	
	private static String passwordUtilizadorAtivo;

	private static int codUtilizadorConvidado;
	
	private static String usernameUtilizadorConvidado;
	
	private static String passwordUtilizadorConvidado;
	
	//Getter e Setters
	public static int getJogadorAtivo() {
		return jogadorAtivo;
	}

	public static void setJogadorAtivo(int jogadorAtivo) {
		Globais.jogadorAtivo = jogadorAtivo;
	}

	public static int getVencedor() {
		return vencedor;
	}

	public static void setVencedor(int vencedor) {
		Globais.vencedor = vencedor;
	}

	public static int getCodUtilizadorAtivo() {
		return codUtilizadorAtivo;
	}

	public static void setCodUtilizadorAtivo(int codUtilizadorAtivo) {
		Globais.codUtilizadorAtivo = codUtilizadorAtivo;
	}

	public static String getUsernameUtilizadorAtivo() {
		return usernameUtilizadorAtivo;
	}

	public static void setUsernameUtilizadorAtivo(String usernameUtilizadorAtivo) {
		Globais.usernameUtilizadorAtivo = usernameUtilizadorAtivo;
	}

	public static int getCodUtilizadorConvidado() {
		return codUtilizadorConvidado;
	}

	public static void setCodUtilizadorConvidado(int codUtilizadorConvidado) {
		Globais.codUtilizadorConvidado = codUtilizadorConvidado;
	}

	public static String getUsernameUtilizadorConvidado() {
		return usernameUtilizadorConvidado;
	}

	public static void setUsernameUtilizadorConvidado(
			String usernameUtilizadorConvidado) {
		Globais.usernameUtilizadorConvidado = usernameUtilizadorConvidado;
	}
	
	public static String getPasswordUtilizadorAtivo() {
		return passwordUtilizadorAtivo;
	}

	public static void setPasswordUtilizadorAtivo(String passwordUtilizadorAtivo) {
		Globais.passwordUtilizadorAtivo = passwordUtilizadorAtivo;
	}

	public static String getPasswordUtilizadorConvidado() {
		return passwordUtilizadorConvidado;
	}

	public static void setPasswordUtilizadorConvidado(
			String passwordUtilizadorConvidado) {
		Globais.passwordUtilizadorConvidado = passwordUtilizadorConvidado;
	}

	//Listas
	public static ObservableList<Jogador> listaJogadores = FXCollections.observableArrayList();
	
	public static ObservableList<Administrador> listaAdministradores = FXCollections.observableArrayList();
	
	public static ObservableList<Parametrizador> listaParametrizadores = FXCollections.observableArrayList();
	
	public static ObservableList<Jogo> listaJogos = FXCollections.observableArrayList();
	
	public static ObservableList<Parametro> listaVarLimites = FXCollections.observableArrayList();
	
	public static ObservableList<Recuperacao> listaRecContas = FXCollections.observableArrayList();

	//Métodos
	public static ObservableList<Jogador> carregarListaJogadores() {
		
		return listaJogadores;
		
	}
	
	public static ObservableList<Administrador> carregarListaAdministradores() {
		
		return listaAdministradores;
		
	}

	public static ObservableList<Parametrizador> carregarListaParametrizador() {
		
		return listaParametrizadores;
		
	}
	
	public static ObservableList<Jogo> carregarListaJogos() {
		
		return listaJogos;
		
	}
	
	public static ObservableList<Parametro> carregarListaVarLimites() {
		
		return listaVarLimites;
		
	}
	
	public static ObservableList<Recuperacao> carregarListaRecContas() {
		
		return listaRecContas;
		
	}
	
}
