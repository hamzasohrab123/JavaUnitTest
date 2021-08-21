public class ForEach {

        public static void main(String[] args) {
            int[] a = new int[10];
            a[0] = 12;
            a[1] = 24;
            a[2] = 36;
            a[3] = 48;
            a[4] = 60;
            a[5] = 72;
            a[6] = 84;
            a[7] = 96;
            a[8] = 108;
            a[9] = 120;

            //Demonstration of for-each loop
            int i = 0;
            for (int array : a){
                System.out.println("Array["+ i++ +"] : " + array);

            }
        }
    }
