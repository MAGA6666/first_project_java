void main() {
    Animal cat1 = new Animal();
    System.out.println(cat1.getName());
    System.out.println(cat1.getMeow());
}

class Animal{
    public String getMeow(){
        return "мяу мяуууууу";
    }
    public String getName(){
        return "я кот";
    }
}
