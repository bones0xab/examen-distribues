package org.example.keynoteservice.dtos;

import lombok.Value;

import java.io.Serializable;


@Value
public class ResponseKeynoteDto implements Serializable {
    Long id;
    String nom;
    String prenom;
    String email;
    String fonction;
}