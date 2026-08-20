/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */
// 0 30 
//    31  35
class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        if(intervals.size()==0)return true;
        Collections.sort(intervals,Comparator.comparingInt(i->i.start));
        int res=0;
        int prevstart=intervals.get(0).start;
        int prevend=intervals.get(0).end;
        for(int i=1;i<intervals.size();i++){
            int start=intervals.get(i).start;
            int end=intervals.get(i).end;
            if(prevend>start){
                return false;
            }else{
                prevstart=start;
                prevend=end;
            }
        }
        return true;
    }
}
