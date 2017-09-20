package com.pgrabarczyk.spring.boot.actuator;

import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.List;

import org.springframework.boot.actuate.endpoint.Endpoint;
import org.springframework.stereotype.Component;

/**
 * Returns all hosts from network interfaces using GET request at /host
 */
@Component
public class HostEndpoint implements Endpoint<String> {

	public String getId() {
		return "host";
	}

	public boolean isEnabled() {
		return true;
	}

	public boolean isSensitive() {
		return false;
	}

	@Override
	public String invoke() {
		try {
			final Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
			StringBuilder sb = new StringBuilder();
			while(networkInterfaces.hasMoreElements()) {
				final NetworkInterface networkInterface = networkInterfaces.nextElement();
				final List<InterfaceAddress> interfaceAddresses = networkInterface.getInterfaceAddresses();
				for (InterfaceAddress interfaceAddress : interfaceAddresses) {
					sb.append(interfaceAddress.getAddress().getHostAddress()).append("\n");
				}
			}
			return sb.toString();
		} catch (SocketException ex) {
			return "Can't determine host";
		}
	}

}
