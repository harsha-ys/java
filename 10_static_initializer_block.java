
static int B;
static int H;
static boolean flag=true;
static
{
    Scanner s=new Scanner(System.in);
    B=s.nextInt();
    H=s.nextInt();
    if (B<=0 || H<=0)
    {
        flag=false;
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
}


