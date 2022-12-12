package Day5;

import java.util.Stack;

public class Supplies {
    public static void main(String[] args) {
        Supplies supplies = new Supplies();
        Stack<String> stackFrom = supplies.emptyStack;
        Stack<String> stackTowards = supplies.emptyStack;
        Stack<String>[] newStack = supplies.newStack;

        for (int m = 0; m < 9; m++) {
            newStack[m] = new Stack<String>();
        }
        supplies.populateStack1();
        supplies.populateStack2();
        supplies.populateStack3();
        supplies.populateStack4();
        supplies.populateStack5();
        supplies.populateStack6();
        supplies.populateStack7();
        supplies.populateStack8();
        supplies.populateStack9();

        int[][] instructions = {{3, 2, 9}, {1, 1, 6}, {6, 6, 7}, {13, 7, 6}, {2, 4, 5}, {1, 4, 3}, {5, 9, 8}, {1, 8, 5}, {3, 1, 6}, {2, 1, 8}, {1, 2, 1}, {1, 9, 3}, {2, 9, 8}, {2, 5, 9}, {4, 5, 4}, {10, 8, 4}, {5, 6, 2}, {5, 5, 9}, {7, 3, 7}, {1, 9, 8}, {1, 1, 9}, {1, 7, 3}, {3, 8, 9}, {8, 6, 7}, {3, 9, 4}, {3, 2, 6}, {6, 6, 3}, {10, 7, 9}, {1, 7, 5}, {1, 5, 7}, {2, 3, 6}, {8, 4, 2}, {7, 4, 3}, {5, 2, 3}, {2, 4, 6}, {6, 2, 8}, {14, 9, 1}, {6, 3, 2}, {7, 3, 7}, {4, 2, 3}, {1, 6, 5}, {3, 6, 5}, {2, 2, 4}, {3, 1, 2}, {2, 4, 1}, {3, 5, 6}, {1, 9, 6}, {1, 2, 6}, {7, 7, 4}, {5, 8, 1}, {11, 3, 5}, {2, 2, 5}, {8, 5, 1}, {4, 7, 2}, {2, 6, 8}, {3, 2, 4}, {1, 8, 3}, {1, 3, 2}, {11, 1, 8}, {4, 6, 5}, {1, 4, 1}, {2, 6, 4}, {14, 1, 9}, {1, 1, 6}, {1, 1, 9}, {10, 4, 3}, {3, 3, 2}, {8, 8, 9}, {1, 4, 5}, {8, 5, 8}, {10, 9, 5}, {5, 3, 2}, {1, 3, 7}, {1, 2, 5}, {6, 2, 3}, {7, 3, 5}, {1, 6, 9}, {2, 5, 9}, {4, 2, 9}, {1, 2, 1}, {1, 1, 5}, {1, 7, 4}, {17, 9, 1}, {4, 1, 5}, {9, 5, 8}, {21, 8, 6}, {1, 4, 6}, {3, 5, 1}, {10, 1, 5}, {12, 5, 3}, {3, 3, 6}, {5, 5, 7}, {5, 5, 9}, {5, 7, 5}, {2, 5, 7}, {1, 8, 5}, {1, 7, 3}, {3, 1, 7}, {11, 6, 5}, {1, 7, 3}, {5, 9, 7}, {8, 3, 6}, {4, 9, 6}, {3, 1, 6}, {1, 9, 5}, {6, 5, 1}, {1, 1, 6}, {3, 1, 3}, {2, 1, 2}, {19, 6, 1}, {2, 5, 9}, {5, 3, 1}, {1, 5, 6}, {5, 6, 7}, {3, 7, 9}, {6, 5, 9}, {1, 5, 6}, {4, 6, 9}, {2, 2, 1}, {1, 3, 2}, {1, 2, 7}, {7, 7, 6}, {21, 1, 3}, {2, 7, 8}, {7, 3, 2}, {2, 7, 9}, {8, 3, 8}, {4, 3, 1}, {6, 1, 9}, {7, 2, 9}, {1, 3, 6}, {1, 8, 7}, {1, 1, 6}, {12, 6, 9}, {1, 3, 6}, {1, 7, 5}, {1, 1, 9}, {1, 5, 9}, {39, 9, 4}, {3, 9, 6}, {1, 9, 6}, {7, 8, 4}, {1, 9, 8}, {44, 4, 1}, {1, 6, 3}, {28, 1, 8}, {15, 8, 1}, {1, 3, 2}, {11, 1, 5}, {1, 4, 7}, {1, 4, 5}, {16, 1, 6}, {1, 2, 6}, {12, 8, 2}, {1, 7, 4}, {3, 2, 4}, {7, 2, 4}, {4, 1, 6}, {10, 5, 6}, {1, 1, 5}, {3, 5, 9}, {3, 8, 7}, {1, 2, 3}, {1, 2, 4}, {3, 7, 4}, {30, 6, 8}, {1, 3, 7}, {20, 8, 4}, {1, 7, 3}, {1, 9, 8}, {25, 4, 6}, {1, 3, 5}, {8, 8, 5}, {3, 8, 4}, {2, 9, 5}, {2, 5, 2}, {21, 6, 4}, {2, 2, 6}, {28, 4, 5}, {1, 8, 6}, {5, 4, 8}, {3, 6, 7}, {15, 5, 2}, {3, 7, 6}, {1, 4, 3}, {17, 5, 1}, {1, 3, 4}, {1, 4, 8}, {4, 2, 4}, {4, 4, 1}, {5, 6, 8}, {11, 8, 3}, {4, 6, 7}, {5, 3, 2}, {4, 3, 1}, {25, 1, 7}, {3, 6, 7}, {8, 2, 3}, {11, 7, 2}, {2, 2, 7}, {16, 2, 6}, {1, 2, 8}, {1, 7, 6}, {1, 5, 2}, {16, 6, 2}, {3, 5, 7}, {6, 2, 8}, {1, 5, 4}, {1, 4, 3}, {4, 8, 9}, {4, 3, 9}, {2, 6, 2}, {6, 2, 4}, {1, 9, 7}, {1, 2, 8}, {7, 3, 6}, {4, 2, 6}, {2, 9, 5}, {1, 2, 4}, {6, 6, 9}, {2, 5, 1}, {1, 1, 4}, {1, 9, 4}, {2, 7, 6}, {1, 2, 5}, {1, 5, 9}, {4, 8, 1}, {7, 9, 8}, {3, 1, 7}, {1, 8, 3}, {4, 9, 6}, {6, 8, 1}, {6, 1, 2}, {1, 1, 9}, {1, 1, 7}, {21, 7, 5}, {11, 5, 3}, {1, 9, 5}, {1, 2, 8}, {5, 7, 5}, {10, 3, 9}, {1, 8, 5}, {8, 4, 2}, {1, 3, 4}, {2, 7, 3}, {5, 5, 3}, {5, 9, 8}, {10, 6, 2}, {1, 6, 4}, {1, 9, 4}, {4, 9, 3}, {19, 2, 5}, {2, 4, 5}, {11, 5, 1}, {15, 5, 2}, {4, 8, 1}, {12, 1, 5}, {1, 8, 1}, {1, 4, 8}, {3, 1, 3}, {8, 5, 4}, {7, 3, 9}, {4, 3, 5}, {4, 4, 1}, {3, 9, 3}, {2, 4, 1}, {4, 3, 8}, {4, 2, 3}, {1, 9, 5}, {4, 8, 6}, {2, 4, 3}, {1, 4, 5}, {5, 3, 4}, {3, 3, 6}, {5, 1, 6}, {2, 4, 6}, {1, 9, 2}, {7, 6, 3}, {1, 8, 9}, {2, 1, 4}, {2, 4, 7}, {4, 6, 4}, {5, 3, 7}, {1, 7, 2}, {3, 6, 7}, {1, 4, 5}, {4, 2, 6}, {3, 6, 9}, {1, 6, 5}, {1, 9, 2}, {5, 9, 3}, {11, 5, 1}, {3, 7, 8}, {2, 8, 9}, {4, 5, 1}, {10, 2, 7}, {5, 3, 7}, {1, 9, 3}, {6, 1, 7}, {22, 7, 9}, {3, 2, 4}, {4, 5, 3}, {1, 8, 4}, {5, 4, 7}, {19, 9, 8}, {2, 1, 5}, {2, 4, 5}, {2, 4, 9}, {4, 9, 2}, {4, 7, 3}, {5, 7, 5}, {7, 3, 7}, {2, 8, 4}, {3, 4, 7}, {12, 8, 1}, {4, 3, 7}, {1, 3, 6}, {1, 6, 1}, {1, 5, 9}, {3, 9, 3}, {2, 2, 4}, {3, 8, 3}, {2, 4, 7}, {7, 5, 1}, {2, 8, 3}, {8, 7, 9}, {2, 9, 7}, {3, 9, 5}, {11, 1, 2}, {5, 3, 8}, {16, 1, 5}, {1, 9, 8}, {3, 3, 2}, {6, 2, 6}, {6, 7, 4}, {2, 5, 2}, {6, 4, 9}, {11, 5, 7}, {2, 6, 5}, {9, 5, 1}, {2, 8, 5}, {13, 7, 4}, {6, 1, 5}, {10, 2, 9}, {1, 4, 5}, {4, 6, 9}, {3, 2, 4}, {2, 8, 2}, {15, 4, 5}, {1, 2, 8}, {1, 2, 3}, {2, 8, 7}, {3, 7, 1}, {1, 7, 8}, {3, 5, 9}, {1, 7, 1}, {21, 5, 2}, {3, 9, 1}, {5, 1, 4}, {1, 3, 4}, {1, 8, 5}, {1, 8, 9}, {1, 5, 3}, {5, 2, 5}, {5, 5, 3}, {7, 9, 2}, {3, 3, 6}, {2, 1, 4}, {1, 3, 4}, {2, 3, 2}, {25, 2, 1}, {11, 9, 2}, {9, 2, 8}, {4, 9, 5}, {6, 4, 3}, {3, 3, 5}, {9, 8, 2}, {3, 4, 3}, {1, 9, 4}, {4, 3, 8}, {2, 8, 1}, {3, 5, 9}, {2, 8, 1}, {4, 2, 9}, {6, 9, 4}, {1, 9, 2}, {1, 6, 4}, {3, 4, 3}, {2, 3, 9}, {3, 1, 9}, {2, 2, 7}, {2, 7, 2}, {2, 3, 2}, {5, 9, 7}, {2, 7, 2}, {28, 1, 7}, {1, 1, 9}, {10, 2, 5}, {1, 9, 5}, {14, 7, 1}, {6, 1, 6}, {12, 7, 9}, {6, 1, 5}, {1, 3, 8}, {4, 7, 1}, {4, 4, 8}, {4, 6, 1}, {1, 2, 8}, {1, 2, 1}, {1, 6, 1}, {5, 9, 8}, {16, 5, 7}, {2, 7, 1}, {6, 8, 1}, {2, 9, 4}, {2, 1, 3}, {1, 6, 8}, {2, 5, 3}, {3, 5, 7}, {4, 8, 7}, {4, 9, 8}, {6, 8, 6}, {10, 7, 8}, {1, 9, 1}, {11, 7, 6}, {2, 3, 9}, {1, 3, 4}, {4, 1, 2}, {3, 2, 3}, {1, 9, 1}, {3, 4, 2}, {9, 6, 4}, {2, 3, 5}, {8, 4, 9}, {4, 1, 8}, {3, 8, 2}, {2, 2, 6}, {1, 7, 2}, {11, 6, 5}, {7, 8, 6}, {7, 5, 8}, {5, 8, 5}, {1, 2, 5}, {3, 5, 7}, {8, 5, 6}, {2, 4, 5}, {1, 7, 9}, {2, 3, 8}, {3, 8, 5}, {13, 6, 2}, {2, 8, 5}, {5, 1, 9}, {3, 6, 4}, {5, 5, 8}, {1, 5, 4}, {4, 1, 4}, {1, 7, 2}, {12, 9, 7}, {2, 9, 1}, {3, 8, 3}, {1, 5, 4}, {3, 8, 9}, {2, 4, 7}, {4, 9, 5}, {5, 4, 9}, {3, 9, 2}, {1, 9, 4}, {1, 9, 3}, {12, 7, 4}, {1, 4, 8}, {1, 8, 1}, {1, 5, 4}, {2, 3, 5}, {11, 2, 3}, {4, 5, 7}, {7, 7, 2}, {1, 1, 9}, {1, 8, 3}, {1, 9, 1}, {2, 1, 5}, {2, 5, 4}, {1, 8, 1}, {2, 5, 8}, {5, 1, 9}, {11, 3, 9}, {1, 3, 6}, {1, 6, 3}, {3, 3, 6}, {3, 2, 6}, {13, 9, 7}, {2, 6, 1}, {8, 4, 9}, {7, 4, 2}, {2, 8, 6}, {1, 1, 9}, {5, 2, 1}, {2, 1, 3}, {10, 2, 8}, {3, 9, 3}, {1, 7, 4}, {6, 7, 5}};


        for (int i = 0; i < instructions.length; i++) {

            int moveAmnt = instructions[i][0];

            stackFrom = newStack[instructions[i][1] - 1];
            stackTowards = newStack[instructions[i][2] - 1];

            //zovaak als moveAmnt, kopieer top-of-stack van stackFrom naar cache. Push cache naar stackTowards. Pop stackFrom.
            for (int m = 0; m < moveAmnt; m++) {
                String cache = stackFrom.peek();
                stackTowards.push(cache);
                stackFrom.pop();
            }

        }


        System.out.println(newStack[0].peek() + "" + newStack[1].peek() + "" + newStack[2].peek() + "" + newStack[3].peek() + "" + newStack[4].peek() + "" + newStack[5].peek() + "" + newStack[6].peek() + "" + newStack[7].peek() + "" + newStack[8].peek());


    }

