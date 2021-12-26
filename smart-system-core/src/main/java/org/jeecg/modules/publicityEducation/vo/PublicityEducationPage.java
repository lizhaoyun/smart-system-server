package org.jeecg.modules.publicityEducation.vo;

import java.util.List;
import org.jeecg.modules.publicityEducation.entity.PublicityEducation;
import org.jeecg.modules.publicityEducation.entity.PublicityEducationPacpa;
import org.jeecg.modules.publicityEducation.entity.PublicityEducationAnnex;
import lombok.Data;
import org.jeecgframework.poi.excel.annotation.Excel;
import org.jeecgframework.poi.excel.annotation.ExcelEntity;
import org.jeecgframework.poi.excel.annotation.ExcelCollection;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;
import org.jeecg.common.aspect.annotation.Dict;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Description: 宣传教育主表
 * @Author: jeecg-boot
 * @Date:   2021-12-26
 * @Version: V1.0
 */
@Data
@ApiModel(value="publicity_educationPage对象", description="宣传教育主表")
public class PublicityEducationPage {

	/**主键*/
	@ApiModelProperty(value = "主键")
    private java.lang.String id;
	/**创建人*/
	@ApiModelProperty(value = "创建人")
    private java.lang.String createBy;
	/**创建日期*/
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@ApiModelProperty(value = "创建日期")
    private java.util.Date createTime;
	/**更新人*/
	@ApiModelProperty(value = "更新人")
    private java.lang.String updateBy;
	/**更新日期*/
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@ApiModelProperty(value = "更新日期")
    private java.util.Date updateTime;
	/**所属部门*/
	@ApiModelProperty(value = "所属部门")
    private java.lang.String sysOrgCode;
	/**村庄*/
	@Excel(name = "村庄", width = 15)
	@ApiModelProperty(value = "村庄")
    private java.lang.String village;
	/**标题*/
	@Excel(name = "标题", width = 15)
	@ApiModelProperty(value = "标题")
    private java.lang.String title;
	/**地点*/
	@Excel(name = "地点", width = 15)
	@ApiModelProperty(value = "地点")
    private java.lang.String address;
	/**时间*/
	@Excel(name = "时间", width = 20, format = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@ApiModelProperty(value = "时间")
    private java.util.Date time;

	@ExcelCollection(name="宣传教育参会人员")
	@ApiModelProperty(value = "宣传教育参会人员")
	private List<PublicityEducationPacpa> publicityEducationPacpaList;
	@ExcelCollection(name="宣传教育附件表")
	@ApiModelProperty(value = "宣传教育附件表")
	private List<PublicityEducationAnnex> publicityEducationAnnexList;

}