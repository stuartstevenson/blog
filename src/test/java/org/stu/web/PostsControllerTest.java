package org.stu.web;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class PostsControllerTest {
    @Test
    public void testShowHello() {
        PostsController postsController = new PostsController();
        assertEquals("hello", postsController.showHello());
    }
}
