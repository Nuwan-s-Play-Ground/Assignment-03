import java.util.Scanner;

public class MarksEntering {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        final String COLOR_RED = "\033[31;1m";
        final String COLOR_BLUE = "\033[34;1m ";
        final String COLOR_GREEN= "\033[32;1m ";
        final String COLOR_YELLOW="\033[33;1m ";
        final String RESET = "\033[0m";

        System.out.print("Enter your Name: ");
        String name = scanner.nextLine();
        if (name.strip().length() == 0) {
            System.out.printf("%sInvalid name.%s \n", COLOR_RED, RESET);
            return;
            
        } else {
            name = name.toUpperCase();
            System.out.print("Enter your Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            if (age < 10 | age > 18) {
                System.out.printf("%sInvalid age.%s \n", COLOR_RED, RESET);
                System.exit(0);

            } else {
                System.out.print("Enter your Subject 1: ");
                String subject1 = scanner.nextLine();
                if (!((subject1.startsWith("SE-")| subject1.startsWith("se-")) & subject1.strip().length()>3)) {
                    System.out.printf("%sInvalid Subject.%s \n", COLOR_RED, RESET);
                    System.exit(0);

                } else {

                    subject1 = subject1.strip();
                    String subject1Number = subject1.substring(3);
                    int sub1Number = Integer.parseInt(subject1Number);
                    System.out.print("Enter your Marks 1: ");
                    double marks1 = scanner.nextDouble();
                    scanner.nextLine();
                    String status1;

                    if (marks1 >= 75) {
                            status1 = COLOR_YELLOW + "Distint Pass " + "\033[0m";
                        } else if (marks1>=65){
                            status1 = COLOR_GREEN + "Credit Pass  " + "\033[0m";
                        }else if (marks1 >= 55) {
                            status1 = COLOR_BLUE + "Pass         " + RESET;
                        } else {
                            status1 = COLOR_RED + " Fail         " + RESET;
                        }
                        System.out.print("Enter your Subject2: ");
                        String subject2 = scanner.nextLine();
                        if (!((subject2.startsWith("SE-")| subject2.startsWith("se-")) & subject2.strip().length()>3)) {
                            System.out.printf("%sInvalid Subject.%s \n", COLOR_RED, RESET);
                            System.exit(0);

                        } else {

                            subject2 = subject2.strip();
                            String subject2Number = subject2.substring(3);
                            int sub2Number = Integer.parseInt(subject2Number);
                            if (sub2Number==sub1Number){
                                System.out.printf("%sInvalid Subject. You have already entered this subject.%s \n", COLOR_RED, RESET);
                                System.exit(0);

                            } else {
                                System.out.print("Enter your Marks 2: ");
                                double marks2 = scanner.nextDouble();
                                scanner.nextLine();
                                String status2;

                                if (marks2 >= 75) {
                                    status2 = COLOR_YELLOW + "Distint Pass " + "\033[0m";
                                } else if (marks2>=65){
                                    status2 = COLOR_GREEN + "Credit Pass  " + RESET;
                                }else if (marks2 >= 55) {
                                    status2 = COLOR_BLUE + "Pass         " + RESET;
                                } else {
                                    status2 = COLOR_RED + " Fail         " + RESET;
                                }

                            System.out.print("Enter your Subject3: ");
                            String subject3 = scanner.nextLine();

                            if (!((subject3.startsWith("SE-")| subject3.startsWith("se-")) & subject3.strip().length()>3)) {
                                System.out.printf("%sInvalid Subject.%s \n", COLOR_RED, RESET);
                                System.exit(0);

                            } else {
                                subject3 = subject3.strip();
                                String subject3Number = subject3.substring(3);
                                int sub3Number = Integer.parseInt(subject3Number);

                                if (sub3Number==sub1Number || sub3Number==sub2Number){
                                System.out.printf("%sInvalid Subject. You have already entered this subject.%s \n", COLOR_RED, RESET);
                                System.exit(0);

                                } else {
                                System.out.print("Enter your Marks 3: ");

                                    double marks3 = scanner.nextDouble();
                                    scanner.nextLine();
                                    String status3;

                                    if (marks3 >= 75) {
                                        status3 = COLOR_YELLOW + "Distint Pass " + "\033[0m";
                                    } else if (marks3>=65){
                                        status3 = COLOR_GREEN + "Credit Pass  " + RESET;
                                    } else if (marks3 >= 55) {
                                        status3 = COLOR_BLUE + "Pass         " + RESET;
                                    } else {
                                        status3 = COLOR_RED + " Fail         " + RESET;
                                    }

                                    double total =marks1+marks2+marks3;
                                    double avg =(total)/3;
                                    String status;

                                    if (avg >= 75) {
                                        status = COLOR_YELLOW + "Distint Pass" + "\033[0m";
                                    } else if (avg>=65){
                                        status = COLOR_GREEN + "Credit Pass" + RESET;
                                    }else if (avg >= 55) {
                                        status = COLOR_BLUE + "Pass" + RESET;
                                    } else {
                                        status= COLOR_RED + " Fail" + RESET;
                                    }
                                    
                                    System.out.printf("+%40s+\n", "-".repeat(40));
                                    System.out.printf("|Name   : %s%-30s%s|\n", COLOR_BLUE, name, RESET);
                                    System.out.printf("|Age    : %-31s|\n", age + " Years old");
                                    System.out.printf("|Status : %-42s|\n", status);
                                    System.out.printf("|Total  : %-15.2fAvg  :%-10.2f|\n",total,avg);
                                    System.out.printf("+%40s+\n", "-".repeat(40));
                                    System.out.printf("|%-14s|%-10s|%-14s|\n","Subject","Marks","Status");
                                    System.out.printf("+%40s+\n", "-".repeat(40));
                                    System.out.printf("|SE-%03d%8s|%-10.2f|%-14s|\n",sub1Number,"",marks1,status1);
                                    System.out.printf("|SE-%03d%8s|%-10.2f|%-14s|\n",sub2Number,"",marks2,status2);
                                    System.out.printf("|SE-%03d%8s|%-10.2f|%-14s|\n",sub3Number,"",marks3,status3);
                                    System.out.printf("+%40s+\n", "-".repeat(40));
                                    
                                }
                            }
                        }
                    }
                }
            }
        }
        System.exit(0);
    }
}

    