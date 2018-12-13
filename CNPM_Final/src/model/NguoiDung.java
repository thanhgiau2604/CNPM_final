package model;

public class NguoiDung {
	private String tenDN;
	private String matKhau;
	private String matKhauC2;
	private String hoTen;
	private String email;
	private String sDT;
	private String diaChi;
	private int LaGiaoVien;
	private int LaAdmin;
	public NguoiDung(String tenDN, String matKhau, String matKhauC2, String hoTen, String email, String sDT,
			String diaChi, int laGiaoVien, int laAdmin) {
		super();
		this.tenDN = tenDN;
		this.matKhau = matKhau;
		this.matKhauC2 = matKhauC2;
		this.hoTen = hoTen;
		this.email = email;
		this.sDT = sDT;
		this.diaChi = diaChi;
		LaGiaoVien = laGiaoVien;
		LaAdmin = laAdmin;
	}
	public String getTenDN() {
		return tenDN;
	}
	public void setTenDN(String tenDN) {
		this.tenDN = tenDN;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public String getMatKhauC2() {
		return matKhauC2;
	}
	public void setMatKhauC2(String matKhauC2) {
		this.matKhauC2 = matKhauC2;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getsDT() {
		return sDT;
	}
	public void setsDT(String sDT) {
		this.sDT = sDT;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public int getLaGiaoVien() {
		return LaGiaoVien;
	}
	public void setLaGiaoVien(int laGiaoVien) {
		LaGiaoVien = laGiaoVien;
	}
	public int getLaAdmin() {
		return LaAdmin;
	}
	public void setLaAdmin(int laAdmin) {
		LaAdmin = laAdmin;
	}
	@Override
	public String toString() {
		return "NguoiDung [tenDN=" + tenDN + ", matKhau=" + matKhau + ", matKhauC2=" + matKhauC2 + ", hoTen=" + hoTen
				+ ", email=" + email + ", sDT=" + sDT + ", diaChi=" + diaChi + ", LaGiaoVien=" + LaGiaoVien
				+ ", LaAdmin=" + LaAdmin + "]";
	}
	
	
}
