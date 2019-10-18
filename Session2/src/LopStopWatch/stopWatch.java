package LopStopWatch;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class stopWatch {
    private Date startTime,endTime;
    public stopWatch() {
    }
    public Date getStartTime() {
        return startTime;
    }
    public Date getEndTime() {
        return endTime;
    }
    public Date start(){
        return this.startTime= Calendar.getInstance().getTime();
    }
    public Date stop(){
        return this.endTime=Calendar.getInstance().getTime();
    }
    public int getElapsedTime(){
        int m=this.startTime.getSeconds();
        int n=this.endTime.getSeconds();
        return n-m;
    }
    public static int[] creatRandom(){
        Random rd=new Random();
        int[] arr=new int[10];
        System.out.println("danh sach ngau nhien la:");
        for (int i = 0; i <10; i++) {
            arr[i]=rd.nextInt(10);
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }

        return arr;
    }
   public static void GTLN(int []array){
        int max=array[0];
        int index=1;
        for (int i = 0; i <array.length ; i++) {
            if(array[i]>max){
                max=array[i];
                index=i+1;
            }
        }
        System.out.println("GTLN is:"+max+" nam o vi tri"+index);
    }

}
