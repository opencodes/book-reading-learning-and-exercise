package com.rkjha.designpattern.behavioral.memento;

public class Player {
    String name;
    int level;

    Player(String name, int level) {
        this.level = level;
        this.name = name;
    }

    public void levelUp() {
        this.level++;
    }

    public void restoreState(PlayerMemento memento) {
        this.name = memento.getName();
        this.level = memento.getLevel();
    }

    public PlayerMemento saveState() {
        return new PlayerMemento(this.name, this.level);
    }

    @Override
    public String toString() {
        return "Player[name='" + name + "', level=" + level + "]";
    }
}
