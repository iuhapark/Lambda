package com.dennis.api.board;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})

public class Board {
    private int id;
    private String boardType;

    @Builder(builderMethodName = "builder")
    public Board(String boardType) {
        this.boardType = boardType;
    }
}
