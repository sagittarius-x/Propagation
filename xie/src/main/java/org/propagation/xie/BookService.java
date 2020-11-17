package org.propagation.xie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import Mapper.BookMapper;

@Service
public class BookService {
	@Autowired
	private BookMapper bookMapper;
	@Transactional(propagation=Propagation.SUPPORTS)
	public int insert(int id, String name) throws Exception{
		bookMapper.insert(id, name);
		throw new RuntimeException("test ");
	}
}
