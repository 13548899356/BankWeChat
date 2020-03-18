package com.zking.nacosprovider.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author liu
 * @since 2020-03-12
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Dictionary extends Model {

    private static final long serialVersionUID = 1L;
    /**
     * 编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private String id;
    /**
     * 字典类型
     */
    @TableField("dictType")
    private String dictType;

    /**
     * 字典条目
     */
    @TableField("dictItem")
    private String dictItem;

    /**
     * 字典值
     */
    @TableField("dictValue")
    private String dictValue;

    /**
     * 是否可编辑
     */
    @TableField("dictIsEditable")
    private Integer dictIsEditable;


}
