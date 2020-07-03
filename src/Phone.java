public class Phone {

    String[] color = {"black", "grey", "white"};
    String[] size = {"64", "128", "512"};
    String[] model = {"iphone6", "iphoneXS", "iphone11"};

    boolean locked = true;

    public void unlock()
    {
        locked = false;
    }

    public void lock()
    {
        locked = true;
    }

}
