package org.example.conferenceservice.dtos;

import lombok.Value;
import org.example.conferenceservice.enums.Type;

import java.io.Serializable;
import java.util.Date;


@Value
public class ResponseConferenceDto implements Serializable {
    Long id;
    String titre;
    Type type;
    Date date;
    int duree;
    int nbrinscripts;
    double score;
}