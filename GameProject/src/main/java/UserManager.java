public class UserManager implements EntityRepositoryBase<User> {

    @Override
    public void add(User entity) {
        System.out.println(entity.getFirstName()+" kullanýcýsý eklendi");
    }

    @Override
    public void update(User entity) {
        System.out.println(entity.getFirstName()+" kullanýcýsý güncellendi");
    }

    @Override
    public void delete(User entity) {
        System.out.println(entity.getFirstName()+" kullanýcýsý silindi");
    }
}
