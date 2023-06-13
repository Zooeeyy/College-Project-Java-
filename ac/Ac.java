package ac;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zuyyinahawani
 */
public class Ac implements InterfaceAc{
    int statusAc;

    @Override
    public void hidupkan(){
	if (statusAc == KEADAAN_MATI){
		statusAc = KEADAAN_HIDUP;
		System.out.println("Hidupkan AC! --> AC Hidup");
	}else{
		System.out.println("Hidupkan AC! --> AC Sudah Hidup");}
	}
    
    @Override
    public void panaskan(){
	if (statusAc == KEADAAN_SUHU_RENDAH){
		statusAc = KEADAAN_SUHU_TIINGGI;
		System.out.println("Tambah derajat AC! --> Dingin AC berkurang");
	}else{
		System.out.println("Tambah derajat AC! --> Dingin AC sudah berkurang bro!");}
	}
    
    @Override
    public void dinginkan(){
	if (statusAc == KEADAAN_SUHU_TIINGGI){
		statusAc = KEADAAN_SUHU_RENDAH;
		System.out.println("Kurangi derajat AC! --> Dingin AC bertambah");
	}else{
		System.out.println("Kurangi derajat AC! --> Dingin AC sudah bertambah bro!");}
	}

    @Override
  public void matikan(){
	if (statusAc == KEADAAN_HIDUP){
		statusAc = KEADAAN_MATI;
		System.out.println("Matikan AC! --> AC Mati");
	}else{
		System.out.println("Matikan AC! --> AC Sudah Mati Kok");
		}
	}
}
