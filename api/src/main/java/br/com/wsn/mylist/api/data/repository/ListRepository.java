package br.com.wsn.mylist.api.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.wsn.mylist.api.data.model.Catalog;

@Repository
public interface CatalogRepository extends CrudRepository<Catalog, Integer>{

}
