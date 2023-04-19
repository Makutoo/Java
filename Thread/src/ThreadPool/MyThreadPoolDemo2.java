package ThreadPool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyThreadPoolDemo2 {
    public static void main(String[] args) {
        /*
         * 当核心线程正在处理任务，且排队等待处理的任务大于排队的队伍长度时，临时线程才会被创建
         * 先提交的任务不一定先会被执行
         * 如果提交任务 > 核心线程数 + 临时线程数， 触发任务拒绝策略
         * */
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3, //核心线程数量
                6, //最大线程数量，最大线程数量 >= 核心线程数量， 临时线程数量 = 最大线程数量 - 核心线程数量
                60, //空闲线程最大存活时间
                TimeUnit.SECONDS, //时间单位
                new ArrayBlockingQueue<>(3), //阻塞队列
                Executors.defaultThreadFactory(), //线程工厂(创建线程的工厂)
                new ThreadPoolExecutor.AbortPolicy() //任务拒绝策略
        );
    }
}
