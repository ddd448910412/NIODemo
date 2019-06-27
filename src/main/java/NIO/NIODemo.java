package NIO;

import org.junit.Test;

import java.nio.ByteBuffer;

/**
 * 缓冲区（Buffer）：一个用于特定基本数据类 型的容器。由 java.nio 包定义的，所有缓冲区 都是 Buffer 抽象类的子类。
  Java NIO 中的 Buffer 主要用于与 NIO 通道进行 交互，数据是从通道读入缓冲区，从缓冲区写入通道中的。
  Buffer 就像一个数组，可以保存多个相同类型的数据。根据数据类型不同(boolean 除外) ，有以下 Buffer 常用子类：
 ByteBuffer
 CharBuffer
 ShortBuffer
 IntBuffer
 LongBuffer
 FloatBuffer
 DoubleBuffer

 上述 Buffer 类 他们都采用相似的方法进行管理数据，只是各自 管理的数据类型不同而已。都是通过如下方法获取一个 Buffer 对象：
 static XxxBuffer allocate(int capacity) : 创建一个容量为capacity 的 XxxBuffer 对象

 缓冲区存取数据的两个核心方法
 put（）：存入数据到缓冲区中
 get（）：获取缓冲区中的数据

 缓冲区中的4个核心属性
 */
public class NIODemo {


    @Test
    public void test1() {
        ByteBuffer allocate = ByteBuffer.allocate(1024);

        System.out.println("===="+allocate.position());
        System.out.println("===="+allocate.limit());
        System.out.println("===="+allocate.capacity());

}

}
