package PROJE;

public class TableDatas {
    private String tur;
    private int notu;
    private String adi;
    private String paylasan;

public TableDatas(String adi,int notu,String paylasan,String tur)
        {
        this.adi = adi;
        this.notu = notu;
        this.paylasan = paylasan;
        this.tur = tur;
        }

public int  getNotu()
{
return notu;
}

public String  getPaylasan()
{
return paylasan;
}

public String  getAdi()
{
return adi;
}
public String  getTur()
{
return tur;
}

}