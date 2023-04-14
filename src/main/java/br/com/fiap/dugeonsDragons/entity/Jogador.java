package br.com.fiap.dugeonsDragons.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="TB_JOGADOR")
@SequenceGenerator(name="jogador", sequenceName = "SQ_TB_JOGADOR", allocationSize = 1)
public class Jogador {

    @Id
    @Column(name = "id_jogador")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "jogador")
    private Long id;
    @Column(name="nm_nickname", nullable = false, length = 50)
    private String nickname;
    @Column(name="nm_senha", nullable = false, length = 50)
    private String senha;
    @Column(name="nr_idade", precision = 10, nullable = false)
    private int idade;
    private List<Personagem> personagens;
    private List<Campanha> campanhas;

    public Jogador() {
    }

    public Jogador(Long id, String nickname, String senha, int idade, List<Personagem> personagens, List<Campanha> campanhas) {
        this.id = id;
        this.nickname = nickname;
        this.senha = senha;
        this.idade = idade;
        this.personagens = personagens;
        this.campanhas = campanhas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<Personagem> getPersonagens() {
        return personagens;
    }

    public void setPersonagens(List<Personagem> personagens) {
        this.personagens = personagens;
    }

    public List<Campanha> getCampanhas() {
        return campanhas;
    }

    public void setCampanhas(List<Campanha> campanhas) {
        this.campanhas = campanhas;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", senha='" + senha + '\'' +
                ", idade=" + idade +
                ", personagens=" + personagens +
                ", campanhas=" + campanhas +
                '}';
    }
}
