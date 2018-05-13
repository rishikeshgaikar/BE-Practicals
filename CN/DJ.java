import java.util.*;
public class DJ {
  public  int distance[] = new int[10];
  public  int cost[][] = new int[10][10];

  public void calc(int n, int s) {
    int flag[] = new int[n + 1];
    int i, minpos = 1, k, c, minimum;

    for (i = 1; i <= n; i++) {
      flag[i] = 0;
      distance[i] = cost[s][i];
    }
    c = 2;
    while (c <= n) {
      minimum = 99;
      for (k = 1; k <= n; k++) {
        if (distance[k] < minimum && flag[k] != 1) {
          minimum = distance[i];
          minpos = k;
        }
      }
      flag[minpos] = 1;
      c++;
      for (k = 1; k <= n; k++) {
        if (distance[minpos] + cost[minpos][k] <  distance[k] && flag[k] != 1 )
          distance[k] = distance[minpos] + cost[minpos][k];
      }
    }

  }
  public static void main(String args[]) {
    int nodes, source, i, j;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the Number of Nodes: ");
    nodes = in.nextInt();
    DJ d = new DJ();
    System.out.println("Enter the Cost Matrix Weights: ");
    for (i = 1; i <= nodes; i++)
      for (j = 1; j <= nodes; j++) {
        d.cost[i][j] = in.nextInt();
        if (d.cost[i][j] == 0)
          d.cost[i][j] = 999;
      }
    System.out.print("Enter the Source Vertex: ");
    source = in.nextInt();

    d.calc(nodes, source);
    System.out.println("The Shortest Path from Source " + source + " to all other vertices are:");
    for (i = 1; i <= nodes; i++)
      if (i != source)
        System.out.println("Source: " + source + " Destination: " + i + " Minimum Cost is: " + d.distance[i]);
  }
}



//**C:\Users\rishi\Desktop\cn101>javac Dj.java

C:\Users\rishi\Desktop\cn101>java DJ
Enter the Number of Nodes: 5
Enter the Cost Matrix Weights:
0 4 0 8 0
4 0 3 0 0
0 3 0 4 0
8 0 4 0 7
0 0 0 7 0
Enter the Source Vertex: 1
The Shortest Path from Source 1 to all other vertices are:
Source: 1 Destination: 2 Minimum Cost is: 4
Source: 1 Destination: 3 Minimum Cost is: 7
Source: 1 Destination: 4 Minimum Cost is: 8
Source: 1 Destination: 5 Minimum Cost is: 15

C:\Users\rishi\Desktop\cn101>**//
