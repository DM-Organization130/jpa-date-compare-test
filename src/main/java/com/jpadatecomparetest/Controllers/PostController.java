package com.jpadatecomparetest.Controllers;

// Create a new Note

import com.jpadatecomparetest.models.Post;
import com.jpadatecomparetest.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/api")
public class PostController {

    @Autowired
    PostRepository pr;

    @PostMapping("/posts")
    public Post createNote() {
        Post p = new Post();
        p.setTitle("ValTitle");
        p.setContent("ValContent");
        pr.save(p);
        return pr.save(p);
    }

    @PostMapping("/posts/a")
    public Post aNote() throws ParseException {
        Date d1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse("2018-05-10 19:00:00");
        return pr.findPostsBiggerThan(d1);
    }
}

