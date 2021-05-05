public class CampaignManager implements EntityRepositoryBase<Campaign> {

    @Override
    public void add(Campaign entity) {
        System.out.println(entity.getCampaignName()+" Ýsimli kampanya eklendi");
    }

    @Override
    public void update(Campaign entity) {
        System.out.println(entity.getCampaignName()+" Ýsimli kampanya güncellendi");
    }

    @Override
    public void delete(Campaign entity) {
        System.out.println(entity.getCampaignName()+" Ýsimli kampanya silindi");
    }


}
