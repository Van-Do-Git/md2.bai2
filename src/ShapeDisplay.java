import java.util.Scanner;

public class ShapeDisplay {
    public static void main(String[] args) {
        System.out.println("1 : Print the rectangle");
        System.out.println("2: Print the square triangle");
        System.out.println("3: Print isosceles triangle");
        System.out.println("0: Exit");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input choice:");
        int choice = sc.nextInt();
        while(choice!=0){
            switch (choice){
                case 1:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 8; j++) {
                            System.out.print("*\t");
                        }
                        System.out.println("");
                        break;
                    }
                case 2:
                    System.out.println("1: bot left");
                    System.out.println("2: bot right");
                    System.out.println("3: top left");
                    System.out.println("4: top right");
                    int choiceTriagle;
                    System.out.println("Input choiceTriagle");
                    choiceTriagle = sc.nextInt();
                    switch (choiceTriagle){
                        case 1:
                            for (int i = 0; i < 6; i++) {
                                for (int j = 0; j < 6; j++) {
                                    if (j>i){
                                        System.out.print("\t");
                                    }else{
                                        System.out.print("*\t");
                                    }
                                }
                                System.out.println("");
                            }
                            break;
                        case 2:
                            for (int i = 0; i < 6; i++) {
                                for (int j = 0; j <6; j++) {
                                    if (j>=6-i){
                                        System.out.print("*\t");
                                    }else {
                                        System.out.print("\t");
                                    }
                                }
                                System.out.println("");
                            }
                            break;
                        case 3:
                            for (int i = 0; i < 6; i++) {
                                for (int j = 0; j < 6; j++) {
                                    if(6-j>i){
                                        System.out.print("*\t");
                                    }else {
                                        System.out.print("\t");
                                    }
                                }
                                System.out.println("");
                            }
                            break;
                        case 4:
                            for (int i = 0; i < 6; i++) {
                                for (int j = 0; j < 6; j++) {
                                    if (j>i){
                                        System.out.print("*\t");
                                    } else {
                                        System.out.print("\t");
                                    }
                                }
                                System.out.println("");
                            }
                            break;
                    }
                    break;
                case 3:
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < 6; j++) {
                            if (j>=6-i){
                                System.out.print("*\t");
                            }else{
                                System.out.print("\t");
                            }
                        }
                        for (int j = 0; j <6; j++) {
                            if (j>i){
                                System.out.print("\t");
                            }else {
                                System.out.print("*\t");
                            }
                        }
                        System.out.println("");
                    }
            }
            System.out.println("Input choice:");
            choice = sc.nextInt();
        }

    }
}
