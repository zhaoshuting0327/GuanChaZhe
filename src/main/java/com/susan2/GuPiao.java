package com.susan2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/11/30.
 */
public class GuPiao implements Ticket {

    private double price=0;
    private List<GuMing> list=new ArrayList<GuMing>();
    @Override
    public void addGuMing(People p) {

        list.add((GuMing) p);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if (price!=this.price)
        {
           for(GuMing g:list)
           {
            g.callMe();
           }
        }


        this.price = price;
    }
}
