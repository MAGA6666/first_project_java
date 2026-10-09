void main() {
    Animal cat1 = new Animal();
    System.out.println(cat1.getName());
}

class Animal{
    public String getName(){
        return "я кот";
    }
}
