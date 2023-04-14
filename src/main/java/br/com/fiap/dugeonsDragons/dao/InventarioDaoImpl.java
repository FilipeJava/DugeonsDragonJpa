package br.com.fiap.dugeonsDragons.dao;

import br.com.fiap.dugeonsDragons.entity.Inventario;

import javax.persistence.EntityManager;

public class InventarioDaoImpl extends GenericDaoImpl<Inventario, Long> implements InventarioDao {

    public InventarioDaoImpl(EntityManager em) {
        super(em);
    }

}