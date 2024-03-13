import java.util.Random;
public class Regbi {
    public static void main(String[] args) {
        int[] team1 = generateTeam();
        int[] team2 = generateTeam();

        System.out.println("Возраст игроков в первой команде:");
        printTeamAges(team1);
        double avgAgeTeam1 = calculateAverageAge(team1);
        System.out.println("Средний возраст первой команды: " + avgAgeTeam1 + " лет");

        System.out.println("\nВозраст игроков во второй команде:");
        printTeamAges(team2);
        double avgAgeTeam2 = calculateAverageAge(team2);
        System.out.println("Средний возраст второй команды: " + avgAgeTeam2 + " лет");
    }
    public static int[] generateTeam() {
        Random random = new Random();
        int[] team = new int[25];
        for (int i = 0; i < team.length; i++) {
            team[i] = random.nextInt(23) + 18;
        }
        return team;
    }
    public static void printTeamAges(int[] team) {
        for (int age : team) {
            System.out.print(age + " ");
        }
        System.out.println();
    }
    public static double calculateAverageAge(int[] team){
        int sum = 0;
        for (int age : team) {
            sum += age;
        }
        return (double) sum / team.length;
    }
}
