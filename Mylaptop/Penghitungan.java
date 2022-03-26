package Mylaptop;

public class Penghitungan {
    private Stack stack;
    private String masukan;
    private String total = "";

    public Penghitungan(String in) {
        masukan = in;
        int stackSize = masukan.length();
        stack = new Stack(stackSize);
    }

    public String doTrans() {
        for (int a = 0; a < masukan.length(); a++) {
            char ch = masukan.charAt(a);
            switch (ch) {
                case '+':
                case '-':
                    gotOper(ch, 1);
                    break;
                case '*':
                case '/':
                    gotOper(ch, 2);
                    break;
                case '^':
                    gotOper(ch, 3);
                    break;
                case '(':
                    stack.push(ch);
                    break;
                case ')':
                    gotParen(ch);
                    break;
                default:
                    total = total + ch;
                    break;
            }
        }
        while (!stack.isEmpty()) {
            total = total + stack.pop();
        }
        return total;
    }

    public void gotOper(char opThis, int prec1) {
        while (!stack.isEmpty()) {
            char opTop = (char) stack.pop();
            if (opTop == '(') {
                stack.push(opTop);
                break;
            }
            else {
                int prec2;
                if (opTop == '+' || opTop == '-')
                    prec2 = 1;
                else if (opTop == '*' || opTop == '/')
                    prec2 = 2;
                else
                    prec2 = 3;
                if (prec2 < prec1)
                {
                    stack.push(opTop);
                    break;
                } else
                    total = total + opTop;
            }
        }
        stack.push(opThis);
    }

    public void gotParen(char ch){
        while (!stack.isEmpty()) {
            char chx = (char) stack.pop();
            if (chx == '(')
                break;
            else
                total = total + chx;
        }
    }
}
