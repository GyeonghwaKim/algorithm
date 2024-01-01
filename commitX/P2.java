package commitX;

public class P2 {
    public static void main(String[] args) {

        int[] stone= {5, 3, 4, 1, 3, 8, 3};

        Dog[] dogArr={
                new Dog("루비독", "95년생", 3, 4),
                new Dog("피치독", "95년생", 3, 3),
                new Dog("씨-독", "72년생", 2, 1),
                new Dog("코볼독", "59년생", 1, 1)
        };


        for(Dog d:dogArr){
            boolean jump=true;
            for(int i=d.jump-1;i< stone.length;i+=d.jump){
                stone[i]-=d.weight;
                if(stone[i]<0) {
                    jump=false;
                    break;
                }
            }
            if(jump) System.out.println(d.name);
        }

    }
}
class Dog{
    String name;
    String age;
    int jump;
    int weight;

    public Dog(String name, String age, int jump, int weight) {
        this.name = name;
        this.age = age;
        this.jump = jump;
        this.weight = weight;
    }
}
