/**
 * <p>Company: www.black-shop.cn</p>
 *
 * <p>Copyright: Copyright (c) 2018-2050</p>
 * <p>
 * black-shop(黑店) 版权所有,并保留所有权利。
 */
package cn.balckshop.designpatterns.proxy.client;


import cn.balckshop.designpatterns.proxy.service.UserServuceImpl;
import cn.balckshop.designpatterns.proxy.staticproxy.UserServiceProxy;

/**
 * 测试类
 * @author zibin
 */
public class UserServiceTest {

    public static void main(String[] args) {
        UserServiceProxy userServiceProxy = new UserServiceProxy(new UserServuceImpl());
        userServiceProxy.deleteUser();
    }
}
