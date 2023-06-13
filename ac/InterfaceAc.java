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
interface InterfaceAc{
		public static final int KEADAAN_HIDUP=1;
		public static final int KEADAAN_MATI=0;
                public static final int KEADAAN_SUHU_TIINGGI = 1;
                public static final int KEADAAN_SUHU_RENDAH = 0;

		public abstract void hidupkan();
		public abstract void matikan();
                public abstract void panaskan();
                public abstract void dinginkan();
                
	}