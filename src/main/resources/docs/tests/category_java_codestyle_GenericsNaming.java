//#Patterns: category_java_codestyle_GenericsNaming

public interface GenericDao<E extends BaseModel, K extends Serializable> extends BaseDao {
   // This is ok...
}

public interface GenericDao<E extends BaseModel, K extends Serializable> {
   // Also this
}

//#Info: category_java_codestyle_GenericsNaming
public interface GenericDao<e extends BaseModel, K extends Serializable> {
   // 'e' should be an 'E'
}

//#Info: category_java_codestyle_GenericsNaming
public interface GenericDao<EF extends BaseModel, K extends Serializable> {
   // 'EF' is not ok.
}
