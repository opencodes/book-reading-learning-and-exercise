package com.rkjha.designpattern.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class GameState {
    private List<PlayerMemento> mementos = new ArrayList<>();

    public void saveState(PlayerMemento memento) {
        mementos.add(memento);
    }

    public PlayerMemento getState(int index) {
        return mementos.get(index);
    }
}
