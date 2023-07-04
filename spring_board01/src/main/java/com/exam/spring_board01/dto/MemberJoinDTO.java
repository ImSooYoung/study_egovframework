package com.exam.spring_board01.dto;

import lombok.Data;

@Data
public class MemberJoinDTO {
	
	private String id;
	private String password;
	private String name;
	private int age;
	private String mobile;
	
}
