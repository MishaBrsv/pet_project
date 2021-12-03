package core.services;

import core.models.ClientDO;

public interface ClientService {

    public ClientDO findClient(Long id);

    public void saveClient(ClientDO clientDO);

    public void deleteClient(ClientDO clientDO);

    public void updateClient(ClientDO clientDO);
}
