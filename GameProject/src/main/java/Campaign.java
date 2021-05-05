public class Campaign {
    private int id;
    public int campaignCategoryId;
    private String campaignName;


    public Campaign(int id, int campaignCategoryId, String campaignName) {
        super();
       this.id=id;
       this.campaignCategoryId=campaignCategoryId;
       this.campaignName=campaignName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCampaignCategoryId() {
        return campaignCategoryId;
    }

    public void setCampaignCategoryId(int campaignCategoryId) {
        this.campaignCategoryId = campaignCategoryId;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }
}
