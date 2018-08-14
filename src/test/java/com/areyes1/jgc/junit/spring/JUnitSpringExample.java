package com.areyes1.jgc.junit.spring;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.BaseMatcher.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.areyes1.jgc.junit.spring.main.AppConfig;
import com.areyes1.jgc.junit.spring.service.Client;
import com.areyes1.jgc.junit.spring.service.SampleService;
import com.areyes1.jgc.unit.obj.Order;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=AppConfig.class,loader=AnnotationConfigContextLoader.class)
public class JUnitSpringExample {
	
	@Autowired
	private SampleService sampleService;

	
	@BeforeClass
	public static void setUp() {
		System.out.println("-----> SETUP <-----");
	}
	
	@Test
	public void testSampleService() {
		assertEquals("class com.areyes1.jgc.junit.spring.service.SampleServiceImpl",this.sampleService.getClass().toString());
	}
	
	@Test
	public void testSampleServiceRead() throws IOException {
		assertEquals(sampleService.readFileInList().size(), 717);
	}
	
	@Test
	public void testSampleServiceWriteCSV() {
		List<Client> list = new ArrayList<Client>();
		assertEquals(sampleService.writeFile(list), "true");
	}

	@AfterClass
	public static void afterTest() {
		System.out.println("-----> DESTROY <-----");
	}
}
