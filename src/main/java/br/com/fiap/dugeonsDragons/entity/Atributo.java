package br.com.fiap.dugeonsDragons.entity;

import javax.persistence.*;

@Entity
@Table(name="TB_ATRIBUTO")
@SequenceGenerator(name="atributo", sequenceName = "SQ_TB_ATRIBUTO", allocationSize = 1)
public class Atributo {

    @Id
    @Column(name = "id_atributo")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "atributo")
    private Long id;
    @Column(name="nm_atributo", nullable = false, length = 50)
    private String nome;
    @Column(name="nr_valor", precision = 10, nullable = false)
    private int valor;

    public Atributo() {
    }

    public Atributo(Long id, String nome, int valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
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

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Atributo{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }
}
