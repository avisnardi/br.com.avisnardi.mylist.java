package br.com.wsn.mylist.api.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.wsn.mylist.api.data.model.Catalog;
import br.com.wsn.mylist.api.service.CatalogService;

@Controller
@CrossOrigin
public class CatalogController {

	private final CatalogService catalogService;
	
	public CatalogController(CatalogService catalogService) {
		this.catalogService = catalogService;
	}
	
	@RequestMapping("/lista")
	@ResponseBody
	public List<Catalog> list() {
		return catalogService.list();
	}
}
