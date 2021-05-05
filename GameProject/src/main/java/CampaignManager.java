public class CampaignManager implements EntityRepositoryBase<Campaign> {

    @Override
    public void add(Campaign entity) {
        System.out.println(entity.getCampaignName()+" �simli kampanya eklendi");
    }

    @Override
    public void update(Campaign entity) {
        System.out.println(entity.getCampaignName()+" �simli kampanya g�ncellendi");
    }

    @Override
    public void delete(Campaign entity) {
        System.out.println(entity.getCampaignName()+" �simli kampanya silindi");
    }


}
