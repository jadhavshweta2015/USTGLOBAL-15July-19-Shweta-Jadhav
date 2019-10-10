package com.dev.musicplayer;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class Music extends MusicImpl {

	static Scanner s=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicImpl mi=new MusicImpl();
		while(true) {
			int ch = 0;
			System.out.println("***********MusicPlayer***************");
			System.out.println("1.play a song");
			System.out.println("2.Search a Song");
			System.out.println("3.Show all songs");
			System.out.println("4.Opearate on songs Database");
			System.out.println("Enter ur choice:");
			ch=s.nextInt();
			switch(ch) {
			case 1: 
				int op=0;
				while(op<=3) {
					System.out.println("****************");
					System.out.println("1.Play all songs");
					System.out.println("2.play songs randomly");
					System.out.println("3.play a particulat song");
					
					System.out.println("Enter ur choice:");
					
					op=s.nextInt();
					switch(op) {
					case 1:
						mi.playAllSongs();
						
						break;
					case 2:
						mi.songsRandom();
						   break;
					case 3:
						mi.perticluarSong();
						   break;
					default :
						System.out.println("invalid option");
						break;
						
					}
					
				}
				
				break;
				
			case 2:
				mi.searchSongs();
					break;
			case 3:
				
				mi.showAllSongs();
				break;
			case 4:
				int op1=0;
				while(op1<=3) {
					System.out.println("****************");
					System.out.println("1.Insert");
					System.out.println("2.edit");
					System.out.println("3.delete");
					
					System.out.println("Enter ur choice:");
					
					op1=s.nextInt();
					switch(op1) {
					case 1:
						
						mi.insertSong();
						
						break;
					case 2:
						mi.editSong();
						   break;
					case 3:
						mi.deletesong();
						   break;
					default :
						System.out.println("invalid option");
						break;
						
					}
					
				}
				
				break;
			default:
				break;
			}
			}
		}
	}



