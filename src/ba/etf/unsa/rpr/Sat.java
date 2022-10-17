package ba.etf.unsa.rpr;



public class Sat {
    int sati,minute,sekunde;
    public Sat(int h,int m, int s)
    {
        Postavi(h,m,s);
    }
    public void Postavi(int h, int m, int s)
    {
        sati = h;
        minute = m;
        sekunde = s;
    }
    public void Sljedeci()
    {
        sekunde++;
        if(sekunde==60) {
            sekunde=0;
            minute++;
        }
        if (minute==60) { minute=0; sati++; }
        if (sati==24) sati=0;

    }
    public void Prethodni() {
        sekunde--;
        if (sekunde==-1) { sekunde=59; minute--; }
        if (minute==-1) { minute=59; sati--; }
        if (sati==-1) sati=23;
    }
   public void PomjeriZa(int pomak) {
        if (pomak>0) for (int i=0; i<pomak; i++) Sljedeci();
        else for (int i=0; i<=pomak; i++) Prethodni();
    }
    int DajSate()  { return sati; }
    int DajMinute()  { return minute; }
    int DajSekunde()  { return sekunde; }
    void Ispisi()  {
        System.out.println("Sati: "+ sati + ":"+minute+":"+sekunde);
    }


}
