package com.bwhx.community.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bwhx.community.model.entity.BmsTip;

public interface IBmsTipService extends IService<BmsTip> {
    BmsTip getRandomTip();
}