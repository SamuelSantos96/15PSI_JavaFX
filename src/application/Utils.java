package application;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Callback;

public class Utils {
	
	static Label label1 = new Label("1"); 				//Cria a label para mostra
	static Label label2 = new Label("2"); 				//Cria a label para mostra
	static Label label3 = new Label("3"); 				//Cria a label para mostra
	static Label label4 = new Label("4"); 				//Cria a label para mostra
	static Label label5 = new Label("5"); 				//Cria a label para mostra
	static Label label6 = new Label("6"); 				//Cria a label para mostra
	static Label label7 = new Label("7"); 				//Cria a label para mostra
	static Label label8 = new Label("8"); 				//Cria a label para mostra
	static Label label9 = new Label("9"); 				//Cria a label para mostra
	
	static boolean resposta;							//Variável de confirmação a escolha do utilizador

	static boolean recConta;							//Variável de confirmação da recuperação de conta
	
	static int codRecConta;								//Variável de confirmação da recuperação de conta
	
	static boolean criacaoNegada;						//Verifica se a criação é ou não negada
	
	static boolean recNegada;							//Verifica se a recuperação é ou não negada
	
	static boolean alterarUtilizador = false;			//Verifica se a alteração está a decorrer
	
	static boolean anularUtilizador = false;			//Verifica se a anulação está a decorrer
	
	static boolean alterarParametro = false;			//Verifica se a alteração está a decorrer
	
	static boolean anularParametro = false;				//Verifica se a anulação está a decorrer
	
	//static int recContaPassword;						//Guarda a password da conta da recuperação da conta
	
	static int 	i;										//Contador
	
	static boolean 	loginJogador = false,				//Variável de indicação de login feito por jogador
					loginAdministrador = false,			//Variável de indicação de login feito por administrador
					loginParametrizador = false,		//Variável de indicação de login feito por parametrizador
					loginDoConvidado = false;			//Variável de indicação de login feito pelo convidado
					
	static Image image1 = new Image("file:images\\question-mark-dude.png");		//Cria uma Image
	static Image image2 = new Image("file:images\\question-mark-dude.png");		//Cria uma Image
	static Image image3 = new Image("file:images\\question-mark-dude.png");		//Cria uma Image
	static Image image4 = new Image("file:images\\question-mark-dude.png");		//Cria uma Image
	static Image image5 = new Image("file:images\\question-mark-dude.png");		//Cria uma Image
	static Image image6 = new Image("file:images\\question-mark-dude.png");		//Cria uma Image
	static Image image7 = new Image("file:images\\question-mark-dude.png");		//Cria uma Image
	static Image image8 = new Image("file:images\\question-mark-dude.png");		//Cria uma Image
	static Image image9 = new Image("file:images\\question-mark-dude.png");		//Cria uma Image
    
	static Image image1o = new Image("file:images\\tic-tac-toe-O.png");			//Cria uma Image
	static Image image2o = new Image("file:images\\tic-tac-toe-O.png");			//Cria uma Image
	static Image image3o = new Image("file:images\\tic-tac-toe-O.png");			//Cria uma Image
	static Image image4o = new Image("file:images\\tic-tac-toe-O.png");			//Cria uma Image
	static Image image5o = new Image("file:images\\tic-tac-toe-O.png");			//Cria uma Image
	static Image image6o = new Image("file:images\\tic-tac-toe-O.png");			//Cria uma Image
	static Image image7o = new Image("file:images\\tic-tac-toe-O.png");			//Cria uma Image
	static Image image8o = new Image("file:images\\tic-tac-toe-O.png");			//Cria uma Image
	static Image image9o = new Image("file:images\\tic-tac-toe-O.png");			//Cria uma Image	    
    
	static Image image1x = new Image("file:images\\tic-tac-toe-X.png");			//Cria uma Image
	static Image image2x = new Image("file:images\\tic-tac-toe-X.png");			//Cria uma Image
	static Image image3x = new Image("file:images\\tic-tac-toe-X.png");			//Cria uma Image
	static Image image4x = new Image("file:images\\tic-tac-toe-X.png");			//Cria uma Image
	static Image image5x = new Image("file:images\\tic-tac-toe-X.png");			//Cria uma Image
	static Image image6x = new Image("file:images\\tic-tac-toe-X.png");			//Cria uma Image
	static Image image7x = new Image("file:images\\tic-tac-toe-X.png");			//Cria uma Image
	static Image image8x = new Image("file:images\\tic-tac-toe-X.png");			//Cria uma Image
	static Image image9x = new Image("file:images\\tic-tac-toe-X.png");			//Cria uma Image
	
	static ImageView imgv1 = new ImageView(image1);						//Cria uma ImageView com a Image
	static ImageView imgv2 = new ImageView(image2);						//Cria uma ImageView com a Image
	static ImageView imgv3 = new ImageView(image3);						//Cria uma ImageView com a Image
	static ImageView imgv4 = new ImageView(image4);						//Cria uma ImageView com a Image
	static ImageView imgv5 = new ImageView(image5);						//Cria uma ImageView com a Image
	static ImageView imgv6 = new ImageView(image6);						//Cria uma ImageView com a Image
	static ImageView imgv7 = new ImageView(image7);						//Cria uma ImageView com a Image
	static ImageView imgv8 = new ImageView(image8);						//Cria uma ImageView com a Image
	static ImageView imgv9 = new ImageView(image9);						//Cria uma ImageView com a Image
	
	static ImageView imgv1o = new ImageView(image1o);						//Cria uma ImageView com a Image
	static ImageView imgv2o = new ImageView(image2o);						//Cria uma ImageView com a Image
	static ImageView imgv3o = new ImageView(image3o);						//Cria uma ImageView com a Image
	static ImageView imgv4o = new ImageView(image4o);						//Cria uma ImageView com a Image
	static ImageView imgv5o = new ImageView(image5o);						//Cria uma ImageView com a Image
	static ImageView imgv6o = new ImageView(image6o);						//Cria uma ImageView com a Image
	static ImageView imgv7o = new ImageView(image7o);						//Cria uma ImageView com a Image
	static ImageView imgv8o = new ImageView(image8o);						//Cria uma ImageView com a Image
	static ImageView imgv9o = new ImageView(image9o);						//Cria uma ImageView com a Image
	 	
	static ImageView imgv1x = new ImageView(image1x);						//Cria uma ImageView com a Image
	static ImageView imgv2x = new ImageView(image2x);						//Cria uma ImageView com a Image
	static ImageView imgv3x = new ImageView(image3x);						//Cria uma ImageView com a Image
	static ImageView imgv4x = new ImageView(image4x);						//Cria uma ImageView com a Image
	static ImageView imgv5x = new ImageView(image5x);						//Cria uma ImageView com a Image
	static ImageView imgv6x = new ImageView(image6x);						//Cria uma ImageView com a Image
	static ImageView imgv7x = new ImageView(image7x);						//Cria uma ImageView com a Image
	static ImageView imgv8x = new ImageView(image8x);						//Cria uma ImageView com a Image
	static ImageView imgv9x = new ImageView(image9x);						//Cria uma ImageView com a Image
	
	//Janela que apresenta o login para o utilizador convidado
	public static void loginDoConvidado(){ //Static para não ser instanciada
		
		loginDoConvidado = false;
				
		//Janela login
		Stage janelaLoginDoConvidado = new Stage();							//Cria uma window
		//janelaLogin.initModality(Modality.APPLICATION_MODAL);				//Define uma janelaLogin Modal
		janelaLoginDoConvidado.initModality(Modality.APPLICATION_MODAL);	//Define uma janelaLogin Modal
		janelaLoginDoConvidado.setTitle("Log In"); 							//Como título, recebe a string do parametro
		janelaLoginDoConvidado.setMinWidth(500);							//Largura da janelaLogin
		janelaLoginDoConvidado.setMaxWidth(500);
		janelaLoginDoConvidado.setMinHeight(300);
		janelaLoginDoConvidado.setMaxHeight(300);
		
		//layout 
		GridPane layout = new GridPane();
		//Labels
		Label labelUserName = new Label("Username: ");
		Label labelPassword = new Label("Password: ");
		//TextFields
		TextField textFieldUserName = new TextField();
		PasswordField passwordFieldPassword = new PasswordField();
		
		Button btnOk = new Button("OK");							//Cria botão para fazer login
		btnOk.setOnAction(e -> {
			janelaLoginDoConvidado.hide();
			//janelaLogin.close();
			if(textFieldUserName.getText().equals("") || passwordFieldPassword.getText().equals("")) {
				errorBox("Erro", "Um ou mais campos nulos!", "Recuperar Conta", "Fazer Login");
				if(recConta == true) {
					recuperarConta();
					recConta = false;
					janelaLoginDoConvidado.show();
				}
				else {
					janelaLoginDoConvidado.show();
				}
			}
			else
			{
				if(textFieldUserName.getText().equals(Globais.getUsernameUtilizadorAtivo())) {
					alertBox("Erro", "Utilizador não válido!");
				}
				else {
					//Estrutura de controlo para verificar se o username e password estão na lista de jogadores
					for(i = 0; i < Globais.listaJogadores.size(); i++) {
						if(Globais.listaJogadores.get(i).getUsername().equals(textFieldUserName.getText()) &&
						   Globais.listaJogadores.get(i).getPassword().equals(passwordFieldPassword.getText())) {
							loginDoConvidado = true;
							Globais.setCodUtilizadorConvidado(Globais.listaJogadores.get(i).getCodJogador());
							Globais.setUsernameUtilizadorConvidado(Globais.listaJogadores.get(i).getUsername());
						}					
					}
					//Estrutura de controlo para verificar se o username e password estão na lista de administradores
					for(i = 0; i < Globais.listaAdministradores.size(); i++) {
						if(Globais.listaAdministradores.get(i).getUsername().equals(textFieldUserName.getText()) &&
						   Globais.listaAdministradores.get(i).getPassword().equals(passwordFieldPassword.getText())) {
							loginDoConvidado = true;
							Globais.setCodUtilizadorConvidado(Globais.listaAdministradores.get(i).getCodAdmin());
							Globais.setUsernameUtilizadorConvidado(Globais.listaAdministradores.get(i).getUsername());
						}
					}
									
					//Se o login do convidado foi feito
					if(loginDoConvidado == true) {						
						//tictactoe();
						janelaLoginDoConvidado.close();
					}
					//Se os dados não correspondem a nenhum dos indivíduos acima referidos envia uma mensagem de erro
					else {					
						janelaLoginDoConvidado.hide();
						errorBox("Erro", "Um ou mais dados incorretos!", "Recuperar Conta", "Fazer Login");
						if(recConta == true) {
							recuperarConta();
							recConta = false;
							janelaLoginDoConvidado.show();
						}
						else {
							janelaLoginDoConvidado.show();
						}
					}
				}
			}
		});				//Ação fecha esta janelaLogin
		Button btnRecConta = new Button("Recuperar Conta");		//Cria botão para recuperar conta
		btnRecConta.setOnAction(e -> recuperarConta());		//Aceder à janela de recuperação
		
		Button btnCriarConta = new Button("Criar Conta");		//Cria botão para criar conta de jogador
		btnCriarConta.setOnAction(e -> criarContaJogador());	//Aceder à janela de criar conta
		
		//Adicionar à Grid os botoes, label e textfields-----------------------------
		layout.add(labelUserName, 0, 0);
		layout.add(textFieldUserName, 1, 0);
		layout.add(labelPassword, 0, 2);
		layout.add(passwordFieldPassword, 1,2);
		layout.add(btnOk, 0, 3);
		layout.add(btnRecConta, 1, 3);
		layout.add(btnCriarConta, 1, 4);
		layout.setAlignment(Pos.CENTER);
		
		//SCENE
		Scene scene = new Scene(layout);					//Criar a Scene e associa o Layout
		janelaLoginDoConvidado.setScene(scene);								//Associa a Scena 
		janelaLoginDoConvidado.showAndWait();								//Executa e prende o controlo até ser fechada
	}
	
