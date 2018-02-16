Since: PMD 4.2.6

Names for references to generic values should be limited to a single uppercase letter.

Example(s):
```
public interface GenericDao<E extends BaseModel, K extends Serializable> extends BaseDao {
    // This is ok...
}

public interface GenericDao<E extends BaseModel, K extends Serializable> {
    // Also this
}

public interface GenericDao<e extends BaseModel, K extends Serializable> {
    // 'e' should be an 'E'
}

public interface GenericDao<EF extends BaseModel, K extends Serializable> {
   // 'EF' is not ok.
}
```
