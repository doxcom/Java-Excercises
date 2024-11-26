package Enums;

import static Enums.Season.*;

public class ReadEnum {

    int number=0;
    public int getExpectedWheater(){


        switch (number){
            case WINTER:
                return 1;

            case SPRING:
                return 2;

            case FALL:
                return 3;

            case SUMMER:
                return 4;
        }

        return -1;
    }
}
