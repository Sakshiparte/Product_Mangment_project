package com.Rest.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.Rest.Model.Manufacture;
import com.Rest.Model.Supplier;
import com.Rest.Repository.ManufactureRepository;

@Service
public class ManufactureService {
	
	@Autowired
	ManufactureRepository manufacutreRepository;
	
	//1)getting all manufacure product
		public Iterable<Manufacture> getall() 
		{
			return manufacutreRepository.findAll();
		}
		
		//2)getting all manufacure product by id
		public Manufacture getById(int id) {
			return manufacutreRepository.findById(id).orElseThrow(()->{
				throw new ResponseStatusException(HttpStatus.NOT_FOUND,"id not exist");
			});
		}

		//3)insert /add new product
		public Manufacture create(Manufacture manufacture) {
			manufacutreRepository.save(manufacture);
			return manufacture;
		}
		
		//4)update manufacturing 
		public Manufacture update(int id,Manufacture manufacture) {
		 Manufacture get_mnfProduct= getById(id);
		 manufacture.setId(get_mnfProduct.getId());
		 manufacture.setCreatedAt(get_mnfProduct.getCreatedAt());
		 Manufacture found_mnfProduct = manufacutreRepository.save(manufacture);
		  return found_mnfProduct;
		}
		//5) delete data
		public void delete(int id) {
			this.getById(id);
			manufacutreRepository.deleteById(id);
		}
		
	


}
