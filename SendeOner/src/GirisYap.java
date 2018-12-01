/*Bu sınıfta sadece veri tabanı işlemleri vardır */
package PROJE;
import PROJE.TableDatas;
import PROJE.BaglantiDurumu;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class GirisYap {

    BaglantiDurumu bd = new BaglantiDurumu();
    Statement stmt;
    ResultSet rs;

    public boolean girisYap(String kulAdi, String kulSifre) {
        if (bd.conn == null) {
            System.out.println("Bağlanılıyor....");
            bd.baglan();
        }
        try {
            stmt = bd.conn.createStatement();
            rs = stmt.executeQuery("select sifre from kullanicilar where adi = '" + kulAdi + "'");
            while (rs.next()) {
                String temp = rs.getString(1);
                if (kulSifre.equals(temp)) {
                    return true;
                }
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public String hosGeldin(String kulAdi) {
        if (bd.conn == null) {
            bd.baglan();
        }
        try {
            stmt = bd.conn.createStatement();
            rs = stmt.executeQuery("select nick from kullanicilar where adi = '" + kulAdi + "'");
            while (rs.next()) {
                String temp = rs.getString(1);
                return temp;
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
        return "nasıl olcak ozamn";
    }

    public ArrayList<TableDatas> ListUsers(String specificSearch) {

        ArrayList<TableDatas> usersList = new ArrayList<TableDatas>();
        if (bd.conn == null) {
            bd.baglan();
        }

        try {
            stmt = bd.conn.createStatement();
            String searchQuery = "select adi,tur,paylasan,notOrt as notu from eserler e,notortalamalari nOrt where e.eserlerid = nOrt.eserlerid and concat(`adi`, `tur`, `paylasan`,`notOrt`) like '%" + specificSearch + "%'";
            rs = stmt.executeQuery(searchQuery);

            TableDatas tabledatas;

            while (rs.next()) {
                tabledatas = new TableDatas(
                        rs.getString("adi"),
                        rs.getInt("notu"),
                        rs.getString("paylasan"),
                        rs.getString("tur")
                );
                usersList.add(tabledatas);
            }
            rs.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return usersList;
    }

    public ArrayList<TableDatas> showUsers() {
        ArrayList<TableDatas> usersList = new ArrayList<TableDatas>();
        if (bd.conn == null) {
            bd.baglan();
        }
        try {
            stmt = bd.conn.createStatement();
            String listQuery = "select adi,tur,paylasan,notOrt as notu from eserler e,notortalamalari nOrt where e.eserlerid = nOrt.eserlerid";
            rs = stmt.executeQuery(listQuery);

            TableDatas tabledatas;

            while (rs.next()) {
                tabledatas = new TableDatas(
                        rs.getString("adi"),
                        rs.getInt("notu"),
                        rs.getString("paylasan"),
                        rs.getString("tur")
                );
                usersList.add(tabledatas);
            }
            rs.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return usersList;
    }

    public void yeniKayit() {
        if (bd.conn == null) {
            bd.baglan();
        }
        try {
            stmt = bd.conn.createStatement();
            String insertQuery = "insert into eserler (tur,adi,paylasan) values('" + User.eserTurAdi + "','" + EserOner.kontrolAd + "','" + User.paylasanNick + "')";
            stmt.executeUpdate(insertQuery);
            rs = stmt.executeQuery("select last_insert_id() from eserler");
            yeniKayitDevam();
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public boolean isimCakismaKontrol(String cakisma) {

        cakisma = cakisma.toLowerCase();
        cakisma = cakisma.replace(" ", "");
        if (bd.conn == null) {
            bd.baglan();
        }
        try {
            stmt = bd.conn.createStatement();
            String createTableQuery = "create temporary table sanal_table (select replace (lower(adi),' ','')as adi from eserler)";
            stmt.executeUpdate(createTableQuery);
            rs = stmt.executeQuery("select adi from sanal_table where adi = '" + cakisma + "'");
            rs.first();
            String cakismaTemp = rs.getString(1);
            if (!cakismaTemp.isEmpty())// bu condition'a girerse içi dolu demek yani çakışma var
            {
                return true;
            } else {
                return false;
            }

        } catch (java.sql.SQLException e) {
            return false;
            //System.out.println(e);
        }

//        return false;// sende çakışma yok demektir.
    }

    public void yeniKullanici(String ad, String sifre, String nick, String mail, String date) {
        if (bd.conn == null) {
            bd.baglan();
        }
        try {
            stmt = bd.conn.createStatement();
            String yeniKulQuery = "insert into kullanicilar (adi,sifre,nick,mail,kayitTarihi)values('" + ad + "','" + sifre + "','" + nick + "','" + mail + "','" + date + "')";
            stmt.executeUpdate(yeniKulQuery);
            rs = stmt.executeQuery("select last_insert_id() from kullanicilar");
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public boolean isimNickCakismaKontrol(String cakismaAd, String cakismaNick) {

        cakismaAd = cakismaAd.toLowerCase();
        cakismaNick = cakismaNick.toLowerCase();
        cakismaAd = cakismaAd.replace(" ", "");
        if (bd.conn == null) {
            bd.baglan();
        }
        try {
            stmt = bd.conn.createStatement();
            String createSanalQuery = "create temporary table sanal_table2 (select replace(lower(adi),' ','')as ad,lower(nick)as nickT from kullanicilar)";
            stmt.executeUpdate(createSanalQuery);
            rs = stmt.executeQuery("select ad,nickT from sanal_table2 where ad = '" + cakismaAd + "' or nickT = '" + cakismaNick + "'");
            while (rs.next()) {
                String cakismaTempAd = rs.getString(1);
                String cakismaTempNick = rs.getString(2);
                if (!cakismaTempAd.isEmpty())// bu condition'a girerse içi dolu demek yani çakışma var
                {
                    return true;
                }
            }
            rs.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return false;// sende çakışma yok demektir.

    }

    public void veriSil(String sil) {
        if (bd.conn == null) {
            bd.baglan();
        }
        try {
            stmt = bd.conn.createStatement();
            String delQuery = "delete from eserler where adi ='" + sil + "'";
            stmt.executeUpdate(delQuery);
            delQuery = "select adi,tur,paylasan from eserler";
            stmt.executeQuery(delQuery);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public String notOrtGetir(String eserAd) {
        if (bd.conn == null) {
            bd.baglan();
        }
        try {
            stmt = bd.conn.createStatement();
            String notQuery = "select notu from eserler where adi = '" + eserAd + "'";
            rs = stmt.executeQuery(notQuery);
            while (rs.next()) {
                String tempNotOrt = rs.getString(1);
                return tempNotOrt;
            }
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return "sen buraya nasıl geldin??";

    }

    public void yeniKayitDevam() {
        if (bd.conn == null) {
            bd.baglan();
        }
        try {
            stmt = bd.conn.createStatement();
            String insertNotQuery = "insert into notlar (eserlerid,notu) values((select eserlerid from eserler where adi = '" + EserOner.kontrolAd + "'),'" + EserOner.kontrolNot + "')";
            String insertNotOrtQuery = "insert into notortalamalari(eserlerid,notOrt) values((select eserlerid from eserler where adi = '" + EserOner.kontrolAd + "'),'" + EserOner.kontrolNot + "')";
            stmt.executeUpdate(insertNotOrtQuery);
            stmt.executeUpdate(insertNotQuery);
            rs = stmt.executeQuery("select last_insert_id() from notlar");
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void notKontrolIsareti(int kontrol) {//kontrolnottablasunda ilgili notVerdi column'una 1 yazılır.
        if (bd.conn == null) {
            bd.baglan();
        }
        try {
            stmt = bd.conn.createStatement();
            String kontrolEkleQuery = "insert into kontrolnot(kullaniciid,eserlerid,notVerdi)values((select kullaniciid from kullanicilar where nick = '" + User.paylasanNick + "'),(select eserlerid from eserler where adi ='" + EserOner.kontrolAd + "'),'" + kontrol + "')";
            stmt.executeUpdate(kontrolEkleQuery);
            rs = stmt.executeQuery("select * from kontrolnot");
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public boolean notVerdiColumnKontrol(String arama) {
        if (bd.conn == null) {
            bd.baglan();
        }
        try {
            stmt = bd.conn.createStatement();
            String aramaQuery = "select notVerdi from kontrolnot kn where (select kullaniciid from kullanicilar where nick ='" + User.paylasanNick + "') = kn.kullaniciid and kn.eserlerid = (select eserlerid from eserler where adi = '" + arama + "')";
            rs = stmt.executeQuery(aramaQuery);
            rs.first();
            int aramaTemp = rs.getInt(1);
            if (aramaTemp == 1) {
                return true;//daha önce not verilmiş demektir
            } else {
                return false;//not verilmemeiş demektir.
            }
        } catch (java.sql.SQLException e) {
            return false;
        }
    }

    public void notVerildiIsareti(String notVerildiAd, int kontrol) {
        if (bd.conn == null) {
            bd.baglan();
        }
        try {
            stmt = bd.conn.createStatement();
            String kontrolEkleQuery = "insert into kontrolnot(kullaniciid,eserlerid,notVerdi)values((select kullaniciid from kullanicilar where nick = '" + User.paylasanNick + "'),(select eserlerid from eserler where adi ='" + notVerildiAd + "'),'" + kontrol + "')";
            stmt.executeUpdate(kontrolEkleQuery);
            rs = stmt.executeQuery("select * from kontrolnot");
            rs.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public int notVer(int not, String eserAd) {//eserid'sine göre notlar tablosuna notu giriyor ve notlar tablosundaki eserid'sine
        if (bd.conn == null) {                  //göre verilmiş not sayısını tutuyor.    
            bd.baglan();
        }
        try {
            stmt = bd.conn.createStatement();
            String updateQuery = "insert into notlar (eserlerid,notu) values((select eserlerid from eserler where adi='" + eserAd + "'),'" + not + "')";
            stmt.executeUpdate(updateQuery);
            String notOrtUpdateQuery = "select count(n.eserlerid)as notSayisi from notlar n where n.eserlerid = (select eserlerid from eserler where adi = '" + eserAd + "')";
            rs = stmt.executeQuery(notOrtUpdateQuery);
            rs.first();
            int notSayisi = rs.getInt(1);
            System.out.println(notSayisi);
            return notSayisi;
        } catch (Exception e) {
            System.out.println(e);
        }
        return -1;
    }

    public int notVerDevam(String eserAd, int notSayisi) {//eserlerid'sine bakarak notlar toplosundaki notlari sum ediyor
        if (bd.conn == null) {                            //ve ortalama hesabı bu metoda göre yapılıyor.
            bd.baglan();
        }
        try {
            stmt = bd.conn.createStatement();
            String notToplamQuery = "select sum(notu)as nottoplam from notlar where eserlerid = (select eserlerid from eserler where adi ='" + eserAd + "')";
            rs = stmt.executeQuery(notToplamQuery);
            rs.first();
            int notToplamTemp = rs.getInt(1);
            int notOrt = (notToplamTemp / notSayisi);
            return notOrt;
        } catch (Exception e) {
            System.out.println(e);

        }
        return -1;
    }

    public void notOrtKayit(String eserAd, int notOrtalamasi) {//buraya gelmeden önce gelecek olan eserler id var mı yok diye bakılır
        if (bd.conn == null) {              //zaten bu tabloda böyle bir eserlerid var ise update yapılır
            bd.baglan();
        }
        try {
            stmt = bd.conn.createStatement();
            String kontrolQuery = "select nOrt.eserlerid from eserler e,notOrtalamalari nOrt where e.eserlerid = nOrt.eserlerid;";
            String notToplamQuery = "insert into notortalamalari (eserlerid,notOrt)values((select eserlerid from eserler where adi = '" + eserAd + "' ),'" + notOrtalamasi + "')";
            String updateKontrolQuery = "update notortalamalari set notOrt ='" + notOrtalamasi + "' where eserlerid = (select eserlerid from eserler where adi = '" + eserAd + "') ";
            rs = stmt.executeQuery(kontrolQuery);
            rs.first();
            int kontrol = rs.getInt(1);
            if (kontrol > 0) {
                stmt.executeUpdate(updateKontrolQuery);

            } else {
                stmt.executeUpdate(notToplamQuery);
            }

            rs.close();
        } catch (Exception e) {
            System.out.println(e);

        }

    }

    public ArrayList<YorumTableData> showComment() {
        ArrayList<YorumTableData> commentsList = new ArrayList<YorumTableData>();
        if (bd.conn == null) {
            bd.baglan();
        }
        try {
            stmt = bd.conn.createStatement();
            //String listQuery = "select yorum from yorumlar where eserlerid = (select eserlerid from eserler where adi= '" + EserAyrintiFrame.eserAdcomment + "')";
            String listQuery = "select k.nick as paylasan,yorum from (select kullaniciid,yorum from yorumlar y where y.eserlerid =(select eserlerid from eserler where adi ='" + EserAyrintiFrame.eserAdcomment + "'))as tb1,kullanicilar k where tb1.kullaniciid = k.kullaniciid;";
            rs = stmt.executeQuery(listQuery);
            YorumTableData yorumtabledata;
            while (rs.next()) {
                yorumtabledata = new YorumTableData(
                        rs.getString("paylasan"),
                        rs.getString("yorum")
                );
                commentsList.add(yorumtabledata);

            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return commentsList;
    }

    public void yorumKayit(String yorum, String eserAd) {
        bd.baglan();
        try {
            stmt = bd.conn.createStatement();
            String insertYorumQuery = "insert into yorumlar(eserlerid,yorum,kullaniciid)values((select eserlerid from eserler where adi ='" + eserAd + "'),('" + yorum + "'),(select kullaniciid from kullanicilar where adi = '" + Login.kulAdi + "')) ";
            stmt.executeUpdate(insertYorumQuery);
            rs = stmt.executeQuery("select * from yorumlar");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
