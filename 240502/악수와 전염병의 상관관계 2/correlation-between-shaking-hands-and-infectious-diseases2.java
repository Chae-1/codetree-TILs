import java.util.*;

public class Main {
    static int[] A = new int[1_000_001];
    static int[] B = new int[1_000_001];

    static class Person {
        int no;
        boolean infected;
        int infectCount;

        public Person(int no, boolean infected, int infectCount) {
            this.no = no;
            this.infected = infected;
            this.infectCount = infectCount;
        }
    }

    static class TimeLine {
        int time;
        int from;
        int to;

        public TimeLine(int time, int from, int to) {
            this.time = time;
            this.from = from;
            this.to = to;
        }
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 개발자의 수
        int K = sc.nextInt(); // 전염될 수 있는 악수 횟수?
        int P = sc.nextInt(); // 처음에 전염병이 걸려있는 사람
        int T = sc.nextInt(); // 악수 시행 횟수
        Person[] persons = new Person[N + 1];
        for (int i = 1; i <= N; i++) {
            if (i == P) {
                persons[i] = new Person(i, true, K);
            } else {
                persons[i] = new Person(i, false, 0);
            }
        }

        TimeLine[] timeLines = new TimeLine[T];
        for (int i = 0; i < T; i++) {
            int time = sc.nextInt();
            int from = sc.nextInt();
            int to = sc.nextInt();
            timeLines[i] = new TimeLine(time, from, to);
        }

        Arrays.sort(timeLines, Comparator.comparingInt((p) -> p.time));
        // timeLine을 time 순으로 정렬
        // 순차적으로 감염 여부를 확인한다.
        for (int i = 0; i < T; i++) {
            TimeLine currentTimeLine = timeLines[i];
            // from 이 감염되어 있다면

            int from = currentTimeLine.from;
            int to = currentTimeLine.to;

            // 감염 시킬 수 있다면
            if (persons[from].infected && persons[from].infectCount > 0) {
                if (persons[to].infected) {
                    persons[to].infectCount--;
                } else {
                    persons[to].infected = true;
                    persons[to].infectCount = K;
                }
                persons[currentTimeLine.from].infectCount--;
            } else if (persons[to].infected && persons[to].infectCount > 0) {
                if (persons[from].infected) {
                    persons[from].infectCount--;
                } else {
                    persons[from].infected = true;
                    persons[from].infectCount = K;
                }
                persons[currentTimeLine.to].infectCount--;
            }
        }


        for (int i = 1; i <= N; i++) {
            if (persons[i].infected) {
                System.out.print(1);
            } else {
                System.out.print(0);
            }
        }
    }
}