package com.bwhx.community.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bwhx.community.mapper.BmsTopicTagMapper;
import com.bwhx.community.model.entity.BmsTopicTag;
import com.bwhx.community.service.IBmsTopicTagService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional(rollbackFor = Exception.class)
public class IBmsTopicTagServiceImpl extends ServiceImpl<BmsTopicTagMapper, BmsTopicTag> implements IBmsTopicTagService {

    @Override
    public List<BmsTopicTag> selectByTopicId(String topicId) {
        QueryWrapper<BmsTopicTag> wrapper = new QueryWrapper<>();
        wrapper.lambda().eq(BmsTopicTag::getTopicId, topicId);
        return this.baseMapper.selectList(wrapper);
    }

}
