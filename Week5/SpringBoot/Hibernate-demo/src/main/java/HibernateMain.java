import org.hibernate.Session;

public class HibernateMain {
    static void main() {
        Session session = HibernateUtil.getSession();
        try {
            UserClassHibernate user = new UserClassHibernate("ram");
            session.beginTransaction();
            session.persist(user);// save in datbases
            session.getTransaction().commit();
            System.out.println("user saved"+user.getId());

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            HibernateUtil.close();

        }

    }
}