	public static void login(){ //Static para não ser instanciada
		
		loginJogador = false;							//Variável de indicação de login feito por jogador
		loginAdministrador = false;						//Variável de indicação de login feito por administrador
		loginParametrizador = false;					//Variável de indicação de login feito por parametrizador
				
		//Janela login
		Stage janelaLogin = new Stage();							//Cria uma window
		//janelaLogin.initModality(Modality.APPLICATION_MODAL);		//Define uma janelaLogin Modal
		janelaLogin.initModality(Modality.APPLICATION_MODAL);		//Define uma janelaLogin Modal
		janelaLogin.setTitle("Log In"); 							//Como título, recebe a string do parametro
		janelaLogin.setMinWidth(500);								//Largura da janelaLogin
		janelaLogin.setMaxWidth(500);
		janelaLogin.setMinHeight(300);
		janelaLogin.setMaxHeight(300);
		
		//layout 
		GridPane layout = new GridPane();
		//Labels
		Label labelUserName = new Label("Username: ");
		Label labelPassword = new Label("Password: ");
		//TextFields
		TextField textFieldUserName = new TextField();
		PasswordField passwordFieldPassword = new PasswordField();
		
		Button btnOk = new Button("OK");							//Cria botão para fazer login
		btnOk.setOnAction(e -> {
			janelaLogin.hide();
			//janelaLogin.close();
			if(textFieldUserName.getText().equals("") || passwordFieldPassword.getText().equals("")) {
				errorBox("Erro", "Um ou mais campos nulos!", "Recuperar Conta", "Fazer Login");
				if(recConta == true) {
					recuperarConta();
					recConta = false;
					janelaLogin.show();
				}
				else {
					janelaLogin.show();
				}
			}
			else
			{
				//Estrutura de controlo para verificar se o username e password estão na lista de jogadores
				for(i = 0; i < Globais.listaJogadores.size(); i++) {
					if(Globais.listaJogadores.get(i).getUsername().equals(textFieldUserName.getText()) &&
					   Globais.listaJogadores.get(i).getPassword().equals(passwordFieldPassword.getText())) {
						loginJogador = true;
						Globais.setCodUtilizadorAtivo(Globais.listaJogadores.get(i).getCodJogador());
						Globais.setUsernameUtilizadorAtivo(Globais.listaJogadores.get(i).getUsername());
					}
				}
				//System.out.println(textFieldUserName.getText());
				//System.out.println(passwordFieldPassword.getText());
				//Estrutura de controlo para verificar se o username e password estão na lista de administradores
				for(i = 0; i < Globais.listaAdministradores.size(); i++) {
					if(Globais.listaAdministradores.get(i).getUsername().equals(textFieldUserName.getText()) &&
					   Globais.listaAdministradores.get(i).getPassword().equals(passwordFieldPassword.getText())) {
						loginAdministrador = true;
						Globais.setCodUtilizadorAtivo(Globais.listaAdministradores.get(i).getCodAdmin());
						Globais.setUsernameUtilizadorAtivo(Globais.listaAdministradores.get(i).getUsername());
					}
				}
				//Estrutura de controlo para verificar se o username e password estão na lista de parametrizadores
				for(i = 0; i < Globais.listaParametrizadores.size(); i++) {
					if(Globais.listaParametrizadores.get(i).getUsername().equals(textFieldUserName.getText()) &&
					   Globais.listaParametrizadores.get(i).getPassword().equals(passwordFieldPassword.getText())) {
						loginParametrizador = true;
						Globais.setCodUtilizadorAtivo(Globais.listaParametrizadores.get(i).getCodParametrizador());
						Globais.setUsernameUtilizadorAtivo(Globais.listaParametrizadores.get(i).getUsername());
					}
				}
								
				//Se o login foi feito por um jogador
				if(loginJogador == true) {
					loginAdministrador = false;
					loginParametrizador = false;
					menuJogador();								//Acede ao Menu Jogador
					janelaLogin.close();
				}
				//Se o login foi feito por um administrador
				else if(loginAdministrador == true) {
					loginJogador = false;
					loginParametrizador = false;
					menuAdministrador();						//Acede ao Menu Administrador
					janelaLogin.close();
				}
				//Se o login foi feito por um parametrizador
				else if(loginParametrizador == true) {
					loginJogador = false;
					loginAdministrador = false;
					menuParametrizador();						//Acede ao Menu Parametrizador
					janelaLogin.close();
				}
				//Se os dados não correspondem a nenhum dos indivíduos acima referidos envia uma mensagem de erro
				else if(loginJogador == false && loginAdministrador == false && loginParametrizador == false) {					
					janelaLogin.hide();
					errorBox("Erro", "Um ou mais dados incorretos!", "Recuperar Conta", "Fazer Login");					
					if(recConta == true) {
						recuperarConta();
						recConta = false;
						janelaLogin.show();
					}
					else {
						janelaLogin.show();
					}
				}				
			}
		});				//Ação fecha esta janelaLogin
		Button btnRecConta = new Button("Recuperar Conta");		//Cria botão para recuperar conta
		btnRecConta.setOnAction(e -> recuperarConta());			//Aceder à janela de recuperação
		
		Button btnCriarConta = new Button("Criar Conta");		//Cria botão para criar conta de jogador
		btnCriarConta.setOnAction(e -> criarContaJogador());	//Aceder à janela de criar conta
		
		//Adicionar à Grid os botoes, label e textfields-----------------------------
		layout.add(labelUserName, 0, 0);
		layout.add(textFieldUserName, 1, 0);
		layout.add(labelPassword, 0, 2);
		layout.add(passwordFieldPassword, 1,2);
		layout.add(btnOk, 0, 3);
		layout.add(btnRecConta, 1, 3);
		layout.add(btnCriarConta, 1, 4);
		layout.setAlignment(Pos.CENTER);
		
		//SCENE
		Scene scene = new Scene(layout);						//Criar a Scene e associa o Layout
		janelaLogin.setScene(scene);							//Associa a Scena 
		janelaLogin.showAndWait();								//Executa e prende o controlo até ser fechada
	}
	//ALERTBOX para a exercicio  05a ModalWindow_AlertBox
		
	public static void alertBox(String title, String msg){ //Static para não ser instanciada
		
		Stage janela = new Stage();							//Cria uma window
		//janela.initModality(Modality.APPLICATION_MODAL);	//Define uma janela Modal
		janela.initModality(Modality.WINDOW_MODAL);	//Define uma janela Modal
		janela.setTitle(title); 							//Como título, recebe a string do parametro
		janela.setMinWidth(200);							//Largura da janela
		
		Label mensagem = new Label(msg); 					//Cria a label para mostra
		Button btnClose = new Button("Fechar");				//Cria botão para fechar janela
		btnClose.setOnAction(e -> janela.close());			//Ação fecha esta janela
		
		VBox layout = new VBox(10);							//Layout vertical com 10px entre células
		layout.getChildren().addAll(mensagem, btnClose);	//Adiciona Label e Button ao layout
		layout.setAlignment(Pos.CENTER);					//Alinhar os cnteudos ao Centros
		
		Scene scene = new Scene(layout);					//Criar a Scene e associa o Layout
		janela.setScene(scene);								//Associa a Scena 
		janela.showAndWait();								//Executa e prende o controlo até ser fechada
		
		
	}
	
	
	public static boolean confirmationBox(String title, String msg){ //Static para não ser instanciada
		
		Stage janela = new Stage();							//Cria uma window
		//janela.initModality(Modality.APPLICATION_MODAL);	//Define uma janela Modal
		janela.initModality(Modality.WINDOW_MODAL);	//Define uma janela Modal
		janela.setTitle(title); 							//Como título, recebe a string do parametro
		janela.setMinWidth(200);							//Largura da janela
		
		Label mensagem = new Label(msg); 					//Cria a label para mostra
		Button btnTrue = new Button("Sim");				//Cria botão para fechar janela
		btnTrue.setOnAction(e -> {
			resposta = true;
			janela.close();			//Ação fecha esta janela
		});
		Button btnFalse = new Button("Não");
		btnFalse.setOnAction(e -> {
			resposta = false;
			janela.close();			//Ação fecha esta janela
		});
		
		VBox layout = new VBox(10);							//Layout vertical com 10px entre células
		VBox layout1 = new VBox(10);
		layout.getChildren().addAll(mensagem, layout1);
		layout.setAlignment(Pos.CENTER);
		
		layout1.getChildren().addAll(btnTrue, btnFalse);
	
		
		Scene scene = new Scene(layout);					//Criar a Scene e associa o Layout
		janela.setScene(scene);								//Associa a Scena 
		janela.showAndWait();								//Executa e prende o controlo até ser fechada
		
		return resposta;
	}
	
	//JAnela que é apresentada caso haja um erro no login
	public static void errorBox(String title, String msg, String op1, String op2){ //Static para não ser instanciada
					
		//Janela de erro
		Stage janelaError = new Stage();							//Cria uma window
		//janelaError.initModality(Modality.APPLICATION_MODAL);	//Define uma janelaError Modal
		janelaError.initModality(Modality.WINDOW_MODAL);	//Define uma janelaError Modal
		janelaError.setTitle(title); 							//Como título, recebe a string do parametro
		janelaError.setMinWidth(300);							//Largura da janelaError
		janelaError.setMinHeight(300);							//Altura da janelaError
		
		Label mensagem = new Label(msg); 					//Cria a label para mostra
		Button btnOp1 = new Button(op1);					//Cria botão para fechar janelaError
		btnOp1.setOnAction(e -> {
			recConta = true;
			janelaError.close();			
		});			//Ação fecha esta janelaError
		Button btnOp2 = new Button(op2);					//Cria botão para fechar janelaError
		btnOp2.setOnAction(e -> {
			recConta = false;
			janelaError.close();
			//login();
		});			//Ação fecha esta janelaError
		

		VBox layout = new VBox(10);							//Layout vertical com 10px entre células
		layout.getChildren().addAll(mensagem, btnOp1, btnOp2);	//Adiciona Label e Button ao layout
		layout.setAlignment(Pos.CENTER);					//Alinhar os cnteudos ao Centros
		
		Scene scene = new Scene(layout);					//Criar a Scene e associa o Layout
		janelaError.setScene(scene);								//Associa a Scena 
		janelaError.showAndWait();								//Executa e prende o controlo até ser fechada
		
	}
	
