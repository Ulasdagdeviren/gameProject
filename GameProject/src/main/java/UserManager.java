public class UserManager implements EntityRepositoryBase<User> {

    @Override
    public void add(User entity) {
        System.out.println(entity.getFirstName()+" kullan�c�s� eklendi");
    }

    @Override
    public void update(User entity) {
        System.out.println(entity.getFirstName()+" kullan�c�s� g�ncellendi");
    }

    @Override
    public void delete(User entity) {
        System.out.println(entity.getFirstName()+" kullan�c�s� silindi");
    }
}
