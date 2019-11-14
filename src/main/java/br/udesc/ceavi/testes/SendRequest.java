/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.testes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gustavo Jung
 */
public class SendRequest {
    NetworkConfig nc = new NetworkConfig();
    Socket conn = null;
    BufferedReader in = null;
    PrintWriter out = null;

    //Pronto
    public String authentication(String login, String senha) {
        String linha = null;
        try {
            conn = new CreateConnection().create();
        } catch (IOException ex) {
            System.out.println("Falha ao conectar ao servidor");
        }

        String message = "authentication{"
                + "\"login\":\"" + login + "\","
                + "\"senha\":\"" + senha + "\"}";
        try {
            //envia requisição com os dados para o servidor
            out = new PrintWriter(conn.getOutputStream(), true);
            out.println(message);
            //recebe a resposta do servidor
            in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                 linha = in.readLine();
            while (linha == null) {
                linha = in.readLine();
            }
            
        } catch (IOException ex) {
            Logger.getLogger(SendRequest.class.getName()).log(Level.SEVERE, null, ex);
        }
        return linha;
    }

    //Pronto
    public String create_account(String login, String senha, String email, int idade) {
        String linha = null;
        try {
            conn = new CreateConnection().create();
        } catch (IOException ex) {
            Logger.getLogger(SendRequest.class.getName()).log(Level.SEVERE, null, ex);
          }

        String message = "create_account{"
                + "\"login\":\"" + login + "\","
                + "\"senha\":\"" + senha + "\","
                + "\"email\":\"" + email + "\","
                + "\"idade\":\"" + idade + "\","
                + "\"porta\":\"" + nc.getPorta()+"\","
                + "\"ip\":\":\"" + nc.getIp()+"\"}";


        try {
            //envia requisição com os dados para o servidor
            out = new PrintWriter(conn.getOutputStream(), true);
            out.println(message);
            //recebe a resposta do servidor
            in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                 linha = in.readLine();
            while (linha == null) {
                linha = in.readLine();
            }
            
        } catch (IOException ex) {
            Logger.getLogger(SendRequest.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erro ao conectar com o servidor! Tente mais tarde!");
        }
        return linha;
    }

    //Pronto
    public String update_account(String login, String senha, String email, int idade) {
        String linha = null;
        try {
            conn = new CreateConnection().create();
        } catch (IOException ex) {
            Logger.getLogger(SendRequest.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        //envia todos os dados porem na tela o usuário só pode alterar email e idade
        String message = "update_info{"
                + "\"login\":\"" + login + "\","
                + "\"senha\":\"" + senha + "\","
                + "\"email\":\"" + email + "\","
                + "\"idade\":\"" + idade + "\"}";

        try {
            //envia requisição com os dados para o servidor
            out = new PrintWriter(conn.getOutputStream(), true);
            out.println(message);
            //recebe a resposta do servidor
            in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            linha = in.readLine();
            while (linha == null) {
                linha = in.readLine();
            }
          
        } catch (IOException ex) {
            Logger.getLogger(SendRequest.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erro ao conectar com o servidor! Tente mais tarde!");
        }
        return linha;
    }

    //Pronto
    public String get_contacts() {
        String linha = null;
        /*String teste = "{"
                + "\"contact1\":{"
                + "\"login\":\"login1\","
                + "\"isActive\":\"true\","
                + "\"ip\":\"192.168.0.1\","
                + "\"porta\":\"56000\"},"
                + "\"contact2\":{"
                + "\"login\":\"login2\","
                + "\"isActive\":\"false\","
                + "\"ip\":\"192.168.1.1\","
                + "\"porta\":\"56000\"}}";
*/
        try {
            conn = new CreateConnection().create();
        } catch (IOException ex) {
            Logger.getLogger(SendRequest.class.getName()).log(Level.SEVERE, null, ex);
         }

       // String message = "get_contacts{"
         //       + "\"login\":\"" + Usuario.getInstance().getLogin() + "\"}";
        try {
            in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
             linha = in.readLine();
            while (linha == null) {
                linha = in.readLine();
            }


        } catch (IOException ex) {
            Logger.getLogger(SendRequest.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erro ao conectar com o servidor! Tente mais tarde!");
        }
        return linha;
    }
    
    //Pronto
    public String add_contact(String login_contact) {
       String linha = null;
       /*
        String teste = "{"
                + "\"contact1\":{"
                + "\"login\":\""+login_contact+"\","
                + "\"isActive\":\"true\","
                + "\"ip\":\"192.168.0.1\","
                + "\"porta\":\"56000\"}}";
        */
       try {
            conn = new CreateConnection().create();
        } catch (IOException ex) {
            Logger.getLogger(SendRequest.class.getName()).log(Level.SEVERE, null, ex);
          }

        //String message = "add_contact{"
         //       + "\"login\":\"" + Usuario.getInstance().getLogin() + "\","
          //      + "\"contact_login\": \"" + login_contact + "\"}";
        try {
            in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
             linha = in.readLine();
            while (linha == null) {
                linha = in.readLine();
            }
            
        } catch (IOException ex) {
            Logger.getLogger(SendRequest.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erro ao conectar com o servidor! Tente mais tarde!");
        }
        return linha;
    }
    
    //Pronto
    public String remove_contact(String login_contact) {
        String linha = null;
        
        try {
            conn = new CreateConnection().create();
        } catch (IOException ex) {
            Logger.getLogger(SendRequest.class.getName()).log(Level.SEVERE, null, ex);
         }

        //String message = "remove_contact{"
        //        + "\"login\":\"" + Usuario.getInstance().getLogin() + "\","
         //       + "\"contact_login\": \"" + login_contact + "\"}";
        try {
            in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                linha = in.readLine();
            while (linha == null) {
                linha = in.readLine();
            }           

        } catch (IOException ex) {
            Logger.getLogger(SendRequest.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erro ao conectar com o servidor! Tente mais tarde!");
        }
        return linha;
    }

}
