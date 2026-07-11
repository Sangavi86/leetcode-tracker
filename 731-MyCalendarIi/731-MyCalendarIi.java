// Last updated: 7/11/2026, 4:03:18 PM
import java.util.*;

class MyCalendarTwo {

    List<int[]> bookings;
    List<int[]> overlaps;

    public MyCalendarTwo() {
        bookings = new ArrayList<>();
        overlaps = new ArrayList<>();
    }

    public boolean book(int start, int end) {

        // Check if triple booking occurs
        for (int[] overlap : overlaps) {
            if (start < overlap[1] && end > overlap[0]) {
                return false;
            }
        }

        // Find new overlaps with existing bookings
        for (int[] booking : bookings) {
            if (start < booking[1] && end > booking[0]) {

                int overlapStart = Math.max(start, booking[0]);
                int overlapEnd = Math.min(end, booking[1]);

                overlaps.add(new int[]{overlapStart, overlapEnd});
            }
        }

        // Add current booking
        bookings.add(new int[]{start, end});

        return true;
    }
}