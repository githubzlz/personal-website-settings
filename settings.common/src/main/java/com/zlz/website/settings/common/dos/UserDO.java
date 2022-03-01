package com.zlz.website.settings.common.dos;

/**
 * @author zhulinzhong
 * @date 2022-02-24 17:46:29
 */
public class UserDO {

    private String username;

    private String password;

    private Integer enabled;

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

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }
}
