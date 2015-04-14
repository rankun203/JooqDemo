package org.rankun.dao.model;

import org.joda.time.LocalDateTime;

import java.sql.Timestamp;

/**
 * Created on 4/14/15.
 *
 * @author rankun203
 */
public class User {
    private final Long uid;
    private final String userName;
    private final String password;
    private final Integer gender;
    private final String nickName;
    private final String avatar;
    private final String sign;
    private final Integer school;
    private final LocalDateTime registerTime;
    private final String location;

    private User(Builder builder) {
        this.uid = builder.uid;
        this.userName = builder.userName;
        this.password = builder.password;
        this.gender = builder.gender;
        this.nickName = builder.nickName;
        this.avatar = builder.avatar;
        this.sign = builder.sign;
        this.school = builder.school;

        LocalDateTime registerTime = null;
        if (builder.registerTime != null) {
            registerTime = new LocalDateTime(builder.registerTime);
        }
        this.registerTime = registerTime;

        this.location = builder.location;
    }

    public static Builder getBuilder(String userName) {
        return new Builder(userName);
    }

    public Long getUid() {
        return uid;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public Integer getGender() {
        return gender;
    }

    public String getNickName() {
        return nickName;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getSign() {
        return sign;
    }

    public Integer getSchool() {
        return school;
    }

    public LocalDateTime getRegisterTime() {
        return registerTime;
    }

    public String getLocation() {
        return location;
    }

    public static class Builder{
        private Long uid;
        private String userName;
        private String password;
        private Integer gender;
        private String nickName;
        private String avatar;
        private String sign;
        private Integer school;
        private Timestamp registerTime;
        private String location;

        public Builder(String userName) {
            this.userName = userName;
        }

        public Builder uid(Long uid) {
            this.uid = uid;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder gender(Integer gender) {
            this.gender = gender;
            return this;
        }

        public Builder nickName(String nickName) {
            this.nickName = nickName;
            return this;
        }

        public Builder avatar(String avatar) {
            this.avatar = avatar;
            return this;
        }

        public Builder sign(String sign) {
            this.sign = sign;
            return this;
        }

        public Builder school(Integer school) {
            this.school = school;
            return this;
        }

        public Builder registerTime(Timestamp registerTime) {
            this.registerTime = registerTime;
            return this;
        }

        public Builder location(String location) {
            this.location = location;
            return this;
        }

        public User build() {
            User user = new User(this);

            // 负责构建, 调用 build 方法的逻辑必须要在 getBuilder 之后设置好一些值, 再调用 build
            if (user.userName == null || user.userName.length() == 0) {
                throw new IllegalStateException("userName cannot be null");
            }

            return user;
        }
    }
}
