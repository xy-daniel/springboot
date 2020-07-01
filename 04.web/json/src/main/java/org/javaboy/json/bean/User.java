package org.javaboy.json.bean;

//import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author daniel
 * @version 1.0.0
 * @date 2020/3/6 21:17
 */
public class User {

    private Integer id;
    private String name;
    private String address;
    //格式化日期格式----弊端如果很多日期每个实体类都需要添加这个注解----我们寻求一个全局的配置
//    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
