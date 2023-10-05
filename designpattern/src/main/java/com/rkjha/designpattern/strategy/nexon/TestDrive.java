package com.rkjha.designpattern.strategy.nexon;

public class TestDrive {
    public static void main(String[] args) {
        NexonDieselCreative nexonDieselCreative = new NexonDieselCreative(new DieselDrive());
        nexonDieselCreative.executeDriveBehaviour();

        Nexon nexonPetrol = new NexonPetrolFearless(new PetrolDrive());
        nexonPetrol.executeDriveBehaviour();

        Nexon nexonDieselSmart = new NexonDieselSmart(new DieselDrive());
        nexonDieselSmart.executeDriveBehaviour();
    }
}
