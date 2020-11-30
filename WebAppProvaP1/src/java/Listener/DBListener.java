/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.sql.*;
/**
 * Web application lifecycle listener.
 *
 * @author Dario
 */
public class DBListener implements ServletContextListener {

    public static final String CLASS_NAME ="org.sqlite.JDBC";
    public static final String URL = "jdbc:sqlite:DBP2.db";
    public static Exception exception = null;
    
    public static Connection getConnection() throws Exception{
        return DriverManager.getConnection(URL);
    }
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try {
            Class.forName(CLASS_NAME);
            Connection con = getConnection();
            Statement stmt = con.createStatement();
            stmt.execute("CREATE TABLE IF NOT EXISTS TB_MATERIAS("
                    + "NOME VARCHAR(50) NOT NULL,"
                    + "EMENTA VARCHAR(100) NOT NULL,"
                    + " CICLO INTEGER NOT NULL, NOTA INTEGER NOT NULL"
                    + ")");
            stmt.close();
            con.close();
        }catch(Exception ex){
            exception = ex;
            
        }
        // cria o banco
        
        
        
    }

    public ArrayList<String> getMaterias(){
        ArrayList<String> list = new ArrayList <>();
         Connection con = getConnection();
         Statement stmt = con.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT nome from TB_MATERIAS");
         while(rs.next()){
             list.add(rs.getString("nome"));
         }
         rs.close();
         stmt.close();
         con.close();
        
        return list;
    }
    
    
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}
