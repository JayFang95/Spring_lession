package com.jay.code.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author jay.fang
 * @since 2022-06-30
 */
@Getter
@Setter
@ApiModel(value = "User对象", description = "")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("所属公司id")
    private Long companyId;

    @ApiModelProperty("角色id")
    private Long roleId;

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("职务")
    private String post;

    @ApiModelProperty("手机号")
    private String phone;

    @ApiModelProperty("公众号id")
    private String appId;

    @ApiModelProperty("备注")
    private String note;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("是否可以删除")
    private Boolean deleteFlg;


}
