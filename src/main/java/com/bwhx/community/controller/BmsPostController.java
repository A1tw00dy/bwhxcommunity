package com.bwhx.community.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bwhx.community.common.api.ApiResult;
import com.bwhx.community.model.vo.PostVO;
import com.bwhx.community.service.IBmsPostService;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;


@RestController
@RequestMapping("/post")
public class BmsPostController extends BaseController {

    @Resource
    private IBmsPostService iBmsPostService;

    @GetMapping("/list")
    public ApiResult<Page<PostVO>> list(@RequestParam(value = "tab", defaultValue = "latest") String tab,
                                        @RequestParam(value = "pageNo", defaultValue = "1")  Integer pageNo,
                                        @RequestParam(value = "size", defaultValue = "10") Integer pageSize) {
        Page<PostVO> list = iBmsPostService.getList(new Page<>(pageNo, pageSize), tab);
        return ApiResult.success(list);
    }

}