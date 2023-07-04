package com.exam.spring_board01.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class BoardSelectDTO {
	private int no;
	private String title;
	private String content;
	private LocalDateTime create_time;
	private LocalDateTime modified_time;
	
	private int member_no; 
	private String name;
}
