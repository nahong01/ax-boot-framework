package com.chequer.axboot.admin.domain.boardPro;
 
import org.springframework.stereotype.Service;
import com.chequer.axboot.admin.domain.BaseService;
import javax.inject.Inject;
import com.chequer.axboot.core.parameter.RequestParams;
import java.util.List;
 
@Service
public class BoardProService extends BaseService {
    private BoardProRepository boardProRepository;
    @Inject
    public BoardProService(BoardProRepository boardProRepository) {
        super(boardProRepository);
        this.boardProRepository = boardProRepository;
    }
    public List gets(RequestParams requestParams) {
        return findAll();
    }
}