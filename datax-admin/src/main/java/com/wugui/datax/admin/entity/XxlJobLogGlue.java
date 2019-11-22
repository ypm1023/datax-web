package com.wugui.datax.admin.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * xxl-job log for glue, used to track job code process
 * @author xuxueli 2016-5-19 17:57:46
 */
@Data
public class XxlJobLogGlue {
	
	private int id;
	@ApiModelProperty("任务主键ID")
	private int jobId;
	@ApiModelProperty("GLUE类型\t#com.xxl.job.core.glue.GlueTypeEnum")
	private String glueType;
	@ApiModelProperty("GLUE源代码")
	private String glueSource;
	@ApiModelProperty("GLUE备注")
	private String glueRemark;
	private String addTime;
	private String updateTime;

}