package com.example.charity_app.utils;

import org.keycloak.KeycloakPrincipal;
import org.springframework.security.core.Authentication;

public class KeycloakHelper {

    // Metoda ce ne intoarce username-ul din keycloak care la noi e id-ul user-ului din db
    // Fiind o metoda statica, o putem apela din alte clase direct ca KeycloakHelper.getUser(...);
    public static String getUser(Authentication authentication) {
        return ((KeycloakPrincipal) authentication.getPrincipal()).getKeycloakSecurityContext()
                .getToken().getPreferredUsername();
    }
}
