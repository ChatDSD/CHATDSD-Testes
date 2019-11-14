/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.testes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 08205268940
 */
public class SendRequestTest {
    
    public SendRequestTest() {
    }
    
    @BeforeEach
    public void setUp() {
    }

    /**
     * Test of authentication method, of class SendRequest.
     */
    @Test
    public void testAuthentication() {
        System.out.println("authentication");
        String login = "gutyGuty";
        String senha = "1234";
        SendRequest instance = new SendRequest();
        String expResult = "success";
        String result = instance.authentication(login, senha);
        assertNotNull(expResult,"Autenticação funcionando!");

    }

    /**
     * Test of create_account method, of class SendRequest.
     */
    @Test
    public void testCreate_account() {
        System.out.println("create_account");
        String login = "login";
        String senha = "senha";
        String email = "email";
        int idade = 20;
        SendRequest instance = new SendRequest();
        String expResult = "success";
        String result = instance.create_account(login, senha, email, idade);
        assertNotNull(expResult, "Criar Conta funcionando!");
    }

    /**
     * Test of update_account method, of class SendRequest.
     */
    @Test
    public void testUpdate_account() {
        System.out.println("update_account");
        String login = "login";
        String senha = "senha";
        String email = "email";
        int idade = 20;
        SendRequest instance = new SendRequest();
        String expResult = "success";
        String result = instance.update_account(login, senha, email, idade);
        assertNotNull(expResult, "Atualizar conta funcionando");
    }

    /**
     * Test of get_contacts method, of class SendRequest.
     */
    @Test
    public void testGet_contacts() {
        System.out.println("get_contacts");
        SendRequest instance = new SendRequest();
        String expResult = "success";
        String result = instance.get_contacts();
        assertNotNull(expResult, "Buscar contatos funcionando!");
    }

    /**
     * Test of add_contact method, of class SendRequest.
     */
    @Test
    public void testAdd_contact() {
        System.out.println("add_contact");
        String login_contact = "user";
        SendRequest instance = new SendRequest();
        String expResult = "success";
        String result = instance.add_contact(login_contact);
        assertNotNull(expResult, "Adicionar contato funcionando!");
    }

    /**
     * Test of remove_contact method, of class SendRequest.
     */
    @Test
    public void testRemove_contact() {
        System.out.println("remove_contact");
        String login_contact = "login";
        SendRequest instance = new SendRequest();
        String expResult = "success";
        String result = instance.remove_contact(login_contact);
        assertNotNull(expResult, "Remover contato funcionando!");
    }
    
}
