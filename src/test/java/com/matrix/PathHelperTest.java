package com.matrix;


import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PathHelperTest {
    @Test
    void testCreateFilePath() {
        PathHelper helper = new PathHelper();
        
        // Lấy dấu phân cách chuẩn của hệ điều hành đang chạy 
        // (Windows sẽ là '\', còn Linux/macOS sẽ là '/')
        String expectedOsPath = "docs" + File.separator + "readme.txt";
        
        // So sánh đường dẫn chuẩn của OS với kết quả bị hardcode "\"
        assertEquals(expectedOsPath, helper.createFilePath("docs", "readme.txt"), 
            "Phen này Linux và macOS tạch chắc luôn nè! 😈");
    }
}