	//Janela com o menu do jogador
	public static void menuJogador() {
		try {			
			//Janela do Jogador
			Stage janelaMenuJogador = new Stage();
			
			//Menus
			Menu menuJogar = new Menu("_Jogar");							//Menu Jogar
			Menu menuGerirConta = new Menu("Gerir _Conta");					//Menu Gerir Conta
			Menu menuListas = new Menu("_Listas");							//Menu Listas
			
			//Itens dos menus
			//MenuItem menu1Player = new MenuItem("1 Player");
			//menu1Player.setOnAction(e -> tictactoe());
			//menuJogar.getItems().add(menu1Player);
			MenuItem menu2Players = new MenuItem("2 Players");
			menu2Players.setOnAction(e -> {
				loginDoConvidado();
				
				if(loginDoConvidado == true) {
					tictactoe();
				}
			});
			menuJogar.getItems().add(menu2Players);

			MenuItem menuAlterarConta = new MenuItem("Alterar Conta");
			menuGerirConta.getItems().add(menuAlterarConta);
			MenuItem menuAnularConta = new MenuItem("Anular Conta");
			menuGerirConta.getItems().add(menuAnularConta);
			
			MenuItem menuListaJogadores = new MenuItem("Jogadores");
			menuListaJogadores.setOnAction(e -> listaDeJogadores());
			menuListas.getItems().add(menuListaJogadores);
			
			MenuItem menuListaResultados = new MenuItem("Resultados");
			menuListaResultados.setOnAction(e -> listaDeResultados());
			menuListas.getItems().add(menuListaResultados);
			
			MenuItem menuListaJogos = new MenuItem("Jogos");
			menuListaJogos.setOnAction(e -> listaDeJogos());
			menuListas.getItems().add(menuListaJogos);
			
			//MenuBar com os menus associados
			MenuBar menuBar = new MenuBar();
			menuBar.getMenus().addAll(menuJogar, menuGerirConta, menuListas);
			
			//Associar o menu à região TOP do rootLayout
			BorderPane rootLayout = new BorderPane();
			rootLayout.setTop(menuBar);
			
			//Layout da Janela
			GridPane grid = new GridPane();
		    grid.setHgap(10);
		    grid.setVgap(10);
		    grid.setPadding(new Insets(50, 50, 50, 50));

			//Username
			Label username = new Label("Username: ");
			grid.add(username, 0, 1);
			Label usernameJogador = new Label(Globais.getUsernameUtilizadorAtivo());
			grid.add(usernameJogador, 1, 1);

			//Botão para Sair
			Button btnSair = new Button("Log Out");
			btnSair.setOnAction(e -> {
				janelaMenuJogador.close();				
				login();
			});
			grid.add(btnSair, 0, 2);
			
			rootLayout.setCenter(grid);
			Scene scene = new Scene(rootLayout,500,400);
			janelaMenuJogador.setScene(scene);
			janelaMenuJogador.setTitle("Menu Jogador");
			janelaMenuJogador.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//Janela com o menu do administrador
	public static void menuAdministrador() {
		try {			
			//Janela do Administrador
			Stage janelaMenuAdministrador = new Stage();
			
			//Menus
			Menu menuJogar = new Menu("_Jogar");							//Menu Jogar
			Menu menuGerirConta = new Menu("Gerir _Contas");				//Menu Gerir Conta
			Menu menuListas = new Menu("_Listas");							//Menu Listas
			
			//Itens dos menus			
			//MenuItem menu1Player = new MenuItem("1 Player");
			//menu1Player.setOnAction(e -> tictactoe());
			//menuJogar.getItems().add(menu1Player);
			MenuItem menu2Players = new MenuItem("2 Players");
			menu2Players.setOnAction(e -> {
				loginDoConvidado();
				
				if(loginDoConvidado == true) {
					tictactoe();
				}
			});
			menuJogar.getItems().add(menu2Players);
			
			MenuItem menuCriarConta = new MenuItem("Criar Conta");
			menuCriarConta.setOnAction(e -> criarContaJogadorParametrizador());
			menuGerirConta.getItems().add(menuCriarConta);		
			
			MenuItem menuAlterarContaJogador = new MenuItem("Alterar Conta Jogador");
			menuAlterarContaJogador.setOnAction(e -> {
				alterarUtilizador = true;
				anularUtilizador = false;
				listaDeJogadores();
				alterarUtilizador = false;
				anularUtilizador = false;
			});
			menuGerirConta.getItems().add(menuAlterarContaJogador);
			
			MenuItem menuAnularContaJogador = new MenuItem("Anular Conta Jogador");
			menuAnularContaJogador.setOnAction(e -> {
				alterarUtilizador = false;
				anularUtilizador = true;
				listaDeJogadores();
				alterarUtilizador = false;
				anularUtilizador = false;
			});
			menuGerirConta.getItems().add(menuAnularContaJogador);
			
			MenuItem menuAlterarContaParametrizador = new MenuItem("Alterar Conta Parametrizador");
			menuAlterarContaParametrizador.setOnAction(e -> {
				alterarUtilizador = true;
				anularUtilizador = false;
				listaDeParametrizadores();
				alterarUtilizador = false;
				anularUtilizador = false;
			});
			menuGerirConta.getItems().add(menuAlterarContaParametrizador);
			
			MenuItem menuAnularContaParametrizador = new MenuItem("Anular Conta Parametrizador");
			menuAnularContaParametrizador.setOnAction(e -> {
				alterarUtilizador = false;
				anularUtilizador = true;
				listaDeParametrizadores();
				alterarUtilizador = false;
				anularUtilizador = false;
			});
			menuGerirConta.getItems().add(menuAnularContaParametrizador);
			
			MenuItem menuListaJogadores = new MenuItem("Jogadores");
			menuListaJogadores.setOnAction(e -> listaDeJogadores());
			menuListas.getItems().add(menuListaJogadores);
			
			MenuItem menuListaResultados = new MenuItem("Resultados");
			menuListaResultados.setOnAction(e -> listaDeResultados());
			menuListas.getItems().add(menuListaResultados);
			
			MenuItem menuListaJogos = new MenuItem("Jogos");
			menuListaJogos.setOnAction(e -> listaDeJogos());
			menuListas.getItems().add(menuListaJogos);			
						
			MenuItem menuListaVarLimites = new MenuItem("Variáveis de Limites");
			menuListaVarLimites.setOnAction(e -> listaDeVarDeLimites());
			menuListas.getItems().add(menuListaVarLimites);
			
			MenuItem menuListaPedidosRecConta = new MenuItem("Pedidos de Recuperação de Conta");
			menuListaPedidosRecConta.setOnAction(e -> listaDeRecDeContas());
			menuListas.getItems().add(menuListaPedidosRecConta);
			
			MenuItem menuListaParametrizadores = new MenuItem("Parametrizadores");
			menuListaParametrizadores.setOnAction(e -> listaDeParametrizadores());
			menuListas.getItems().add(menuListaParametrizadores);
			
			//MenuBar com os menus associados
			MenuBar menuBar = new MenuBar();
			menuBar.getMenus().addAll(menuJogar, menuGerirConta, menuListas);
			
			//Associar o menu à região TOP do rootLayout
			BorderPane rootLayout = new BorderPane();
			rootLayout.setTop(menuBar);
			
			//Layout da Janela
			GridPane grid = new GridPane();
		    grid.setHgap(10);
		    grid.setVgap(10);
		    grid.setPadding(new Insets(50, 50, 50, 50));
			
			//Username
			Label username = new Label("Username: ");
			grid.add(username, 0, 1);
			Label usernameAdministrador = new Label(Globais.getUsernameUtilizadorAtivo());
			grid.add(usernameAdministrador, 1, 1);

			//Botão para Sair
			Button btnSair = new Button("Log Out");
			btnSair.setOnAction(e -> {
				janelaMenuAdministrador.close();
				login();
			});
			grid.add(btnSair, 0, 2);
			
			rootLayout.setCenter(grid);
			Scene scene = new Scene(rootLayout,500,400);
			janelaMenuAdministrador.setScene(scene);
			janelaMenuAdministrador.setTitle("Menu Administrador");
			janelaMenuAdministrador.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//Janela com o menu do parametrizador
	public static void menuParametrizador() {
		try {			
			//Janela do Parametrizador
			Stage janelaMenuParametrizador = new Stage();
			
			//Menus
			Menu menuParametrizar = new Menu("_Parametrizar");				//Menu Parametrizar
			Menu menuListas = new Menu("_Listas");							//Menu Listas
			
			//Itens dos menus
			MenuItem menuCriarVarLimite = new MenuItem("Criar Variáveis de Limite");
			menuCriarVarLimite.setOnAction(e -> inserirVarLimites());
			menuParametrizar.getItems().add(menuCriarVarLimite);
			
			MenuItem menuAlterarVarLimite = new MenuItem("Alterar Variáveis de Limite");
			menuAlterarVarLimite.setOnAction(e -> {
				alterarParametro = true;
				anularParametro = false;
				listaDeVarDeLimites();
				alterarParametro = false;
				anularParametro = false;
			});
			menuParametrizar.getItems().add(menuAlterarVarLimite);
			
			MenuItem menuAnularVarLimite = new MenuItem("Anular Variáveis de Limite");
			menuAnularVarLimite.setOnAction(e -> {
				alterarParametro = false;
				anularParametro = true;
				listaDeVarDeLimites();
				alterarParametro = false;
				anularParametro = false;
			});
			menuParametrizar.getItems().add(menuAnularVarLimite);
			
			/*
			MenuItem menuCriarVarAlerta = new MenuItem("Criar Variáveis de Alerta");
			menuCriarVarAlerta.setOnAction(e -> janelaMenuParametrizador.close());
			menuParametrizar.getItems().add(menuCriarVarAlerta);			
			
			MenuItem menuAlterarVarAlerta = new MenuItem("Alterar Variáveis de Alerta");
			menuAlterarVarAlerta.setOnAction(e -> janelaMenuParametrizador.close());
			menuParametrizar.getItems().add(menuAlterarVarAlerta);
			
			MenuItem menuAnularVarAlerta = new MenuItem("Anular Variáveis de Alerta");
			menuAnularVarAlerta.setOnAction(e -> janelaMenuParametrizador.close());
			menuParametrizar.getItems().add(menuAnularVarAlerta);
			
			MenuItem menuCriarVarFuncional = new MenuItem("Criar Variáveis Funcionais");
			menuCriarVarFuncional.setOnAction(e -> janelaMenuParametrizador.close());
			menuParametrizar.getItems().add(menuCriarVarFuncional);
			
			MenuItem menuAlterarVarFuncional = new MenuItem("Alterar Variáveis Funcionais");
			menuAlterarVarFuncional.setOnAction(e -> janelaMenuParametrizador.close());
			menuParametrizar.getItems().add(menuAlterarVarFuncional);
			
			MenuItem menuAnularVarFuncional = new MenuItem("Anular Variáveis Funcionais");
			menuAnularVarFuncional.setOnAction(e -> janelaMenuParametrizador.close());
			menuParametrizar.getItems().add(menuAnularVarFuncional);
			*/
			
			MenuItem menuListasJogadores = new MenuItem("Jogadores");
			menuListasJogadores.setOnAction(e -> listaDeJogadores());
			menuListas.getItems().add(menuListasJogadores);
						
			MenuItem menuListasResultados = new MenuItem("Resultados");
			menuListasResultados.setOnAction(e -> listaDeResultados());
			menuListas.getItems().add(menuListasResultados);
			
			MenuItem menuListasJogos = new MenuItem("Jogos");
			menuListasJogos.setOnAction(e -> listaDeJogos());
			menuListas.getItems().add(menuListasJogos);
			
			MenuItem menuListasVarLimites = new MenuItem("Variáveis de Limites");
			menuListasVarLimites.setOnAction(e -> listaDeVarDeLimites());
			menuListas.getItems().add(menuListasVarLimites);
			
			//MenuBar com os menus associados
			MenuBar menuBar = new MenuBar();
			menuBar.getMenus().addAll(menuParametrizar, menuListas);
			
			//Associar o menu à região TOP do rootLayout
			BorderPane rootLayout = new BorderPane();
			rootLayout.setTop(menuBar);
			
			//Layout da Janela
			GridPane grid = new GridPane();
		    grid.setHgap(10);
		    grid.setVgap(10);
		    grid.setPadding(new Insets(50, 50, 50, 50));
			
			//Username
			Label username = new Label("Username: ");
			grid.add(username, 0, 1);
			Label usernameParametrizador = new Label(Globais.getUsernameUtilizadorAtivo());
			grid.add(usernameParametrizador, 1, 1);

			//Botão para Sair
			Button btnSair = new Button("Log Out");
			btnSair.setOnAction(e -> {
				janelaMenuParametrizador.close();
				login();
			});
			grid.add(btnSair, 0, 2);
			
			rootLayout.setCenter(grid);
			Scene scene = new Scene(rootLayout,500,400);
			janelaMenuParametrizador.setScene(scene);
			janelaMenuParametrizador.setTitle("Menu Parametrizador");
			janelaMenuParametrizador.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//Apresenta a janela com a lista de jogadores
	public static void listaDeJogadores() {
		try {
			//Janela de Jogadores
			Stage janelaListaJogadores = new Stage();
			
			//Tabela dos Jogadores
			TableView<Jogador> tabelaJogadores = new TableView<>();
			
			//Coluna Código do Jogador
			TableColumn<Jogador, String> colunaCodJogador = new TableColumn<>("Código");						
			colunaCodJogador.setMinWidth(200);	//Largura em pixeis da coluna
			colunaCodJogador.setCellValueFactory(new PropertyValueFactory<>("codJogador"));
			
			//Coluna Username
			TableColumn<Jogador, String> colunaUsername = new TableColumn<>("Username");						
			colunaUsername.setMinWidth(200);	//Largura em pixeis da coluna
			colunaUsername.setCellValueFactory(new PropertyValueFactory<>("username"));
			//Nome do atributo, na ObservableList, onde vai ler os dados
			
			//Coluna Password
			TableColumn<Jogador, String> colunaPassword = new TableColumn<>("Password");
			colunaPassword.setMinWidth(200);
			colunaPassword.setCellValueFactory(new PropertyValueFactory<>("password"));
			
			//Botão Apagar
			Button btnApagar = new Button("Apagar");
			btnApagar.setOnAction(e -> {
				//Vamos apanhar o item selecionado e compara-lo com a lista de Alunos
				
				ObservableList<Jogador> jogadorselected, listaJogadores;
				listaJogadores = tabelaJogadores.getItems();
				jogadorselected = tabelaJogadores.getSelectionModel().getSelectedItems();
				jogadorselected.forEach(listaJogadores::remove);
			});
			
			//Botão Alterar
			Button btnAlterar = new Button("Alterar");
			btnAlterar.setOnAction(e -> {
				//Alterar
			});
			
			//Associar as colunas à tabela
			//Se o utilizador for jogador apresenta a lista de jogadores sem passwords
			if(loginJogador == true || loginParametrizador == true) {
				tabelaJogadores.getColumns().addAll(colunaCodJogador, colunaUsername);
			}
			//Se o utilizador for administrador apresenta a lista de jogadores com passwords
			else {
				tabelaJogadores.getColumns().addAll(colunaCodJogador, colunaUsername, colunaPassword);
			}
			
			//Carregar a lista com dados
			tabelaJogadores.setItems( Globais.carregarListaJogadores() );
			
			//Preparação da janela
			StackPane layout = new StackPane();
			layout.setPadding(new Insets(20, 20, 20, 20));
			
			HBox layoutEdit = new HBox(10);
			layoutEdit.setPadding(new Insets(10, 10, 10, 10));
			//layoutEdit.setAlignment(Pos.BOTTOM_RIGHT);
			
			VBox layoutSub = new VBox(10);
			//layoutSub.getChildren().addAll(tabelaJogadores, layoutEdit);
						
			if(alterarUtilizador == true) {
				layoutEdit.getChildren().addAll(btnAlterar);
				layoutSub.getChildren().addAll(tabelaJogadores, layoutEdit);
			}
			else if(anularUtilizador == true) {
				layoutEdit.getChildren().addAll(btnApagar);
				layoutSub.getChildren().addAll(tabelaJogadores, layoutEdit);
			}
			else {
				layoutSub.getChildren().add(tabelaJogadores);
			}
						
			//Scene scene = new Scene(layout, 400, 400);
			layout.getChildren().add(layoutSub);
			Scene scene = new Scene(layout);
			janelaListaJogadores.setScene(scene);
			janelaListaJogadores.setTitle("Lista de Jogadores");
			janelaListaJogadores.show();
			/*
			colunaCodJogador.setCellFactory(new Callback<TableColumn<Jogador, String>, TableCell<Jogador, String>>() {
			    @Override
			    public TableCell<Jogador, String> call(TableColumn<Jogador, String> param) {
			        return new TableCell<Jogador, String>() {

			            @Override
			            protected void updateItem(String item, boolean empty) {
			                super.updateItem(item, empty);

			                if (!empty) {
				                // Use a SimpleDateFormat or similar in the format method
				                setText("Anulado");
	
			                }
			                else {
			                	setText(null);
			                }
			            }
			        };
			    }
			});*/
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//Apresenta a janela com a lista de administradores
	public static void listaDeResultados() {
		try {
			//Janela de Jogadores
			Stage janelaListaJogadores = new Stage();
			
			//Tabela dos Jogadores
			TableView<Jogador> tabelaJogadores = new TableView<>();
			
			//Coluna Código do Jogador
			TableColumn<Jogador, String> colunaCodJogador = new TableColumn<>("Código");						
			colunaCodJogador.setMinWidth(200);	//Largura em pixeis da coluna
			colunaCodJogador.setCellValueFactory(new PropertyValueFactory<>("codJogador"));
			
			//Coluna Username
			TableColumn<Jogador, String> colunaUsername = new TableColumn<>("Username");						
			colunaUsername.setMinWidth(200);	//Largura em pixeis da coluna
			colunaUsername.setCellValueFactory(new PropertyValueFactory<>("username"));
			//Nome do atributo, na ObservableList, onde vai ler os dados
			
			//Coluna Password
			TableColumn<Jogador, String> colunaPassword = new TableColumn<>("Password");
			colunaPassword.setMinWidth(200);
			colunaPassword.setCellValueFactory(new PropertyValueFactory<>("password"));
			
			//Coluna Vitórias
			TableColumn<Jogador, String> colunaVitorias = new TableColumn<>("Vitórias");						
			colunaVitorias.setMinWidth(200);	//Largura em pixeis da coluna
			colunaVitorias.setCellValueFactory(new PropertyValueFactory<>("numVitorias"));
			
			//Coluna Derrotas
			TableColumn<Jogador, String> colunaDerrotas = new TableColumn<>("Derrotas");						
			colunaDerrotas.setMinWidth(200);	//Largura em pixeis da coluna
			colunaDerrotas.setCellValueFactory(new PropertyValueFactory<>("numDerrotas"));
			//Nome do atributo, na ObservableList, onde vai ler os dados
			
			//Coluna Empates
			TableColumn<Jogador, String> colunaEmpates = new TableColumn<>("Empates");
			colunaEmpates.setMinWidth(200);
			colunaEmpates.setCellValueFactory(new PropertyValueFactory<>("numEmpates"));
			
			
			//Associar as colunas à tabela
			//Se o utilizador for jogador apresenta a lista de jogadores sem passwords
			if(loginJogador == true  || loginParametrizador == true) {
				tabelaJogadores.getColumns().addAll(colunaCodJogador, colunaUsername, colunaVitorias, colunaDerrotas, colunaEmpates);
			}
			//Se o utilizador for administrador apresenta a lista de jogadores com passwords
			else {
				tabelaJogadores.getColumns().addAll(colunaCodJogador, colunaUsername, colunaPassword, colunaVitorias, colunaDerrotas, colunaEmpates);
			}
			
			//Carregar a lista com dados
			tabelaJogadores.setItems( Globais.carregarListaJogadores() );
			
			//Preparação da janela
			StackPane layout = new StackPane();
			layout.setPadding(new Insets(20, 20, 20, 20));
			layout.getChildren().add(tabelaJogadores);
			
			//Scene scene = new Scene(layout, 400, 400);
			Scene scene = new Scene(layout);
			janelaListaJogadores.setScene(scene);
			janelaListaJogadores.setTitle("Lista de Resultados");
			janelaListaJogadores.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//Apresenta a janela com a lista de jogos
	public static void listaDeJogos() {
		try {
			//Janela de Jogadores
			Stage janelaListaJogadores = new Stage();
			
			//Tabela dos Jogadores
			TableView<Jogo> tabelaJogos = new TableView<>();
			
			//Coluna Código do Jogo
			TableColumn<Jogo, String> colunaCodJogo = new TableColumn<>("Jogo");						
			colunaCodJogo.setMinWidth(200);	//Largura em pixeis da coluna
			colunaCodJogo.setCellValueFactory(new PropertyValueFactory<>("codJogo"));
			
			//Coluna Código do Jogador1
			TableColumn<Jogo, String> colunaCodJogador1 = new TableColumn<>("Código Player1");						
			colunaCodJogador1.setMinWidth(200);	//Largura em pixeis da coluna
			colunaCodJogador1.setCellValueFactory(new PropertyValueFactory<>("codJogador1"));
			
			//Coluna Username1
			TableColumn<Jogo, String> colunaUsername1 = new TableColumn<>("Username Player1");						
			colunaUsername1.setMinWidth(200);	//Largura em pixeis da coluna
			colunaUsername1.setCellValueFactory(new PropertyValueFactory<>("usernameJogador1"));
			//Nome do atributo, na ObservableList, onde vai ler os dados
			
			//Coluna Password1
			TableColumn<Jogo, String> colunaPassword1 = new TableColumn<>("Password Player1");
			colunaPassword1.setMinWidth(200);
			colunaPassword1.setCellValueFactory(new PropertyValueFactory<>("passwordJogador1"));
			
			//Coluna Código do Jogador2
			TableColumn<Jogo, String> colunaCodJogador2 = new TableColumn<>("Código Player2");						
			colunaCodJogador2.setMinWidth(200);	//Largura em pixeis da coluna
			colunaCodJogador2.setCellValueFactory(new PropertyValueFactory<>("codJogador2"));
			
			//Coluna Username2
			TableColumn<Jogo, String> colunaUsername2 = new TableColumn<>("Username Player2");						
			colunaUsername2.setMinWidth(200);	//Largura em pixeis da coluna
			colunaUsername2.setCellValueFactory(new PropertyValueFactory<>("usernameJogador2"));
			//Nome do atributo, na ObservableList, onde vai ler os dados
			
			//Coluna Password2
			TableColumn<Jogo, String> colunaPassword2 = new TableColumn<>("Password Player2");
			colunaPassword2.setMinWidth(200);
			colunaPassword2.setCellValueFactory(new PropertyValueFactory<>("passwordJogador2"));
			
			//Coluna Resultado
			TableColumn<Jogo, String> colunaResultado = new TableColumn<>("Resultado");
			colunaResultado.setMinWidth(200);
			colunaResultado.setCellValueFactory(new PropertyValueFactory<>("resultado"));
			
			//Associar as colunas à tabela
			//Se o utilizador for jogador apresenta a lista de jogadores sem passwords
			if(loginJogador == true || loginParametrizador == true) {
				tabelaJogos.getColumns().addAll(colunaCodJogo, colunaCodJogador1, colunaUsername1, colunaCodJogador2, colunaUsername2, colunaResultado);
			}
			//Se o utilizador for administrador apresenta a lista de jogadores com passwords
			else {
				tabelaJogos.getColumns().addAll(colunaCodJogo, colunaCodJogador1, colunaUsername1, colunaPassword1, colunaCodJogador2, colunaUsername2, colunaPassword2, colunaResultado);
			}
			
			//Carregar a lista com dados
			tabelaJogos.setItems( Globais.carregarListaJogos() );
			
			//Preparação da janela
			StackPane layout = new StackPane();
			layout.setPadding(new Insets(20, 20, 20, 20));
			layout.getChildren().add(tabelaJogos);
			
			//Scene scene = new Scene(layout, 700, 400);
			Scene scene = new Scene(layout);
			janelaListaJogadores.setScene(scene);
			janelaListaJogadores.setTitle("Lista de Jogos");
			janelaListaJogadores.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
		
	//Apresenta a janela com a lista de variáveis de limites
	public static void listaDeVarDeLimites() {
		try {
			//Janela de Variáveis de Limites
			Stage janelaListaVarLimites = new Stage();
			
			//Tabela das Variáveis de Limites
			TableView<Parametro> tabelaVar = new TableView<>();
			
			//Coluna Código do Parâmetro
			TableColumn<Parametro, String> colunaCodParametro = new TableColumn<>("Código Parâmetro");						
			colunaCodParametro.setMinWidth(200);	//Largura em pixeis da coluna
			colunaCodParametro.setCellValueFactory(new PropertyValueFactory<>("codParametro"));
			
			//Coluna Código da Variável
			TableColumn<Parametro, String> colunaCodVar = new TableColumn<>("Código Variável");						
			colunaCodVar.setMinWidth(200);	//Largura em pixeis da coluna
			colunaCodVar.setCellValueFactory(new PropertyValueFactory<>("codVar"));
			
			//Coluna Nome da Variável
			TableColumn<Parametro, String> colunaVar = new TableColumn<>("Variável");						
			colunaVar.setMinWidth(200);	//Largura em pixeis da coluna
			colunaVar.setCellValueFactory(new PropertyValueFactory<>("variavel"));
			//Nome do atributo, na ObservableList, onde vai ler os dados
			
			//Coluna Tipo de Variável
			TableColumn<Parametro, String> colunaTipoVar = new TableColumn<>("Tipo");
			colunaTipoVar.setMinWidth(200);
			colunaTipoVar.setCellValueFactory(new PropertyValueFactory<>("tipoVar"));
			
			//Coluna Valor Máximo
			TableColumn<Parametro, String> colunaLimiteMax = new TableColumn<>("Valor Máx.");						
			colunaLimiteMax.setMinWidth(200);	//Largura em pixeis da coluna
			colunaLimiteMax.setCellValueFactory(new PropertyValueFactory<>("limiteMax"));
			
			//Coluna Valor Mínimo
			TableColumn<Parametro, String> colunaLimiteMin = new TableColumn<>("Valor Mín.");						
			colunaLimiteMin.setMinWidth(200);	//Largura em pixeis da coluna
			colunaLimiteMin.setCellValueFactory(new PropertyValueFactory<>("limiteMin"));
			//Nome do atributo, na ObservableList, onde vai ler os dados
			
			//Botão Apagar
			Button btnApagar = new Button("Apagar");
			btnApagar.setOnAction(e -> {
				//Vamos apanhar o item selecionado e compara-lo com a lista de Alunos
				
				ObservableList<Parametro> parametroselected, listaDeVarDeLimites;
				listaDeVarDeLimites = tabelaVar.getItems();
				parametroselected = tabelaVar.getSelectionModel().getSelectedItems();
				parametroselected.forEach(listaDeVarDeLimites::remove);
			});
			
			//Botão Alterar
			Button btnAlterar = new Button("Alterar");
			btnAlterar.setOnAction(e -> {
				//Alterar
			});
						
			//Associar as colunas à tabela
			//Se o utilizador for jogador apresenta a lista de jogadores sem passwords
			tabelaVar.getColumns().addAll(colunaCodParametro, colunaCodVar, colunaVar, colunaTipoVar, colunaLimiteMax, colunaLimiteMin);
			
			//Carregar a lista com dados
			tabelaVar.setItems( Globais.carregarListaVarLimites() );
			
			/*//Preparação da janela
			StackPane layout = new StackPane();
			layout.setPadding(new Insets(20, 20, 20, 20));
			layout.getChildren().add(tabelaVar);*/
			
			//Preparação da janela
			StackPane layout = new StackPane();
			layout.setPadding(new Insets(20, 20, 20, 20));
			
			HBox layoutEdit = new HBox(10);
			layoutEdit.setPadding(new Insets(10, 10, 10, 10));
			//layoutEdit.setAlignment(Pos.BOTTOM_RIGHT);
			
			VBox layoutSub = new VBox(10);
			//layoutSub.getChildren().addAll(tabelaJogadores, layoutEdit);
						
			if(alterarParametro == true) {
				layoutEdit.getChildren().addAll(btnAlterar);
				layoutSub.getChildren().addAll(tabelaVar, layoutEdit);
			}
			else if(anularParametro == true) {
				layoutEdit.getChildren().addAll(btnApagar);
				layoutSub.getChildren().addAll(tabelaVar, layoutEdit);
			}
			else {
				layoutSub.getChildren().add(tabelaVar);
			}
			
			//Scene scene = new Scene(layout, 700, 400);			
			layout.getChildren().add(layoutSub);
			Scene scene = new Scene(layout);
			janelaListaVarLimites.setScene(scene);
			janelaListaVarLimites.setTitle("Lista de Variáveis de Limites");
			janelaListaVarLimites.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//Apresenta a janela com a lista de recuperações de contas
	public static void listaDeRecDeContas() {
		try {
			//Janela de Variáveis de Limites
			Stage janelaListaRecContas = new Stage();
			
			//Tabela das Variáveis de Limites
			TableView<Recuperacao> tabelaRecContas = new TableView<>();
			
			//Coluna Código do Pedido
			TableColumn<Recuperacao, String> colunaCodPedido = new TableColumn<>("Código Jogador do Pedido");						
			colunaCodPedido.setMinWidth(200);	//Largura em pixeis da coluna
			colunaCodPedido.setCellValueFactory(new PropertyValueFactory<>("codContaRec"));
			
			//Coluna Código do Jogador
			TableColumn<Recuperacao, String> colunaCodJogador = new TableColumn<>("Código Jogador");						
			colunaCodJogador.setMinWidth(200);	//Largura em pixeis da coluna
			colunaCodJogador.setCellValueFactory(new PropertyValueFactory<>("codJogador"));
			
			//Coluna Username do Jogador
			TableColumn<Recuperacao, String> colunaUsername = new TableColumn<>("Username");						
			colunaUsername.setMinWidth(200);	//Largura em pixeis da coluna
			colunaUsername.setCellValueFactory(new PropertyValueFactory<>("username"));
			
			//Coluna Password do Jogador
			TableColumn<Recuperacao, String> colunaPassword = new TableColumn<>("Password");
			colunaPassword.setMinWidth(200);	//Largura em pixeis da coluna
			colunaPassword.setCellValueFactory(new PropertyValueFactory<>("password"));
			//Nome do atributo, na ObservableList, onde vai ler os dados
						
			//Associar as colunas à tabela
			//Se o utilizador for jogador apresenta a lista de jogadores sem passwords
			tabelaRecContas.getColumns().addAll(colunaCodPedido, colunaCodJogador, colunaUsername, colunaPassword);
			
			//Carregar a lista com dados
			tabelaRecContas.setItems( Globais.carregarListaRecContas() );
			
			//Preparação da janela
			StackPane layout = new StackPane();
			layout.setPadding(new Insets(20, 20, 20, 20));
			layout.getChildren().add(tabelaRecContas);
			
			//Scene scene = new Scene(layout, 700, 400);
			Scene scene = new Scene(layout);
			janelaListaRecContas.setScene(scene);
			janelaListaRecContas.setTitle("Lista de Pedidos de Recuperação de Contas");
			janelaListaRecContas.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//Apresenta a janela com a lista de parametrizadores
	public static void listaDeParametrizadores() {
		try {
			//Janela de Variáveis de Limites
			Stage janelaListaParametrizadores = new Stage();
			
			//Tabela das Variáveis de Limites
			TableView<Parametrizador> tabelaParametrizador = new TableView<>();
			
			//Coluna Código do Parametrizador
			TableColumn<Parametrizador, String> colunaCodParametrizador = new TableColumn<>("Código Parametrizador");						
			colunaCodParametrizador.setMinWidth(200);	//Largura em pixeis da coluna
			colunaCodParametrizador.setCellValueFactory(new PropertyValueFactory<>("codParametrizador"));
			
			//Coluna Username do Parametrizador
			TableColumn<Parametrizador, String> colunaUsername = new TableColumn<>("Username");						
			colunaUsername.setMinWidth(200);	//Largura em pixeis da coluna
			colunaUsername.setCellValueFactory(new PropertyValueFactory<>("username"));
			
			//Coluna Password do Parametrizador
			TableColumn<Parametrizador, String> colunaPassword = new TableColumn<>("Password");						
			colunaPassword.setMinWidth(200);	//Largura em pixeis da coluna
			colunaPassword.setCellValueFactory(new PropertyValueFactory<>("password"));
			
			//Botão Apagar
			Button btnApagar = new Button("Apagar");
			btnApagar.setOnAction(e -> {
				//Vamos apanhar o item selecionado e compara-lo com a lista de Alunos
				
				ObservableList<Parametrizador> parametrizadorselected, listaDeParametrizadores;
				listaDeParametrizadores = tabelaParametrizador.getItems();
				parametrizadorselected = tabelaParametrizador.getSelectionModel().getSelectedItems();
				parametrizadorselected.forEach(listaDeParametrizadores::remove);
			});
			
			//Botão Alterar
			Button btnAlterar = new Button("Alterar");
			btnAlterar.setOnAction(e -> {
				//Alterar
			});
								
			//Nome do atributo, na ObservableList, onde vai ler os dados
						
			//Associar as colunas à tabela
			//Se o utilizador for jogador apresenta a lista de jogadores sem passwords
			tabelaParametrizador.getColumns().addAll(colunaCodParametrizador, colunaUsername, colunaPassword);
			
			//Carregar a lista com dados
			tabelaParametrizador.setItems( Globais.carregarListaParametrizador() );
			
			/*//Preparação da janela
			StackPane layout = new StackPane();
			layout.setPadding(new Insets(20, 20, 20, 20));
			layout.getChildren().add(tabelaParametrizador);*/
			
			//Preparação da janela
			StackPane layout = new StackPane();
			layout.setPadding(new Insets(20, 20, 20, 20));
			
			HBox layoutEdit = new HBox(10);
			layoutEdit.setPadding(new Insets(10, 10, 10, 10));
			//layoutEdit.setAlignment(Pos.BOTTOM_RIGHT);
			
			VBox layoutSub = new VBox(10);
			//layoutSub.getChildren().addAll(tabelaJogadores, layoutEdit);
						
			if(alterarUtilizador == true) {
				layoutEdit.getChildren().addAll(btnAlterar);
				layoutSub.getChildren().addAll(tabelaParametrizador, layoutEdit);
			}
			else if(anularUtilizador == true) {
				layoutEdit.getChildren().addAll(btnApagar);
				layoutSub.getChildren().addAll(tabelaParametrizador, layoutEdit);
			}
			else {
				layoutSub.getChildren().add(tabelaParametrizador);
			}
			
			//Scene scene = new Scene(layout, 700, 400);
			layout.getChildren().add(layoutSub);
			Scene scene = new Scene(layout);
			janelaListaParametrizadores.setScene(scene);
			janelaListaParametrizadores.setTitle("Lista de Parametrizadores");
			janelaListaParametrizadores.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//Jogo
	public static void tictactoe() {
		
		Stage janelaTicTacToe = new Stage();							//Cria uma window
		//janela.initModality(Modality.APPLICATION_MODAL);				//Define uma janela Modal
		janelaTicTacToe.initModality(Modality.WINDOW_MODAL);			//Define uma janela Modal
		janelaTicTacToe.setTitle("Tic Tac Toe"); 						//Como título, recebe a string do parametro
		janelaTicTacToe.setMinWidth(600);								//Largura da janela
		janelaTicTacToe.setMinHeight(600);								//Altura da janela
	    
		imgv1.setFitWidth(100);											//Resizes the image
	    imgv1.setFitHeight(100);										//Resizes the image
	    imgv1.setPreserveRatio(true);									//Preserva o racio original da imagem
	    imgv1.setSmooth(true); 											//Filtro de alta qualidade
	    imgv1.setCache(true);											//Põe em cach
	    
	    imgv2.setFitWidth(100);											//Resizes the image
	    imgv2.setFitHeight(100);										//Resizes the image
	    imgv2.setPreserveRatio(true);									//Preserva o racio original da imagem
	    imgv2.setSmooth(true); 											//Filtro de alta qualidade
	    imgv2.setCache(true);											//Põe em cach
	    
	    imgv3.setFitWidth(100);											//Resizes the image
	    imgv3.setFitHeight(100);										//Resizes the image
	    imgv3.setPreserveRatio(true);									//Preserva o racio original da imagem
	    imgv3.setSmooth(true); 											//Filtro de alta qualidade
	    imgv3.setCache(true);											//Põe em cach
	    
	    imgv4.setFitWidth(100);											//Resizes the image
	    imgv4.setFitHeight(100);										//Resizes the image
	    imgv4.setPreserveRatio(true);									//Preserva o racio original da imagem
	    imgv4.setSmooth(true); 											//Filtro de alta qualidade
	    imgv4.setCache(true);											//Põe em cach
	    
	    imgv5.setFitWidth(100);											//Resizes the image
	    imgv5.setFitHeight(100);										//Resizes the image
	    imgv5.setPreserveRatio(true);									//Preserva o racio original da imagem
	    imgv5.setSmooth(true); 											//Filtro de alta qualidade
	    imgv5.setCache(true);											//Põe em cach
	    
	    imgv6.setFitWidth(100);											//Resizes the image
	    imgv6.setFitHeight(100);										//Resizes the image
	    imgv6.setPreserveRatio(true);									//Preserva o racio original da imagem
	    imgv6.setSmooth(true); 											//Filtro de alta qualidade
	    imgv6.setCache(true);											//Põe em cach
	    
	    imgv7.setFitWidth(100);											//Resizes the image
	    imgv7.setFitHeight(100);										//Resizes the image
	    imgv7.setPreserveRatio(true);									//Preserva o racio original da imagem
	    imgv7.setSmooth(true); 											//Filtro de alta qualidade
	    imgv7.setCache(true);											//Põe em cach
	    
	    imgv8.setFitWidth(100);											//Resizes the image
	    imgv8.setFitHeight(100);										//Resizes the image
	    imgv8.setPreserveRatio(true);									//Preserva o racio original da imagem
	    imgv8.setSmooth(true); 											//Filtro de alta qualidade
	    imgv8.setCache(true);											//Põe em cach
	    
	    imgv9.setFitWidth(100);											//Resizes the image
	    imgv9.setFitHeight(100);										//Resizes the image
	    imgv9.setPreserveRatio(true);									//Preserva o racio original da imagem
	    imgv9.setSmooth(true); 											//Filtro de alta qualidade
	    imgv9.setCache(true);											//Põe em cach
	    
	    
	    imgv1o.setFitWidth(100);										//Resizes the image
	    imgv1o.setFitHeight(100);										//Resizes the image
	    imgv1o.setPreserveRatio(true);									//Preserva o racio original da imagem
	    imgv1o.setSmooth(true); 										//Filtro de alta qualidade
	    imgv1o.setCache(true);											//Põe em cach
	    
	    imgv2o.setFitWidth(100);										//Resizes the image
	    imgv2o.setFitHeight(100);										//Resizes the image
	    imgv2o.setPreserveRatio(true);									//Preserva o racio original da imagem
	    imgv2o.setSmooth(true); 										//Filtro de alta qualidade
	    imgv2o.setCache(true);											//Põe em cach
	    
	    imgv3o.setFitWidth(100);										//Resizes the image
	    imgv3o.setFitHeight(100);										//Resizes the image
	    imgv3o.setPreserveRatio(true);									//Preserva o racio original da imagem
	    imgv3o.setSmooth(true); 										//Filtro de alta qualidade
	    imgv3o.setCache(true);											//Põe em cach
	    
	    imgv4o.setFitWidth(100);										//Resizes the image
	    imgv4o.setFitHeight(100);										//Resizes the image
	    imgv4o.setPreserveRatio(true);									//Preserva o racio original da imagem
	    imgv4o.setSmooth(true); 										//Filtro de alta qualidade
	    imgv4o.setCache(true);											//Põe em cach
	    
	    imgv5o.setFitWidth(100);										//Resizes the image
	    imgv5o.setFitHeight(100);										//Resizes the image
	    imgv5o.setPreserveRatio(true);									//Preserva o racio original da imagem
	    imgv5o.setSmooth(true); 										//Filtro de alta qualidade
	    imgv5o.setCache(true);											//Põe em cach
	    
	    imgv6o.setFitWidth(100);										//Resizes the image
	    imgv6o.setFitHeight(100);										//Resizes the image
	    imgv6o.setPreserveRatio(true);									//Preserva o racio original da imagem
	    imgv6o.setSmooth(true); 										//Filtro de alta qualidade
	    imgv6o.setCache(true);											//Põe em cach
	    
	    imgv7o.setFitWidth(100);										//Resizes the image
	    imgv7o.setFitHeight(100);										//Resizes the image
	    imgv7o.setPreserveRatio(true);									//Preserva o racio original da imagem
	    imgv7o.setSmooth(true); 										//Filtro de alta qualidade
	    imgv7o.setCache(true);											//Põe em cach
	    
	    imgv8o.setFitWidth(100);										//Resizes the image
	    imgv8o.setFitHeight(100);										//Resizes the image
	    imgv8o.setPreserveRatio(true);									//Preserva o racio original da imagem
	    imgv8o.setSmooth(true); 										//Filtro de alta qualidade
	    imgv8o.setCache(true);											//Põe em cach
	    
	    imgv9o.setFitWidth(100);										//Resizes the image
	    imgv9o.setFitHeight(100);										//Resizes the image
	    imgv9o.setPreserveRatio(true);									//Preserva o racio original da imagem
	    imgv9o.setSmooth(true); 										//Filtro de alta qualidade
	    imgv9o.setCache(true);											//Põe em cach
	    
	    
	    imgv1x.setFitWidth(100);										//Resizes the image
	    imgv1x.setFitHeight(100);										//Resizes the image
	    imgv1x.setPreserveRatio(true);									//Preserva o racio original da imagem
	    imgv1x.setSmooth(true); 										//Filtro de alta qualidade
	    imgv1x.setCache(true);											//Põe em cach
	    
	    imgv2x.setFitWidth(100);										//Resizes the image
	    imgv2x.setFitHeight(100);										//Resizes the image
	    imgv2x.setPreserveRatio(true);									//Preserva o racio original da imagem
	    imgv2x.setSmooth(true); 										//Filtro de alta qualidade
	    imgv2x.setCache(true);											//Põe em cach
	    
	    imgv3x.setFitWidth(100);										//Resizes the image
	    imgv3x.setFitHeight(100);										//Resizes the image
	    imgv3x.setPreserveRatio(true);									//Preserva o racio original da imagem
	    imgv3x.setSmooth(true); 										//Filtro de alta qualidade
	    imgv3x.setCache(true);											//Põe em cach
	    
	    imgv4x.setFitWidth(100);										//Resizes the image
	    imgv4x.setFitHeight(100);										//Resizes the image
	    imgv4x.setPreserveRatio(true);									//Preserva o racio original da imagem
	    imgv4x.setSmooth(true); 										//Filtro de alta qualidade
	    imgv4x.setCache(true);											//Põe em cach
	    
	    imgv5x.setFitWidth(100);										//Resizes the image
	    imgv5x.setFitHeight(100);										//Resizes the image
	    imgv5x.setPreserveRatio(true);									//Preserva o racio original da imagem
	    imgv5x.setSmooth(true); 										//Filtro de alta qualidade
	    imgv5x.setCache(true);											//Põe em cach
	    
	    imgv6x.setFitWidth(100);										//Resizes the image
	    imgv6x.setFitHeight(100);										//Resizes the image
	    imgv6x.setPreserveRatio(true);									//Preserva o racio original da imagem
	    imgv6x.setSmooth(true); 										//Filtro de alta qualidade
	    imgv6x.setCache(true);											//Põe em cach
	    
	    imgv7x.setFitWidth(100);										//Resizes the image
	    imgv7x.setFitHeight(100);										//Resizes the image
	    imgv7x.setPreserveRatio(true);									//Preserva o racio original da imagem
	    imgv7x.setSmooth(true); 										//Filtro de alta qualidade
	    imgv7x.setCache(true);											//Põe em cach
	    
	    imgv8x.setFitWidth(100);										//Resizes the image
	    imgv8x.setFitHeight(100);										//Resizes the image
	    imgv8x.setPreserveRatio(true);									//Preserva o racio original da imagem
	    imgv8x.setSmooth(true); 										//Filtro de alta qualidade
	    imgv8x.setCache(true);											//Põe em cach
	    
	    imgv9x.setFitWidth(100);										//Resizes the image
	    imgv9x.setFitHeight(100);										//Resizes the image
	    imgv9x.setPreserveRatio(true);									//Preserva o racio original da imagem
	    imgv9x.setSmooth(true); 										//Filtro de alta qualidade
	    imgv9x.setCache(true);											//Põe em cach
	    
		
		label1.setMinWidth(100);										//Define uma largura mínima do label
		label1.setMinHeight(100);										//Define uma altura mínima do label
		label1.setMaxWidth(100);										//Define uma largura máxima do label
		label1.setMaxHeight(100);										//Define uma altura máxima do label		
		label1.setGraphic(imgv1);										//Adiciona a ImageView ao Label
		label1.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
	        public void handle(MouseEvent arg0) {	            
				if(label1.getGraphic() == imgv1) {
					if(Globais.getJogadorAtivo() % 2 == 0) {
						label1.setGraphic(imgv1x);
					}
					else {
						label1.setGraphic(imgv1o);
					}
					
					confirmarVencedor();
					
					if(Globais.getVencedor() == 0) {
						Globais.setJogadorAtivo(Globais.getJogadorAtivo() + 1);
					}
					else {
						janelaTicTacToe.close();
						registarJogo();
					}
				}
			}
		});
		
		label2.setMinWidth(100);										//Define uma largura mínima do label
		label2.setMinHeight(100);										//Define uma altura mínima do label
		label2.setMaxWidth(100);										//Define uma largura máxima do label
		label2.setMaxHeight(100);										//Define uma altura máxima do label		
		label2.setGraphic(imgv2);											//Adiciona a ImageView ao Label
		label2.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
	        public void handle(MouseEvent arg0) {	            
				if(label2.getGraphic() == imgv2) {
					if(Globais.getJogadorAtivo() % 2 == 0) {
						label2.setGraphic(imgv2x);
					}
					else {
						label2.setGraphic(imgv2o);
					}
					
					confirmarVencedor();
					
					if(Globais.getVencedor() == 0) {
						Globais.setJogadorAtivo(Globais.getJogadorAtivo() + 1);
					}
					else {
						janelaTicTacToe.close();
						registarJogo();
					}
				}
			}
		});
		
		label3.setMinWidth(100);										//Define uma largura mínima do label
		label3.setMinHeight(100);										//Define uma altura mínima do label
		label3.setMaxWidth(100);										//Define uma largura máxima do label
		label3.setMaxHeight(100);										//Define uma altura máxima do label		
		label3.setGraphic(imgv3);										//Adiciona a ImageView ao Label
		label3.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
	        public void handle(MouseEvent arg0) {	            
				if(label3.getGraphic() == imgv3) {
					if(Globais.getJogadorAtivo() % 2 == 0) {
						label3.setGraphic(imgv3x);
					}
					else {
						label3.setGraphic(imgv3o);
					}
					
					confirmarVencedor();
					
					if(Globais.getVencedor() == 0) {
						Globais.setJogadorAtivo(Globais.getJogadorAtivo() + 1);
					}
					else {
						janelaTicTacToe.close();
						registarJogo();
					}
				}
			}
		});
		
		label4.setMinWidth(100);										//Define uma largura mínima do label
		label4.setMinHeight(100);										//Define uma altura mínima do label
		label4.setMaxWidth(100);										//Define uma largura máxima do label
		label4.setMaxHeight(100);										//Define uma altura máxima do label
		label4.setGraphic(imgv4);										//Adiciona a ImageView ao Label
		label4.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
	        public void handle(MouseEvent arg0) {	            
				if(label4.getGraphic() == imgv4) {
					if(Globais.getJogadorAtivo() % 2 == 0) {
						label4.setGraphic(imgv4x);
					}
					else {
						label4.setGraphic(imgv4o);
					}
					
					confirmarVencedor();
					
					if(Globais.getVencedor() == 0) {
						Globais.setJogadorAtivo(Globais.getJogadorAtivo() + 1);
					}
					else {
						janelaTicTacToe.close();
						registarJogo();
					}
				}
			}
		});
		
		label5.setMinWidth(100);										//Define uma largura mínima do label
		label5.setMinHeight(100);										//Define uma altura mínima do label
		label5.setMaxWidth(100);										//Define uma largura máxima do label
		label5.setMaxHeight(100);										//Define uma altura máxima do label
		label5.setGraphic(imgv5);										//Adiciona a ImageView ao Label
		label5.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
	        public void handle(MouseEvent arg0) {	            
				if(label5.getGraphic() == imgv5) {
					if(Globais.getJogadorAtivo() % 2 == 0) {
						label5.setGraphic(imgv5x);
					}
					else {
						label5.setGraphic(imgv5o);
					}
					
					confirmarVencedor();
					
					if(Globais.getVencedor() == 0) {
						Globais.setJogadorAtivo(Globais.getJogadorAtivo() + 1);
					}
					else {
						janelaTicTacToe.close();
						registarJogo();
					}
				}
			}
		});
		
		label6.setMinWidth(100);										//Define uma largura mínima do label
		label6.setMinHeight(100);										//Define uma altura mínima do label
		label6.setMaxWidth(100);										//Define uma largura máxima do label
		label6.setMaxHeight(100);										//Define uma altura máxima do label
		label6.setGraphic(imgv6);										//Adiciona a ImageView ao Label
		label6.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
	        public void handle(MouseEvent arg0) {
				if(label6.getGraphic() == imgv6) {
					if(Globais.getJogadorAtivo() % 2 == 0) {
						label6.setGraphic(imgv6x);
					}
					else {
						label6.setGraphic(imgv6o);
					}
					
					confirmarVencedor();
					
					if(Globais.getVencedor() == 0) {
						Globais.setJogadorAtivo(Globais.getJogadorAtivo() + 1);
					}
					else {
						janelaTicTacToe.close();
						registarJogo();
					}
				}
			}
		});
		
		label7.setMinWidth(100);										//Define uma largura mínima do label
		label7.setMinHeight(100);										//Define uma altura mínima do label
		label7.setMaxWidth(100);										//Define uma largura máxima do label
		label7.setMaxHeight(100);										//Define uma altura máxima do label
		label7.setGraphic(imgv7);										//Adiciona a ImageView ao Label
		label7.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
	        public void handle(MouseEvent arg0) {	            
				if(label7.getGraphic() == imgv7) {
					if(Globais.getJogadorAtivo() % 2 == 0) {
						label7.setGraphic(imgv7x);
					}
					else {
						label7.setGraphic(imgv7o);
					}
					
					confirmarVencedor();
					
					if(Globais.getVencedor() == 0) {
						Globais.setJogadorAtivo(Globais.getJogadorAtivo() + 1);
					}
					else {
						janelaTicTacToe.close();
						registarJogo();
					}
				}
			}
		});
		
		label8.setMinWidth(100);										//Define uma largura mínima do label
		label8.setMinHeight(100);										//Define uma altura mínima do label
		label8.setMaxWidth(100);										//Define uma largura máxima do label
		label8.setMaxHeight(100);										//Define uma altura máxima do label
		label8.setGraphic(imgv8);										//Adiciona a ImageView ao Label
		label8.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
	        public void handle(MouseEvent arg0) {	            
				if(label8.getGraphic() == imgv8) {
					if(Globais.getJogadorAtivo() % 2 == 0) {
						label8.setGraphic(imgv8x);
					}
					else {
						label8.setGraphic(imgv8o);
					}
					
					confirmarVencedor();
					
					if(Globais.getVencedor() == 0) {
						Globais.setJogadorAtivo(Globais.getJogadorAtivo() + 1);
					}
					else {
						janelaTicTacToe.close();
						registarJogo();
					}
				}
			}
		});
		
		label9.setMinWidth(100);										//Define uma largura mínima do label
		label9.setMinHeight(100);										//Define uma altura mínima do label
		label9.setMaxWidth(100);										//Define uma largura máxima do label
		label9.setMaxHeight(100);										//Define uma altura máxima do label
		label9.setGraphic(imgv9);										//Adiciona a ImageView ao Label
		label9.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
	        public void handle(MouseEvent arg0) {
				if(label9.getGraphic() == imgv9) {
					if(Globais.getJogadorAtivo() % 2 == 0) {
						label9.setGraphic(imgv9x);
					}
					else {
						label9.setGraphic(imgv9o);
					}
					
					confirmarVencedor();
					
					if(Globais.getVencedor() == 0) {
						Globais.setJogadorAtivo(Globais.getJogadorAtivo() + 1);
					}
					else {
						janelaTicTacToe.close();
						registarJogo();						
					}
				}
			}
		});
		//Button btnClose = new Button("Fechar");						//Cria botão para fechar janela
		//btnClose.setOnAction(e -> janelaTicTacToe.close());			//Ação fecha esta janela
		
		//GridPane grid;
		//VBox layout = new VBox(10);									//Layout vertical com 10px entre células
		
		//Cria o layout do tipo grid e adiciona os labels ao layout
		GridPane layout = new GridPane();
		layout.add(label1, 0, 0);
		layout.add(label2, 1, 0);
		layout.add(label3, 2, 0);
		layout.add(label4, 0, 1);
		layout.add(label5, 1, 1);
		layout.add(label6, 2, 1);
		layout.add(label7, 0, 2);
		layout.add(label8, 1, 2);
		layout.add(label9, 2, 2);
		
		//layout.getChildren().addAll(mensagem, btnClose);				//Adiciona Label e Button ao layout
		/*layout.getChildren().addAll(
				mensagem1, 
				mensagem2, 
				mensagem3, 
				mensagem4, 
				mensagem5, 
				mensagem6, 
				mensagem7, 
				mensagem8, 
				mensagem9);*/											//Adiciona Label e Button ao layout
		layout.setAlignment(Pos.CENTER);								//Alinhar os conteudos ao Centros
		
		VBox layoutPlayers = new VBox();
		layoutPlayers.setAlignment(Pos.TOP_CENTER);
		Label labelPlayer1 = new Label("Player1: " + Globais.getUsernameUtilizadorAtivo() + " - X");
		Label labelPlayer2 = new Label("Player2: " + Globais.getUsernameUtilizadorConvidado() + " - O");
		
		layoutPlayers.getChildren().addAll(labelPlayer1, labelPlayer2);
		
		BorderPane layoutRoot = new BorderPane();
		layoutRoot.setTop(layoutPlayers);
		layoutRoot.setCenter(layout);
		
		
		Scene scene = new Scene(layoutRoot);								//Criar a Scene e associa o Layout
		janelaTicTacToe.setScene(scene);								//Associa a Scena 
		janelaTicTacToe.showAndWait();									//Executa e prende o controlo até ser fechada
				
	}

