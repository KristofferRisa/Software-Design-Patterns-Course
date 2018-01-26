package easylib.controller;

import javax.swing.ImageIcon;

interface ISuperlist {
	Usecase EXIT = new Usecase("avslutt", new ImageIcon("exit.png"));
	Usecase ABOUT = new Usecase("om", null);	
}
