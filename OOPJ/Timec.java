class Timec{
    int Hours, Minutes, Seconds;

    public void Display(){
        Sysytem.out.println(Hours + ":" + Minutes + ":" + Seconds);
    }

    public void createObject(){
        Timec Obj1 = new Timec();
        System.out.print("Object 1 ==> ");
        Obj1.Display();
        Timec Obj2 = new Timec();
        System.out.print("Object 2 ==> ");
        Obj2.Display();
    }
}