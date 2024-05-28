package com.scccy.stgy.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;

/**
 * 支付方式表
 */
@Schema(description = "支付方式表")
@TableName(value = "payment_type")
public class PaymentType implements Serializable {
    @TableId(value = "id", type = IdType.INPUT)
    @Schema(description = "")
    private Long id;

    /**
     * 付款方式名称
     */
    @TableField(value = "`name`")
    @Schema(description = "付款方式名称")
    private String name;

    /**
     * 每次支付租期数
     */
    @TableField(value = "pay_month_count")
    @Schema(description = "每次支付租期数")
    private Integer payMonthCount;

    /**
     * 付费说明
     */
    @TableField(value = "additional_info")
    @Schema(description = "付费说明")
    private String additionalInfo;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    @Schema(description = "创建时间")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    @Schema(description = "更新时间")
    private Date updateTime;

    /**
     * 是否删除
     */
    @TableField(value = "is_deleted")
    @Schema(description = "是否删除")
    private Byte isDeleted;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取付款方式名称
     *
     * @return name - 付款方式名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置付款方式名称
     *
     * @param name 付款方式名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取每次支付租期数
     *
     * @return pay_month_count - 每次支付租期数
     */
    public Integer getPayMonthCount() {
        return payMonthCount;
    }

    /**
     * 设置每次支付租期数
     *
     * @param payMonthCount 每次支付租期数
     */
    public void setPayMonthCount(Integer payMonthCount) {
        this.payMonthCount = payMonthCount;
    }

    /**
     * 获取付费说明
     *
     * @return additional_info - 付费说明
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * 设置付费说明
     *
     * @param additionalInfo 付费说明
     */
    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取是否删除
     *
     * @return is_deleted - 是否删除
     */
    public Byte getIsDeleted() {
        return isDeleted;
    }

    /**
     * 设置是否删除
     *
     * @param isDeleted 是否删除
     */
    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", payMonthCount=").append(payMonthCount);
        sb.append(", additionalInfo=").append(additionalInfo);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append("]");
        return sb.toString();
    }
}