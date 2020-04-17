package com.example.TestAll;

import SpringMvcunittestusingMockitoo.Customer;
import com.fasterxml.jackson.databind.ObjectMapper;
import oracle.jdbc.proxy.annotation.Post;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
class TestAllApplicationTests  {
/*
	MockMvc mockMvc;
	@Autowired
	ObjectMapper mapper= new ObjectMapper();
	WebApplicationContext context;
	@BeforeAll

	public void setUp()
	{
		mockMvc= MockMvcBuilders.webAppContextSetup(context).build();
	}

  public  void saveTest() throws  Exception
  {
	  Customer custome = new Customer();
	  custome.setId(101);
	  custome.setName("smruti");
	  String json= mapper.writeValueAsString(custome);
	  MvcResult result = mockMvc.perform(post("").content
  }*/



}
