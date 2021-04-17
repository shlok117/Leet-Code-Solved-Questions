class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double avg=0;
        double sum=0;
        for(int i=1;i<salary.length-1;i++){
            sum=(sum+salary[i]);
        }
        avg = sum / (salary.length-2);
        return avg;
    }
}