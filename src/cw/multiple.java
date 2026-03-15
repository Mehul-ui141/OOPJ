package cw;
class multiple extends Thread{

    public void run(){

        for(int i=1;i<5;i++){

            try{Thread.sleep(500);}catch(InterruptedException
                    e){System.out.println(e);}

            System.out.println(i);

        }

    }

    public static void main(String args[]){

        multiple t1=new multiple();

        multiple t2=new multiple();

        t1.start();

        t2.start(); }}
