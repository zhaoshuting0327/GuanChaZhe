package com.susan2;

/**
 * Created by Administrator on 2017/11/30.
 */
public class MainTest {

    public static void main(String[] args) {


        GuPiao guPiao=new GuPiao();

        GuMing guMing=new GuMing();

        guPiao.addGuMing(guMing);



        guPiao.setPrice(12);
    }
}
