package com.company;

public class DailyTask {

    String name;
    String prio;
    Integer comp;


    //!!!enum Complaxity {Hard, Middle, Easy}


    public DailyTask(String nm, String pr, String cmp) {
        this.name = nm;
        this.prio = Priority();
        this.comp = CompHours(cmp);


    }

    public static String Priority() {
        Priority[] priorities = Priority.values();
        for (Priority p : priorities) {
            return String.valueOf(p);

        }
        return null;
    }

    public static Integer CompHours(String s) {
        Integer hours = 0;
        if (s.equals("HARD") || Integer.valueOf(s)==1) {
             hours =4;}
            else if (s.equals("MEDIUM") || Integer.valueOf(s)==2) {
                hours = 2;}
                if (s.equals("EASY") || Integer.valueOf(s) == 3) {
                    hours = 1;}


        return hours;
    }
        
    }