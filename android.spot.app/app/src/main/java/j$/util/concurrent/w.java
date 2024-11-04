package j$.util.concurrent;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class w implements Iterator {
    private ConcurrentLinkedQueue.Node a;
    private Object b;
    private ConcurrentLinkedQueue.Node c;
    final /* synthetic */ ConcurrentLinkedQueue d;

    public w(ConcurrentLinkedQueue concurrentLinkedQueue) {
        ConcurrentLinkedQueue.Node node;
        ConcurrentLinkedQueue.Node node2;
        this.d = concurrentLinkedQueue;
        loop0: while (true) {
            node = concurrentLinkedQueue.head;
            node2 = node;
            while (true) {
                E e = node2.item;
                if (e != 0) {
                    this.a = node2;
                    this.b = e;
                    break loop0;
                }
                ConcurrentLinkedQueue.Node node3 = node2.next;
                if (node3 == null) {
                    break loop0;
                } else if (node2 == node3) {
                    break;
                } else {
                    node2 = node3;
                }
            }
        }
        concurrentLinkedQueue.f(node, node2);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        ConcurrentLinkedQueue.Node node;
        ConcurrentLinkedQueue.Node node2 = this.a;
        if (node2 != null) {
            this.c = node2;
            ConcurrentLinkedQueue concurrentLinkedQueue = this.d;
            concurrentLinkedQueue.getClass();
            ConcurrentLinkedQueue.Node node3 = node2.next;
            if (node2 == node3) {
                node3 = concurrentLinkedQueue.head;
            }
            Object obj = null;
            while (node3 != null) {
                obj = node3.item;
                if (obj != null) {
                    break;
                }
                ConcurrentLinkedQueue concurrentLinkedQueue2 = this.d;
                concurrentLinkedQueue2.getClass();
                ConcurrentLinkedQueue.Node node4 = node3.next;
                if (node3 == node4) {
                    node = concurrentLinkedQueue2.head;
                } else {
                    node = node4;
                }
                if (node != null) {
                    ConcurrentLinkedQueue.d.a(node2, node3, node);
                }
                node3 = node;
            }
            this.a = node3;
            Object obj2 = this.b;
            this.b = obj;
            return obj2;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        ConcurrentLinkedQueue.Node node = this.c;
        if (node != null) {
            node.item = null;
            this.c = null;
            return;
        }
        throw new IllegalStateException();
    }
}
