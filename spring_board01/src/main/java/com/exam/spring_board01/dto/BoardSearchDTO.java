package com.exam.spring_board01.dto;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class BoardSearchDTO {

	private String type;
	private String keyword;
	
}
