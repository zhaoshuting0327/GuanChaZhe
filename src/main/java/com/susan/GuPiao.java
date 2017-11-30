package com.susan;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/30.
 */
public class GuPiao implements  Ticket {

    private double price=0;

    List<People> list=new ArrayList<People>();



    @Override
    public void addGuMing(People people) {
        list.add(people);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if(price!=this.price)
        {
           for(People o:list)
           {
               System.out.println("hahaha");
               o.callMe();
           }
        }
        this.price = price;
    }
}
