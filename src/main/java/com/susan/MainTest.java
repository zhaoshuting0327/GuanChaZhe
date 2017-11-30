package com.susan;

/**
 * Created by Administrator on 2017/11/30.
 */
public class MainTest {

    public static void main(String[] args) {

        People p1= new GuMing();
        People p2= new GuMing();
        GuPiao guPiao=new GuPiao();

        guPiao.addGuMing(p1);
        guPiao.addGuMing(p2);

        guPiao.setPrice(52);
    }
}
