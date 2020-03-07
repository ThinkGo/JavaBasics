package io.kk.classes.oops;

class Animal {
    private int legs;
    private boolean isTall;
    public Animal() {
        log("Animal()");
    }
    public Animal(int legs, boolean isTall) {
        this.legs = legs;
        this.isTall = isTall;
    }
    public int getLegs() {
        return legs;
    }
    public void setLegs(int legs) {
       this.legs = legs;
    }
    public boolean isTall() {
        return isTall;
    }
    public void setTall(boolean tall) {
        isTall = tall;
    }
    public void log(String x){
        System.out.println(x);
    }
}

class Dog extends Animal {
    public Dog() {
       super();
       log("Dog()");
    }

    public void dogBreed(){
        log("dogBree()");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.dogBreed();
        dog.isTall();
    }
}
