package lampu;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zuyyinahawani
 */
interface InterfaceLampu{
		public static final int KEADAAN_HIDUP=1;
		public static final int KEADAAN_MATI=0;

		public abstract void hidupkan();
		public abstract void matikan();
	}