	//Confirma se há ou não vencedor a cada jogada
	public static void confirmarVencedor() {		
		//Testa as 3 colunas (vertical) para ver se o jogador x ganhar o jogo
		//Testa na 1ªColuna
		if(label1.getGraphic() == imgv1x && label4.getGraphic() == imgv4x && label7.getGraphic() == imgv7x) {
			Globais.setVencedor(1);
		}
		//Testa na 2ªColuna
		else if (label2.getGraphic() == imgv2x && label5.getGraphic() == imgv5x && label8.getGraphic() == imgv8x) {
			Globais.setVencedor(1);
		}
		//Testa na 3ªColuna
		else if (label3.getGraphic() == imgv3x && label6.getGraphic() == imgv6x && label9.getGraphic() == imgv9x) {
			Globais.setVencedor(1);
		}
		//Testa as 3 linhas (horizontal) para ver se o jogador x ganhar o jogo
		//Testa na 1ªLinha
		if(label1.getGraphic() == imgv1x && label2.getGraphic() == imgv2x && label3.getGraphic() == imgv3x) {
			Globais.setVencedor(1);
		}
		//Testa na 2ªLinha
		else if (label4.getGraphic() == imgv4x && label5.getGraphic() == imgv5x && label6.getGraphic() == imgv6x) {
			Globais.setVencedor(1);
		}
		//Testa na 3ªLinha
		else if (label7.getGraphic() == imgv7x && label8.getGraphic() == imgv8x && label9.getGraphic() == imgv9x) {
			Globais.setVencedor(1);
		}
		//Testa as 2 linhas diagonais para ver se o jogador x ganhar o jogo
		//Testa na 1ªDiagonal
		if(label1.getGraphic() == imgv1x && label5.getGraphic() == imgv5x && label9.getGraphic() == imgv9x) {
			Globais.setVencedor(1);
		}
		//Testa na 2ªDiagonal
		else if (label3.getGraphic() == imgv3x && label5.getGraphic() == imgv5x && label7.getGraphic() == imgv7x) {
			Globais.setVencedor(1);
		}
				
		//Testa as 3 colunas (vertical) para ver se o jogador o ganhar o jogo
		//Testa na 1ªColuna
		if(label1.getGraphic() == imgv1o && label4.getGraphic() == imgv4o && label7.getGraphic() == imgv7o) {
			Globais.setVencedor(2);
		}
		//Testa na 2ªColuna
		else if (label2.getGraphic() == imgv2o && label5.getGraphic() == imgv5o && label8.getGraphic() == imgv8o) {
			Globais.setVencedor(2);
		}
		//Testa na 3ªColuna
		else if (label3.getGraphic() == imgv3o && label6.getGraphic() == imgv6o && label9.getGraphic() == imgv9o) {
			Globais.setVencedor(2);
		}
		//Testa as 3 linhas (horizontal) para ver se o jogador o ganhar o jogo
		//Testa na 1ªLinha
		if(label1.getGraphic() == imgv1o && label2.getGraphic() == imgv2o && label3.getGraphic() == imgv3o) {
			Globais.setVencedor(2);
		}
		//Testa na 2ªLinha
		else if (label4.getGraphic() == imgv4o && label5.getGraphic() == imgv5o && label6.getGraphic() == imgv6o) {
			Globais.setVencedor(2);
		}
		//Testa na 3ªLinha
		else if (label7.getGraphic() == imgv7o && label8.getGraphic() == imgv8o && label9.getGraphic() == imgv9o) {
			Globais.setVencedor(2);
		}
		//Testa as 2 linhas diagonais para ver se o jogador o ganhar o jogo
		//Testa na 1ªDiagonal
		if(label1.getGraphic() == imgv1o && label5.getGraphic() == imgv5o && label9.getGraphic() == imgv9o) {
			Globais.setVencedor(2);
		}
		//Testa na 2ªDiagonal
		else if (label3.getGraphic() == imgv3o && label5.getGraphic() == imgv5o && label7.getGraphic() == imgv7o) {
			Globais.setVencedor(2);
		}
		
		//Se há empate, todas as casas têm um x ou um o mas não há uma sequência de 3 casas com o mesmo símbolo
		else if(label1.getGraphic() != imgv1 && 
				label2.getGraphic() != imgv2 && 
				label3.getGraphic() != imgv3 && 
				label4.getGraphic() != imgv4 && 
				label5.getGraphic() != imgv5 && 
				label6.getGraphic() != imgv6 && 
				label7.getGraphic() != imgv7 && 
				label8.getGraphic() != imgv8 && 
				label9.getGraphic() != imgv9){
			Globais.setVencedor(3);
		}
	}
	
