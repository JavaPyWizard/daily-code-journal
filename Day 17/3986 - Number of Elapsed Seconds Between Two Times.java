/*
You are given two valid times startTime and endTime, each represented as a string in the format "HH:MM:SS".

Return the number of seconds that have elapsed from startTime to endTime.

 

Example 1:

Input: startTime = "01:00:00", endTime = "01:00:25"

Output: 25

Explanation:

endTime is 25 seconds ahead of startTime.
Example 2:

Input: startTime = "12:34:56", endTime = "13:00:00"

Output: 1504

Explanation:

endTime is 25 minutes and 4 seconds ahead of startTime, which equals 1504 seconds.
*/

class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String st[] = startTime.split(":");
        String et[] = endTime.split(":");

        int start = Integer.parseInt(st[0]) * 3600 + Integer.parseInt(st[1]) * 60 + Integer.parseInt(st[2]);

        int end = Integer.parseInt(et[0]) * 3600 + Integer.parseInt(et[1]) * 60 + Integer.parseInt(et[2]);

        return end - start;
    }
}