package org.javaboy.swagger2.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author daniel
 * @version 1.0.0
 * @date 2020/3/25 22:27
 */
@ApiModel(value = "用户实体类", description = "用户信息描述类")
public class User {

    @ApiModelProperty(value = "用户id")
    private Integer id;
    @ApiModelProperty(value = "用户名称")
    private String username;
    @ApiModelProperty(value = "用户地址")
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
