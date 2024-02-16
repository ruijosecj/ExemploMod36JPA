/**
 * 
 */
package ruijosecj.dao.jpa;

import ruijosecj.dao.generic.jpa.GenericJpaDB1DAO;
import ruijosecj.domain.jpa.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
