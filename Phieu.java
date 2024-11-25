package QuanLyCHTL;

public abstract class Phieu {
    protected String IDPhieu;
    protected String date;
    protected String IDNhanVien;
    protected int sumMoney;

    public Phieu() {

    }

    public Phieu(String IDPhieu, String date, int sumMoney, String IDNhanVien) {
        setIDPhieu(IDPhieu);
        setDate(date);
        this.sumMoney = sumMoney;
        this.IDNhanVien = IDNhanVien;
    }

    public String toString() {
        return IDPhieu + "-" + date + "-" + sumMoney + "-" + IDNhanVien;
    }

    public String getIDPhieu() {
        return IDPhieu;
    }

    public void setIDPhieu(String IDPhieu) {
        this.IDPhieu = IDPhieu;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getSumMoney() {
        return sumMoney;
    }

    public void setSumMoney(int sumMoney) {
        this.sumMoney = sumMoney;
    }

    public String getIDNhanVien() {
        return IDNhanVien;
    }

    public void setIDNhanVien(String IDNhanVien) {
        this.IDNhanVien = IDNhanVien;
    }
}
