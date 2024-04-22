public class LogicalOperator {

    public static void main(String[] args) {
        // Example logical operations
        boolean a = true;
        boolean b = false;
        
        // Logical AND
        boolean resultAnd = a && b;
        System.out.println("a && b = " + resultAnd); // Output: false
        
        // Logical OR
        boolean resultOr = a || b;
        System.out.println("a || b = " + resultOr); // Output: true
        
        // Logical NOT
        boolean resultNotA = !a;
        System.out.println("!a = " + resultNotA); // Output: false
        
        boolean resultNotB = !b;
        System.out.println("!b = " + resultNotB); // Output: true
    }
}
