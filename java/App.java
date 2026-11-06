public class App {
     public static void mostrarTimes(String[] times) {
        System.out.println("TIMES:");
        for (int i = 0; i < times.length; i++) {
            System.out.println(i + " - " + times[i]);
        }
    }

    public static void gerarIdaVolta(String[] times) {
        int total = 0;

        System.out.println("\nCONFRONTOS DE IDA E VOLTA:");
        for (int i = 0; i < times.length; i++) {
            for (int j = 0; j < times.length; j++) {
                if (i != j) {
                    System.out.println(times[i] + " x " + times[j]);
                    total++;
                }
            }
        }

        System.out.println("Total: " + total);
    }

    public static void gerarTurnoUnico(String[] times) {
        int total = 0;

        System.out.println("\nCONFRONTOS DE TURNO ÚNICO:");
        for (int i = 0; i < times.length; i++) {
            for (int j = 0; j < times.length; j++) {
                if (i < j) {
                    System.out.println(times[i] + " x " + times[j]);
                    total++;
                }
            }
        }

        System.out.println("Total: " + total);
    }

    public static void main(String[] args) {

        String[] times = {
            "Atlético-MG",
            "Cruzeiro",
            "América-MG",
            "Villa Nova"
        };

        mostrarTimes(times);
        gerarIdaVolta(times);
        gerarTurnoUnico(times);

        // Criar um array maior e copiar os times
        String[] timesNovos = new String[times.length + 1];

        for (int i = 0; i < times.length; i++) {
            timesNovos[i] = times[i];
        }

        timesNovos[times.length] = "Tombense";
        times = timesNovos;

        System.out.println("\nAPÓS ADICIONAR O TOMBENSE:");

        mostrarTimes(times);
        gerarIdaVolta(times);
        gerarTurnoUnico(times);
    }
}
