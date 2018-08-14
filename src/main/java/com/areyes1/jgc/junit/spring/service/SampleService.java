package com.areyes1.jgc.junit.spring.service;

import java.io.IOException;
import java.util.List;

import com.areyes1.jgc.unit.obj.Order;


public interface SampleService {

	List<Client> readFileInList() throws IOException ;
	
	String writeFile(List<Client> listClient);
	
	
}
