/**
 * @ClassName AbstractLinkList
 * @Description TODO
 * @Author Monkingbird
 * @Date 2020/5/23 18:39
 **/
public interface AbstractLinkList {
    /***
     * 插入
     * @param position 位置(从0开始）
     * @param value 值
     **/
    void insert(int position, int value);

    /***
     * 删除
     * @param position 值
     **/
    void delete(int position);

    /***
     * 查询：根据val反查position，通过position查找val
     **/
    void get();

    /***
     * 更新
     * @param position 位置(从0开始）
     * @param value 值
     **/
    void update(int position, int value);
}
