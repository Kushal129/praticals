// Write a program to perform below task:
// 1. Calculate sum of given two variables, where subject_mark1= 26 and
// subject_mark2=40.
// 2. Consider same variable and display average using conditional operator.
// 3. Display minimum marks of student.

class p3 {
    public static void main(String[] args)
    { 
        //Scanner sc=new Scanner (System.in);
        int subject_mark1 = 26;
        int subject_mark2 = 40;
        
        int sum = subject_mark1 + subject_mark2;
        System.out.println ("Sum of two variable is :- " + sum);
        int avg = (subject_mark1 + subject_mark2 )/2;
        System.out.println ("Average is :- "+ avg);
        int min = subject_mark1 < subject_mark2 ? subject_mark1 : subject_mark2;
        System.out.println("Minimum of two variables :- " + min);
        int max = subject_mark1 > subject_mark2 ? subject_mark1 : subject_mark2;
        System.out.println("Minimum of two variables :- " + max);
}
}