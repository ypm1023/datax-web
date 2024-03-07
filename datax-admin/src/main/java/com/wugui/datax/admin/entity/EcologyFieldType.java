package com.wugui.datax.admin.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author liliang
 * @date 2024/3/6
 */
@Data
public class EcologyFieldType implements Serializable {

    private static final long serialVersionUID = 4186697719773899294L;

    @ApiModelProperty("主键Id")
    private long id;

    @ApiModelProperty("表现形式")
    private String expressions;

    @ApiModelProperty("类型名称")
    private String typeName;

    @ApiModelProperty("类型值")
    private String typeValue;

    @ApiModelProperty("数据库类型")
    private String dataType;

    @ApiModelProperty("是否多选（true:多选，false:单选）")
    private  boolean multiple;

}
