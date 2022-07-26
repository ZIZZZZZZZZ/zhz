package test.dao;


/**
 * @author 龙
 */
public interface SqlDao {
    /**
     * 查询所有的SQL语句
     *
     * @param clazz 类
     * @return SQL语句字符串
     */
    String findAllSql(Class<?> clazz);

    /**
     * 根据id查询
     *
     * @param clazz 类
     * @return SQL语句字符串
     */
    String findByIdSql(Class<?> clazz);

    /**
     * 删除
     *
     * @param clazz 类
     * @return SQL语句字符串
     */
    String deleteSql(Class<?> clazz);

    /**
     * 新增
     *
     * @param clazz 类
     * @return 新增的SQL语句
     */
    String addSql(Class<?> clazz);

    /**
     * 修改
     *
     * @param clazz 类
     * @return 修改的SQL语句
     */
    String updateSql(Class<?> clazz);
}
