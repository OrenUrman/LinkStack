import ru.OrenUrman.LinkStackClass.LinkStack;
import ru.OrenUrman.Forms.*;

import java.util.ArrayList;

/**
 * Created by OrenUrman on 28.03.2017.
 */
public class StackClassApp {
    public static void main(String[] args) {

        LinkStack<Object> myStack = new LinkStack<>();

        myStack.push("1");
        myStack.push("2");
        myStack.push(new Integer (10));

        System.out.println(myStack.isEmpty());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.isEmpty());
        try {
            myStack.push("2");
            myStack.push("2");
            myStack.push("2");
            myStack.push("2");
            myStack.push("2");
            myStack.push("2");
            myStack.push("2");
            myStack.push("2");
            myStack.push("2");
            myStack.push("2");
            myStack.push("2");
        }catch (StackOverflowError ex){
            ex.printStackTrace();
            System.out.println("error");
        }
        System.out.println("NO ERROR");
        myStack = null;

        LinkStack<Calculate> calcStack = new LinkStack<Calculate>();
        calcStack.push(new CircleCalculate(2.5));
        calcStack.push(new TriangleCalculate(5,5,5));
        calcStack.push(new SqureCalculate(5));
        calcStack.push(new RectangleCalculate(10,5));

        for (int i=0;i<calcStack.size();i++){
            calcStack.peek().calculate();
            System.out.println(calcStack.pop().toString());
        }



    }
}
