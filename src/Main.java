import com.sun.source.util.SourcePositions;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        /*
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        final double ROUBLES_PER_YUAN = 11.91;
        int yuan = scanner.nextInt();
        double roubles = ROUBLES_PER_YUAN * yuan;
        System.out.println(Math.ceil(roubles));
        */

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        final double ROUBLES_PER_YUAN = 11.91;
        int yuan = scanner.nextInt();
        double roubles = ROUBLES_PER_YUAN * yuan;
        //System.out.println(Math.ceil(roubles));
        int numb = (int)Math.ceil(roubles)%10;
        System.out.println(roubles);
        System.out.println((int)Math.ceil(roubles) / 10);
        System.out.println(numb);
        if (numb == 0 || numb == 5 || numb == 6 || numb == 7 || numb == 8 || numb == 9){
            System.out.println("Сумма составляет " +  (int)Math.ceil(roubles) + " рублей");
        } else if ((int)Math.ceil(roubles)/10%10 == 1) {
            System.out.println("Сумма составляет " + (int) Math.ceil(roubles) + " рублей");
        } else if (numb == 1){
            System.out.println("Сумма составляет " +  (int)Math.ceil(roubles) + " рубль");
        } else if (numb == 2 || numb == 3 || numb == 4) {
            System.out.println("Сумма составляет " + (int) Math.ceil(roubles) + " рубля");
        } else {
            System.out.println("Ошибка в вычислениях, тикет отправлен в техподдержку");
            System.out.println("Ожидайте");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Ожидайте");
        }




























        /*int n = scanner.nextInt();
        List<Integer>[] graph = new ArrayList[n + 1];
        int[] inDegree = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 1; i <= n; i++) {
            int a = scanner.nextInt();
            for (int j = 0; j < a; j++) {
                int dependency = scanner.nextInt();
                graph[dependency].add(i);
                inDegree[i]++;
            }
        }
        scanner.close();
        List<List<Integer>> levels = new ArrayList<>(1000);
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                int node = queue.poll();
                level.add(node);

                for (int neighbor : graph[node]) {
                    inDegree[neighbor]--;
                    if (inDegree[neighbor] == 0) {
                        queue.add(neighbor);
                    }
                }
            }
            Collections.sort(level);
            levels.add(level);
        }
        try (BufferedOutputStream bos = new BufferedOutputStream(System.out)) {
            bos.write((levels.size() + "\n").getBytes());
            for (List<Integer> level : levels) {
                bos.write((level.size() + " ").getBytes());
                for (int process : level) {
                    bos.write((process + " ").getBytes());
                }
                bos.write("\n".getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}