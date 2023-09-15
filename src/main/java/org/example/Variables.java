package org.example;

public class Variables {
    public static void main(String[] args) {

        // Deklarace se zklada z urceni typu a jmena promenne
        // Toto je deklarace promenne typu bayt se jmenem myFirtstByte
        byte  myFirstByte  = 2 ;
        short myFirstShort = 2 ;
        int   myFirstInt   = 2 ;
        long  myFirstLong  = 2 ;

        Byte objByte = Byte.MAX_VALUE;
        Short objShort = Short.MAX_VALUE;
        Integer objInteger = Integer.MAX_VALUE;
        Long objLong = Long.MAX_VALUE;

        System.out.println("Byte max " + objByte);
        System.out.println("Short max " + objShort);
        System.out.println("Int max " + objInteger);
        System.out.println("Long max " + objLong);

        decimalNumbers();
        logicValues();
    }

    public static void decimalNumbers(){
        float myFloat = 3.14f;
        double myDouble = 22.33;

        Float objFloat = Float.MAX_VALUE;
        Double objDouble = Double.MAX_VALUE;
        System.out.println("Flout " + objFloat);
        System.out.println("Double " + objDouble);
    }

    public static void logicValues(){
        boolean jirka = true ;
        Boolean objBool = Boolean.FALSE;

        System.out.println("Boolean " + objBool);
    }
}
