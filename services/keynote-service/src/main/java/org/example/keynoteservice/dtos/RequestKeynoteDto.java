package org.example.keynoteservice.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.io.Serializable;

@Value
public class RequestKeynoteDto implements Serializable {

    @NotNull(message = "Nom must not be null")
    String nom;
    @NotNull(message = "Prenom must not be null")
    String prenom;
    @NotNull(message = "Email must not be null")
    String email;
    @NotNull(message = "Fonction must not be null")
    String fonction;
}