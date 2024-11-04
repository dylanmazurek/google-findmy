package defpackage;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lap implements laq {
    private final ReadWriteLock a = new ReentrantReadWriteLock();

    @Override // defpackage.laq
    public final void a() {
        this.a.writeLock().lock();
    }

    @Override // defpackage.laq
    public final void b() {
        this.a.writeLock().unlock();
    }
}
