package com.Rest.Controller;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.Rest.helpper.ResponseWrapper;
import com.Rest.Model.Manufacture;
import com.Rest.Service.ManufactureService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/manufacture")
public class ManufactureController {
	
	@Autowired
	ManufactureService manufactureService;
	
	//1)to get all mnf product
	
	@GetMapping("")
	public ResponseEntity<?> getAllmnfProduct()
	{
		Iterable<Manufacture>data=manufactureService.getall();
		Iterator<Manufacture>all_mnfproduct=data.iterator();
		
		if(!all_mnfproduct.hasNext()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND," no record of mnfProduct");
		}
		else {
			ResponseWrapper mrw=new ResponseWrapper();
			mrw.setMessage("mnfProduct found");
			mrw.setData(all_mnfproduct);
			return new ResponseEntity<>(mrw,HttpStatus.OK);
			
		}
	}
	
	//2)to get mnfProduct based on id
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getmnfProductById(@PathVariable int id) {
		Manufacture mnf_data=manufactureService.getById(id);
		ResponseWrapper mrw= new ResponseWrapper();
		mrw.setMessage("mnfProduct found by id");
		mrw.setData(mnf_data);
		return new ResponseEntity<>(mrw,HttpStatus.FOUND);
	}
	
	//3)create new mnfProduct
	@PostMapping(" ")
	public ResponseEntity<?> createmnfProduct(@RequestBody @Valid Manufacture manufacture) {
		Manufacture mnf_update=manufactureService.create(manufacture);
		ResponseWrapper mrw=new ResponseWrapper();
		mrw.setMessage(" added succuessfully");
		mrw.setData(mnf_update);
		return new ResponseEntity<>(mrw,HttpStatus.OK);
	}
	
	//4) to update mnfProduct based on id;
	@PutMapping("/{id}")
	public ResponseEntity<?> updateMnfProduct(@PathVariable int id, @RequestBody @Valid Manufacture manufacture) {
		 Manufacture mnf_update=manufactureService.getById(id);
		 ResponseWrapper mrw=new ResponseWrapper();
		 mrw.setMessage("update succuessfully");
		 mrw.setData(mnf_update);
		 return new ResponseEntity<>(mrw,HttpStatus.OK);
		
	}
	
	//5)delete mnf product based on id
	@DeleteMapping("/{}")
	public ResponseEntity<?> deletemnfProduct(@PathVariable int id) {
		manufactureService.getById(id);
		manufactureService.delete(id);
		ResponseWrapper mrw=new ResponseWrapper();
		mrw.setMessage("delete succuesfully");
		return new ResponseEntity<>(mrw,HttpStatus.NO_CONTENT);
	}
}





