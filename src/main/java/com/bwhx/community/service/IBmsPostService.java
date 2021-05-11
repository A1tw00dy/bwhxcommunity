package com.bwhx.community.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.bwhx.community.model.entity.BmsPost;
import com.bwhx.community.model.vo.PostVO;

import java.util.List;
import java.util.Map;


public interface IBmsPostService extends IService<BmsPost> {

    /**
     * 获取首页话题列表
     *
     * @param page
     * @param tab
     * @return
     */
    Page<PostVO> getList(Page<PostVO> page, String tab);
}
