
# Multi-threading

**Monitor Lock:** 
- Achieves mutual exclusion by synconizing the comman resource for same object.
- Ex. If two threads are working on same shared resource (obj1) then it makes sence. Not when one thread is working on obj1 and other on obj2.


<img width="267" alt="Screenshot 2024-04-14 at 12 43 41 PM" src="https://github.com/nisarg0/Multi-threading/assets/60577767/7fa74f83-7551-4554-a4c3-f6ca81ff56d2">

**Shared Resouce:**
- A resouce is shared between producer and consumer.
- Consumer first comes in to get the resouce hence locks it but as it's not available it goes into wait and releases the lock (automatically)
- Now the producer adds the item and invokes notifyAll(), so the consumer comes to know that resource is available and comes in to consume it.

<img width="351" alt="Screenshot 2024-04-14 at 1 37 32 PM" src="https://github.com/nisarg0/Multi-threading/assets/60577767/8c51b19b-d9af-481c-b3d2-ffd0d1128eec">

**Joins In Thread:**
- Join helps threads syncronized.
- caller thread wait for calling thread to finish. Ex. Inside main t1.join() makes main thread wait for t1 to finish.

<img width="155" alt="Screenshot 2024-04-14 at 3 01 03 PM" src="https://github.com/nisarg0/Multi-threading/assets/60577767/c163b55a-8198-4346-bd70-413b1905d1c6">

**Thread Pool Executor:**
- Thread Pool has a core Pool of threads which will stay alive even if idle.
- It has Worker Queues which stores the tasks if in thread pool is busy.
- Creates a new thread in thread pool when worker queue is full and active threads in thread pool is less than maxPoolSize.

Ex. corePoolSize = 2, maxPoolSize = 4, workerqueueSize = 2. We are trying to assign 7 tasks... So, 1st 4 tasks gets added next 2 are stored in queue but last one gets discarded.
<img width="1074" alt="Screenshot 2024-04-14 at 5 06 16 PM" src="https://github.com/nisarg0/Multi-threading/assets/60577767/e1585cb0-4cc5-4527-9221-597725872523">

> **Q. How to choose size of poolSize? **
> - It's good to have poolSize same as num of cores or few more to avoid starvation but not too high b'coz otherwise our threads will waste lot of time in context swtiching.
> - JVM Memory: As we need to have space to store things(Register, stack, counter) for each thread.
> - Task Nature: CPU intensive (Need more processing time), I/O Intensive: Thread is usually idle. It's good to have more threads if it's idle for more time (Context switching helps)...
> - Concurrency, throughput - how fast can be process a req
> - Memory Requirement: Memory needed to process a req should be taken into account. POST req will make db call store data and everything...

### Ref

[Awesome YT video](https://www.youtube.com/watch?v=AYiE7_loIsE&list=PL6W8uoQQ2c63f469AyV78np0rbxRFppkx&index=31)



