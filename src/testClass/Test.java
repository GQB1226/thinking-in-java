package testClass;


/**
 * Created by lw on 14-5-19.
 * <p/>
 * Class������ô��ʼ�������������Ѵ���˳��
 * <p/>
 * 1.��ִ�о�̬�����վ�̬������߾�̬������˳��ִ��
 * 2.ִ��main
 * 3.�Ǿ�̬�����ĳ�ʼ����������˳��ִ��
 * 4.��������
 * 5.���췽��
 * -----------------
 * ��̬����ִ�м��Σ�
 * ��������ִ��˳��
 * ����Ǹ��������ָ�������أ�
 * �����Ա������������������class�أ�
 * ���� int i=10; int j; ִ��i=10ʱ�� j ������������Ǿ�̬���أ�
 */
public class Test extends SuperInitClass {

    static {
        System.out.println("InitClass->��̬����� 1");
    }

    static String s1 = "InitClass->��̬����s1";

    static String s2 = getS2();

    static {
        System.out.println("InitClass->��̬����� 2");
        System.out.println("InitClass->��̬����� 2->����static String s1=" + s1);
    }


    String s3 = "InitClass->��Ա����s3";
    String s4 = getS4();
    static String s5;

    {
        System.out.println("InitClass->���췽�������");
        System.out.println("InitClass->���췽������� ִ��ʱ���Ա����s3�Ƿ��Ѿ���ʼ���ˣ�" + (s3 != null));
    }

    Test() {
        System.out.println("InitClass->���췽��");
        System.out.println("InitClass->���췽�� ִ��ʱ���Ա����s3�Ƿ��Ѿ���ʼ���ˣ�" + (s3 != null));
    }


    static String getS2() {
        System.out.println("InitClass->getS2()ִ��->��ʼ����̬����s1");
        return "InitClass->��ʼ����̬����s1";
    }

    static String getS4() {
        System.out.println("InitClass->getS4()ִ��->��ʼ����Ա����s4");
        return "InitClass->��ʼ����Ա����s4";
    }

    public static void main(String[] args) {
        System.out.println("main.........run");
        System
        .out.println();
        System.out.println("------------InitClass initClass = new InitClass();----------------ִ��");
        Test initClass = new Test();
        System.out.println();
        System.out.println("------------SuperInitClass superInitClass = new InitClass();----------------ִ��");
        SuperInitClass superInitClass = new Test();
    }

}

class SuperInitClass {
    static {
        System.out.println("SuperInitClass->��̬����� 1");
    }

    static String s1 = "SuperInitClass->��̬����s1";

    static String s2 = getS2();
 
    static {
        System.out.println("SuperInitClass->��̬����� 2");
        System.out.println("SuperInitClass->��̬����� 2->����static String s1=" + s1);
    }

    String s3 = "SuperInitClass->��Ա����s3";
    String s4 = getS4();

    People people = new People();

    {
        System.out.println("SuperInitClass->���췽�������");
        System.out.println("SuperInitClass->���췽������� ִ��ʱ���Ա����s3�Ƿ��Ѿ���ʼ���ˣ�" + (s3 != null));
    }

    SuperInitClass() {
        System.out.println("SuperInitClass->���췽��");
        System.out.println("SuperInitClass->���췽�� ִ��ʱ���Ա����s3�Ƿ��Ѿ���ʼ���ˣ�" + (s3 != null));
    }

    static String getS2() {
        System.out.println("SuperInitClass->getS2()ִ��->��ʼ����̬����s1");
        return "SuperInitClass->��ʼ����̬����s1";
    }

    static String getS4() {
        System.out.println("SuperInitClass->getS4()ִ��->��ʼ����Ա����s4");
        return "SuperInitClass->��ʼ����Ա����s4";
    }
}

class People {

    People() {
        System.out.println("PeopleClass->init...");
    }
}
