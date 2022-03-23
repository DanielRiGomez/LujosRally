package runner;

import java.io.IOException;
import java.net.UnknownHostException;

import controller.ClientAdmin;

public class Runner {
	public static void main(String[] args) throws UnknownHostException, IOException {
		new ClientAdmin();
	}
}
