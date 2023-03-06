/* Find average of a number array between two limit numbers (except the two numbers)
 * Input
 * ---------------
 *  5
    1 
    2
    3
    4
    5
 *  1
 *  4
 * 
 * Output
 * ---------------
 * 2
 */
class averageBetweenLimits{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int l = 1;
        int h = 5;

        int sum=0;
        int n=0;
        for(int i=l+1;i<h;i++){
            sum+=arr[i];
            n++;
        }

        System.out.println(sum/n);
    }
}
