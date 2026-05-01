package com.matrix;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PathHelperTest {
    @Test
    void testCreateFilePath() {
        PathHelper helper = new PathHelper();
        // Cố tình bắt nó phải ra chuỗi y hệt Windows nè!
        assertEquals("docs\\readme.txt", helper.createFilePath("docs", "readme.txt"), "Test này gài bẫy đó nha!");
    }
}
