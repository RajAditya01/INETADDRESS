class Parent {
    void display(){
        System.out.println("Parent");
    }
    void show(){
        System.out.println("Show");
    }
}

class Child extends Parent {
    //METHOD OVERRIDE
    void display(){
        System.out.println("Child");
    }
    void fun(){
        System.out.println("Fun");
    }
}


class DMD {
    public static void main(String args[]){
        Parent obj = new Child();

        obj.display();
        obj.show();
       //obj.fun();
    }
}