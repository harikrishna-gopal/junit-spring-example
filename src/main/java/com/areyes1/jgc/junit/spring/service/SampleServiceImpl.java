package com.areyes1.jgc.junit.spring.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import com.areyes1.jgc.unit.obj.Order;

public class SampleServiceImpl implements SampleService {

	
	public static List<String> readFileInListImpl(String fileName) {
		List<String> lines = Collections.emptyList();
		try {
			lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lines;
	}
	
	public List<Client> readFileInList() throws IOException {

		List<String> lines = Collections.emptyList();
		List<Client> clientsList = null;
		lines = readFileInListImpl("/Users/harikrishnagopal/Downloads/Input.txt");
		clientsList = new ArrayList<Client>();
		
		Iterator<String> itr = lines.iterator();
		while (itr.hasNext()) {
			String s = itr.next().replaceAll("\\s+", "");
			Client c =  new Client();
			c.setClientType(s.substring(3, 7));
			c.setClientNumber(s.substring(7, 11));
			c.setAccountNumber(s.substring(11, 15));
			c.setSubAccountNumber(s.substring(15, 19));
			c.setProductGroupCode(s.substring(25, 27));
			c.setExchangeCode(s.substring(27, 31));
			c.setSymbol(s.substring(31, 37));
			c.setExpirationDate(s.substring(37, 45));
			clientsList.add(c);
		}
		return clientsList;
	}
	
	public String writeFile(List<Client> listClient) {
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new File("/Users/harikrishnagopal/Downloads/oldData.csv"));
		} catch (FileNotFoundException e) {
			return "false";
		}
		StringBuilder builder = new StringBuilder();
		String ColumnNamesList = "CLIENT TYPE,CLIENT NUMBER,ACCOUNT NUMBER,SUBACCOUNT NUMBER,EXCHANGE CODE,PRODUCT GROUP CODE,SYMBOL,EXPIRATION DATE";
		builder.append(ColumnNamesList + "\n");
		for (Client cli : listClient) {
			builder.append(cli.getClientType() + ",");
			builder.append(cli.getClientNumber() + ",");
			builder.append(cli.getAccountNumber() + ",");
			builder.append(cli.getSubAccountNumber() + ",");
			builder.append(cli.getExchangeCode() + ",");
			builder.append(cli.getProductGroupCode() + ",");
			builder.append(cli.getSymbol() + ",");
			builder.append(cli.getExpirationDate());
			builder.append('\n');
		}
		pw.write(builder.toString());
		pw.close();
		return "true";
	}
	

}
