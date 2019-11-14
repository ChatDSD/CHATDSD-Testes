/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.testes;

import java.net.Socket;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 08205268940
 */
public class CreateConnectionTest {
    
    public CreateConnectionTest() {
    }

    /**
     * Test of create method, of class CreateConnection.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        NetworkConfig nc = new NetworkConfig();
        nc.set_config();
        
        CreateConnection instance = new CreateConnection();
        Socket result = instance.create();
        assertNotNull(result, "Conexao criada");
    }
    
}
