package bicycles;
    public class Bicycle {
        int increaseSpeed;
        int decreasedSpeed;
        int brake;
        int deadBrake;
    
        public void accelerate(int s) {
            final int speed = 5;
            this.increaseSpeed = s;
            //if the speed is more than 1 and less than 100, method must return final speed which is "i". else, invalid number entered
            if(increaseSpeed > 1 && increaseSpeed <= 100){
                final int i = increaseSpeed + speed; //decrease the private speed variable with of the bike with 3.... do not understand this request
               System.out.println("Accelerate applied, Current speed >> " + i);
            }
            else {
                System.out.println("Number entered is in valid");
            }
        }
        public void brake(int decrease){
               this.decreasedSpeed = decrease - 3; //This request is confusing
                int speedDecrease = increaseSpeed - decreasedSpeed;
                    System.out.println("Brakes applied, Current speed >> " + speedDecrease);
        }

        public void completeStop(){
                int stop1 = increaseSpeed * 0;
                int stop2 = decreasedSpeed * 0;
                System.out.println("Motion is 0. Bicycle has stopped");
        }


}



