package br.com.fiap.dugeonsDragons.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="TB_INVENTARIO")
@SequenceGenerator(name="inventario", sequenceName = "SQ_TB_INVENTARIO", allocationSize = 1)
public class Inventario {

    @Id
    @Column(name = "id_inventario")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "inventario")
    private Long id;
    private Personagem personagem;
    private List<Item> itens;

    public Inventario() {
    }

    public Inventario(Long id, Personagem personagem, List<Item> itens) {
        this.id = id;
        this.personagem = personagem;
        this.itens = itens;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Personagem getPersonagem() {
        return personagem;
    }

    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "id=" + id +
                ", personagem=" + personagem +
                ", itens=" + itens +
                '}';
    }
}
