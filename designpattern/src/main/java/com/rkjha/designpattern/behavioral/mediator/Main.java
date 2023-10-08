package com.rkjha.designpattern.behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User user1 = new User("Alice", chatRoom);
        User user2 = new User("Bob", chatRoom);
        User user3 = new User("Charlie", chatRoom);

        user1.sendMessage("Hello, everyone!"); // Sends message to Bob and Charlie
        user2.sendMessage("Hi, Alice!");        // Sends message to Alice and Charlie
        user3.sendMessage("Hey, folks!");        // Sends message to Alice and Bob
    }
}
