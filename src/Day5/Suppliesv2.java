package Day5;

import java.util.Stack;

public class Suppliesv2 {
    public static void main(String[] args) {
        Suppliesv2 suppliesv2 = new Suppliesv2();
        Stack<String> stackFrom = suppliesv2.emptyStack;
        Stack<String> stackTowards = suppliesv2.emptyStack;
        Stack<String>[] newStack = suppliesv2.newStack;
        for (int m = 0; m < 3; m++) {
            suppliesv2.newStack[m] = new Stack<String>();
        }
        suppliesv2.populateStack1();
        suppliesv2.populateStack2();
        suppliesv2.populateStack3();

        System.out.println(newStack[0].peek() + "" + newStack[1].peek() + "" + newStack[2].peek());
        int[][] instructions = {{1, 2, 1}, {3, 1, 3}, {2, 2, 1}, {1, 1, 2}};
        for (int i = 0; i < instructions.length; i++) {

            int moveAmnt = instructions[i][0];

            stackFrom = newStack[instructions[i][1] - 1];
            stackTowards = newStack[instructions[i][2] - 1];
            Stack<String> stapeltje = new Stack<>();


            //Neem de top-of-stack van stackFrom en leg die op stapeltje, pop hem bij stackFrom. Doe dat zo vaak als movement size.
            // Leg de top-of-stack van stapeltje op stackTowards, pop daarna stapeltje. Doe dat tot stapeltje.size 0 is. Ga naar volgende instructie.
            for (int m = 0; m < moveAmnt; m++) {
                stapeltje.add(stackFrom.peek());
                stackFrom.pop();
            }
            for (int n = 0; n < stapeltje.size(); n++) {
                stackTowards.add(stapeltje.peek());
                stapeltje.pop();

            }


        }

        System.out.println(newStack[0].size() + "" + newStack[1].size() + "" + newStack[2].size());


    }

    Stack<String>[] newStack = new Stack[3];


    Stack<String> emptyStack = new Stack<>();
    Stack<String> stack1 = new Stack<>();
    Stack<String> stack2 = new Stack<>();
    Stack<String> stack3 = new Stack<>();

    void populateStack1() {
        Stack<String> stack1 = newStack[0];
        stack1.add("Z");
        stack1.add("N");

    }

    void populateStack2() {
        Stack<String> stack2 = newStack[1];
        stack2.add("M");
        stack2.add("C");
        stack2.add("D");
    }

    void populateStack3() {
        Stack<String> stack3 = newStack[2];
        stack3.add("P");
    }

}
