package code;

import java.util.ArrayList;

public class test2 {
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
        list.stream().forEach(K-> System.out.println(K.getName()));
        ArrayList<String> list2=new ArrayList<>();
        list2.add("kiran");
        list2.add("melroy");
        list2.add("melssi");
        list2.stream().forEach((k-> System.out.println(k)));
        list2.stream().filter(k->k.startsWith("R")).forEach(k-> System.out.println(k));

        ArrayList<Integer> list3=new ArrayList<>();
        list3.add(10);
        list3.add(2);
        list3.add(7);
        list3.add(5);
        list3.stream().filter(k->k%2==0).forEach(k-> System.out.println(k));
        System.out.println("map()");
        list3.stream().map(k->k*2).forEach(k-> System.out.println(k));

    }}
