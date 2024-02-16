/**
 * 
 */
package ruijosecj.dao.jpa;

import ruijosecj.dao.generic.jpa.GenericJpaDB1DAO;
import ruijosecj.domain.jpa.ProdutoJpa;

public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
