package FizzBuzz;

public class FizzBuzz {
    private int sn;
    private int en;

    public FizzBuzz(){
//        this.sn = 1;
//        this.en = 10;

        this(1,10);
    }

    public FizzBuzz(int sn, int en)
    {
        this.sn = sn;
        this.en = en;
    }

    public int getSn()
    {
        return sn;
    }

    public int getEn()
    {
        return en;
    }

    public void setSn(int sn)
    {
        this.sn = sn;
    }

    public void setEn(int en)
    {
        this.en = en;
    }

    //method name: fizzBuzz
    public void fizzBuzz(FizzBuzz fb) //fb has sn and en .. fb.sn and fb.en
    {
        this.sn = fb.sn;
        this.en = fb.en;
        int number = this.sn;
        while( number <= this.en)
        {
            if(number % 3 == 0 && number % 5 == 0)
            {
                System.out.println("FizzBuzz");
            }
            else if(number % 3 == 0)
            {
                System.out.println("Fizz");
            }
            else if(number % 5 == 0)
            {
                System.out.println("Buzz");
            }
            else {
                System.out.println(number);
            }
            number++;
        }

    }

}
