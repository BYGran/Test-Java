package Work09.EX01Sys;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Person a[]=new Person[3];
        a[0]=new Person("zhangsan",1111,"1998-03-15","旅游，唱歌");
        Scanner sc= new Scanner(System.in);
        boolean loop=true;
        System.out.println("1.注册    2.登录    3.退出");
        while(loop){
            int x=sc.nextInt();
            if(x==1||x==2||x==3||x==0)
            {
                xz(x,a);
                System.out.println("1.注册    2.登录    3.退出");
            }
            else{

                System.out.println("输入有误,重新输入:");
            }
        }

    }

//    登录选择功能
    public static void xz(int x,Person a[]){
        switch (x){
            case 0:
                show(a);
                break;
            case 1:
                int index=checknum(a);
                if(index==-1){
                    break;
                }else {
                    registe(a,index);
                }
                break;
            case 2:
                login(a);
                break;
            case 3:
                System.out.println("BYE BYE!");
                System.exit(0);
        }
    }

    private static void login(Person[] a) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name=sc.next();
        System.out.println("请输入登录密码：");
        Integer psw=sc.nextInt();

//
        int p=checklog(a,name,psw);
        if(p==-1){
            System.out.println("用户名或密码错误！");
        }else
        {
            System.out.println(a[p].getName()+" "+a[p].getPsw()+" "+a[p].getBirth()+" "+a[p].getInfo());

        }
    }


//    检查用户名是否存在，若存在返回其索引值
    private static int checklog(Person a[],String name,Integer psw) {
//        记录空白位置
        int index=3;
        int p=-1;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==null){
                index=i;
                break;
            }
        }
        for (int i = 0; i < index; i++) {
            if(a[i].getName().equals(name)){
                p=i;
                break;
            }
        }

        int x=a[p].getPsw();
        if(x!=psw){
            p=-1;
        }



        return p;
    }


    //    检查数组是否已满，并将第一个空闲位置的索引值返回
    private static int checknum(Person a[]) {
//        记录插入信息位置
        int index=-1;

        int ck=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==null){
                index=i;
                ck=1;
                break;
            }
        }
        if(ck==0)
            System.out.println("禁止注册");
        return index;
    }

//    注册
    public static void registe(Person[] a, int index){
        String name,birth,info;
        Integer psw;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入");
        System.out.println("用户名：");
        name=sc.next();
        System.out.println("登录密码：");
        psw=sc.nextInt();
        System.out.println("出生日期：");
        birth=sc.next();
        System.out.println("爱好（多个爱好中间用逗号(中英文都可以)隔开：");
        info=sc.next();
        a[index]=new Person(name,psw,birth,info);
        System.out.println("注册成功！");
        show(a);
    }

    public static void show(Person a[]){
        int index=3;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==null){
                index=i;
                break;
            }
        }
        for (int i = 0; i < index; i++) {
//            a[i]=new Person();
            System.out.println(a[i].getName()+" "+a[i].getPsw()+" "+a[i].getBirth()+" "+a[i].getInfo());
        }
    }
}
