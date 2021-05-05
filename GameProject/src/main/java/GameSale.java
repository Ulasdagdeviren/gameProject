public class GameSale {
    public static void campaignSale(Campaign campaign,Game game,User user){
        switch (campaign.campaignCategoryId){
            case 1:
                game.setDiscountRate(15);
                System.out.println(user.getFirstName()+" Adl� kullan�c� "+campaign.getCampaignName()
                        +" isimli kampanyadan yaraland��� i�in indirimli fiyat�: "
                        +game.getDiscountPrice());
                break;
            case 2:
                game.setDiscountRate(25);
                System.out.println(user.getFirstName()+" Adl� kullan�c� "+campaign.getCampaignName()
                        +" isimli kampanyadan yaraland��� i�in indirimli fiyat�: "
                        +game.getDiscountPrice());
                break;
            case 3:
                game.setDiscountRate(8);
                System.out.println(user.getFirstName()+" Adl� kullan�c� "+campaign.getCampaignName()
                        +" isimli kampanyadan yaraland��� i�in indirimli fiyat�: "
                        +game.getDiscountPrice());
                break;
            default:
                game.setDiscountRate(0);
                System.out.println(user.getFirstName()+" Adl� kullan�c� "+campaign.getCampaignName()
                        +" isimli kampanyadan yaraland��� i�in indirimli fiyat�: "
                        +game.getDiscountPrice());

        }
    }
}
