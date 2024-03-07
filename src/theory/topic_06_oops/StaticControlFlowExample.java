package theory.topic_06_oops;

/*
Static Control Flow:
    1)	Identification of static members from top to bottom.
    2)	Execution of static variable assignments & static blocks from top to bottom.
    3)	Execution of the main method.

Steps:
    1)	Identification of static members from top to bottom.
        01) i=0 [Read Indirectly Write-Only]    //Line-10
        02) Identify first static block         //Line-12
        03) Identify main() static method       //Line-17
        04) Identify m1() static method         //Line-22
        05) Identify second static block        //Line-26
        06) j=0 [ReadIndirectlyWriteOnly]       //Line-30

    2)	Execution of static variable assignments & static blocks from top to bottom.
        07) i=10 [Read & Write].                        //Line-10
            First static block execution.
        08) Enters m1() method.                         //Line-13
        09) Prints variable j value. j=0.               //Line-23
            Return to first static block.
        10) Print statement from the first static block.    //Line-14
            Second static block execution.
        11) Print statement from the second static block.   //Line-27
        12) j=20 [Read & Write].                        //Line-30

    3)	Execution of main method.
        13) Enters m1() method.                 //Line-18
        14) Prints variable j value. j=20.      //Line-23
            Return to the main method.
        15) Print statement from main method.   //Line-19

Output:
    0
    First Static Block
    Second Static Block
    20
    Main Method
*/

public class StaticControlFlowExample {
    static int i = 10;  //Step-01,Step-07
    static int j = 20;  //Step-06,Step-12

    static {    //Step-02
        m1();   //Step-08
        System.out.println("First Static Block");   //Step-10
    }

    static {    //Step-05
        System.out.println("Second Static Block");  //Step-11
    }

    public static void main(String[] args) {    //Step-03
        m1();   //Step-13
        System.out.println("Main Method");  //Step-15
    }

    public static void m1() {    //Step-04
        System.out.println(j);  //Step-09,Step-14
    }

}
