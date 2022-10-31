class Player {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class SwitchCase {
    public static void main(String[] args) {
        int x = 3;
        int y = switch (x) {
            case 1, 2, 3 -> 6;
            case 4, 5, 6 -> 15;
            default -> 10;
        };
        System.out.println(y);

        Player player = new Player();
        player.setAge(y);
        System.out.println(player.getAge());
        sumAge(player);
        System.out.println(player.getAge());

    }

    static void sumAge(Player p) {
        p.setAge(p.getAge() + 1);
    }
}
