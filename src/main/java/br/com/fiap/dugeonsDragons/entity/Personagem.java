package br.com.fiap.dugeonsDragons.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="TB_PERSONAGEM")
@SequenceGenerator(name="personagem", sequenceName = "SQ_TB_PERSONAGEM", allocationSize = 1)
public class Personagem {

    @Id
    @Column(name = "id_personagem")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "personagem")
    private Long  id;
    @Column(name="nm_personagem", nullable = false, length = 50)
    private String nome;
    @Enumerated(EnumType.STRING)
    @Column(name="ds_raca", length = 40)
    private Raca raca;
    @Enumerated(EnumType.STRING)
    @Column(name="ds_classe", length = 40)
    private Classe classe;
    @Column(name="nr_experiencia", precision = 10, nullable = false)
    private int experiencia;
    @Column(name="nr_level", precision = 10, nullable = false)
    private int level;
    private Guilda guilda;
    private List<Atributo> atributos;
    private Inventario inventario;

    public Personagem() {
    }

    public Personagem(Long id, String nome, Raca raca, Classe classe, int experiencia, int level, Guilda guilda, List<Atributo> atributos, Inventario inventario) {
        this.id = id;
        this.nome = nome;
        this.raca = raca;
        this.classe = classe;
        this.experiencia = experiencia;
        this.level = level;
        this.guilda = guilda;
        this.atributos = atributos;
        this.inventario = inventario;
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

    public Raca getRaca() {
        return raca;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Guilda getGuilda() {
        return guilda;
    }

    public void setGuilda(Guilda guilda) {
        this.guilda = guilda;
    }

    public List<Atributo> getAtributos() {
        return atributos;
    }

    public void setAtributos(List<Atributo> atributos) {
        this.atributos = atributos;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", raca=" + raca +
                ", classe=" + classe +
                ", experiencia=" + experiencia +
                ", level=" + level +
                ", guilda=" + guilda +
                ", atributos=" + atributos +
                ", inventario=" + inventario +
                '}';
    }
}
