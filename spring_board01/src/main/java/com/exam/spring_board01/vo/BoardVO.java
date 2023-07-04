package com.exam.spring_board01.vo;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BoardVO {
	private int no;
	private String title;
	private String content;
	private LocalDateTime create_time;
	private LocalDateTime modified_time;
	private int memberNo;
	
}
