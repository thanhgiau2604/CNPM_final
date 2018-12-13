package model;

public class DeThiCauHoi {

	String MaCH;
	String MaDT;
	String NoiDung;
	String LuaChonA;
	String LuaChonB;
	String LuaChonC;
	String LuaChonD;
	String DapAn;
	int SoTT;
	boolean DaLay;
	
	public String getMaCH() {
		return MaCH;
	}
	public void setMaCH(String maCH) {
		MaCH = maCH;
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
	public String getLuaChonA() {
		return LuaChonA;
	}
	public void setLuaChonA(String luaChonA) {
		LuaChonA = luaChonA;
	}
	public String getLuaChonB() {
		return LuaChonB;
	}
	public void setLuaChonB(String luaChonB) {
		LuaChonB = luaChonB;
	}
	public String getLuaChonC() {
		return LuaChonC;
	}
	public void setLuaChonC(String luaChonC) {
		LuaChonC = luaChonC;
	}
	public String getLuaChonD() {
		return LuaChonD;
	}
	public void setLuaChonD(String luaChonD) {
		LuaChonD = luaChonD;
	}
	public String getDapAn() {
		return DapAn;
	}
	public void setDapAn(String dapAn) {
		DapAn = dapAn;
	}
	public int getSoTT() {
		return SoTT;
	}
	public void setSoTT(int soTT) {
		SoTT = soTT;
	}
	public boolean isDaLay() {
		return DaLay;
	}
	public void setDaLay(boolean daLay) {
		DaLay = daLay;
	}
	@Override
	public String toString() {
		return "DeThiCauHoi [MaCH=" + MaCH + ", MaDT=" + MaDT + ", NoiDung=" + NoiDung + ", LuaChonA=" + LuaChonA
				+ ", LuaChonB=" + LuaChonB + ", LuaChonC=" + LuaChonC + ", LuaChonD=" + LuaChonD + ", DapAn=" + DapAn
				+ ", SoTT=" + SoTT + ", DaLay=" + DaLay + "]";
	}
	public DeThiCauHoi(String maCH, String maDT, String noiDung, String luaChonA, String luaChonB, String luaChonC,
			String luaChonD, String dapAn, int soTT, boolean daLay) {
		super();
		MaCH = maCH;
		MaDT = maDT;
		NoiDung = noiDung;
		LuaChonA = luaChonA;
		LuaChonB = luaChonB;
		LuaChonC = luaChonC;
		LuaChonD = luaChonD;
		DapAn = dapAn;
		SoTT = soTT;
		DaLay = daLay;
	}
	
	public DeThiCauHoi(String maCH, String maDT, int soTT, boolean daLay) {
		super();
		MaCH = maCH;
		MaDT = maDT;
		SoTT = soTT;
		DaLay = daLay;
	}

	
}