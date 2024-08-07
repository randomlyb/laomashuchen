package com.msb.test;

import java.util.ArrayList;
import java.util.Scanner;//告诉程序这个类在什么位置

public class test {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();//书的集合
        while (true) {
            System.out.println("欢迎来到【老马书城】");
            System.out.println("1.展示书籍");
            System.out.println("2.上新书籍");
            System.out.println("3.下架书籍");
            System.out.println("4.退出应用");
            //根据键盘输入执行相关指令
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入指令序号");
            int choice = sc.nextInt();
            if (choice == 1) {
                for (int i = 0; i <=list.size(); i++) {
                    book b = (book) list.get(i);
                    System.out.println(b.getId());
                    System.out.println(b.getName());
                    System.out.println(b.getAuthor());
                    System.out.println(b.getPrice());
                }
            }//从键盘录入书籍信息

            if (choice == 2) {
                System.out.println("【老马书城】<<<<<<2.上新书籍");
                System.out.println("【老马书城】<<<<<<1.展示书籍");
                System.out.println("请输入书籍编号");
                int id=sc.nextInt();
                System.out.println("请输入书籍名称");
                String name=sc.next();
                System.out.println("请输入书籍作者");
                String author=sc.next();
                System.out.println("请输入书籍价格");
                int price=sc.nextInt();
                book b=new book(id,name,author,price);
                b.setId(id);
                b.setName(name);
                b.setAuthor(author);
                b.setPrice(price);
                //创建一个各种书的集合
                list.add(b);//添加个体到集合去
            }
            if (choice == 3) {
                System.out.println("【老马书城】<<<<<<3.下架书籍");
                //录入要下架的书籍
                //下架书籍
                System.out.println("请输入要下架的书籍编号");
                int id=sc.nextInt();
                for (int i=0;i<list.size();i++) {
                    book b = (book) list.get(i);
                    if (b.getId()==id)
                        list.remove(b);
                    System.out.println("书籍已经下架");
                    
                }
            }
            if (choice == 4) {
                System.out.println("【老马书城】<<<<<<4.退出应用");
                break;//
            }
        }
        }
        }




