package middleware;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface FuncionarioInterface extends Remote {
    public ArrayList listar() throws RemoteException;
}
