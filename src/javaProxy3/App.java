package javaProxy3;

/**
 * ������
 */
public class App {

    public static void main(String[] args){
        //Ŀ����� 
        UserDao target = new UserDao();

        //�������
        UserDao proxy = (UserDao)new ProxyFactory(target).getProxyInstance();

        //ִ�д������ķ���
        proxy.save();
    }
}