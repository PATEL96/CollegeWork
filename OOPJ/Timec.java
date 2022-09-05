class Timec{
    int Hours = 01, Minutes = 00, Seconds = 00;

    public void Display(){
        System.out.println(this.Hours + ":" + this.Minutes + ":" + this.Seconds);
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