public class Number_shapes {

    public static void main (String[] args) {

        class Number{

            int num;

            public boolean triangleNumber(){

                int x = 1;

                int triangleNumber = 1;

                while (triangleNumber < num) {

                    x++;
                    triangleNumber = triangleNumber + x;

                }

                return triangleNumber == num;

            }


        }

        Number z = new Number();
        z.num = 6;
        System.out.println(z.triangleNumber());

    }

}
