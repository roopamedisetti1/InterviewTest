package slowgui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class SlowGui {
	
	private JFrame frame;
	private JLabel label;
	
	public SlowGui() {
		initLayout();
	}
	
	public void runUI() {
		frame.setVisible(true);
		loadData();
	}
	
	private void loadData() {
		try {
			for(int chunkNo = 0; chunkNo < 10; chunkNo++) {
				int data = loadDataChunk(chunkNo);
				label.setText("Chunk " + chunkNo + " of 10:  " + data);
			}
			label.setText("Finished getting data");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private void initLayout() {
		frame = new JFrame();
		frame.setSize(400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel(new BorderLayout());
		label = new JLabel("Getting ready to fetch some data...");
		label.setHorizontalAlignment(JLabel.CENTER);
		panel.add(label, BorderLayout.CENTER);
		frame.setContentPane(panel);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override public void run() {
				new SlowGui().runUI();
			}});
	}
	
	// Don't change this method... it has to simulate something that takes a while.
	private int loadDataChunk(int chunkNo) throws InterruptedException {
		Thread.sleep(1000);
		return chunkNo * chunkNo;
	}

}
