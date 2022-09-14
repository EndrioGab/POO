package Executar;

import conection.SingleConnection;

public class ClasseExecutavel {
	public static void main(String[] args) {
			initBanco();
		}
		
		public static void initBanco() {
			SingleConnection.getConnetion();
		}
	}

