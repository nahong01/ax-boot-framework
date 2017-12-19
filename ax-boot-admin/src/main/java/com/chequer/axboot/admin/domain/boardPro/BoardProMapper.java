package com.chequer.axboot.admin.domain.boardPro;
 
import com.chequer.axboot.core.mybatis.MyBatisMapper;
import java.util.List;
 
 
public interface BoardProMapper extends MyBatisMapper {
 
    List findAll();
    BoardPro findOne(BoardPro boardPro);
    int update(BoardPro boardPro);
    int delete(BoardPro boardPro);
    int insert(BoardPro boardPro);
}