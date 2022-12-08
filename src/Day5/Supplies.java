package Day5;

import java.util.Stack;

public class Supplies {
    public static void main(String[] args) {
        Supplies supplies = new Supplies();
        Stack<String> stack1 = supplies.stack1;
        Stack<String> stack2 = supplies.stack2;
        Stack<String> stack3 = supplies.stack3;
        supplies.populateStack1();
        supplies.populateStack2();
        supplies.populateStack3();

        int[][] instructions = {{1, 2, 1}};
        Stack<String> stackFrom = supplies.emptyStack;
        Stack<String> stackTowards = supplies.emptyStack;

        for (int i = 0; i <= instructions[i][0]-1; i++) {

            int moveAmnt= instructions[i][0];
            if (instructions[i][1] == 1) {
                stackFrom = stack1;
            }
            if (instructions[i][1] == 2) {
                stackFrom = stack2;
            }
            if (instructions[i][1] == 3) {
                stackFrom = stack3;
            }
            if (instructions[i][2] == 1) {
                stackTowards = stack1;
            }
            if (instructions[i][2] == 2) {
                stackTowards = stack2;
            }
            if (instructions[i][2] == 1) {
                stackTowards = stack3;
            }
            //zovaak als moveAmnt, kopieer top-of-stack van stackFrom naar cache. Push cache naar stockTowards. Pop stackFrom.
            for(int m=0; m<moveAmnt; m++){
                String cache = stackFrom.peek();
                stackTowards.add(cache);
                stackFrom.pop();
            }

        }

        System.out.println(stack1 + " " + stack2 + " " + stack3);


    }

    Stack<String> emptyStack = new Stack<>();
    Stack<String> stack1 = new Stack<>();
    Stack<String> stack2 = new Stack<>();
    Stack<String> stack3 = new Stack<>();

    void populateStack1() {
        stack1.add("Z");
        stack1.add("N");
    }

    void populateStack2() {
        stack2.add("M");
        stack2.add("C");
        stack2.add("D");
    }

    void populateStack3() {
        stack3.add("P");
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