	//Regista o jogo depois de ter acabo
	public static void registarJogo() {
		//Verifica o vencedor
		//Se o jogador x ganhou
		if(Globais.getVencedor() == 1) {
			//Cria o registo do jogo
			Globais.listaJogos.add(new Jogo(Globais.listaJogos.size() + 1, Globais.getCodUtilizadorAtivo(), Globais.getCodUtilizadorConvidado(), Globais.getUsernameUtilizadorAtivo(), Globais.getUsernameUtilizadorConvidado(), "Player1 Ganhou"));
			alertBox("Match", "Player1 Ganhou!");
			
			//Player1
			
			//Estrutura de controlo para inserir a vitótia na conta do utilizador ativo caso seja jogador
			for(i = 0; i < Globais.listaJogadores.size(); i++) {
				if(Globais.listaJogadores.get(i).getCodJogador() == Globais.getCodUtilizadorAtivo() &&
				   Globais.listaJogadores.get(i).getUsername().equals(Globais.getUsernameUtilizadorAtivo())) {
					Globais.listaJogadores.get(i).setNumVitorias(Globais.listaJogadores.get(i).getNumVitorias() + 1);
				}					
			}
			//Estrutura de controlo para inserir a vitória na conta do utilizador ativo caso seja administrador
			for(i = 0; i < Globais.listaAdministradores.size(); i++) {
				if(Globais.listaAdministradores.get(i).getCodAdmin() == Globais.getCodUtilizadorAtivo() &&
				   Globais.listaAdministradores.get(i).getUsername().equals(Globais.getUsernameUtilizadorAtivo())) {
					Globais.listaAdministradores.get(i).setNumVitorias(Globais.listaAdministradores.get(i).getNumVitorias() + 1);
				}	
			}
			
			//Player2

			//Estrutura de controlo para inserir a derrota na conta do utilizador convidado caso seja jogador
			for(i = 0; i < Globais.listaJogadores.size(); i++) {
				if(Globais.listaJogadores.get(i).getCodJogador() == Globais.getCodUtilizadorConvidado() &&
				   Globais.listaJogadores.get(i).getUsername().equals(Globais.getUsernameUtilizadorConvidado())) {
					Globais.listaJogadores.get(i).setNumDerrotas(Globais.listaJogadores.get(i).getNumDerrotas() + 1);
				}					
			}
			//Estrutura de controlo para inserir a derrota na conta do utilizador convidado caso seja administrador
			for(i = 0; i < Globais.listaAdministradores.size(); i++) {
				if(Globais.listaAdministradores.get(i).getCodAdmin() == Globais.getCodUtilizadorConvidado() &&
				   Globais.listaAdministradores.get(i).getUsername().equals(Globais.getUsernameUtilizadorConvidado())) {
					Globais.listaAdministradores.get(i).setNumDerrotas(Globais.listaAdministradores.get(i).getNumDerrotas() + 1);
				}	
			}
		}
		//Se o jogador o ganhou
		else if(Globais.getVencedor() == 2) {
			//Cria o registo do jogo
			Globais.listaJogos.add(new Jogo(Globais.listaJogos.size() + 1, Globais.getCodUtilizadorAtivo(), Globais.getCodUtilizadorConvidado(), Globais.getUsernameUtilizadorAtivo(), Globais.getUsernameUtilizadorConvidado(), "Player2 Ganhou"));
			alertBox("Match", "Player2 Ganhou!");
			
			//Player1
			
			//Estrutura de controlo para inserir a derrota na conta do utilizador ativo caso seja jogador
			for(i = 0; i < Globais.listaJogadores.size(); i++) {
				if(Globais.listaJogadores.get(i).getCodJogador() == Globais.getCodUtilizadorAtivo() &&
				   Globais.listaJogadores.get(i).getUsername().equals(Globais.getUsernameUtilizadorAtivo())) {
					Globais.listaJogadores.get(i).setNumDerrotas(Globais.listaJogadores.get(i).getNumDerrotas() + 1);
				}					
			}
			//Estrutura de controlo para inserir a derrota na conta do utilizador ativo caso seja administrador
			for(i = 0; i < Globais.listaAdministradores.size(); i++) {
				if(Globais.listaAdministradores.get(i).getCodAdmin() == Globais.getCodUtilizadorAtivo() &&
				   Globais.listaAdministradores.get(i).getUsername().equals(Globais.getUsernameUtilizadorAtivo())) {
					Globais.listaAdministradores.get(i).setNumDerrotas(Globais.listaAdministradores.get(i).getNumDerrotas() + 1);
				}	
			}
			
			//Player2
			
			//Estrutura de controlo para inserir a vitótia na conta do utilizador convidado caso seja jogador
			for(i = 0; i < Globais.listaJogadores.size(); i++) {
				if(Globais.listaJogadores.get(i).getCodJogador() == Globais.getCodUtilizadorConvidado() &&
				   Globais.listaJogadores.get(i).getUsername().equals(Globais.getUsernameUtilizadorConvidado())) {
					Globais.listaJogadores.get(i).setNumVitorias(Globais.listaJogadores.get(i).getNumVitorias() + 1);
				}					
			}
			//Estrutura de controlo para inserir a vitória na conta do utilizador convidado caso seja administrador
			for(i = 0; i < Globais.listaAdministradores.size(); i++) {
				if(Globais.listaAdministradores.get(i).getCodAdmin() == Globais.getCodUtilizadorConvidado() &&
				   Globais.listaAdministradores.get(i).getUsername().equals(Globais.getUsernameUtilizadorConvidado())) {
					Globais.listaAdministradores.get(i).setNumVitorias(Globais.listaAdministradores.get(i).getNumVitorias() + 1);
				}	
			}
		}
		//Se houve empate
		else if(Globais.getVencedor() == 3) {
			//Cria o registo do jogo
			Globais.listaJogos.add(new Jogo(Globais.listaJogos.size() + 1, Globais.getCodUtilizadorAtivo(), Globais.getCodUtilizadorConvidado(), Globais.getUsernameUtilizadorAtivo(), Globais.getUsernameUtilizadorConvidado(), "Empate"));
			alertBox("Match", "Empate!");
			
			//Player1
			
			//Estrutura de controlo para inserir o empate na conta do utilizador ativo caso seja jogador
			for(i = 0; i < Globais.listaJogadores.size(); i++) {
				if(Globais.listaJogadores.get(i).getCodJogador() == Globais.getCodUtilizadorAtivo() &&
				   Globais.listaJogadores.get(i).getUsername().equals(Globais.getUsernameUtilizadorAtivo())) {
					Globais.listaJogadores.get(i).setNumEmpates(Globais.listaJogadores.get(i).getNumEmpates() + 1);
				}					
			}
			//Estrutura de controlo para inserir o empate na conta do utilizador ativo caso seja administrador
			for(i = 0; i < Globais.listaAdministradores.size(); i++) {
				if(Globais.listaAdministradores.get(i).getCodAdmin() == Globais.getCodUtilizadorAtivo() &&
				   Globais.listaAdministradores.get(i).getUsername().equals(Globais.getUsernameUtilizadorAtivo())) {
					Globais.listaAdministradores.get(i).setNumEmpates(Globais.listaAdministradores.get(i).getNumEmpates() + 1);
				}	
			}
			
			//Player2
			
			//Estrutura de controlo para inserir o empate na conta do utilizador convidado caso seja jogador
			for(i = 0; i < Globais.listaJogadores.size(); i++) {
				if(Globais.listaJogadores.get(i).getCodJogador() == Globais.getCodUtilizadorConvidado() &&
				   Globais.listaJogadores.get(i).getUsername().equals(Globais.getUsernameUtilizadorConvidado())) {
					Globais.listaJogadores.get(i).setNumEmpates(Globais.listaJogadores.get(i).getNumEmpates() + 1);
				}					
			}
			//Estrutura de controlo para inserir o empate na conta do utilizador convidado caso seja administrador
			for(i = 0; i < Globais.listaAdministradores.size(); i++) {
				if(Globais.listaAdministradores.get(i).getCodAdmin() == Globais.getCodUtilizadorConvidado() &&
				   Globais.listaAdministradores.get(i).getUsername().equals(Globais.getUsernameUtilizadorConvidado())) {
					Globais.listaAdministradores.get(i).setNumEmpates(Globais.listaAdministradores.get(i).getNumEmpates() + 1);
				}
			}
		}
		
		Globais.setVencedor(0);			//Dá reset ao vencedor
		
		Globais.setJogadorAtivo(0);		//Dá reset ao jogador activo
	}
	
