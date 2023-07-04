package com.exam.spring_board01.dto;

import com.exam.spring_board01.vo.BoardVO;

import lombok.Data;

@Data
public class BoardWriteDTO {
	private String title;
	private String content;
	private int memberNo;
	
	public BoardVO toEntity() {
		return BoardVO.builder()
				.title(title)
				.content(content)
				.memberNo(memberNo)
				.build();
	}
	
}
