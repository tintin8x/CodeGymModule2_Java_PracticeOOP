import java.util.Date;
import java.util.concurrent.TimeUnit;


public class OOP {

    public static void main(String[] args) throws InterruptedException {
//        //Bai tap giai phuong trinh bac 2
//
//        PtBac2 pt = new PtBac2(1,2,3);
//        pt.giaiPTBac2();

        //Bai tap Stop Watch
        StopWatch sw = new StopWatch();
        sw.start();
        System.out.println("Start time: " + new Date());
        Thread.sleep(5000);
        System.out.println("End time: " + new Date());
        System.out.println("Elaped time: " + sw.getElapsedTime(TimeUnit.SECONDS));

    }
}

class Student{
    String name;
    String classes;

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}

class Fan{

    static int SLOW = 1;
    static int MEDIUM =2;
    static int FAST = 3;

    private  int speed;
    private boolean on;
    private double radius;
    private String color;


}

class PtBac2{
    private float a;
    private float b;
    private float c;

    public PtBac2(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getC() {
        return c;
    }

    public void setA(float a) {
        this.a = a;
    }

    public void setB(float b) {
        this.b = b;
    }

    public void setC(float c) {
        this.c = c;
    }

    public void giaiPTBac2() {
        // kiểm tra các hệ số
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
            return;
        }
        // tính delta
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        // tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
}

class StopWatch{
    private long startTime;
    private long endTime;

    public void StopWatch(){
        startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public void start(){
        startTime = System.currentTimeMillis();
    }

    public void stop(){
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime(){
        stop();
        return endTime - startTime;
    }

    public long getElapsedTime(TimeUnit unit) {
        return unit.convert(getElapsedTime(), TimeUnit.MILLISECONDS);
    }

}