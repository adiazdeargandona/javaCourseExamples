class Util 
{
    public int metodo1() throws Exception
    {
        if(Math.random()>0.5)
            return 1;
        else
            throw new Exception();
    }
    
    public static int metodo2() throws ExceptionTipo1, ExceptionTipo2
    {
        if(Math.random()>0.7)
            return 1;
        else if(Math.random()>0.4)
            throw new ExceptionTipo1();
        else
            throw new ExceptionTipo2();
    }    
}

class ExceptionTipo1 extends Exception
{
    
}

class ExceptionTipo2 extends ExceptionTipo1
{
    
}