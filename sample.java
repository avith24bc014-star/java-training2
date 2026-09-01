package code;

import java.util.ArrayList;

public class sample {
    public static void main(String[] args) {
        employee e1 =new employee(1,"avith",50000);
        employee e2 =new employee(2,"aarol",80000);
        employee e3 =new employee(3,"dishanth",100000);

        ArrayList<employee> list=new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(new employee(4,"bhavanth",120000));

        for(employee e:list)
        {
            System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
        }
    }

}
