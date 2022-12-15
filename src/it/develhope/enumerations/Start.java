package it.develhope.enumerations;

public class Start {

    enum Month{
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }

    public static void main(String[] args) {

    for(Month x : Month.values()){
        String name = x.name();

        if(name.endsWith("Y")){
            System.out.println(name + " ends with y");
        }else{
            System.out.println(name + " doesn't end with y");
        }
    }

    }
}
