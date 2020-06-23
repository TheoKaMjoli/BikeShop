package bicycles;

import java.util.ArrayList;
public class FunRide {
    private final ArrayList<Bicycle> bikeList = new ArrayList<Bicycle>(); //generics "< OBJECT >" we only want bicycles
    protected final int maxNumOfBikes;
    public FunRide(int bikeNumberMax) {
       this.maxNumOfBikes = bikeNumberMax;
    }

    //bikes entering the fun ride through "accept method"
    public String accept(Bicycle bicycle) {
        //if the size of the list is less than the maximum number of bikes allowed AND the list must contain bicycleType.
        /*  !  Called Logical NOT Operator. Use to reverses the logical state of its operand. If a condition is true then
            Logical NOT operator will make false.*/
        if (bikeList.size() < maxNumOfBikes && !bikeList.contains(bicycle)) { //! what does it mean?
            bikeList.add(bicycle);
            return "Accepted";
        } else {
            return "Rejected";
        }
    }

        public int getCount(){
            return bikeList.size();
        }
        public int getCountForType(Bicycle bicycleType){
            int count = 0;

            for (Bicycle bicycleType1: bikeList) {
                if (bicycleType1.equals(bicycleType)) {
                    count++;
                }
            }
            return count;
        }

    }
