/*
Link: https://leetcode.com/problems/convert-the-temperature/submissions/982505673/

Input: celsius = 36.50
Output: [309.65000,97.70000]
Explanation: Temperature at 36.50 Celsius converted in Kelvin is 309.65 and converted in Fahrenheit is 97.70.
*/

class Solution {
    public double[] convertTemperature(double celsius) {
        double farenheit = (celsius * 1.80) + 32;
        double kelvin = celsius + 273.15;
        double[] ans = new double[]{kelvin, farenheit};
        return ans;
    }
}
