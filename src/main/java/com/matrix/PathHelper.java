package com.matrix;

import java.nio.file.Paths;


//ERROR:

// public class PathHelper {
//     // Lỗi chà bá ở đây nè: hardcode dấu \ của Windows! 
//     public String createFilePath(String folder, String file) {
//         return folder + "\\" + file; 
//     }
// }


//FIXED
public class PathHelper {
    public String createFilePath(String folder, String file) {
        // Paths.get() sẽ tự động động nối chuỗi bằng '\' trên Windows 
        // và bằng '/' trên Linux/macOS.
        return Paths.get(folder, file).toString();
    }
}