/*
 *��̬����
 *����һ�����涯���Ľӿ�:IUserDao.java,
 *Ȼ��Ŀ�����ʵ������ӿڵķ���UserDao.java,
 *��ʱ���ʹ�þ�̬����ʽ,����Ҫ�ڴ������(UserDaoProxy.java)��Ҳʵ��IUserDao�ӿ�.
 *���õ�ʱ��ͨ�����ô������ķ���������Ŀ�����.
 *
 *��Ϊ���������Ҫ��Ŀ�����ʵ��һ���Ľӿ�,
 *���Ի��кܶ������,��̫��.ͬʱ,һ���ӿ����ӷ���,Ŀ�������������Ҫά��.
*/
package javaProxy1;

public class App {
	public static void main(String[] args) {
		UserDao target=new UserDao();
		UserDaoProxy proxy=new UserDaoProxy(target);
		proxy.save();
	}
}
