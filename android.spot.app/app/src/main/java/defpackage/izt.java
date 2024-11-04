package defpackage;

import org.apache.http.impl.conn.AbstractPoolEntry;
import org.apache.http.impl.conn.tsccm.BasicPooledConnAdapter;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class izt extends BasicPooledConnAdapter {
    public final long a;

    /* JADX INFO: Access modifiers changed from: protected */
    public izt(ThreadSafeClientConnManager threadSafeClientConnManager, AbstractPoolEntry abstractPoolEntry) {
        super(threadSafeClientConnManager, abstractPoolEntry);
        this.a = System.currentTimeMillis();
    }
}
