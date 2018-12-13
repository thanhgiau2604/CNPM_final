package model;

public class CauHoi {
	String maCH;
	String noiDungCH;
	String luaChonA;
	String luaChonB;
	String luaChonC;
	String luaChonD;
	String dapAn;
	String nguoiTao;
	public CauHoi(String maCH, String noiDungCH, String luaChonA, String luaChonB, String luaChonC, String luaChonD,
			String dapAn, String nguoiTao) {
		super();
		this.maCH = maCH;
		this.noiDungCH = noiDungCH;
		this.luaChonA = luaChonA;
		this.luaChonB = luaChonB;
		this.luaChonC = luaChonC;
		this.luaChonD = luaChonD;
		this.dapAn = dapAn;
		this.nguoiTao = nguoiTao;
	}
	public String getMaCH() {
		return maCH;
	}
	public void setMaCH(String maCH) {
		this.maCH = maCH;
	}
	public String getNoiDungCH() {
		return noiDungCH;
	}
	public void setNoiDungCH(String noiDungCH) {
		this.noiDungCH = noiDungCH;
	}
	public String getLuaChonA() {
		return luaChonA;
	}
	public void setLuaChonA(String luaChonA) {
		this.luaChonA = luaChonA;
	}
	public String getLuaChonB() {
		return luaChonB;
	}
	public void setLuaChonB(String luaChonB) {
		this.luaChonB = luaChonB;
	}
	public String getLuaChonC() {
		return luaChonC;
	}
	public void setLuaChonC(String luaChonC) {
		this.luaChonC = luaChonC;
	}
	public String getLuaChonD() {
		return luaChonD;
	}
	public void setLuaChonD(String luaChonD) {
		this.luaChonD = luaChonD;
	}
	public String getDapAn() {
		return dapAn;
	}
	public void setDapAn(String dapAn) {
		this.dapAn = dapAn;
	}
	public String getNguoiTao() {
		return nguoiTao;
	}
	public void setNguoiTao(String nguoiTao) {
		this.nguoiTao = nguoiTao;
	}
	@Override
	public String toString() {
		return "CauHoi [maCH=" + maCH + ", noiDungCH=" + noiDungCH + ", luaChonA=" + luaChonA + ", luaChonB=" + luaChonB
				+ ", luaChonC=" + luaChonC + ", luaChonD=" + luaChonD + ", dapAn=" + dapAn + ", nguoiTao=" + nguoiTao
				+ "]";
	}
	
}
