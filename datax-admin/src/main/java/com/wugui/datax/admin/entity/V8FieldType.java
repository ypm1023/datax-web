package com.wugui.datax.admin.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author liliang
 * @date 2024/3/6
 */
@Data
@TableName("v8_field_type")
public class V8FieldType implements Serializable {

    private static final long serialVersionUID = -9017155463301369456L;

    @ApiModelProperty(name="主键Id")
    @TableId(type=IdType.ASSIGN_UUID)
    private long id;

    @ApiModelProperty(name = "名称-描述")
    private String name;

    @ApiModelProperty(name = "类型名称",value = "文本")
    private String typeName;

    @ApiModelProperty(name = "默认小数位数")
    private int defaultDecimalPlaces;

    @ApiModelProperty(name = "默认阈值",value = "100")
    private int defaultThreshold;

    @ApiModelProperty("关联实体")
    private String relationEntity;
    @ApiModelProperty(name = "是否多选（1:多选，0:单选）",value = "0")
    private  int multiple;

    @ApiModelProperty(name = "用户Id",value = "1")
    private int userId;

    @ApiModelProperty("创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date modifyTime;


}
