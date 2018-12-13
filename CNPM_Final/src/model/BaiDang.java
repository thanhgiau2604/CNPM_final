package model;

public class BaiDang {
	 String maBD;
     String tieudeBD;
     String noidungBD;
     String tacgia;
     public BaiDang(String maBD, String tieudeBD, String noidungBD, String tacgia)
     {
                super();
                this.maBD = maBD;
                this.tieudeBD = tieudeBD;
                this.noidungBD = noidungBD;
                this.tacgia = tacgia;
      }
        public String getMaBD()
        {
                  return maBD;
        }
         public void setMaBD(String maBD)
         {
                  this.maBD = maBD;
         }
         public String getTieuDeBD()
         {
                  return tieudeBD;
         }
         public void setTieuDeBD(String tieudeBD)
         {
                  this.tieudeBD = tieudeBD;
         }
         public String getNoiDungBD()
         {
                  return noidungBD;
         }
         public void setNoiDungBD(String noidungBD)
         {
                  this.noidungBD = noidungBD;
         }
         public String getTacGia()
         {
                  return tacgia;
         }
         public void setTacGia(String tacgia)
         {
                  this.tacgia = tacgia;
         }

         @Override
         public String toString()
         {
                 return "BaiDang [maBD=" + maBD + ", tieudeBD=" + tieudeBD + ", noidungBD=" + noidungBD + ", tacgia=" + tacgia + "]";
         }

}
