package com.exam.spring_board01.mapper;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.exam.spring_board01.vo.BoardVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {
        "file:src/main/webapp/WEB-INF/root-context.xml"
})
class BoardMapperTest {

	@Autowired
	private BoardMapper boardMapper;
	
	@Test
	public void delete() {
		log.info("delete()");
		
		boardMapper.delete(19);
	}

}
