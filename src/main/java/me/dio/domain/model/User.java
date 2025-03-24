package me.dio.domain.model;

import jakarta.persistence.*;

import java.util.Arrays;
import java.util.List;

@Entity(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Account account;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Features> features;

    @OneToOne(cascade = CascadeType.ALL)
    private Card card;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    public List<News> news;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }

    public List<Features> getFeatures() {
        return features;
    }

    public Card getCard() {
        return card;
    }

    public List<News> getNews() {
        return news;
    }
}
