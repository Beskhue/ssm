/**
 * Simple Stack Machine
 *
 * Written by Atze Dijkstra, atze@cs.uu.nl,
 * Copyright Utrecht University.
 *
 */

/**
 * Configuration
 *
 */
package nl.uu.cs.ssm ;

import java.awt.event.KeyEvent;
import java.lang.Math;

public class Config
{
	public static final int[] keysLoad					= { KeyEvent.VK_O } ;
	
	public static final int[] keysReload				= { KeyEvent.VK_R } ;
	
	public static final int[] keysPause					= { KeyEvent.VK_SPACE } ;
	
	public static final int[] keysFullForward			= { KeyEvent.VK_DOWN } ;
	
	public static final int[] keysFullBackward			= { KeyEvent.VK_UP } ;
	
	public static final int[] keysStep1Forward			= { KeyEvent.VK_RIGHT, KeyEvent.VK_SPACE } ;
	
	public static final int[] keysStep1Backward			= { KeyEvent.VK_LEFT, KeyEvent.VK_BACK_SPACE } ;
	
	public static final String extensionSSM				= "ssm" ;
	
    public static final int maxMemory 					= 2500000; // 10 MB
	public static final int stackSize 					= 250000;  // 1 MB
    
    public static final String version()                { return "2.2.1" ; }
    
    public static final String versionDate()            { return "May 15, 2017" ; }
    
    public static final String author()                 { return "Atze Dijkstra, Utrecht University" ; }
    
    public static final String authorEmail()            { return "atze@uu.nl" ; }
    
}
