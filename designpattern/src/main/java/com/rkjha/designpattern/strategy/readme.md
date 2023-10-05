This pattern enables us to build a family of behaviour execution strategies, allowing inherited subclasses to select the
appropriate behaviour execution implementation based on their needs. Since the base class is aware of how the strategy
behaves, it may maintain control over the child class and eliminate deviation. We can eliminate redundant implementation
in specific subclasses by developing a family of behaviour implementations.

In order to keep things simple, let’s use the Hexon model as an example of a vehicle class and talk about just one
behaviour drive.

Lets define a base abstract class Hexon with abstrack method drive() and modelName property.

```

public abstract class Hexon {
    private String model;
    
    public Hexon(String model) {
        this.setModel(model);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public abstract void drive();

}

```

We have few variant of drive behaviour available based on fuel type:

- Diesel
    - Variant: Creative, Fearless, Smart
- Petrol
    - Variant: Creative, Fearless, Smart
- CNG
    - Variant: Creative, Fearless, Smart
- Electric
    - Variant: Creative, Fearless, Smart

Now if we create individual subclass for each fuel type and variant we will end up with nxn = 12 subclass where drive is
based on fuel type so 4 duplication of each drive type.
Instead we can define strategies as for each drive type, Lets create a drive behavious interface:

```java
public interface DriveBehaviour {
    void drive();
}

```

Now create implementation classes for each drive type:

### Diesel Drive Implementaion

```java
public class DieselDrive implements DriveBehaviour {
    @Override
    public void drive() {
        System.out.println("Driving with diesel");
    }
}
```

### Petrol Drive Implementation

```java
public class PetrolDrive implements DriveBehaviour {
    @Override
    public void drive() {
        System.out.println("Driving with petrol");
    }
}
```

### CNG Drive Implementation

```java
public class CNGDrive implements DriveBehaviour {
    @Override
    public void drive() {
        System.out.println("Driving with CNG");
    }
}
```

### Electric Drive Implementation

```java
public class ElectricDrive implements DriveBehaviour {
    @Override
    public void drive() {
        System.out.println("Driving with electricity");
    }
}
```

Now in Hexon class we can define a property to hold reference of drive behaviour and call drive method along with set
and get methods:

- devine a method to exeucte the drive behaviour
- No longer we need abstract derive method in base class as we are delegating it to strategy object DriveBehaviour

```java

public abstract class Hexon {
    private String model;
    private DriveBehaviour driveBehaviour;

    public Hexon(String model, DriveBehaviour driveBehaviour) {
        this.setModel(model);
        this.setDriveBehaviour(driveBehaviour);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public DriveBehaviour getDriveBehaviour() {
        return driveBehaviour;
    }

    public void setDriveBehaviour(DriveBehaviour driveBehaviour) {
        this.driveBehaviour = driveBehaviour;
    }

    public void executeDriveBehaviour() {
        System.out.printf("Driving model:  %s \n", getModel());
        this.driveBehaviour.drive();
    }

}
```

Now lets create concrete Hexon class for few variant:

### Hexon Diesel Creative

```java
public class HexonDieselCreative extends Hexon {
    public HexonDieselCreative(DriveBehaviour driveBehaviour) {
        super("Hexon Diesel Creative", driveBehaviour);
    }
}
```

### Hexon Diesel Smart

```java

public class HexonDieselSmart extends Hexon {
    public HexonDieselSmart(DriveBehaviour driveBehaviour) {
        super("Hexon Diesel Smart ", driveBehaviour);
    }
}

```

### Hexon Petrol Fearless

```java
public class HexonPetrolFearless extends Hexon {
    public HexonPetrolFearless(DriveBehaviour driveBehaviour) {
        super("Hexon Petrol Fearless", driveBehaviour);
    }
}
```

Finally lets test it:
Create a eecution class TestDrive:

```java
public class TestDrive {
    public static void main(String[] args) {
        HexonDieselCreative hexonDieselCreative = new HexonDieselCreative(new DieselDrive());
        hexonDieselCreative.executeDriveBehaviour();

        Hexon hexonPetrol = new HexonPetrolFearless(new PetrolDrive());
        hexonPetrol.executeDriveBehaviour();

        Hexon hexonDieselSmart = new HexonDieselSmart(new DieselDrive());
        hexonDieselSmart.executeDriveBehaviour();
    }
}
```

Overall when we have a need of multiple object with same interface but different behaviour we can use strategy pattern.

Overall when ever you see the duplicate implementation behaviour among list of classes follow this strategy pattern to
get best out of design pattern practice.
