public class Foo {

    int first = 15;
    int second = 20;
    int third = 25;
    int fourth = 30;

    int sum1 = first + second;
    int sum2 = third + fourth;

    public void Bar()
    {
        System.out.println(sum1 > sum2);

        //System.out.println(String.format("Sum 1 is: %s and Sum 2 is: %s", sum1, sum2));

        ++sum1;
        sum2 -= 2;

        //System.out.println(String.format("Sum 1 is: %s and Sum 2 is: %s", sum1, sum2));

        System.out.println(sum1 > sum2);
        System.out.println((sum1 % 2 == 0) || (sum2 % 2 == 0));

    }


}
