package remote;

import java.rmi.server.UnicastRemoteObject;

public class UserImplementor extends UnicastRemoteObject implements UserService {
    public UserImplementor() throws Exception{}

    @Override
    public void Register(UserEntity userEntity) throws Exception {
        UserRepository userDA = new UserRepository();
        userDA.register(userEntity);
        userDA.close();
    }

    @Override
    public void Update(UserEntity userEntity) throws Exception {
        UserRepository userDA = new UserRepository();
        userDA.Update(userEntity);
        userDA.close();
    }
}
