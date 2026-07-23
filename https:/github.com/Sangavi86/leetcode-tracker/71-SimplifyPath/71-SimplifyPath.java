// Last updated: 7/23/2026, 2:57:00 PM
import java.util.*;
class Solution {
    public String simplifyPath(String path) {
        String[] folders = path.split("/");
        ArrayList<String> list = new ArrayList<>();
        for (String folder : folders) {
            if (folder.equals("") || folder.equals(".")) {
                continue;
            }
            else if (folder.equals("..")) {
                if (!list.isEmpty()) {
                    list.remove(list.size() - 1);
                }
            }
            else {
                list.add(folder);
            }
        }
        if (list.isEmpty()) {
            return "/";
        }
        String ans = "";
        for (String folder : list) {
            ans += "/" + folder;
        }
        return ans;
    }
}