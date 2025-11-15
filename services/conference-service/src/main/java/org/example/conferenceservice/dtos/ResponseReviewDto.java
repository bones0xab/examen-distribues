package org.example.conferenceservice.dtos;

import lombok.Value;

import java.io.Serializable;
import java.util.Date;

@Value
public class ResponseReviewDto implements Serializable {
    Long id;
    Date datereview;
    String text;
    int score;
    Long conferenceId;
}