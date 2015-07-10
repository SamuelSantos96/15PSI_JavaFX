package application;

/* UtilsSqlConnection - Possui m�todos static para liga��o a bases de dados 
 * 	- mySqlTeste()- Testa liga��o a um SGBD MySQL, abre uma BD e fecha-a .
 * 	- mySqlQwery(String query) - Cria uma liga��o � BD e executa uma query, passada por parametro
 *  - mySqlDml(String dml) - - Cria uma liga��o � BD e executa uma dml, passada por parametro
 *  - SQLSerrverTeste()- Testa liga��o a um SGBD SQLServer.
 * 	- shutdownConnection() - Fecha a liga��o de BD
*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;



public class UtilsSQLConn {
	
	static private Connection conn = null;								// Objeto de Lica��o
	
	//static boolean ind;
	/*
	static int countJogador = 0;
	static int countJogo = 0;
	static int countParametrizador = 0;
	static int countParametro = 0;
	static int countRecuperacao = 0;
	*/
	static String MYSQL_JDBC_DRIVER  = "com.mysql.jdbc.Driver";			// Connector para o MYSQL
	static String MYSQL_DB_URL = "jdbc:mysql://localhost/tictactoe";	// url e nome da bd em MYSQL
	static String MYSQL_DB_USER = "root";								// BD user name MYSQL
	static String MYSQL_DB_PASS = "123";								// BD password MYSQL
	
	static String SQLSERVER_JDBC_DRIVER  = "com.microsoft.sqlserver.jdbc.SQLServerDriver";		// Connector para o SQLSERVER
	static String SQLSERVER_DB_URL = "jdbc:sqlserver://LX\\SQLEXPRESS;database=Tictactoe";		// url e nome da bd em SQLSERVER
	//static String SQLSERVER_DB_URL = "jdbc:sqlserver://LX\\SQLEXPRESS;database=Escola;integratedSecurity=true";	// url e nome da bd em SQLSERVER
	static String SQLSERVER_DB_USER = "sa";								// BD user name SQLSERVER
	static String SQLSERVER_DB_PASS = "123";							// BD password SQLSERVER
	
	//static boolean msgON = false;										// Ativa Mensagens de controlo
	
	/* mySqlTeste()- Cria e testa uma liga��o a um SGBD MYSQL.*/
	public static void mySqlTeste(){
		try{
			//Tenta ligar-se ao SGBD e � base de dados
			
			Class.forName(MYSQL_JDBC_DRIVER).newInstance();
			conn = DriverManager.getConnection(MYSQL_DB_URL, MYSQL_DB_USER, MYSQL_DB_PASS );
			
			//Utils.alertBox("mySqlTeste", "Base dados aberta");
			
		}
		catch(SQLException ex){							// Apanha Erro da connection ou DML
			Utils.alertBox("mySqlTeste", "Erro na liga��o");
		}
		catch(ClassNotFoundException ex){				// Apanha Erro da Class.forName()
			Utils.alertBox("mySqlTeste", "Erro no Driver");
		}
		catch(Exception ex){								// Apanha todas as restantes Exce��es
			Utils.alertBox("mySqlTeste", "Erro gen�rico na liga��o");
			ex.printStackTrace();
		}
		finally{
			// Se liga��o com sucesso, fecha-a
			shutdownConnection();			
		}
	}
	
	// Executa uma query � base de dados de um SGBD MySQL
	public static void mySqlQwery(String query){
		try{
			//Tenta ligar-se ao SGBD e � base de dados
			Class.forName(MYSQL_JDBC_DRIVER).newInstance();
			conn = DriverManager.getConnection(MYSQL_DB_URL, MYSQL_DB_USER, MYSQL_DB_PASS );
			
			//Utils.alertBox("mySqlQwery", "Base dados aberta");
			
		}
		catch(SQLException ex){							// Apanha Erro da connection ou DML
			Utils.alertBox("mySqlQwery", "Erro na liga��o");
		}
		catch(ClassNotFoundException ex){				// Apanha Erro da Class.forName()
			Utils.alertBox("mySqlQwery", "Erro no Driver");
		}
		catch(Exception ex){								// Apanha todas as restantes Exce��es
			Utils.alertBox("mySqlQwery", "Erro gen�rico na liga��o");
			ex.printStackTrace();
		}
		finally{
			try{
				// Se liga��o com sucesso, executa a query
				if(!query.isEmpty()){		// Se a query tiver comando sql
					String queryResult = "";
					Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery(query);
					while(rs.next()){
						queryResult += rs.getString(1)		// n�mero da coluna na tabela
									+", "+rs.getString(2)	// 
									+", "+rs.getString(4)+"\n";
					}
					
					Utils.alertBox("DB", queryResult);
					
				}
				shutdownConnection();
			}
			catch(SQLException ex){							// Apanha Erro da connection ou DML
				Utils.alertBox("Finally", "Erro na liga��o");
				shutdownConnection();
			}				
		}
	}
	
	/* Executa uma query � base de dados de um SGBD MySQL, para verificar a existencia de uma PK
	 * Recebe a qwery
	 * Ddevolve 1 se encontrou e 0 se n�o.
	 */
	public static boolean mySqlQweryCheckPK(String query){
		boolean foundPK = false;		
		
		try{
			//Tenta ligar-se ao SGBD e � base de dados
			Class.forName(MYSQL_JDBC_DRIVER).newInstance();
			conn = DriverManager.getConnection(MYSQL_DB_URL, MYSQL_DB_USER, MYSQL_DB_PASS );
			
			//Utils.alertBox("mySqlQweryCheckPK", "Base dados aberta");
			
		}
		catch(SQLException ex){							// Apanha Erro da connection ou DML
			Utils.alertBox("mySqlQweryCheckPK", "Erro na liga��o");
		}
		catch(ClassNotFoundException ex){				// Apanha Erro da Class.forName()
			Utils.alertBox("mySqlQweryCheckPK", "Erro no Driver");
		}
		catch(Exception ex){								// Apanha todas as restantes Exce��es
			Utils.alertBox("mySqlQweryCheckPK", "Erro gen�rico na liga��o");
			ex.printStackTrace();
		}
		finally{
			try{
				// Se liga��o com sucesso, executa a query
				if(!query.isEmpty()){		// Se a query tiver comando sql
					Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery(query);
					foundPK = rs.wasNull();
				}		
				shutdownConnection();						// fecha a liga��o
			}
			catch(SQLException ex){							// Apanha Erro da connection ou DML
				Utils.alertBox("Finally", "Erro na liga��o");
				shutdownConnection();
			}				
		}
		return foundPK;
	}
	
	
	// Executa um insert ou update ou delete para SGBD MySql.
	public static void mySqlDml(String dml){
		try{
			//Tenta ligar-se ao SGBD e � base de dados
			Class.forName(MYSQL_JDBC_DRIVER).newInstance();
			conn = DriverManager.getConnection(MYSQL_DB_URL, MYSQL_DB_USER, MYSQL_DB_PASS );
			
			//Utils.alertBox("mySqlDml", "Base dados aberta");
			
		}
		catch(SQLException ex){								// Apanha Erro da connection ou DML
			Utils.alertBox("mySqlDml", "Erro na liga��o");
		}
		catch(ClassNotFoundException ex){					// Apanha Erro da Class.forName()
			Utils.alertBox("mySqlDml", "Erro no Driver");
		}
		catch(Exception ex){								// Apanha todas as restantes Exce��es
			Utils.alertBox("mySqlDml", "Erro gen�rico na liga��o");
			ex.printStackTrace();
		}
		finally{
			try{
				// Se liga��o com sucesso, executa a dml
				if(!dml.isEmpty()){		// Se a dml tiver comando sql, executa-o
					
					Statement stmt = conn.createStatement();		// Cria um obj comando sql
					int dmlResult = stmt.executeUpdate(dml);		// Executa-o. Devolve o n� de registos tratados
					if (dmlResult > 0){								// Devolve inteiro > 0 se ok
						Utils.alertBox("DB","Comando DML OK");		// 0 ou menor, se ERRO.
					}
					else{
						
						Utils.alertBox("DB","ERRO Comando DML");
						
					}
					/*
					//Jogador
					ResultSet resJogador = stmt.executeQuery("select count(*) from jogador");
					while (resJogador.next()){
						countJogador = resJogador.getInt(1);
					}
					
					//Jogo
					ResultSet resJogo = stmt.executeQuery("select count(*) from jogar");
					while (resJogo.next()){
						countJogo = resJogo.getInt(1);
					}
					
					//Parametrizador
					ResultSet resParametrizador = stmt.executeQuery("select count(*) from parametrizador");
					while (resParametrizador.next()){
						countParametrizador = resParametrizador.getInt(1);
					}*/
				}		
				shutdownConnection();
			}
			catch(SQLException ex){							// Apanha Erro da connection ou DML
				Utils.alertBox("Finally", "Erro na liga��o");
				shutdownConnection();
			}				
		}
	}
	
	/*************************************************************************************************
	 * M�todos para carregamento das Listas de alimenta��o das TableViews. 
	 * S�o executados pelo bot�o EDITAR, eliminar, alterar ou eliminar de cada entidade
	 * Popular uma ObservableList com os dados da BD e desvolvemr � TableView
	 *************************************************************************************************/
    public static ObservableList<Jogador> carregaListaJogadores(){
    	
    	ObservableList<Jogador> listaJogadores = FXCollections.observableArrayList();

    	/* Lista para preencher com os dados da tabela de Jogadores
    	 * 	Executa uma query � tabela Jogadores e para cada registo, 
    	 * 		1 Extrai os 6 atributos: codJogador, username, password, numVitorias, numDerrotas, numEmpates
    	 *  	2 Adiciona � lista
    	 *  Devolve a lista � TableView para desenhar a lista de Jogadores
    	 */

    	try{
			//Tenta ligar-se ao SGBD e � base de dados
			Class.forName(MYSQL_JDBC_DRIVER).newInstance();
			conn = DriverManager.getConnection(MYSQL_DB_URL, MYSQL_DB_USER, MYSQL_DB_PASS );
			
			//Utils.alertBox("carregaListaJogadores", "Base dados aberta");
			
		}
		catch(SQLException ex){							// Apanha Erro da connection ou DML
			Utils.alertBox("carregaListaJogadores", "Erro na liga��o");
			return null;
		}
		catch(ClassNotFoundException ex){				// Apanha Erro da Class.forName()
			Utils.alertBox("carregaListaJogadores", "Erro no Driver");
			return null;
		}
		catch(Exception ex){								// Apanha todas as restantes Exce��es
			Utils.alertBox("carregaListaJogadores", "Erro gen�rico na liga��o");
			ex.printStackTrace();
			return null;
		}
		finally{
			try{
				// Se liga��o com sucesso, executa a query
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("Select * from jogador");
				
				// Para cada registo existente na Query rs,
				while(rs.next()){					
					Jogador a = new Jogador();			// Cria um novo jogador
					a.setCodJogador(rs.getInt(1));		// Copia o dado da coluna 1 (codJogador) para a
					a.setUsername(rs.getString(2));		// Extrai o dado da coluna 2 (username) para a
					a.setPassword(rs.getString(3));		// Extrai o dado da coluna 3 (password) para a
					a.setNumVitorias(rs.getInt(4));		// Copia o dado da coluna 4 (numVitorias) para a
					a.setNumDerrotas(rs.getInt(5));		// Extrai o dado da coluna 5 (numDerrotas) para a
					a.setNumEmpates(rs.getInt(6));		// Extrai o dado da coluna 6 (numEmpates) para a
					a.setCarimbo(rs.getBoolean(8));		// Extrai o dado da coluna 8 (carimbo) para a
					listaJogadores.add(a);				// Adiciona-o � lista.
					
					//Alternativa: uma unica linha, usando o contrutor de Aluno
					//ex:listaAlunos.add(new Aluno(rs.getInt(1), rs.getInt(2), rs.getString(4)));
				}
				
				//Utils.alertBox("carregaListaJogadores", "Lista Construida");
				
				shutdownConnection();
			}
			catch(SQLException ex){							// Apanha Erro da connection ou DML
				Utils.alertBox("carregaListaJogadores", "Finally - Erro na liga��o");
				shutdownConnection();
				return null;
			}	
		}
    	return listaJogadores;
    }

    /*************************************************************************************************
	 * M�todos para carregamento das Listas de alimenta��o das TableViews. 
	 * S�o executados pelo bot�o EDITAR, eliminar, alterar ou eliminar de cada entidade
	 * Popular uma ObservableList com os dados da BD e desvolvemr � TableView
	 *************************************************************************************************/
    public static ObservableList<Parametrizador> carregaListaParametrizador(){
    	
    	ObservableList<Parametrizador> listaParametrizadores = FXCollections.observableArrayList();

    	/* Lista para preencher com os dados da tabela de Parametrizadores
    	 * 	Executa uma query � tabela Parametrizadores e para cada registo, 
    	 * 		1 Extrai os 3 atributos: codParametrizador, username, password
    	 *  	2 Adiciona � lista
    	 *  Devolve a lista � TableView para desenhar a lista de Parametrizadores
    	 */

    	try{
			//Tenta ligar-se ao SGBD e � base de dados
			Class.forName(MYSQL_JDBC_DRIVER).newInstance();
			conn = DriverManager.getConnection(MYSQL_DB_URL, MYSQL_DB_USER, MYSQL_DB_PASS );
			
			//Utils.alertBox("carregaListaParametrizador", "Base dados aberta");
			
		}
		catch(SQLException ex){							// Apanha Erro da connection ou DML
			Utils.alertBox("carregaListaParametrizador", "Erro na liga��o");
			return null;
		}
		catch(ClassNotFoundException ex){				// Apanha Erro da Class.forName()
			Utils.alertBox("carregaListaParametrizador", "Erro no Driver");
			return null;
		}
		catch(Exception ex){								// Apanha todas as restantes Exce��es
			Utils.alertBox("carregaListaParametrizador", "Erro gen�rico na liga��o");
			ex.printStackTrace();
			return null;
		}
		finally{
			try{
				// Se liga��o com sucesso, executa a query
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("Select * from parametrizador");
				
				// Para cada registo existente na Query rs,
				while(rs.next()){					
					Parametrizador a = new Parametrizador();	// Cria um novo parametrizador
					a.setCodParametrizador(rs.getInt(1));		// Copia o dado da coluna 1 (codParametrizador) para a
					a.setUsername(rs.getString(2));				// Extrai o dado da coluna 2 (username) para a
					a.setPassword(rs.getString(3));				// Extrai o dado da coluna 3 (password) para a
					a.setCarimbo(rs.getBoolean(5));				// Extrai o dado da coluna 5 (carimbo) para a
					listaParametrizadores.add(a);				// Adiciona-o � lista.
					
					//Alternativa: uma unica linha, usando o contrutor de Aluno
					//ex:listaAlunos.add(new Aluno(rs.getInt(1), rs.getInt(2), rs.getString(4)));
				}
				
				//Utils.alertBox("carregaListaParametrizador", "Lista Construida");
				
				shutdownConnection();
			}
			catch(SQLException ex){							// Apanha Erro da connection ou DML
				Utils.alertBox("carregaListaParametrizador", "Finally - Erro na liga��o");
				shutdownConnection();
				return null;
			}	
		}
    	return listaParametrizadores;
    }
    
    /*************************************************************************************************
	 * M�todos para carregamento das Listas de alimenta��o das TableViews. 
	 * S�o executados pelo bot�o EDITAR, eliminar, alterar ou eliminar de cada entidade
	 * Popular uma ObservableList com os dados da BD e desvolvemr � TableView
	 *************************************************************************************************/
    public static ObservableList<Jogo> carregaListaJogos(){
    	
    	ObservableList<Jogo> listaJogos = FXCollections.observableArrayList();

    	/* Lista para preencher com os dados da tabela de Jogos
    	 * 	Executa uma query � tabela Parametrizadores e para cada registo, 
    	 * 		1 Extrai os 7 atributos: codJogo, codJogador1, codJogador2, usernameJogador1, usernameJogador2, passwordJogador1, passwordJogador2, resultado
    	 *  	2 Adiciona � lista
    	 *  Devolve a lista � TableView para desenhar a lista de Jogos
    	 */

    	try{
			//Tenta ligar-se ao SGBD e � base de dados
			Class.forName(MYSQL_JDBC_DRIVER).newInstance();
			conn = DriverManager.getConnection(MYSQL_DB_URL, MYSQL_DB_USER, MYSQL_DB_PASS );
			
			//Utils.alertBox("carregaListaJogos", "Base dados aberta");
			
		}
		catch(SQLException ex){							// Apanha Erro da connection ou DML
			Utils.alertBox("carregaListaJogos", "Erro na liga��o");
			return null;
		}
		catch(ClassNotFoundException ex){				// Apanha Erro da Class.forName()
			Utils.alertBox("carregaListaJogos", "Erro no Driver");
			return null;
		}
		catch(Exception ex){								// Apanha todas as restantes Exce��es
			Utils.alertBox("carregaListaJogos", "Erro gen�rico na liga��o");
			ex.printStackTrace();
			return null;
		}
		finally{
			try{
				// Se liga��o com sucesso, executa a query
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("Select * from jogar");
				
				// Para cada registo existente na Query rs,
				while(rs.next()){					
					Jogo a = new Jogo();						// Cria um novo jogo
					a.setCodJogo(rs.getInt(1));					// Copia o dado da coluna 1 (codJogo) para a
					a.setCodJogador1(rs.getInt(3));				// Extrai o dado da coluna 3 (codJogador1) para a
					a.setCodJogador2(rs.getInt(4));				// Extrai o dado da coluna 4 (codJogador) para a
					a.setUsernameJogador1(rs.getString(5));		// Copia o dado da coluna 5 (usernameJogador1) para a
					a.setUsernameJogador2(rs.getString(6));		// Extrai o dado da coluna 6 (usernameJogador2) para a
					a.setPasswordJogador1(rs.getString(7));		// Extrai o dado da coluna 7 (passwordJogador1) para a
					a.setPasswordJogador2(rs.getString(8));		// Copia o dado da coluna 8 (passwordJogador2) para a
					a.setResultado(rs.getString(15));			// Copia o dado da coluna 15 (resultado) para a
					a.setCarimbo(rs.getBoolean(16));			// Extrai o dado da coluna 16 (carimbo) para a
					listaJogos.add(a);							// Adiciona-o � lista.
					
					//Alternativa: uma unica linha, usando o contrutor de Aluno
					//ex:listaAlunos.add(new Aluno(rs.getInt(1), rs.getInt(2), rs.getString(4)));
				}
				
				//Utils.alertBox("carregaListaJogos", "Lista Construida");
				
				shutdownConnection();
			}
			catch(SQLException ex){							// Apanha Erro da connection ou DML
				Utils.alertBox("carregaListaJogos", "Finally - Erro na liga��o");
				shutdownConnection();
				return null;
			}	
		}
    	return listaJogos;
    }
    
    /*************************************************************************************************
	 * M�todos para carregamento das Listas de alimenta��o das TableViews. 
	 * S�o executados pelo bot�o EDITAR, eliminar, alterar ou eliminar de cada entidade
	 * Popular uma ObservableList com os dados da BD e desvolvemr � TableView
	 *************************************************************************************************/
    public static ObservableList<Parametro> carregaListaVarLimites(){
    	
    	ObservableList<Parametro> listaVarLimites = FXCollections.observableArrayList();

    	/* Lista para preencher com os dados da tabela de Parametro
    	 * 	Executa uma query � tabela Parametro e para cada registo, 
    	 * 		1 Extrai os 7 atributos: cordParametro, codVar, variavel, tipovariavel, limiteMin, limiteMax
    	 *  	2 Adiciona � lista
    	 *  Devolve a lista � TableView para desenhar a lista de Parametro
    	 */

    	try{
			//Tenta ligar-se ao SGBD e � base de dados
			Class.forName(MYSQL_JDBC_DRIVER).newInstance();
			conn = DriverManager.getConnection(MYSQL_DB_URL, MYSQL_DB_USER, MYSQL_DB_PASS );
			
			//Utils.alertBox("carregaListaVarLimites", "Base dados aberta");
			
		}
		catch(SQLException ex){							// Apanha Erro da connection ou DML
			Utils.alertBox("carregaListaVarLimites", "Erro na liga��o");
			return null;
		}
		catch(ClassNotFoundException ex){				// Apanha Erro da Class.forName()
			Utils.alertBox("carregaListaVarLimites", "Erro no Driver");
			return null;
		}
		catch(Exception ex){								// Apanha todas as restantes Exce��es
			Utils.alertBox("carregaListaVarLimites", "Erro gen�rico na liga��o");
			ex.printStackTrace();
			return null;
		}
		finally{
			try{
				// Se liga��o com sucesso, executa a query
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("Select * from parametrizacao");
				
				// Para cada registo existente na Query rs,
				while(rs.next()){					
					Parametro a = new Parametro();			// Cria um novo parametro/vari�vel de limites
					a.setCodParametro(rs.getInt(1));		// Copia o dado da coluna 1 (codParametro) para a
					a.setCodVar(rs.getInt(2));				// Extrai o dado da coluna 3 (codVar) para a
					a.setVariavel(rs.getString(3));			// Extrai o dado da coluna 4 (variavel) para a
					a.setTipoVar(rs.getString(4));			// Copia o dado da coluna 5 (tipoVar) para a
					a.setLimiteMin(rs.getString(5));		// Extrai o dado da coluna 6 (limiteMin) para a
					a.setLimiteMax(rs.getString(6));		// Extrai o dado da coluna 7 (limiteMax) para a
					a.setCarimbo(rs.getBoolean(7));			// Extrai o dado da coluna 7 (carimbo) para a
					listaVarLimites.add(a);					// Adiciona-o � lista.
					
					//Alternativa: uma unica linha, usando o contrutor de Aluno
					//ex:listaAlunos.add(new Aluno(rs.getInt(1), rs.getInt(2), rs.getString(4)));
				}
				
				//Utils.alertBox("carregaListaVarLimites", "Lista Construida");
				
				shutdownConnection();
			}
			catch(SQLException ex){							// Apanha Erro da connection ou DML
				Utils.alertBox("carregaListaVarLimites", "Finally - Erro na liga��o");
				shutdownConnection();
				return null;
			}	
		}
    	return listaVarLimites;
    }
    
    /*************************************************************************************************
	 * M�todos para carregamento das Listas de alimenta��o das TableViews. 
	 * S�o executados pelo bot�o EDITAR, eliminar, alterar ou eliminar de cada entidade
	 * Popular uma ObservableList com os dados da BD e desvolvemr � TableView
	 *************************************************************************************************/
    public static ObservableList<Recuperacao> carregaListaRecContas(){
    	
    	ObservableList<Recuperacao> listaVarLimites = FXCollections.observableArrayList();

    	/* Lista para preencher com os dados da tabela de Recupera��o
    	 * 	Executa uma query � tabela Recupera��o e para cada registo, 
    	 * 		1 Extrai os 5 atributos: codRec, codVar, variavel, tipovariavel, limiteMin, limiteMax
    	 *  	2 Adiciona � lista
    	 *  Devolve a lista � TableView para desenhar a lista de Recupera��o
    	 */

    	try{
			//Tenta ligar-se ao SGBD e � base de dados
			Class.forName(MYSQL_JDBC_DRIVER).newInstance();
			conn = DriverManager.getConnection(MYSQL_DB_URL, MYSQL_DB_USER, MYSQL_DB_PASS );
			
			//Utils.alertBox("carregaListaRecContas", "Base dados aberta");
			
		}
		catch(SQLException ex){							// Apanha Erro da connection ou DML
			Utils.alertBox("carregaListaRecContas", "Erro na liga��o");
			return null;
		}
		catch(ClassNotFoundException ex){				// Apanha Erro da Class.forName()
			Utils.alertBox("carregaListaRecContas", "Erro no Driver");
			return null;
		}
		catch(Exception ex){								// Apanha todas as restantes Exce��es
			Utils.alertBox("carregaListaRecContas", "Erro gen�rico na liga��o");
			ex.printStackTrace();
			return null;
		}
		finally{
			try{
				// Se liga��o com sucesso, executa a query
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("Select * from recuperacao");
				
				// Para cada registo existente na Query rs,
				while(rs.next()){					
					Recuperacao a = new Recuperacao();	// Cria um novo parametro/vari�vel de limites
					a.setCodContaRec(rs.getInt(1));		// Copia o dado da coluna 1 (codParametro) para a
					a.setCodJogador(rs.getInt(4));		// Extrai o dado da coluna 4 (variavel) para a
					a.setUsername(rs.getString(5));		// Copia o dado da coluna 5 (tipoVar) para a
					a.setPassword(rs.getString(6));		// Extrai o dado da coluna 6 (limiteMin) para a
					a.setCarimbo(rs.getBoolean(7));		// Extrai o dado da coluna 7 (carimbo) para a
					listaVarLimites.add(a);				// Adiciona-o � lista.
					
					//Alternativa: uma unica linha, usando o contrutor de Aluno
					//ex:listaAlunos.add(new Aluno(rs.getInt(1), rs.getInt(2), rs.getString(4)));
				}
				
				//Utils.alertBox("carregaListaRecContas", "Lista Construida");
				
				shutdownConnection();
			}
			catch(SQLException ex){							// Apanha Erro da connection ou DML
				Utils.alertBox("carregaListaRecContas", "Finally - Erro na liga��o");
				shutdownConnection();
				return null;
			}	
		}
    	return listaVarLimites;
    }
    
    /*************************************************************************************************
	 * M�todos para carregamento das Listas de alimenta��o das TableViews. 
	 * S�o executados pelo bot�o EDITAR, eliminar, alterar ou eliminar de cada entidade
	 * Popular uma ObservableList com os dados da BD e desvolvemr � TableView
	 *************************************************************************************************/
    public static ObservableList<Administrador> carregaListaAdministradores(){
    	
    	ObservableList<Administrador> listaAdministradores = FXCollections.observableArrayList();

    	/* Lista para preencher com os dados da tabela de Jogadores
    	 * 	Executa uma query � tabela Jogadores e para cada registo, 
    	 * 		1 Extrai os 6 atributos: codJogador, username, password, numVitorias, numDerrotas, numEmpates
    	 *  	2 Adiciona � lista
    	 *  Devolve a lista � TableView para desenhar a lista de Jogadores
    	 */

    	try{
			//Tenta ligar-se ao SGBD e � base de dados
			Class.forName(MYSQL_JDBC_DRIVER).newInstance();
			conn = DriverManager.getConnection(MYSQL_DB_URL, MYSQL_DB_USER, MYSQL_DB_PASS );
			
			//Utils.alertBox("carregaListaAdministradores", "Base dados aberta");
			
		}
		catch(SQLException ex){							// Apanha Erro da connection ou DML
			Utils.alertBox("carregaListaAdministradores", "Erro na liga��o");
			return null;
		}
		catch(ClassNotFoundException ex){				// Apanha Erro da Class.forName()
			Utils.alertBox("carregaListaAdministradores", "Erro no Driver");
			return null;
		}
		catch(Exception ex){								// Apanha todas as restantes Exce��es
			Utils.alertBox("carregaListaAdministradores", "Erro gen�rico na liga��o");
			ex.printStackTrace();
			return null;
		}
		finally{
			try{
				// Se liga��o com sucesso, executa a query
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("Select * from administrador");
				
				// Para cada registo existente na Query rs,
				while(rs.next()){					
					Administrador a = new Administrador();			// Cria um novo jogador
					a.setCodAdmin(rs.getInt(1));		// Copia o dado da coluna 1 (codJogador) para a
					a.setUsername(rs.getString(2));		// Extrai o dado da coluna 2 (username) para a
					a.setPassword(rs.getString(3));		// Extrai o dado da coluna 3 (password) para a
					a.setNumVitorias(rs.getInt(4));		// Copia o dado da coluna 4 (numVitorias) para a
					a.setNumDerrotas(rs.getInt(5));		// Extrai o dado da coluna 5 (numDerrotas) para a
					a.setNumEmpates(rs.getInt(6));		// Extrai o dado da coluna 6 (numEmpates) para a
					a.setCarimbo(rs.getBoolean(8));		// Extrai o dado da coluna 8 (carimbo) para a
					listaAdministradores.add(a);				// Adiciona-o � lista.
					
					//Alternativa: uma unica linha, usando o contrutor de Aluno
					//ex:listaAlunos.add(new Aluno(rs.getInt(1), rs.getInt(2), rs.getString(4)));
				}
				
				//Utils.alertBox("carregaListaAdministradores", "Lista Construida");
				
				shutdownConnection();
			}
			catch(SQLException ex){							// Apanha Erro da connection ou DML
				Utils.alertBox("carregaListaAdministradores", "Finally - Erro na liga��o");
				shutdownConnection();
				return null;
			}	
		}
    	return listaAdministradores;
    }
	
	
	/******************************************************************************************
	 * SQLserver
	 * */
	
    /*
	public static void connectToSQLSerrver(){
		//Connection conn = null;
		try{
			// Liga��o ao SGBD e � BD.
			Class.forName(SQLSERVER_JDBC_DRIVER).newInstance();
			conn = DriverManager.getConnection(SQLSERVER_DB_URL);
			
			Utils.alertBox("layoutLeft", "Base dados aberta");
			
		}
		catch(SQLException ex){							// Apanha Erro da connection ou DML
			Utils.alertBox("layoutLeft", "Erro na liga��o");
		}
		catch(ClassNotFoundException ex){				// Apanha Erro da Class.forName()
			Utils.alertBox("layoutLeft", "Erro no Driver");
		}
		catch(Exception ex){								// Apanha todas as restantes Exce��es
			Utils.alertBox("layoutLeft", "Erro gen�rico na liga��o");
			ex.printStackTrace();
		}
		finally{
			try{
				if(conn != null){
					conn.close();
					
					Utils.alertBox("SQLSERVER", "Base dados fechada");
					
				}
			}
			catch(SQLException ex){							// Apanha Erro da connection ou DML
				Utils.alertBox("layoutLeft", "Erro na liga��o");
			}				
		}
	}
	*/
	
	
	/*SHUTDOWNCONNECTION() - Fecha a liga��o de BD*/
	public static void shutdownConnection(){
		try{
			if (conn != null) { conn.close();}	// apenas se estiver aberta
			
			//Utils.alertBox("SQLshutDown", "Base dados fechada");
			
		}
		catch(SQLException e){
			Utils.alertBox("SQLshutDown", "Erro no fecho da liga��o � BD");
		}
		catch(Exception e){
			Utils.alertBox("SQLshutDown", "Erro gen�rico no fecho da liga��o � BD");
		}
    }
}