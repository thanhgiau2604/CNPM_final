package model;

public class DeThi {
	
	String MaDT;
	String KyThi;
	String MonThi;
	int SoCH;
	int ThoiGianThi;
	int SoDiem;
	String NguoiTao;
	
	public DeThi(
			String MaDT,
			String KyThi,
			String MonThi,
			int SoCH,
			int ThoiGianThi,
			int SoDiem,
			String NguoiTao) {
		super();
		this.MaDT=MaDT;
		this.KyThi=KyThi;
		this.MonThi=MonThi;
		this.SoCH=SoCH;
		this.SoDiem=SoDiem;
		this.ThoiGianThi=ThoiGianThi;
		this.NguoiTao=NguoiTao;
	}
	
	public String getMaDT() {
		return MaDT;
	}
	public void setMaDT(String madt) {
		this.MaDT=madt;
	}
	
	public String getKyThi() {
		return KyThi;
	}
	public void setKyThi(String kythi) {
		this.KyThi = kythi;
	}
	
	public String getMonThi() {
		return MonThi;
	}
	public void setMonThi(String monthi) {
		this.MonThi = monthi;
	}
	
	public int getSoCH() {
		return SoCH;
	}
	public void setSoCH(int soch) {
		this.SoCH = soch;
	}
	
	public int getThoiGianThi() {
		return ThoiGianThi;
	}
	public void setThoiGianThi(int thoigianthi) {
		this.ThoiGianThi = thoigianthi;
	}
	
	public int getSoDiem() {
		return SoDiem;
	}
	public void setSoDiem(int sodiem) {
		this.SoDiem=sodiem;
	}
	
	public String getNguoiTao() {
		return NguoiTao;
	}
	public void setNguoiTao(String nguoitao) {
		this.NguoiTao=nguoitao;
	}

	@Override
	public String toString() {
		return "CauHoi [MaDT=" + MaDT + ", KyThi=" + KyThi + ", MonThi=" + MonThi + ", SoCH=" + SoCH
				+ ", ThoiGianThi=" + ThoiGianThi + ", SoDiem=" + SoDiem + ", NguoiTao=" + NguoiTao
				+ "]";
	}

}
