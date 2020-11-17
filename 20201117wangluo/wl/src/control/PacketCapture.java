package control;

import java.io.IOException;
import java.text.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import jpcap.*;
import jpcap.packet.*;

//ץ��
public class PacketCapture implements Runnable {

	NetworkInterface device;
	static DefaultTableModel tablemodel;
	static String FilterMess = "";
	static ArrayList<Packet> packetlist = new ArrayList<Packet>();
	public PacketCapture() {
	}
	public void setDevice(NetworkInterface device){
		this.device = device;
	}
	public void setTable(DefaultTableModel tablemodel){
		this.tablemodel = tablemodel;
	}
	public void setFilter(String FilterMess){
		this.FilterMess = FilterMess;
	}
	public void clearpackets(){
		packetlist.clear();
	}
	
	public void run() {

		Packet packet;
		try {
			JpcapCaptor captor = JpcapCaptor.openDevice(device, 65535,true, 20);
			while(true){
				long startTime = System.currentTimeMillis();
				while (startTime + 600 >= System.currentTimeMillis()) {
					packet = captor.getPacket();
					// ���ù�����
					if(packet!=null&&TestFilter(packet)){

						packetlist.add(packet);
						showTable(packet);
					}
				}
				Thread.sleep(2000);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}
	//��ץ��������Ϣ��ӵ��б�
	public static void showTable(Packet packet){
		String[] rowData = getObj(packet);
		tablemodel.addRow(rowData);
	}
	//������ͨ���˷�����ȡPacket���б�
	public static ArrayList<Packet> getpacketlist(){
		return packetlist;
	}
	//���ù��˹���
	public static boolean TestFilter(Packet packet){
		if(FilterMess.contains("sip")){
			String sip = FilterMess.substring(4, FilterMess.length());
			if(new PacketAnalyze(packet).packetClass().get("ԴIP").equals(sip)){
				return true;
			}
		}else if(FilterMess.contains("ICMP")){
			if(new PacketAnalyze(packet).packetClass().get("Э��").equals("ICMP")){
				return true;
			}
		}
		else if(FilterMess.contains("UDP")){
			if(new PacketAnalyze(packet).packetClass().get("Э��").equals("UDP")){
				return true;
			}
		}else if(FilterMess.contains("TCP")){
			if(new PacketAnalyze(packet).packetClass().get("Э��").equals("TCP")){
				return true;
			}
		}else if(FilterMess.equals("")){
			return true;
		}
		return false;
	}
	//��ץ�İ��Ļ�����Ϣ��ʾ���б��ϣ�������Ϣ��String[]��ʽ
	public static String[] getObj(Packet packet){
		String[] data = new String[6];
		if (packet != null&&new PacketAnalyze(packet).packetClass().size()>=3) {
			Date d = new Date();
			DateFormat df = new SimpleDateFormat("HH:mm:ss");
			data[0]=df.format(d);
			data[1]=new PacketAnalyze(packet).packetClass().get("ԴIP");
			data[2]=new PacketAnalyze(packet).packetClass().get("Ŀ��IP");
			data[3]=new PacketAnalyze(packet).packetClass().get("Э��");
			data[4]=String.valueOf(packet.len);
		}
		return data;
	}
}
