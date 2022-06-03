package Adv7;

public class MonthUtils {

    public static final Month Jan = new Month("Jan", 31);
    public static final Month Feb = new Month("Feb", 28);
    public static final Month March = new Month("March", 31);
    public static final Month Apr = new Month("Apr", 30);
    public static final Month May = new Month("May", 31);
    public static final Month Jun = new Month("Jun", 30);
    public static final Month Jul = new Month("Jul", 31);
    public static final Month Aug = new Month("Aug", 31);
    public static final Month Sep = new Month("Sep", 30);
    public static final Month Oct = new Month("Oct", 30);
    public static final Month Nov = new Month("Nov", 30);
    public static final Month Dec = new Month("Dec", 31);

    public static Month [] firstQuater(){
        return new Month[] {Jan, Feb, March};
    }

    public static Month [] secondQuater(){
        return new Month[] {Apr, May, Jun};
    }

    public static Month [] thirdQuater(){
        return new Month[] {Jul, Aug, Sep};
    }
    public static Month [] fourthQuater(){
        return new Month[] {Oct, Nov, Dec};
    }

    public static Month [] firstHalf(){
        return new Month[] {Jan, Feb, March, Apr, May, Jun};
    }

    public static Month [] secondHalf(){
        return new Month[] {Jul, Aug, Sep, Oct, Nov, Dec};
    }

    public static Month [] year(){
        return new Month[]{Jan, Feb, March, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec};
    }

}
