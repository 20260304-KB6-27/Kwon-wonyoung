package basic.ch06.sec08.exam03;

public class Car {
    int gas;


    void setGas(int gas) {
        this.gas = gas;
    }

    boolean isLeftGas(){
        if(this.gas==0){
            System.out.println("gas가 없습니다.");
        } else {
            System.out.println("gas가 있습니다.");
        }
        return this.gas != 0;
    }

    void run() {
        while(this.gas > 0){
            System.out.printf("달립니다.(gas잔량: %d)\n",this.gas);
            this.gas--;
        }
        System.out.printf("멈춥니다.(gas잔량: %d)\n",this.gas);
    }
}
