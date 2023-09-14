package isp;

public class ISPExample1 {

    // ISP-violating interface
    interface Animal {
        void eat();
        void sleep();
        void fly();  // Not all animals can fly
        void swim(); // Not all animals can swim
    }

    // Bird class implementing the ISP-violating interface
    class Bird implements Animal {
        private String name;

        public Bird(String name) {
            this.name = name;
        }

        @Override
        public void eat() {
            System.out.println(name + " is eating.");
        }

        @Override
        public void sleep() {
            System.out.println(name + " is sleeping.");
        }

        @Override
        public void fly() {
            // Birds can fly, so this is fine for them.
            System.out.println(name + " is flying.");
        }

        @Override
        public void swim() {
            throw new RuntimeException();
        }
    }

    // Fish class implementing the ISP-violating interface
    class Fish implements Animal {
        private String name;

        public Fish(String name) {
            this.name = name;
        }

        @Override
        public void eat() {
            System.out.println(name + " is eating.");
        }

        @Override
        public void sleep() {
            System.out.println(name + " is sleeping.");
        }

        @Override
        public void fly() {
            throw new RuntimeException();
        }

        @Override
        public void swim() {
            // Fish can swim, so this is fine for them.
            System.out.println(name + " is swimming.");
        }
    }



}
