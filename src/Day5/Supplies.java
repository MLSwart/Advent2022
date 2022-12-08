package Day5;

import java.util.Stack;

public class Supplies {
    public static void main(String[] args) {
        Supplies supplies = new Supplies();
        Stack<String> stackFrom = supplies.emptyStack;
        Stack<String> stackTowards = supplies.emptyStack;
        Stack<String> stack1 = supplies.stack1;
        Stack<String> stack2 = supplies.stack2;
        Stack<String> stack3 = supplies.stack3;
        Stack<String> stack4 = supplies.stack4;
        Stack<String> stack5 = supplies.stack5;
        Stack<String> stack6 = supplies.stack6;
        Stack<String> stack7 = supplies.stack7;
        Stack<String> stack8 = supplies.stack8;
        Stack<String> stack9 = supplies.stack9;
        supplies.populateStack1();
        supplies.populateStack2();
        supplies.populateStack3();
        supplies.populateStack4();
        supplies.populateStack5();
        supplies.populateStack6();
        supplies.populateStack7();
        supplies.populateStack8();
        supplies.populateStack9();
        System.out.println(stack1.size() + " " + stack2.size() + " " + stack3.size() + " " + stack4.size() + " " + stack5.size() + " " + stack6.size() + " " + stack7.size() + " " + stack8.size() + " " + stack9.size());


        int[][] instructions = {{3,2,9}};


        for (int i = 0; i < instructions.length; i++) {

            int moveAmnt = instructions[i][0];
            if (instructions[i][1] == 1) {
                stackFrom = stack1;
            }
            if (instructions[i][1] == 2) {
                stackFrom = stack2;
            }
            if (instructions[i][1] == 3) {
                stackFrom = stack3;
            }
            if (instructions[i][1] == 4) {
                stackFrom = stack4;
            }
            if (instructions[i][1] == 5) {
                stackFrom = stack5;
            }
            if (instructions[i][1] == 6) {
                stackFrom = stack6;
            }
            if (instructions[i][1] == 7) {
                stackFrom = stack7;
            }
            if (instructions[i][1] == 8) {
                stackFrom = stack8;
            }
            if (instructions[i][1] == 9) {
                stackFrom = stack9;
            }
            if (instructions[i][2] == 1) {
                stackTowards = stack1;
            }
            if (instructions[i][2] == 2) {
                stackTowards = stack2;
            }
            if (instructions[i][2] == 3) {
                stackTowards = stack3;
            }
            if (instructions[i][1] == 4) {
                stackTowards = stack4;
            }
            if (instructions[i][1] == 5) {
                stackTowards = stack5;
            }
            if (instructions[i][1] == 6) {
                stackTowards = stack6;
            }
            if (instructions[i][1] == 7) {
                stackTowards = stack7;
            }
            if (instructions[i][1] == 8) {
                stackTowards = stack8;
            }
            if (instructions[i][1] == 9) {
                stackTowards = stack9;
            }
            //zovaak als moveAmnt, kopieer top-of-stack van stackFrom naar cache. Push cache naar stockTowards. Pop stackFrom.
            for (int m = 0; m < moveAmnt; m++) {
                String cache = stackFrom.peek();
                stackTowards.add(cache);
                stackFrom.pop();
            }

        }


        System.out.println(stack1.size() + " " + stack2.size() + " " + stack3.size() + " " + stack4.size() + " " + stack5.size() + " " + stack6.size() + " " + stack7.size() + " " + stack8.size() + " " + stack9.size());


    }

    Stack<String> emptyStack = new Stack<>();
    Stack<String> stack1 = new Stack<>();
    Stack<String> stack2 = new Stack<>();
    Stack<String> stack3 = new Stack<>();
    Stack<String> stack4 = new Stack<>();
    Stack<String> stack5 = new Stack<>();
    Stack<String> stack6 = new Stack<>();
    Stack<String> stack7 = new Stack<>();
    Stack<String> stack8 = new Stack<>();
    Stack<String> stack9 = new Stack<>();

    void populateStack1() {
        stack1.add("T");
        stack1.add("D");
        stack1.add("W");
        stack1.add("Z");
        stack1.add("V");
        stack1.add("P");
    }

    void populateStack2() {
        stack2.add("L");
        stack2.add("S");
        stack2.add("W");
        stack2.add("V");
        stack2.add("F");
        stack2.add("J");
        stack2.add("D");

    }

    void populateStack3() {
        stack3.add("Z");
        stack3.add("M");
        stack3.add("L");
        stack3.add("S");
        stack3.add("V");
        stack3.add("T");
        stack3.add("B");
        stack3.add("H");
    }

    void populateStack4() {
        stack4.add("R");
        stack4.add("S");
        stack4.add(" J");
    }

    void populateStack5() {
        stack5.add("C");
        stack5.add("Z");
        stack5.add("B");
        stack5.add("G");
        stack5.add("F");
        stack5.add("M");
        stack5.add("L");
        stack5.add("W");

    }

    void populateStack6() {
        stack6.add("Q");
        stack6.add("W");
        stack6.add("V");
        stack6.add("H");
        stack6.add("Z");
        stack6.add("R");
        stack6.add("G");
        stack6.add("B");


    }

    void populateStack7() {
        stack7.add("V");
        stack7.add("J");
        stack7.add("P");
        stack7.add("C");
        stack7.add("B");
        stack7.add("D");
        stack7.add("N");
    }

    void populateStack8() {
        stack8.add("P");
        stack8.add("T");
        stack8.add("B");
        stack8.add("Q");

    }

    void populateStack9() {
        stack9.add("H");
        stack9.add("G");
        stack9.add("Z");
        stack9.add("R");
        stack9.add("C");
    }


}
//Integer.parseInt(String str)
/*
Plan:
-maak de stacks
-push de juiste letters in de juiste stacks.
-hoeveel regels instructies (ins) zijn er? insStart = ins.
 -> ins>0 ? kijk naar hoe vaak er gepopt moet worden ('move x')
 -> move >0 ?
 -> pop entry van eerst vermelde stack ('from'), push deze letter naar de tweede vermelde stack ('to')
 -> move --
 -> move >0 ?
 -> move==0? ins ++
 -> insStart-ins => 0 :Volgende regel instructies.
 -> insStart-ins <0? Peek alle stacks.
 -> Output peeks.

 */
