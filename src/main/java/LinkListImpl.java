/**
 * @ClassName LinkListImpl
 * @Description TODO
 * @Author Monkingbird
 * @Date 2020/5/23 18:41
 **/
public class LinkListImpl implements AbstractLinkList {

    static SingleLinkList singleLink;

    static {
        singleLink = new SingleLinkList();
    }

    public void insert(int position, int value) {
        ListNode newNode = new ListNode(value);
        if (position > singleLink.size){
            System.out.println("插入链表位置不连续，不允许插入");
        }

        if (position == 0) {
            //从头部插入
            newNode.next = singleLink.header;
            singleLink.header = newNode;
            if (singleLink.tail == null) {
                singleLink.tail = newNode;
            }
        } else if (position == singleLink.size) {
            //从尾部插入
            if (singleLink.tail == null) {
                //size = 0 && 从尾部插入
                singleLink.tail = newNode;
            } else {
                //size > 0 && 从尾部插入
                singleLink.tail.next = newNode;
            }
        } else {
            //从中间插入
            //从header开始遍历链表查找 位于${position}的元素
            ListNode prev = singleLink.header;
            //position -1 ：表示找到索引位置的前一位
            for (int i = 0; i < position - 1 ; i++) {
                prev = prev.next;
            }
            // front --> newNode --> behind；保证newNode先指向behind，再让front指向front，否则会丢失behind对象
            ListNode behind = prev.next; //取出behind的对象
            newNode.next = behind;       //newNode指针指向behind
            prev.next = newNode;         //front指针执行newNode
        }
        singleLink.size++;
    }

    public void delete(int position) {

    }

    public void get() {

    }

    public void update(int position, int value) {

    }
}
