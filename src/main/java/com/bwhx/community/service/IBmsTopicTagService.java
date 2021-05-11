package com.bwhx.community.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bwhx.community.model.entity.BmsTopicTag;

import java.util.List;
import java.util.Set;

public interface IBmsTopicTagService extends IService<BmsTopicTag> {

    /**
     * 获取Topic Tag 关联记录
     *
     * @param topicId TopicId
     * @return
     */
    List<BmsTopicTag> selectByTopicId(String topicId);

}
