package model;

public class PhanHoi {
	String TenDNgui;
	String TenDNnhan;
	String MaDT;
	String NoiDung;
	boolean DaXem;
	
	public PhanHoi(String tenDNgui, String tenDNnhan, String maDT, String noiDung, boolean daXem) {
		super();
		TenDNgui = tenDNgui;
		TenDNnhan = tenDNnhan;
		MaDT = maDT;
		NoiDung = noiDung;
		DaXem = daXem;
	}
	public String getTenDNgui() {
		return TenDNgui;
	}
	public void setTenDNgui(String tenDNgui) {
		TenDNgui = tenDNgui;
	}
	public String getTenDNnhan() {
		return TenDNnhan;
	}
	public void setTenDNnhan(String tenDNnhan) {
		TenDNnhan = tenDNnhan;
	}
	public String getMaDT() {
		return MaDT;
	}
	public void setMaDT(String maDT) {
		MaDT = maDT;
	}
	public String getNoiDung() {
		return NoiDung;
	}
	public void setNoiDung(String noiDung) {
		NoiDung = noiDung;
	}
	public boolean isDaXem() {
		return DaXem;
	}
	public void setDaXem(boolean daXem) {
		DaXem = daXem;
	}
	@Override
	public String toString() {
		return "PhanHoi [TenDNgui=" + TenDNgui + ", TenDNnhan=" + TenDNnhan + ", MaDT=" + MaDT + ", NoiDung=" + NoiDung
				+ ", DaXem=" + DaXem + "]";
	}
	

}
