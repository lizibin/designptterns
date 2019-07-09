/**
 * <p>Company: www.black-shop.cn</p>
 *
 * <p>Copyright: Copyright (c) 2018-2050</p>
 * <p>
 * black-shop(黑店) 版权所有,并保留所有权利。
 */
package cn.balckshop.designpatterns.proxy.staticproxy;


import cn.balckshop.designpatterns.proxy.service.UserService;


/**
 * 用户服务静态代理类
 */
public class UserServiceProxy implements UserService {

    private UserService userService;

    public UserServiceProxy(UserService userService) {
        this.userService = userService;
    }

    public void deleteUser() {
        System.out.println("删除用户准备开始-----》》");
        userService.deleteUser();
        System.out.println("删除用户准备结束-----》》");
    }
}
