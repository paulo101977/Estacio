
package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;


public class CandidatoDAO {
    
    private static List<Candidato> list;
    /*private static Connection getConnection() throws Exception{
        String URL = "jdbc:derby://localhost:1527/Cadastro_2";
        String USER = "app";
        String PASS = "app";
        return DriverManager.getConnection(URL, USER , PASS);
    }*/
    
    private final static String[] VAGA = new String[4];
    private final static String UF[] = new String[4];
    
    
    
    
    private static List<Candidato> getConnection(){
        VAGA[0] = "Tecnico de Desenvolvimento Web";
        VAGA[1] = "Analista de Suporte";
        VAGA[2] = "Administrador de Rede";
        VAGA[3] = "Analista de Banco de Dados";
        
        UF[0] = "RJ";
        UF[1] = "SP";
        UF[2] = "MG";
        UF[3] = "ES";
        
        String SEXO[] = new String[2];
        SEXO[0]  = "M";
        SEXO[1] = "F";
        
        
        if(list != null)
            return list;
        else {
            list = new ArrayList<>();
            for(int i = 0; i < 10 ; i++){
                list.add(new Candidato("" + new Random().nextInt(999999999),//cpf
                                    "" + new Random().nextInt(1000000),
                                    "" + new Random().nextInt(1000000),
                                    VAGA[new Random().nextInt(4)],
                                    "Blabla", //nome
                                    "DETRAN", //orgao
                                    "paulo10.1977@yahoo.com.br",
                                    new Date().toString(),
                                    new Date().toString(),
                                    SEXO[new Random().nextInt(2)], 
                                    UF[new Random().nextInt(4)]));
            }
            return list;
        }
    }
         
    public static void Inserir(Candidato candidato){
        
        getConnection().add(candidato);
        //Connection conn = getConnection();
        /*PreparedStatement f1=j1.prepareStatement("Insert into Produto values(?,?,?)");
        f1.setInt(1, candidato.cpf);
        f1.setString(2, candidato.nome);
        f1.setDate(3, (java.sql.Date) candidato.data);
        f1.setString(4, candidato.sexo); //Lista opção de sexo//
        f1.setInt(5,candidato.identidade);
        f1.setString(6, candidato.orgao);
        f1.setString(7, candidato.UF);   //Criar lista das regioes//
        f1.setDate(8, (java.sql.Date) candidato.expedicao);
        f1.setInt(9, candidato.telefone);
        f1.setString(10, candidato.email);
        f1.setString(11, candidato.vaga); //Criar lista de vaga//
        f1.executeUpdate();
        j1.close();*/
    }
    
    public static List<Candidato> getAll(){
        return CandidatoDAO.getConnection();
    }

        
}
        
    
    

