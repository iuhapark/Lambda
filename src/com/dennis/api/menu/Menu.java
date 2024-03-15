package com.dennis.api.menu;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})

public class Menu {
    private int id;
    private String item;
    private String category;

    @Builder(builderMethodName = "builder")
    public Menu(String item, String category) {
        this.item = item;
        this.category = category;
    }
}
