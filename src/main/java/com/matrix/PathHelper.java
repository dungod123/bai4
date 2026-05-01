package com.matrix;


public class PathHelper {
    // Lỗi chà bá ở đây nè: hardcode dấu \ của Windows! (T_T)
    public String createFilePath(String folder, String file) {
        return folder + "\\" + file; 
    }
}
