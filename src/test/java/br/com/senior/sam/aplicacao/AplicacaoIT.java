package br.com.senior.sam.aplicacao;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import br.com.senior.core.base.Environment;
import br.com.senior.core.entities.EntityPage;
import br.com.senior.sam.application.ApplicationClient;
import br.com.senior.sam.application.pojos.Credential;

public class AplicacaoIT {

    private static ApplicationClient client;

    @BeforeClass
    public static void beforeClass() {
        client = new ApplicationClient(System.getenv("TOKEN"), Environment.PROD);
    }

    @Test
    public void testGetCredentials() {
        EntityPage<Credential> output = client.getPersonCredentials("1");
        Assert.assertNotNull(output);
        System.out.println(output);
    }

}
