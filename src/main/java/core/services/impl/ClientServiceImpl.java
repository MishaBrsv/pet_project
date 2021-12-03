package core.services.impl;

import core.dao.impl.ClientDaoImpl;
import core.models.ClientDO;
import core.services.ClientService;

public class ClientServiceImpl implements ClientService {

    private final ClientDaoImpl clientDaoImpl;

    public ClientServiceImpl(ClientDaoImpl clientDaoImpl) {
        this.clientDaoImpl = clientDaoImpl;
    }

    @Override
    public ClientDO findClient(Long id) {
        return clientDaoImpl.findById(id);
    }

    @Override
    public void saveClient(ClientDO clientDO) {
        clientDaoImpl.save(clientDO);
    }

    @Override
    public void deleteClient(ClientDO clientDO) {
        clientDaoImpl.delete(clientDO);
    }

    @Override
    public void updateClient(ClientDO clientDO) {
        clientDaoImpl.update(clientDO);
    }
}