	//Janela que apresenta a criação de uma conta de jogador
	public static void criarContaJogador(){ //Static para não ser instanciada
		//Janela criar conta
		Stage janelaCriacaoContaJogadorNoLogin = new Stage();							//Cria uma window
		//janelaLogin.initModality(Modality.APPLICATION_MODAL);							//Define uma janelaLogin Modal
		janelaCriacaoContaJogadorNoLogin.initModality(Modality.APPLICATION_MODAL);		//Define uma janelaLogin Modal
		janelaCriacaoContaJogadorNoLogin.setTitle("Criar Conta"); 						//Como título, recebe a string do parametro
		janelaCriacaoContaJogadorNoLogin.setMinWidth(500);								//Largura da janelaLogin
		janelaCriacaoContaJogadorNoLogin.setMaxWidth(500);
		janelaCriacaoContaJogadorNoLogin.setMinHeight(300);
		janelaCriacaoContaJogadorNoLogin.setMaxHeight(300);
		
		//layout 
		GridPane layout = new GridPane();
		//Labels
		Label labelUserName = new Label("Username: ");
		Label labelPassword = new Label("Password: ");
		//TextFields
		TextField textFieldUserName = new TextField();
		PasswordField passwordFieldPassword = new PasswordField();
		
		Button btnOk = new Button("OK");							//Cria botão para fazer login
		btnOk.setOnAction(e -> {
			
			//Dá reset ao valor de verificação da criação de conta
			criacaoNegada = false;
			
			if(textFieldUserName.getText().equals("") || passwordFieldPassword.getText().equals("")) {
				alertBox("Erro", "Um ou mais campos nulos!");
			}
			else {
				//Estrutura de controlo para verificar se o username e password estão na lista de jogadores
				for(i = 0; i < Globais.listaJogadores.size(); i++) {
					if(Globais.listaJogadores.get(i).getUsername().equals(textFieldUserName.getText())) {
						criacaoNegada = true;
					}
				}
				//System.out.println(textFieldUserName.getText());
				//System.out.println(passwordFieldPassword.getText());
				//Estrutura de controlo para verificar se o username e password estão na lista de administradores
				for(i = 0; i < Globais.listaAdministradores.size(); i++) {
					if(Globais.listaAdministradores.get(i).getUsername().equals(textFieldUserName.getText())) {
						criacaoNegada = true;
					}
				}
				//Estrutura de controlo para verificar se o username e password estão na lista de parametrizadores
				for(i = 0; i < Globais.listaParametrizadores.size(); i++) {
					if(Globais.listaParametrizadores.get(i).getUsername().equals(textFieldUserName.getText())) {
						criacaoNegada = true;
					}
				}
			}
			
			if(criacaoNegada == false) {
				Globais.listaJogadores.add(new Jogador(Globais.listaJogadores.size() + 1, textFieldUserName.getText(), passwordFieldPassword.getText(), 0, 0, 0));
			}
			else {
				alertBox("Erro", "Conta de utilizador não disponível!");
			}
			
			janelaCriacaoContaJogadorNoLogin.close();
			
		});
		//Adicionar à Grid os botoes, label e textfields-----------------------------
		layout.add(labelUserName, 0, 0);
		layout.add(textFieldUserName, 1, 0);
		layout.add(labelPassword, 0, 2);
		layout.add(passwordFieldPassword, 1,2);
		layout.add(btnOk, 0, 3);
		layout.setAlignment(Pos.CENTER);
		
		//SCENE
		Scene scene = new Scene(layout);						//Criar a Scene e associa o Layout
		janelaCriacaoContaJogadorNoLogin.setScene(scene);		//Associa a Scena 
		janelaCriacaoContaJogadorNoLogin.showAndWait();			//Executa e prende o controlo até ser fechada
	}
	
