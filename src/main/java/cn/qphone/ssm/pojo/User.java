package cn.qphone.ssm.pojo;

public class User {
    private Integer id;
    private String username;
    private String password;
    private Integer group_id;

    public User() {
    }

    public User(Integer id, String username, String password, Integer group_id) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.group_id = group_id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getGroup_id() {
        return group_id;
    }

    public void setGroup_id(Integer group_id) {
        this.group_id = group_id;
    }
}
