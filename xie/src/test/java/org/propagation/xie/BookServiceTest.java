package org.propagation.xie;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:ApplicationContext.xml"})
public class BookServiceTest {
	@Resource
	private BookService bookService;
	
	@Test
	public void insert() throws Exception{
		int id = 2; 
		String name = "test";
		System.out.println(bookService.insert(id, name)); 
	}
}

