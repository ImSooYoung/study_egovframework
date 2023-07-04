package com.exam.spring_board01.mapper;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.exam.spring_board01.dto.MemberJoinDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {
        "file:src/main/webapp/WEB-INF/root-context.xml"
})
public class MemberMapperTest {

	@Autowired
	private MemberMapper memberMapper;
	
//	@Test
	public void selectByNo() {
		log.info("selectByNo()");
		
		memberMapper.selectByNo(1);
	}
	
	@Test
	public void insert() {
		log.info("insert()");
		
		MemberJoinDTO memberJoinDTO = new MemberJoinDTO();
		
		memberMapper.insert(memberJoinDTO);
	}

}
