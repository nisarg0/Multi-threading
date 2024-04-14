
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


### Ref

[Awesome YT video](https://www.youtube.com/watch?v=AYiE7_loIsE&list=PL6W8uoQQ2c63f469AyV78np0rbxRFppkx&index=31)



