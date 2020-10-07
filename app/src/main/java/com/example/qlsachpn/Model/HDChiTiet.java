package com.example.qlsachpn.Model;

    public class HDChiTiet {
       private String maHDCT,maHD,maSach,soLuongMua;

        public HDChiTiet() {
        }

        public HDChiTiet(String maHDCT, String maHD, String maSach, String soLuongMua) {
            this.maHDCT = maHDCT;
            this.maHD = maHD;
            this.maSach = maSach;
            this.soLuongMua = soLuongMua;
        }

        public String getMaHDCT() {
            return maHDCT;
        }

        public void setMaHDCT(String maHDCT) {
            this.maHDCT = maHDCT;
        }

        public String getmaHD() {
            return maHD;
        }

        public void setmaHD(String maHD) {
            this.maHD = maHD;
        }

        public String getMaSach() {
            return maSach;
        }

        public void setMaSach(String maSach) {
            this.maSach = maSach;
        }

        public String getSoLuongMua() {
            return soLuongMua;
        }

        public void setSoLuongMua(String soLuongMua) {
            this.soLuongMua = soLuongMua;
        }
    }
