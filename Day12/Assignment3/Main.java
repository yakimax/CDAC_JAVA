class One

{

    One()

    {

        fun();

    }   

    void fun()

    {

        System.out.print("first ");

    }

}

class Two extends One

{

    void fun()

    {

        System.out.print("second ");

    }

}

class Main

{

    public static void main(String args[])

    {

        One o = new Two();

        o.fun();

    }
}