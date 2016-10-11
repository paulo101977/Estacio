/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

public class Candidato {
    public String nome, orgao, email , cpf,identidade,telefone;
    public String data, expedicao;
    public String sexo, UF, vaga;


    public Candidato(String cpf,
                 String identidade, 
                 String telefone,
                 String vaga,
                 String nome, 
                 String orgao, 
                 String email, 
                 String data, 
                 String expedicao,
                 String sexo, 
                 String UF){
        
        this.cpf=cpf;
        this.identidade=identidade;
        this.nome=nome;
        this.orgao=orgao;
        this.email=email;
        this.data=data;
        this.expedicao=expedicao;
        this.UF=UF;
        this.telefone=telefone;
        this.vaga=vaga;
    }   
}
