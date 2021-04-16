public class FlourPacker {

        // write your code here
        public static boolean canPack(int bigCount, int smallCount, int goal) {
            int ex = sum(bigCount,smallCount, goal);
            if (ex >= goal){
                return true;

            }
            else {
                return false;
            }




        }
        public static int sum (int bigCount, int smallCount, int goal){
            int sum = 0;
            int big = bigCount * 5;
            if(big > goal){
                while (big > goal ){
                    big -= 5;
                    sum = smallCount + big;
                }
            }
           else if (big <= goal){
               sum = smallCount + big;
            }
            return sum;
        }
}

