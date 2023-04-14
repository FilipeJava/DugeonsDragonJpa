package br.com.fiap.dugeonsDragons.dao;

import br.com.fiap.dugeonsDragons.entity.Jogador;

import javax.persistence.EntityManager;

public class JogadorDaoImpl extends GenericDaoImpl<Jogador, Long> implements JogadorDao {

    public JogadorDaoImpl(EntityManager em) {
        super(em);
    }

}
