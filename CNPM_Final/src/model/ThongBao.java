package model;

public class ThongBao {
	String maTB;
	String noidungTB;
	int laAdmin;
	int guiGV;
	int guiTS;
	String ngaygui;
	String xoa;
	String nguoitao;
	public ThongBao( String maTB, String noidungTB, int laAdmin, int guiGV, int guiTS, String ngaygui, String xoa, String nguoitao ){
		super();
		this.maTB = maTB;
		this.noidungTB = noidungTB;
		this.laAdmin = laAdmin;
		this.guiGV = guiGV;
		this.guiTS = guiTS;
		this.ngaygui = ngaygui;
		this.xoa = xoa;
		this.nguoitao = nguoitao;
	}
	public String getMaTB()
	{
		return maTB;
	}
	public void setMaTB(String maTB)
	{
		this.maTB = maTB;
	}
	
	public String getNoiDungTB()
	{
		return noidungTB;
	}
	public void setNoiDungTB(String noidungTB)
	{
		this.noidungTB = noidungTB;
	}
	
	public int getLaAdmin()
	{
		return laAdmin;
	}
	public void setLaAdmin(int laAdmin)
	{
		this.laAdmin = laAdmin;
	}
	public int getGuiGV()
	{
		return guiGV;
	}
	public void setGuiGV(int guiGV)
	{
		this.guiGV = guiGV;
	}
	public int getGuiTS()
	{
		return guiTS;
	}
	public void setGuiTS(int guiTS)
	{
		this.guiTS = guiTS;
	}
	
	
	public String getNgayGui()
	{
		return ngaygui;
	}
	public void setNgayGui(String ngaygui)
	{
		this.ngaygui = ngaygui;
	}
	public String getXoa()
	{
		return xoa;
	}
	public void setXoa(String xoa)
	{
		this.xoa = xoa;
	}
	
	public String getNguoiTao()
	{
		return nguoitao;
	}
	public void setNguoiTao(String nguoitao)
	{
		this.nguoitao = nguoitao;
	}
	
	@Override
	public String toString()
	{
		return "ThongBao [maTB=" + maTB + ", noidungTB=" + noidungTB + ", laAdmin" + laAdmin + ", guiGV" + guiGV + ", guiTS" + guiTS  + ", ngaygui" + ngaygui + ", xoa" + xoa + ", nguoitao" + nguoitao + "]";
	}

}
