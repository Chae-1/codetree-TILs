import java.util.*;
public class Main {
    static class Agent {
        String codeName;
        int score;
        
        public Agent() {
            this.codeName = "X";
            this.score = 100;
        }

        public Agent(String codeName, int score) {
            this.codeName = codeName;
            this.score = score;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agent[] agents = new Agent[5];
        Agent minScoreAgent = new Agent();
        for (int i = 0; i < 5; i++) {
            String codeName = sc.next();
            int score = sc.nextInt();
            agents[i] = new Agent(codeName, score);
            if (minScoreAgent.score > agents[i].score) {
                minScoreAgent = agents[i];
            }
        }

        System.out.println(minScoreAgent.codeName + " " + minScoreAgent.score);
    }
}