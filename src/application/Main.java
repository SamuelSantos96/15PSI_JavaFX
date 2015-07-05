package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		int i;	//Contadores
		
		//Administrador
		Globais.listaAdministradores.add(new Administrador(Globais.listaAdministradores.size() + 1, "123", "123", 0, 0, 0));
		/*
		//Parâmetros
		Globais.listaVarLimites.add(new Parametro(1, 1));
		Globais.listaVarLimites.add(new Parametro(2, 2));
		Globais.listaVarLimites.add(new Parametro(2, 3));
		
		for(i = 0; i < Globais.listaVarLimites.size(); i++) {
			if(Globais.listaVarLimites.get(i).getCodVar() == 1) {
				Globais.listaVarLimites.get(i).setVariavel("Tempo de uma partida");
				Globais.listaVarLimites.get(i).setTipoVar("Alerta");
				Globais.listaVarLimites.get(i).setLimiteMax("18 minutos");
				Globais.listaVarLimites.get(i).setLimiteMin("2 minutos");				
			}
			else if(Globais.listaVarLimites.get(i).getCodVar() == 2) {
				Globais.listaVarLimites.get(i).setVariavel("Tempo de uma jogada");
				Globais.listaVarLimites.get(i).setTipoVar("Alerta");
				Globais.listaVarLimites.get(i).setLimiteMax("2 minutos");
				Globais.listaVarLimites.get(i).setLimiteMin("0 minutos");				
			}
			else if(Globais.listaVarLimites.get(i).getCodVar() == 3) {
				Globais.listaVarLimites.get(i).setVariavel("Tempo de recuperar uma conta");
				Globais.listaVarLimites.get(i).setTipoVar("Funcional");
				Globais.listaVarLimites.get(i).setLimiteMax("360 dias");
				Globais.listaVarLimites.get(i).setLimiteMin("0 minutos");
			}
		}
		
		//Jogadores
		Globais.listaJogadores.add(new Jogador(1, "Joaquim1", "Mendes"));
		Globais.listaJogadores.add(new Jogador(2, "Joaquim2", "Mendes"));
		Globais.listaJogadores.add(new Jogador(3, "Joaquim3", "Mendes"));
		
		for(i = 0; i < Globais.listaJogadores.size(); i++) {
			if(Globais.listaJogadores.get(i).getUsername() == "Joaquim1") {
				Globais.listaJogadores.get(i).setCarimbo(true);
			}
		}
		
		//Jogos
		Globais.listaJogos.add(new Jogo(1));

		for(i = 0; i < Globais.listaJogos.size(); i++) {
			if(Globais.listaJogos.get(i).getCodJogo() == 1) {
				Globais.listaJogos.get(i).setCodJogador1(1);
				Globais.listaJogos.get(i).setCodJogador2(2);
				Globais.listaJogos.get(i).setUsernameJogador1("JoaquimHAH1A");
				Globais.listaJogos.get(i).setUsernameJogador2("JoaquimHAH2A");
				Globais.listaJogos.get(i).setPasswordJogador1("J1");
				Globais.listaJogos.get(i).setPasswordJogador2("J2");
				Globais.listaJogos.get(i).setResultado("Empate");
			}
		}
		
		//Contas
		Globais.listaRecContas.add(new Recuperacao(1, 1, "Joao"));
		for(i = 0; i < Globais.listaRecContas.size(); i++) {
			if(Globais.listaRecContas.get(i).getCodContaRec() == 1) {
				Globais.listaRecContas.get(i).setPassword("123");
			}
		}
		
		//Parametrizadores
		Globais.listaParametrizadores.add(new Parametrizador(1, "Rui", "ui"));
		*/
		//Utils.listaDeParametrizadores();
		
		//Utils.listaDeRecDeContas();
		
		//Utils.listaDeVarDeLimites();
		
		//Utils.listaDeJogos();
		
		//Utils.listaDeResultados();
		
		//Utils.listaDeJogadores();
		
		//Utils.menuParametrizador();
		
		//Utils.menuAdministrador();
		
		//Utils.menuJogador();
		
		Utils.login();
		
		//Utils.tictactoe();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}