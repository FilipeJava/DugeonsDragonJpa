package br.com.fiap.dugeonsDragons.entity;

import javax.persistence.*;

@Entity
@Table(name="TB_ITEM")
@SequenceGenerator(name="item", sequenceName = "SQ_TB_ITEM", allocationSize = 1)
public class Item {

    @Id
    @Column(name = "id_item")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "item")
    private Long id;
    @Column(name="nm_item", nullable = false, length = 50)
    private String nome;
    @Column(name="nr_quantidade", precision = 10, nullable = false)
    private int quantidade;
    @Column(name="ds_descricao", nullable = false, length = 300)
    private String descricao;

    public Item() {
    }

    public Item(Long id, String nome, int quantidade, String descricao) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.descricao = descricao;
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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
