package cn.czzcz;

public class Client {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setTarget(userService);
        UserService proxy = (UserService) pih.getProxy();
        proxy.deleteUser();
    }
}