	//Janela que apresenta a criação de uma conta de jogador
	public static void criarContaJogadorParametrizador(){ //Static para não ser instanciada
		//Janela criar conta
		Stage janelaCriacaoContaJogadorParametrizadorNoLogin = new Stage();							//Cria uma window
		//janelaLogin.initModality(Modality.APPLICATION_MODAL);										//Define uma janelaLogin Modal
		janelaCriacaoContaJogadorParametrizadorNoLogin.initModality(Modality.APPLICATION_MODAL);	//Define uma janelaLogin Modal
		janelaCriacaoContaJogadorParametrizadorNoLogin.setTitle("Criar Conta"); 					//Como título, recebe a string do parametro
		janelaCriacaoContaJogadorParametrizadorNoLogin.setMinWidth(500);							//Largura da janelaLogin
		janelaCriacaoContaJogadorParametrizadorNoLogin.setMaxWidth(500);
		janelaCriacaoContaJogadorParametrizadorNoLogin.setMinHeight(300);
		janelaCriacaoContaJogadorParametrizadorNoLogin.setMaxHeight(300);
		
		//layout 
		GridPane layout = new GridPane();
		//Labels
		Label labelUserName = new Label("Username: ");
		Label labelPassword = new Label("Password: ");
		//TextFields
		TextField textFieldUserName = new TextField();
		PasswordField passwordFieldPassword = new PasswordField();
		
		ComboBox<String> comboBox = new ComboBox<>();	//Criar checkbox com label
		
		comboBox.getItems().add("Jogador");
		comboBox.getItems().add("Parametrizador");
		
		comboBox.setPromptText("Escolha uma opção:");
		
		Button btnOk = new Button("OK");							//Cria botão para fazer login
		btnOk.setOnAction(e -> {
			
			//Dá reset ao valor de verificação da criação de conta
			criacaoNegada = false;
			
			if(textFieldUserName.getText().equals("") || passwordFieldPassword.getText().equals("")) {
				alertBox("Erro", "Um ou mais campos nulos!");
				criacaoNegada = true;
			}
			else {
				//Estrutura de controlo para verificar se o username e password estão na lista de jogadores
				for(i = 0; i < Globais.listaJogadores.size(); i++) {
					if(Globais.listaJogadores.get(i).getUsername().equals(textFieldUserName.getText())) {
						criacaoNegada = true;
					}
				}

				//Estrutura de controlo para verificar se o username e password estão na lista de administradores
				for(i = 0; i < Globais.listaAdministradores.size(); i++) {
					if(Globais.listaAdministradores.get(i).getUsername().equals(textFieldUserName.getText())) {
						criacaoNegada = true;
					}
				}
				//Estrutura de controlo para verificar se o username e password estão na lista de parametrizadores
				for(i = 0; i < Globais.listaParametrizadores.size(); i++) {
					if(Globais.listaParametrizadores.get(i).getUsername().equals(textFieldUserName.getText())) {
						criacaoNegada = true;
					}
				}
			}
			
			if(criacaoNegada == false) {
				if(comboBox.getValue() == "Jogador") {
					Globais.listaJogadores.add(new Jogador(Globais.listaJogadores.size() + 1, textFieldUserName.getText(), passwordFieldPassword.getText(), 0, 0, 0));
				}
				else if(comboBox.getValue() == "Parametrizador") {
					Globais.listaParametrizadores.add(new Parametrizador(Globais.listaParametrizadores.size() + 1, textFieldUserName.getText(), passwordFieldPassword.getText()));
				}
				else {
					alertBox("Erro", "Não escolheu o tipo de utilizador!");
					criacaoNegada = true;
				}
			}
			else {
				alertBox("Erro", "Conta de utilizador não disponível!");
			}
			
			janelaCriacaoContaJogadorParametrizadorNoLogin.close();
			
		});
		
		//Adicionar à Grid os botoes, label e textfields-----------------------------
		layout.add(labelUserName, 0, 0);
		layout.add(textFieldUserName, 1, 0);
		layout.add(labelPassword, 0, 2);
		layout.add(passwordFieldPassword, 1,2);
		layout.add(btnOk, 0, 3);
		layout.add(comboBox, 1, 3);
		layout.setAlignment(Pos.CENTER);
		
		//SCENE
		Scene scene = new Scene(layout);									//Criar a Scene e associa o Layout
		janelaCriacaoContaJogadorParametrizadorNoLogin.setScene(scene);		//Associa a Scena 
		janelaCriacaoContaJogadorParametrizadorNoLogin.showAndWait();		//Executa e prende o controlo até ser fechada
	}
	
