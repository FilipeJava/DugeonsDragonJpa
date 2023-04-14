package br.com.fiap.dugeonsDragons.dao;

import br.com.fiap.dugeonsDragons.entity.Item;

import javax.persistence.EntityManager;

public class ItemDaoImpl extends GenericDaoImpl<Item, Long> implements ItemDao {

    public ItemDaoImpl(EntityManager em) {
        super(em);
    }

}