package br.com.senior.sam.utils;

import lombok.experimental.UtilityClass;

/**
 * Utilitário com os caminhos dos serviços
 */
@UtilityClass
public class EndpointPath {

    /**
     * Caminhos do serviço de Autenticação
     */
    @UtilityClass
    public class Portaria {

        public static final String CREATE_PERSON_PROVISORY_CREDENTIAL_CARD = "createPersonProvisoryCredentialCard";
        public static final String CREATE_VISITOR_PROVISORY_CREDENTIAL_CARD = "createVisitorProvisoryCredentialCard";
    }

}
