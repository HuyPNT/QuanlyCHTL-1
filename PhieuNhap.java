package QuanLyCHTL;

public class PhieuNhap extends Phieu {
    private String IDNhaCungCap;

    public PhieuNhap() {

    }

    public PhieuNhap(String IDPhieu, String date, String IDNhaCungCap, String IDNhanVien, int sumMoney) {
        super(IDPhieu, date, sumMoney, IDNhanVien);
        this.IDNhaCungCap = IDNhaCungCap;
    }

    public String getIDNhaCungCap() {
        return IDNhaCungCap;
    }

    public void setIDNhaCungCap(String iDNhaCungCap) {
        IDNhaCungCap = iDNhaCungCap;
    }

}
