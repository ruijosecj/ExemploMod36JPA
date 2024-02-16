/**
 * 
 */
package ruijosecj.dao.jpa;

import ruijosecj.dao.generic.jpa.IGenericJapDAO;
import ruijosecj.domain.jpa.Persistente;

public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}
