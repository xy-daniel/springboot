package club.atotech.json.bean;

//import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author daniel
 * @version 1.0.0
 * @date 2020/1/12 18:44
 */
public class User {
    private Integer id;
    private String username;
    private String address;

    //单个实体类配置----》修改为全局配置
//    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    public User(Integer id, String username, String address, Date birthday) {
        this.id = id;
        this.username = username;
        this.address = address;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public User(Integer id, String username, String address) {
        this.id = id;
        this.username = username;
        this.address = address;
    }

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
