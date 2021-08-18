package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();
        ArrayList<String> c = new ArrayList<>();
        Iterator<String> iter = c.iterator();

        Scanner sc = new Scanner(System.in);
        System.out.println("внесите данные в список a");

        while (true) {
            if (a.size() >= 5) {
                break;
            } else {
                a.add(sc.nextLine());
            }
        }
        System.out.println("список а заполнен" + a);

        System.out.println("внесите данные в список b");
        while (true) {
            if (b.size() >= 5) {
                break;
            } else {
                b.add(sc.nextLine());
            }
        }
        System.out.println("список b заполнен" + b);
        Collections.reverse(b);

        int afi =0; // для af
        int ci=0 ; //для c
        int ai=0; //для а
        int bi=0; //для b

        boolean af=false;
        while (c.size() < 10) {
            if (afi % 2 == 0) {
                af = true;
            }else {af=false;}

            iter.hasNext();

            if (af==true) {
                c.add(ci, a.get(ai));
                ai++;
                afi++;
                ci++;
            } else
            {
                c.add(ci, b.get(bi));
                bi++;
                ci++;
                afi++;
            }
        }
        System.out.println("список с");
        System.out.println(c);
        System.out.println("-----------------------------------");
        Collections.sort(c, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        System.out.println(c);
    }
}
