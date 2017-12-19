package com.chequer.axboot.admin.domain.boardPro;
 
import static java.util.stream.Collectors.toList;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.domain.Page;

import com.chequer.axboot.core.utils.ModelMapperUtils;
import com.chequer.axboot.core.vo.BaseVO;

import lombok.Data;
import lombok.NoArgsConstructor;
 
@Data
@NoArgsConstructor
public class BoardProVO extends BaseVO {
 
	private Integer bno;
 
	private String subject;
 
	private String content;
 
	private String writer;
 
	private LocalDateTime regDate;
 
	private Integer hit;
 
    public static BoardProVO of(BoardPro boardPro) {
        BoardProVO boardProVO = ModelMapperUtils.map(boardPro, BoardProVO.class);
        return boardProVO;
    }
 
    public static List of(List boardProList) {
        return (List) boardProList.stream().map(boardPro -> of((BoardPro) boardPro)).collect(toList());
    }
    public static List of(Page boardProPage) {
        return (List) boardProPage.getContent().stream().map(boardPro -> of((BoardPro) boardPro)).collect(toList());
    }
}