package com.examp.gmall.test;

public class SellTicks {

    public static void main(String[] args) {

        for(int i=0; i<3; i++){
            new Thread("线程 " + i){
                public void run() {
                    while(true){
                        int p = getNumber();
                        if(p >0 ){
                            System.out.println(getName() + " 票号: " + p);
                        }else{
                            System.out.println("没票了");
                            break;
                        }
                    }
                };
            }.start();
        }
    }




    public static int num = 30;		//总票数

    /**
     * synchronized 同步锁
     * @return
     */
    public static synchronized int getNumber(){
        if(num >0){
            return num --;				//如果大于0, 则返回当前票并减少一张
        }
        return 0;
    }
}
