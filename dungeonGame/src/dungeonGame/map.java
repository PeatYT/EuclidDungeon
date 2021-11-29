package dungeonGame;

public class map {
	
	public String[][] map=new String[1][100];
	public int level=0;
	
	public int cx=55;
	public int cy=55;
	
	public map() {
		for (int i=0;i<100;i++) {map[0][i]="beansbeansbeansbeansbeansbeansbeansbeansbeansbeansbeansbeansbeansbeansbeansbeansbeansbeansbeansbeans";}
	}
	
	public String[] view(int camx, int camy, int fovx, int fovy) {
		// the goal here is to crop a rectangle from total map and yeet it back to the player class
		
		String[] view;
		view  = new String[fovy*2+1];
		for(int i=-fovy;i<fovy;i++) {
			view[i+fovy]=map[level][camy+i].substring(camx-fovx, camx+fovx);
		}
		return view;
	}
	
}
