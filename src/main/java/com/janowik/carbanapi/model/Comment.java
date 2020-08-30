package com.janowik.carbanapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Comment {
    @Id
    private Long id;
    private String text;
}
