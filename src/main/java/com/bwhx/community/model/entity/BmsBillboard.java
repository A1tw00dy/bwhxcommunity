package com.bwhx.community.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;


@Data
@Builder
@Accessors(chain = true)
@TableName("bms_billboard")
@NoArgsConstructor
@AllArgsConstructor
public class BmsBillboard implements Serializable {
    private static final long serialVersionUid = 1L;

    @TableId(type = IdType.AUTO)
    private Integer id;

    @TableField("content")
    private String content;

    //公告时间 创建时自动填充
    @TableField(value = "create_time",fill = FieldFill.INSERT)
    private Date createTime;

    //1：展示 0：过期
    @Builder.Default
    @TableField("`show`")
    private boolean show = false;

}
