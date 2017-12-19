package com.chequer.axboot.admin.controllers.boardPro;
 
import com.chequer.axboot.core.api.response.Responses;
import com.chequer.axboot.core.controllers.BaseController;
import com.chequer.axboot.core.parameter.RequestParams;
import org.springframework.stereotype.Controller;
import com.chequer.axboot.core.api.response.ApiResponse;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.chequer.axboot.admin.domain.boardPro.BoardPro;
import com.chequer.axboot.admin.domain.boardPro.BoardProService;

import javax.inject.Inject;
import java.util.List;
 
@Controller
@RequestMapping(value = "/api/v1/boardPros")
public class BoardProController extends BaseController {
 
    @Inject
    private BoardProService boardProService;
 
    @RequestMapping(method = RequestMethod.GET, produces = APPLICATION_JSON)
    public Responses.ListResponse list(RequestParams requestParams) {
        List list = boardProService.gets(requestParams);
        return Responses.ListResponse.of(list);
    }
    @RequestMapping(method = {RequestMethod.PUT}, produces = APPLICATION_JSON)
    public ApiResponse save(@RequestBody List request) {
        boardProService.save(request);
        return ok();
    }
}
