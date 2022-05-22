package remote;

import java.rmi.Remote;

public interface UserService extends Remote {
    public void Register(UserEntity userEntity) throws Exception;
    public void Update(UserEntity userEntity) throws Exception;
}
