package br.com.wsn.mylist.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.wsn.mylist.api.data.model.Catalog;
import br.com.wsn.mylist.api.data.repository.CatalogRepository;

@Service
public class CatalogService {

	private final CatalogRepository repository;
	
	public CatalogService(CatalogRepository repository) {
		this.repository = repository;
	}
	
	public List<Catalog> list(){
		List<Catalog> catalogList = new ArrayList<Catalog>();
		
		Iterable<Catalog> interator = repository.findAll();		
		interator.forEach((cat) -> catalogList.add(cat));
		
		return catalogList;
	}
	
	public Catalog insert() {
		Catalog cat = new Catalog();
		cat.setName("Animais");
		Catalog cat1 =  repository.save(cat);
		return cat1;
	}
}
