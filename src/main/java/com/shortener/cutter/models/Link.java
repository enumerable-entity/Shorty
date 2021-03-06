package com.shortener.cutter.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Link {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private long id;
    @Getter @Setter
    private String link;
    @Getter @Setter
    private String shortLink;
    @Getter @Setter
    private LocalDateTime createdAt;
    @Getter @Setter
    private LocalDateTime expireAt;
    public Link (){}
    public Link(String link, String shortLink, LocalDateTime createdAt, LocalDateTime expireAt) {
        this.link = link;
        this.shortLink = shortLink;
        this.createdAt = createdAt;
        this.expireAt = expireAt;
    }
}
