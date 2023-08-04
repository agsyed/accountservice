package com.chivano.apps.accountservice.configuration;

import com.azure.identity.DefaultAzureCredential;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class ApplicationConfig {
    public void createDefaultAzureCredentialForUserAssignedManagedIdentity() {
        DefaultAzureCredential defaultCredential = new DefaultAzureCredentialBuilder()
                .managedIdentityClientId("<MANAGED_IDENTITY_CLIENT_ID>")
                .build();

        // Azure SDK client builders accept the credential as a parameter
//        SecretClient client = new SecretClientBuilder()
//                .vaultUrl("https://{YOUR_VAULT_NAME}.vault.azure.net")
//                .credential(defaultCredential)
//                .buildClient();
    }
}
