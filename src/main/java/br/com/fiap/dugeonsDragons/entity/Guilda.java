package br.com.fiap.dugeonsDragons.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="TB_GUILDA")
@SequenceGenerator(name="guilda", sequenceName = "SQ_TB_GUILDA", allocationSize = 1)
public class Guilda {

    @Id
    @Column(name = "id_guilda")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "guilda")
    private Long id;
    @Column(name="nm_guilda", nullable = false, length = 50)
    private String nome;
    @Enumerated(EnumType.STRING)
    @Column(name="ds_categoria", length = 40)
    private Categoria categoria;
    
    private List<Personagem> personagens;

    public Guilda() {
    }

    public Guilda(Long id, String nome, Categoria categoria, List<Personagem> personagens) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.personagens = personagens;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Personagem> getPersonagens() {
        return personagens;
    }

    public void setPersonagens(List<Personagem> personagens) {
        this.personagens = personagens;
    }

    @Override
    public String toString() {
        return "Guilda{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", categoria=" + categoria +
                ", personagens=" + personagens +
                '}';
    }
}
