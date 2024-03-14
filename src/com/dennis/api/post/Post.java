package com.dennis.api.post;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})

public class Post {
    private Long id;
    private String title;
    private String content;
    private String writer;
    private String registerDate;

    @Builder(builderMethodName = "builder")
    public Post(Long id, String title, String content, String writer, String registerDate) {
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.registerDate = registerDate;
    }
}
