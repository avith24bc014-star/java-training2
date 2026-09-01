package code;

import java.util.ArrayList;

public class sample2 {
    public static void main(String[] args) {
        customer c1=new customer(1,"avith",2000);
        customer c2=new customer(2,"aarol",7000);
        customer c3=new customer(3,"dishanth",10000);

        ArrayList<customer> list=new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(new customer(4,"bhavanth",25000));

        for(customer c:list){
            System.out.println(c.getCustomer_id()+" "+c.getName()+" "+c.getBill());
        }
    }
}
