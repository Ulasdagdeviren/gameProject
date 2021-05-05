public class GameSale {
    public static void campaignSale(Campaign campaign,Game game,User user){
        switch (campaign.campaignCategoryId){
            case 1:
                game.setDiscountRate(15);
                System.out.println(user.getFirstName()+" Adlý kullanýcý "+campaign.getCampaignName()
                        +" isimli kampanyadan yaralandýðý için indirimli fiyatý: "
                        +game.getDiscountPrice());
                break;
            case 2:
                game.setDiscountRate(25);
                System.out.println(user.getFirstName()+" Adlý kullanýcý "+campaign.getCampaignName()
                        +" isimli kampanyadan yaralandýðý için indirimli fiyatý: "
                        +game.getDiscountPrice());
                break;
            case 3:
                game.setDiscountRate(8);
                System.out.println(user.getFirstName()+" Adlý kullanýcý "+campaign.getCampaignName()
                        +" isimli kampanyadan yaralandýðý için indirimli fiyatý: "
                        +game.getDiscountPrice());
                break;
            default:
                game.setDiscountRate(0);
                System.out.println(user.getFirstName()+" Adlý kullanýcý "+campaign.getCampaignName()
                        +" isimli kampanyadan yaralandýðý için indirimli fiyatý: "
                        +game.getDiscountPrice());

        }
    }
}
