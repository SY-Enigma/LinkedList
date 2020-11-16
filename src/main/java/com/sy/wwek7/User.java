package com.sy.wwek7;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName User
 * @Description TODO
 * @Author SY
 * @Date 2020/11/9
 **/
@Getter
@Setter
public class User {
        private int id;
        private String userName;
        private String password;

        public User() {
            super();
        }

        public User(String userName, String password) {
            super();
            this.userName = userName;
            this.password = password;
        }

    }



