/**
 * <p>Company: www.black-shop.cn</p>
 *
 * <p>Copyright: Copyright (c) 2018-2050</p>
 * <p>
 * black-shop(黑店) 版权所有,并保留所有权利。
 */
package cn.balckshop.designpatterns.proxy.service;

/**
 * 用户服务实现
 */
public class UserServuceImpl implements UserService {
    public void deleteUser() {
        System.out.println("删除用户李四---------》》");
    }
}
