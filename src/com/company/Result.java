package com.company;

/**
 * Класс для получения результата арифметической операции
 */
public class Result {
    private int a;
    private  int b;
    private int outputArabic;
    private String outputRoman;
    private String operation;
    private String numberType;

    public Result(int a, int b, String operation, String numberType) {
        this.a = a;
        this.b = b;
        this.operation = operation;
        if (!numberType.equals("arab") && !numberType.equals("rome")) {
            System.err.println("Не соответствие типов чисел!");
            System.exit(0);
        }
        this.numberType = numberType;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public String getOperation() {
        return operation;
    }

    /**
     * В методе выполняется операции с арабским числами
     * @return возвращает целое число
     */
    public int getOutputArabic() {
        switch (operation) {
            case "+":
                outputArabic =(int)(a+b);
                break;
            case "-":
                outputArabic =(int)(a-b);
                break;
            case "*":
                outputArabic =(int)(a*b);
                break;
            case "/":
                outputArabic =(int)(a/b);
                break;
            default:
                outputArabic =0;
                break;
        }
        return outputArabic;
    }

    /**
     * Метод конвертирует арабские числа в римские
     * @return возвращает строку с римскими числами
     */
    public String getOutputRoman() {
        outputRoman = ConvertRomanNumbers.arabicToRoman(getOutputArabic());
        return outputRoman;
    }

    /**
     * Метод выдает тот тип чисел, который был при вводе выражения
     * @return возвращает строку с арабскими или римскими числами
     */
    public String getOutput() {
        if (numberType.equals("arab")) {
            return String.valueOf(getOutputArabic());
        } else if (numberType.equals("rome")) {
            return  getOutputRoman();
        }
        return null;
    }
}
