
public class Main {


    public static void main(String[] args) {

        /*System.out.println("Hello World!");
        System.out.println("Aravind");

        Pen p = new Pen();
        System.out.println(p.clicked);
        p.click();
        System.out.println(p.clicked);
        System.out.println("pen type = " + p.type);
        System.out.println("pen color = " + p.color);

        Phone ph = new Phone();

        System.out.println("Phone lock status: " + ph.locked);
        if (ph.locked == true) {
            System.out.println("Phone is locked, so unlocking now...");
            ph.unlock();
        }

        System.out.println("Phone lock status: " + ph.locked);

        if (ph.locked == false) {
            System.out.println("Phone is unlocked, so locking now...");
            ph.lock();
        }

        System.out.println("Phone lock status: " + ph.locked);
        */

        int x=0;
        while(x<=5)
        {
            System.out.println("Current value in the WHILE loop x (3rd change): "+ x);
            x++;
        }

        for(int y=0; y<=5; y++)
        {
            System.out.println("Current value in the FOR loop y:" + y);
        }

        {
            int[] marks = {10, 20, 30, 40, 50};
            int maxMarks = maximum(marks);
            System.out.println("Maximum Mark: " + maxMarks);
        }


    }
    public static int maximum(int[] numbers)
    {
        int maxMarks = numbers[0];
        for(int num : numbers)
        {
            if(maxMarks < num)
            {
                maxMarks = num;
            }

        }
        return maxMarks;
    }
}
