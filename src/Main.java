void main() {
    Animal cat1 = new Animal();
    System.out.println(cat1.getName());
    System.out.println(cat1.getMeow());
    System.out.println(cat1.summ(7,8));
}

class Animal{
    public int summ(int a, int b){
        return a + b;
    }

    public String getMeow(){
        return "мяу мяуууууу";
    }
    public String getName(){
        return "я кот";
    }
}