	//Janela que apresenta um menu para o utilizador pedir a devolução dos dados da conta
	public static void recuperarConta(){ //Static para não ser instanciada
		//Janela login
		Stage janelaLoginRecConta = new Stage();							//Cria uma window
		//janelaLogin.initModality(Modality.APPLICATION_MODAL);				//Define uma janelaLogin Modal
		janelaLoginRecConta.initModality(Modality.APPLICATION_MODAL);		//Define uma janelaLogin Modal
		janelaLoginRecConta.setTitle("Log In"); 							//Como título, recebe a string do parametro
		janelaLoginRecConta.setMinWidth(500);								//Largura da janelaLogin
		janelaLoginRecConta.setMaxWidth(500);
		janelaLoginRecConta.setMinHeight(300);
		janelaLoginRecConta.setMaxHeight(300);
		
		//layout 
		GridPane layout = new GridPane();
		//Labels
		Label labelUserName = new Label("Username: ");
		//TextFields
		TextField textFieldUserName = new TextField();
		
		Button btnOk = new Button("OK");							//Cria botão para fazer login
		btnOk.setOnAction(e -> {
			if(textFieldUserName.getText().equals("")) {
				alertBox("Erro", "Não introduziu username!");
			}
			else {
				recNegada = true;
				
				//Estrutura de controlo para verificar se o username e password estão na lista de jogadores
				for(i = 0; i < Globais.listaJogadores.size(); i++) {
					if(Globais.listaJogadores.get(i).getUsername().equals(textFieldUserName.getText())) {
						recNegada = false;
						Globais.listaRecContas.add(new Recuperacao(Globais.listaRecContas.size() + 1, Globais.listaJogadores.get(i).getCodJogador(),textFieldUserName.getText(), Globais.listaJogadores.get(i).getPassword()));
					}
				}
				
				if(recNegada == true) {
					alertBox("Erro", "Utilizador não existe!");
				}
			}
			
			janelaLoginRecConta.close();
		});
		
		//Adicionar à Grid os botoes, label e textfields-----------------------------
		layout.add(labelUserName, 0, 0);
		layout.add(textFieldUserName, 1, 0);
		layout.add(btnOk, 0, 1);
		layout.setAlignment(Pos.CENTER);
		
		//SCENE
		Scene scene = new Scene(layout);								//Criar a Scene e associa o Layout
		janelaLoginRecConta.setScene(scene);							//Associa a Scena 
		janelaLoginRecConta.showAndWait();								//Executa e prende o controlo até ser fechada
	}
	
	//Janela que apresenta a criação de uma conta de jogador
	public static void inserirVarLimites(){ //Static para não ser instanciada
		//Janela criar conta
		Stage janelaInserirVarLimites = new Stage();							//Cria uma window
		//janelaLogin.initModality(Modality.APPLICATION_MODAL);										//Define uma janelaLogin Modal
		janelaInserirVarLimites.initModality(Modality.APPLICATION_MODAL);	//Define uma janelaLogin Modal
		janelaInserirVarLimites.setTitle("Criar Conta"); 					//Como título, recebe a string do parametro
		janelaInserirVarLimites.setMinWidth(500);							//Largura da janelaLogin
		janelaInserirVarLimites.setMaxWidth(500);
		janelaInserirVarLimites.setMinHeight(300);
		janelaInserirVarLimites.setMaxHeight(300);
		
		//layout 
		GridPane layout = new GridPane();
		//Labels
		Label labelVariavel = new Label("Nome: ");
		Label labelLimMax = new Label("Máximo: ");
		Label labelLimMin = new Label("Mínimo: ");
		//TextFields
		TextField textFieldVariavel = new TextField();
		TextField textFieldLimMax = new TextField();
		TextField textFieldLimMin = new TextField();
		
		ComboBox<String> comboBox = new ComboBox<>();	//Criar checkbox com label
		
		comboBox.getItems().add("Alerta");
		comboBox.getItems().add("Funcional");
		
		comboBox.setPromptText("Escolha o tipo:");
		
		Button btnOk = new Button("OK");							//Cria botão para fazer login
		btnOk.setOnAction(e -> {
			
			//Dá reset ao valor de verificação da criação de conta
			criacaoNegada = false;
			
			if(textFieldVariavel.getText().equals("") || textFieldLimMax.getText().equals("") || textFieldLimMin.getText().equals("")) {
				alertBox("Erro", "Um ou mais campos nulos!");
				criacaoNegada = true;
			}
			
			if(criacaoNegada == false) {
				if(comboBox.getValue() == "Alerta") {
					Globais.listaVarLimites.add(new Parametro(Globais.listaVarLimites.size() + 1, Globais.listaVarLimites.size() + 1, textFieldVariavel.getText(), "Alerta", textFieldLimMax.getText(), textFieldLimMin.getText()));
				}
				else if(comboBox.getValue() == "Funcional") {
					Globais.listaVarLimites.add(new Parametro(Globais.listaVarLimites.size() + 1, Globais.listaVarLimites.size() + 1, textFieldVariavel.getText(), "Funcional", textFieldLimMax.getText(), textFieldLimMin.getText()));
				}
				else {
					alertBox("Erro", "Não escolheu o tipo de utilizador!");
					criacaoNegada = true;
				}
			}
			
			janelaInserirVarLimites.close();
			
		});
		
		//Adicionar à Grid os botoes, label e textfields-----------------------------
		layout.add(labelVariavel, 0, 0);
		layout.add(textFieldVariavel, 1, 0);
		layout.add(labelLimMax, 0, 2);
		layout.add(textFieldLimMax, 1, 2);
		layout.add(labelLimMin, 0, 4);
		layout.add(textFieldLimMin, 1, 4);
		layout.add(btnOk, 0, 5);
		layout.add(comboBox, 1, 5);
		layout.setAlignment(Pos.CENTER);
		
		//SCENE
		Scene scene = new Scene(layout);				//Criar a Scene e associa o Layout
		janelaInserirVarLimites.setScene(scene);		//Associa a Scena 
		janelaInserirVarLimites.showAndWait();			//Executa e prende o controlo até ser fechada
	}
	
}