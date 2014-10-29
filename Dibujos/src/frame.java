import javax.swing.JFrame;


public class frame extends JFrame {

	public frame(){
		setSize(400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new dibujo());
		setVisible(true);
		
	}
	
}
