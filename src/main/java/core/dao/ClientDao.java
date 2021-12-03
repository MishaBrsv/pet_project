package core.dao;

import core.models.ClientDO;

public interface ClientDao {

    ClientDO findById(Long id);

    void save(ClientDO clientDO);

    void update(ClientDO clientDO);

    void delete(ClientDO clientDO);
}
