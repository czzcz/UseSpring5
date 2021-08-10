package cn.czzcz;

import cn.czzcz.pojo.User;

public class UserServiceImpl implements UserService{
    @Override
    public void addUser() {
        System.out.println("add user");
    }

    @Override
    public void deleteUser() {
        System.out.println("delete user");
    }

    @Override
    public void modifyUser() {
        System.out.println("modify user");
    }

    @Override
    public void searchUser() {
        System.out.println("search user");
    }
}
