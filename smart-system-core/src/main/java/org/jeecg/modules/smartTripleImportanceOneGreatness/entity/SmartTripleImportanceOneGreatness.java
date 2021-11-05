package org.jeecg.modules.smartTripleImportanceOneGreatness.entity;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import org.jeecgframework.poi.excel.annotation.Excel;
import org.jeecg.common.aspect.annotation.Dict;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Description: 三重一大表
 * @Author: jeecg-boot
 * @Date:   2021-11-05
 * @Version: V1.0
 */
@ApiModel(value="smart_triple_importance_one_greatness对象", description="三重一大表")
@Data
@TableName("smart_triple_importance_one_greatness")
public class SmartTripleImportanceOneGreatness implements Serializable {
    private static final long serialVersionUID = 1L;

	/**主键*/
	@TableId(type = IdType.ASSIGN_ID)
    @ApiModelProperty(value = "主键")
    private java.lang.String id;
	/**单位ID*/
	@Excel(name = "单位ID", width = 15)
    @ApiModelProperty(value = "单位ID")
    private java.lang.String documentid;
	/**名称*/
	@Excel(name = "名称", width = 15)
    @ApiModelProperty(value = "名称")
    private java.lang.String meetingName;
	/**地点*/
	@Excel(name = "地点", width = 15)
    @ApiModelProperty(value = "地点")
    private java.lang.String meetingPlace;
	/**时间*/
	@Excel(name = "时间", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "时间")
    private java.util.Date meetingStarttime;
	/**类型*/
	@Excel(name = "类型", width = 15, dicCode = "meeting_type")
    @Dict(dicCode = "meeting_type")
    @ApiModelProperty(value = "类型")
    private java.lang.String meetingType;
	/**参会人数*/
	@Excel(name = "参会人数", width = 15)
    @ApiModelProperty(value = "参会人数")
    private java.lang.Integer meetingNumber;
	/**参会人员*/
	@Excel(name = "参会人员", width = 15)
    @ApiModelProperty(value = "参会人员")
    private java.lang.String meetingPeople;
	/**主持人*/
	@Excel(name = "主持人", width = 15)
    @ApiModelProperty(value = "主持人")
    private java.lang.String meetingHoster;
	/**记录人*/
	@Excel(name = "记录人", width = 15)
    @ApiModelProperty(value = "记录人")
    private java.lang.String meetingRecorer;
	/**会议内容摘要*/
	@Excel(name = "会议内容摘要", width = 15)
    @ApiModelProperty(value = "会议内容摘要")
    private java.lang.String meetingAbstract;
	/**备注*/
	@Excel(name = "备注", width = 15)
    @ApiModelProperty(value = "备注")
    private java.lang.String meetingRemarks;
	/**创建人*/
    @ApiModelProperty(value = "创建人")
    private java.lang.String createBy;
	/**创建时间*/
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "创建时间")
    private java.util.Date createTime;
}