    Stack<String>[] newStack = new Stack[9];


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
        Stack<String> stack1 = newStack[0];
        stack1.add("T");
        stack1.add("D");
        stack1.add("W");
        stack1.add("Z");
        stack1.add("V");
        stack1.add("P");
    }

    void populateStack2() {
        Stack<String> stack2 = newStack[1];
        stack2.add("L");
        stack2.add("S");
        stack2.add("W");
        stack2.add("V");
        stack2.add("F");
        stack2.add("J");
        stack2.add("D");

    }

    void populateStack3() {
        Stack<String> stack3 = newStack[2];
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
        Stack<String> stack4 = newStack[3];
        stack4.add("R");
        stack4.add("S");
        stack4.add(" J");
    }

    void populateStack5() {
        Stack<String> stack5 = newStack[4];
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
        Stack<String> stack6 = newStack[5];
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
        Stack<String> stack7 = newStack[6];
        stack7.add("V");
        stack7.add("J");
        stack7.add("P");
        stack7.add("C");
        stack7.add("B");
        stack7.add("D");
        stack7.add("N");
    }

    void populateStack8() {
        Stack<String> stack8 = newStack[7];
        stack8.add("P");
        stack8.add("T");
        stack8.add("B");
        stack8.add("Q");

    }

    void populateStack9() {
        Stack<String> stack9 = newStack[8];
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
