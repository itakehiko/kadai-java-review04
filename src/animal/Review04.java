package animal;

public class Review04 {

    public static void main(String[] args) {
        
        Human tanaka    = new Human("田中 太郎", 25, "電車");
        Human suzuki    = new Human("鈴木 次郎", 30, "野球");
        Human sato      = new Human("佐藤 花子", 20, "映画");
        
        Human[] humans = new Human[3];
        humans[0] = tanaka;
        humans[1] = suzuki;
        humans[2] = sato;
        
        for (Human human : humans) {
            human.say();
            human.think();
        }
        
    }

}
