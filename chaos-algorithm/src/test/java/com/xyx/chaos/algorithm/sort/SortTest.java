package com.xyx.chaos.algorithm.sort;


import com.xyx.chaos.algorithm.util.NumArrayUtil;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author XuYexin
 * @Description :
 * @date 2017/4/13
 */
public class SortTest {

    private static final Logger logger = LoggerFactory.getLogger(SortTest.class);

    private int[] nums;

    public SortTest(){
        this.nums = NumArrayUtil.getIntArrays(10);
    }

    @Test
    public void testBubbleSort(){
        BaseSort bubbleSort = new BubbleSort();
        logger.info("Origin Num:" + NumArrayUtil.printArray(this.nums));
        logger.info("Sorted Num:" + NumArrayUtil.printArray(bubbleSort.sort(this.nums)));
    }

    @Test
    public void testSelectSort(){
        BaseSort bubbleSort = new SelectSort();
        logger.info("Origin Num:" + NumArrayUtil.printArray(this.nums));
        logger.info("Sorted Num:" + NumArrayUtil.printArray(bubbleSort.sort(this.nums)));
    }

    @Test
    public void testInsertSort(){
        BaseSort bubbleSort = new InsertSort();
        logger.info("Origin Num:" + NumArrayUtil.printArray(this.nums));
        logger.info("Sorted Num:" + NumArrayUtil.printArray(bubbleSort.sort(this.nums)));
    }

    @Test
    public void testShellSort(){
        ShellSort shellSort = new ShellSort();
        logger.info("Origin Num:" + NumArrayUtil.printArray(this.nums));
        logger.info("Sorted Num:" + NumArrayUtil.printArray(shellSort.sort(this.nums)));
    }

    @Test
    public void testQuickSort(){
        QuickSort quickSort = new QuickSort();
        logger.info("Origin Num:" + NumArrayUtil.printArray(this.nums));
        logger.info("Sorted Num:" + NumArrayUtil.printArray(quickSort.sort(this.nums)));
    }





}
