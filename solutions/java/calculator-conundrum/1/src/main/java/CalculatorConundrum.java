class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) throws IllegalArgumentException,IllegalOperationException{
        if(operation==null){
            throw new IllegalArgumentException("Operation cannot be null");
        }
        else if("".equals(operation)){
            throw new IllegalArgumentException("Operation cannot be empty");
        }
        else if(operand2==0&&"/".equals(operation)){
            throw new IllegalOperationException("Division by zero is not allowed",new ArithmeticException());
        }
        switch(operation){
            case "+":return String.format("%s %s %s = %s",operand1,operation,operand2,operand1+operand2);
            case "*":return String.format("%s %s %s = %s",operand1,operation,operand2,operand1*operand2);
            case "/":return String.format("%s %s %s = %s",operand1,operation,operand2,operand1/operand2);
            default:throw new IllegalOperationException("Operation '"+operation+"' does not exist");
        }
    }
}
