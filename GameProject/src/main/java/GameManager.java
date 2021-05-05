public class GameManager implements EntityRepositoryBase<Game> {

    @Override
    public void add(Game entity) {
        System.out.println(entity.getGameName()+" oyunu eklendi");
    }

    @Override
    public void update(Game entity) {
        System.out.println(entity.getGameName()+" oyunu güncellendi");
    }

    @Override
    public void delete(Game entity) {
        System.out.println(entity.getGameName()+" oyunu silindi");
    }

    public void sale(Game game,User user,Campaign campaign){
       GameSale.campaignSale(campaign,game,user);
    }
}
