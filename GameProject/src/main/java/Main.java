
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user=new User(1,"111111111","ulaþ","daðdeviren","2000");
        User user2=new User(2,"22222222","Ahmet","Cem","1999");

        Game game=new Game(1,2,450,15,"MORTAL COMBAT");
        Game game2=new Game(2,3,300,4,"FÝFA 2020");

        GameManager gameManager=new GameManager();

        Campaign campaign=new Campaign(1,1,"'SON YAZ KAÇIRMA KAMPANYASI'");
        Campaign campaign2=new Campaign(2,2,"'YENÝ KULLANICI KAMPANYASI'");
        Campaign campaign3=new Campaign(3,3,"'2.ÜRÜN ALAN KAMPANYASI'");

        gameManager.sale(game2,user2,campaign3);
       
        

	}
		
	
}
