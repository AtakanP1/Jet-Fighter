package project_D;
import javax.swing.ImageIcon;
import javax.swing.Icon;


 public class Shoot {
	 private int x;
	    private int y;
	    private int Width;
	    private int Height;
	    private ImageIcon image;
	    
	    public Shoot(String string,int x, int y,int Width,int Height) {
	        this.x = x;
	        this.y = y;
	        this.Width=Width;
	        this.Height=Height;
	        
	        try {

				this.image = new ImageIcon(getClass().getResource(string));

			} catch (Exception e) {
				e.printStackTrace();
			}
	        
	        
	        
	    }

	    public int getX() {
	        return x;
	    }

	    public void setX(int x) {
	        this.x = x;
	    }

	    public int getY() {
	        return y;
	    }

	    public void setY(int y) {
	        this.y = y;
	    }
	    public int getWidth(){
	    	return Width;
	    }
	    public int getHeight(){
	    	return Height;
	    }
	    public ImageIcon getImage() {
			return image;
		}
	
	
	

}
