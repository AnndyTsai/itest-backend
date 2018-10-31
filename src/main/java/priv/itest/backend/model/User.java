package priv.itest.backend.model;

import com.google.gson.Gson;

import java.util.Date;

/**
 * Create By ab.xie.
 * 0n 2018/10/30 14:50.
 */
public class User extends Model{
    public static void main(String[] args) {
        String str = "{\"userRole\":\"1\",\"userName\":\"faker\",\"password\":\"123456\"}";
        User user = new Gson().fromJson(str, User.class);
        System.out.println(user);
    }

    private Integer userId;

    private String userName;

    private String password;

    private String email;

    private Integer userRole;

    private Date createTime;

    private Date updateTime;

    public User(){

    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getUserRole() {
        return userRole;
    }

    public void setUserRole(Integer userRole) {
        this.userRole = userRole;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
