package br.com.senior.sam.aplicacao;

import br.com.senior.core.base.Environment;
import br.com.senior.core.entities.EntityPage;
import br.com.senior.sam.aplicacao.pojos.Credential;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class AplicacaoIT {

    private static AplicacaoClient client;

    @BeforeClass
    public static void beforeClass() {
        client = new AplicacaoClient(System.getenv("TOKEN"), Environment.PROD);
    }

    @Test
    public void testGetCredentials() {
        EntityPage<Credential> output = client.getPersonCredentials("1");
        Assert.assertNotNull(output);
        System.out.println(output);
    }

}
