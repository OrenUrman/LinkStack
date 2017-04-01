import ru.OrenUrman.LinkStackClass.StackLink;
import ru.OrenUrman.NewForms.*;
import ru.OrenUrman.NewForms.CalculateForms;

/**
 * Created by OrenUrman on 28.03.2017.
 */
public class StackClassApp {
    public static void main(String[] args) {

        StackLink<Object> myStack = new StackLink<>();

        myStack.push("220000");
        myStack.push("1");
        myStack.push("2");
        myStack.push(new Integer(10));

        System.out.println(myStack.isEmpty());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
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
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
            System.out.println("выход за пределы стека");
        }
        System.out.println("NO ERROR");

        StackLink<CalculateForms> calcStack = new StackLink<>();
        calcStack.push(new CircleCalculate(2.5));
        calcStack.push(new TriangleCalculate(5, 5, 5));
        calcStack.push(new SqureCalculate(5));
        calcStack.push(new RectangleCalculate(10, 5));

        for (int i = 0; i < calcStack.size(); i++) {
            System.out.println(calcStack.pop().toString());
        }


    }
}
