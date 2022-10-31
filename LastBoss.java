import java.util.*;

class Bowling {
    // public String nama;
    HashMap<String, Integer> players;

    Bowling() {
        players = new HashMap<String, Integer>();
    }

    public void addPlayer(String name, int p) {
        players.put(name, p);
    }

    // your code goes here
    public void getWinner() {
        String nama = "";
        int skor = 0;
        for (String i : this.players.keySet()) {
            if (skor < this.players.get(i)) {
                nama = i;
                skor = this.players.get(i);
            }
        }
        System.out.println(nama);
    }
}

public class LastBoss {
    public static void main(String[] args) {
        Bowling game = new Bowling();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            String input = sc.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            game.addPlayer(name, points);
        }
        game.getWinner();
        sc.close();
    }
}