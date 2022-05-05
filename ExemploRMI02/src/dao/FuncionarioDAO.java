package dao;

import java.sql.PreparedStatement;
import java.io.Serializable;
import java.util.ArrayList;
import java.sql.ResultSet;
import entity.Funcionario;

public class FuncionarioDAO implements Serializable{
    private BaseDeDados bd;
    
    public FuncionarioDAO(){
        
    }
    
    public ArrayList listar(){
        PreparedStatement pstm;
        ResultSet rs;
        ArrayList listagem = new ArrayList<Funcionario>();
        
        try{
            bd = new BaseDeDados();
            pstm = bd.conecta().prepareStatement("SELECT * FROM funcionario ORDER BY nome");
            rs = pstm.executeQuery();
            
            while(rs.next()){
                Funcionario func = new Funcionario(rs.getInt("id"), rs.getString("nome"), rs.getString("endereco"), rs.getDouble("salario"));
                listagem.add(func);
            }
            
            bd.desconecta();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return listagem;
    }
}