package cn.czzcz;

import cn.czzcz.pojo.User;

import javax.jws.soap.SOAPBinding;

public interface UserService {
    void addUser();
    void deleteUser();
    void modifyUser();
    void searchUser();
}
