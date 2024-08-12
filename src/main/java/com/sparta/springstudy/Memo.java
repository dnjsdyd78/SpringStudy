package com.sparta.springstudy;

import lombok.*;

@Setter
@Getter
@RequiredArgsConstructor
public class Memo {
    private String username;
    private String contents;

    public static void main(String[] args) {
        Memo memo = new Memo();
        System.out.println(memo.getUsername());
    }
}