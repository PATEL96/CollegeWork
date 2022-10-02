class Timec{
    int Hours = 0, Minutes = 0, Seconds = 0;

    Timec(){
        Hours = 0;
        Minutes = 0;
        Seconds = 0;
    }

    Timec(int h, int m, int s){
        Hours = h;
        Minutes = m;
        Seconds = s;
    }

    Timec addTo(Timec T1){
        Timec temp = new Timec();
        temp.Seconds = Seconds + T1.Seconds;
        temp.Minutes = Minutes + T1.Minutes;
        temp.Hours = Hours + T1.Hours;

        if(temp.Seconds>12){
            temp.Hours = temp.Hours - 12;
        }
        
        if(temp.Seconds>=60){
            temp.Seconds = temp.Seconds - 60;
            temp.Minutes++;
        }

        if(temp.Minutes>=60){
            temp.Minutes = temp.Minutes - 60;
            temp.Hours++;
        }


        return temp;
    }

    void displayTime(){
        System.out.println(Hours + " : " + Minutes + " : " + Seconds);
    }
}