package PROJE;

public class YorumTableData {

    private final String yorum;
    private final String yorumPaylasan;
    public YorumTableData(String yorum,String yorumPaylasan) {
        this.yorum = yorum;
        this.yorumPaylasan = yorumPaylasan;
    }

    public String getYorum() {
        return yorum;
    }
    
    public String getYorumPaylasan() {
        return yorumPaylasan;
    }
}
