package br.com.fiap.dugeonsDragons.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="TB_CAMPANHA")
@SequenceGenerator(name="campanha", sequenceName = "SQ_TB_CAMPANHA", allocationSize = 1)
public class Campanha {

    @Id
    @Column(name = "id_campanha")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "campanha")
    private Long id;
    @Column(name="nm_campanha", nullable = false, length = 50)
    private String nome;
    @Column(name = "st_status", nullable = false)
    private Boolean status;
    @Column(name = "dt_inicio", nullable = false)
    private LocalDate dataInicio;
    private List<Jogador> jogadores;

    public Campanha() {
    }

    public Campanha(Long id, String nome, Boolean status, LocalDate dataInicio, List<Jogador> jogadores) {
        this.id = id;
        this.nome = nome;
        this.status = status;
        this.dataInicio = dataInicio;
        this.jogadores = jogadores;
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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    @Override
    public String toString() {
        return "Campanha{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", status=" + status +
                ", dataInicio=" + dataInicio +
                ", jogadores=" + jogadores +
                '}';
    }
}
