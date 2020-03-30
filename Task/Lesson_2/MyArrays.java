package Task.Lesson_2;

public class MyArrays {


    public static int exceptionMethod(String[][] arr1) throws MyArraySizeException, MyArrayDataException {

        int sumOfElements = 0;
        if (arr1.length != 4) throw new MyArraySizeException();
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i].length != 4) throw new MyArraySizeException();
            for (int j = 0; j < arr1.length; j++) {
                try {
                    sumOfElements = sumOfElements + Integer.parseInt(arr1[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException();
                }
            }
        }
        return sumOfElements;
    }


    public static void main(String[] args) {
        String[][] arr1 = {
                {"hello", "10", "145", "word"},
                {"help", "four", "27", "ok"},
                {"15", "20", "71", "96"},
                {"pass", "failed", "window", "abc"}
        };
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {

                try { int result = exceptionMethod(arr1);
                        System.out.println(result);
                    } catch (MyArraySizeException e) {
                        e.printStackTrace();
                        System.out.println("РАЗМЕР МАССИВА НЕ РАВЕН 4 (четырем)!");
                    } catch (MyArrayDataException e) {
                        System.out.println("ЗНАЧЕНИЕ МАССИВА ИМЕЕТ НЕ ЧИСЛОВОЕ ЗНАЧЕНИЕ");
                        System.out.println("ОШИБКА В ЯЧЕЙКЕ МАССИВА: (строка * столбец)"  + "  " + i + " * " +  j);
                        System.out.println();
                        e.printStackTrace();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        private static class MyArraySizeException extends Exception {
    }

    private static class MyArrayDataException extends Throwable {
        public String i;
        public String j;

       public MyArrayDataException() {
        }


        public void printStackTrace() {
        }

        public void toString(int j) {
        }

    }
}

