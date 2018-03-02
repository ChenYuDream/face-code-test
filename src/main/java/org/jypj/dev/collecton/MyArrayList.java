package org.jypj.dev.collecton;

/**
 * 手写Arraylist
 *
 * @author yu_chen
 * @create 2018-01-30 9:37
 **/
public class MyArrayList<T extends Object> {

    //默认扩容因子
    private static final double DEFAULT_EXPANSION_FACTOR = 0.75;
    //初始容量
    private int defaultSize = 10;
    //实际大小
    private int size = 0;
    //默认的存储容器
    private Object[] defaultContainer = new Object[defaultSize];

    //临时保存的容器
    private Object[] tempContainer = {};

    public int getSize() {
        return size;
    }

    /**
     * 添加对象
     *
     * @param t
     */
    public void add(T t) {
        //将传入对象放入数组中
        defaultContainer[size] = t;
        size++;
        if (defaultSize * DEFAULT_EXPANSION_FACTOR < size) {
            defaultSize = defaultSize * 2 + 1;
            tempContainer = new Object[defaultSize];
            //扩容
            System.arraycopy(defaultContainer, 0, tempContainer, 0, size);
            //copy完成之后再进行还原
            defaultContainer = tempContainer;
        }

    }

    /**
     * 删除
     *
     * @param index
     */
    public void remove(int index) {
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(defaultContainer, index + 1, defaultContainer, index,
                    numMoved);
        }
        defaultContainer[size] = null;
        size--;

    }


    public T get(int index) {
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return (T) defaultContainer[index];
    }

}
