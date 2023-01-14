class first{
    public static void main(String[] args){
        /*System.out.println("Hi Sumit");
        int pie = 22;
        System.out.println(pie);
        float pie_value = 1.1234567890987654321f;
        System.out.println(pie_value);
        byte asd = -128;
        System.out.println(asd);
        short s = 32000;
        System.out.println(s);
        long t = 12345667L;
        System.out.println(t);
        double g = 1.23456789123456789;
        System.out.println(g);
        char j = 'T';
        System.out.println(j);

         */
        char gender = 'F';
        byte age = 12;

      /*  if (gender == 'M') {
            if (age >= 21) {
                System.out.println("He can Vote");
            }else {
                System.out.println("He cannot Vote");
            }
        }else if (gender == 'F') {
            if (age >= 18) {
                System.out.println("She can Vote");
            }else {
                System.out.println("She cannot Vote");
            }
        }else {
            System.out.println("you can write gender as 'M' or 'F' only");
        }
*/
        //using gates
        if (gender == 'M') {
            if ((gender == 'M') && (age >= 21)) {
                System.out.println("He can vote");
            }else {
                System.out.println("He is not matured to Vote");
            }
        } else if (gender == 'F') {
            if ((gender == 'F') && (age >= 18)) {
                System.out.println("She can vote");
            }else {
                System.out.println("She is not matured to Vote");
            }
        }else {
            System.out.println("The voter should be a Male or a Female");
        }

        // NOTE - using not operator (!) that is if !(100 > 1) first check if 100 is greater than 1 True
        // then do its negationn that is False this if statement would not run because condition is false
        // see in the below example
        if (100 > 1) {
            System.out.println("True");
        }else {
            System.out.println("False");
        }
        if !(100 > 1) {
            System.out.println();
        }

    }
        }

