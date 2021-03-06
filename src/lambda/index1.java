package lambda;

//内部类实现Calculable接口
public class index1 {
    public static Calculable1 calculable(char opr) {
        Calculable1 result;
        if (opr == '+') {
            //匿名内部类实现Calculable接口
            result = new Calculable1() {
                //实现加法算法
                @Override
                public int calculateInt(int a, int b) {
                    return a + b;
                }
            };
        } else {
            //匿名内部类实现Calculable接口
            result = new Calculable1() {
                @Override
                public int calculateInt(int a, int b) {
                    return a - b;
                }
            };
        }
        return result;
    }

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 5;

        //实现加法计算Calculable对象
        Calculable1 f1 = calculable('+');
        //实现减法计算Calculable对象
        Calculable1 f2 = calculable('-');

        //调用calculateInt方法进行加法计算
        System.out.printf("%d+%d=%d\n", n1, n2, f1.calculateInt(n1, n2));
        //调用calculateInt方法进行减法计算
        System.out.printf("%d-%d=%d\n", n1, n2, f2.calculateInt(n1, n2));
    }
}
