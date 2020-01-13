package com.practice.design.pattern.behavioural.momento;

import com.practice.design.pattern.behavioural.momento.api.Momento;
import com.practice.design.pattern.behavioural.momento.impl.Editor;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Momento> momentos = new Stack<Momento>();
        Editor editor = new Editor("satish");
        momentos.add(editor.save());

        editor.setContent("chandra ");
        momentos.add(editor.save());

        editor.setContent("Gupta");
        momentos.add(editor.save());

        editor.setContent("hellow wolrd");
        momentos.add(editor.save());

        while (!momentos.empty()) {
            Momento momento = momentos.pop();
            editor.restoreFromMomemto(momento);
            System.out.println(editor.getContent());
        }
    }
}
