package lesson_1;

public class Stats <T extends Number> {
    private T [] nums;

    public Stats(T[] nums) {
        this.nums = nums;
    }

    public double avg(){
        double sum = 0.0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }

        return sum/nums.length;
    }

    public boolean sameAvg(Stats<? extends Number> another){
//        System.out.println(this.avg() + " - " + another.avg() + " = Math.abs("+Math.abs(this.avg() - another.avg())+")");
//        System.out.println("Без Math.abs = "+(this.avg() - another.avg()));
        return Math.abs(this.avg() - another.avg()) < 0.0001;
    }
}
