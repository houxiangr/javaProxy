/*
 *静态代理
 *定义一个保存动作的接口:IUserDao.java,
 *然后目标对象实现这个接口的方法UserDao.java,
 *此时如果使用静态代理方式,就需要在代理对象(UserDaoProxy.java)中也实现IUserDao接口.
 *调用的时候通过调用代理对象的方法来调用目标对象.
 *
 *因为代理对象需要与目标对象实现一样的接口,
 *所以会有很多代理类,类太多.同时,一旦接口增加方法,目标对象与代理对象都要维护.
*/
package javaProxy1;

public class App {
	public static void main(String[] args) {
		UserDao target=new UserDao();
		UserDaoProxy proxy=new UserDaoProxy(target);
		proxy.save();
	}
}
