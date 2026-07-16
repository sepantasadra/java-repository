package calculator;

import java.util.ArrayList;

public class CalculatorS {

//    public static String args(){
//
//
//    }

    public static double calc(ArrayList<String> args) {

        ArrayList<Double> nums = new ArrayList<>();
        ArrayList<String> methods = new ArrayList<>();

        for (int i = 0; i < args.size(); i++) {

            String x = args.get(i);

            if (x.equals("/") || x.equals("*")) {

                switch (x) {
                    case "/":
                        nums.set(
                                nums.size() - 1, nums.get(nums.size() - 1) / Double.parseDouble(args.get(++i)));
                        break;

                    case "*":
                        nums.set(
                                nums.size() - 1, nums.get(nums.size() - 1) * Double.parseDouble(args.get(++i)));
                        break;
                }

            } else if (x.equals("+") || x.equals("-")) {

                methods.add(x);

            } else {

                nums.add(Double.parseDouble(x));
            }
        }

        while (nums.size() != 1) {

            switch (methods.get(0)) {

                case "+":
                    nums.set(0,nums.get(0) + nums.get(1));
                    nums.remove(1);
                    methods.remove(0);
                break;

                case "-":
                    nums.set(0,nums.get(0) - nums.get(1));
                    nums.remove(1);
                    methods.remove(0);
                break;
            }
        }

        return nums.get(0);
    }

}