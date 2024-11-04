package defpackage;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jho extends jid implements Serializable {
    private static final long serialVersionUID = 0;
    private final Queue a;

    public jho() {
        hwx.M(true, "maxSize (%s) must >= 0", 50);
        this.a = new ArrayDeque(50);
    }

    @Override // defpackage.jid, defpackage.jhu
    protected final /* synthetic */ Collection a() {
        return this.a;
    }

    @Override // defpackage.jhu, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        obj.getClass();
        if (size() == 50) {
            this.a.remove();
        }
        this.a.add(obj);
        return true;
    }

    @Override // defpackage.jhu, java.util.Collection
    public final boolean addAll(Collection collection) {
        int size = collection.size();
        if (size >= 50) {
            clear();
            collection.getClass();
            hwx.K(true, "number to skip cannot be negative");
            return hzc.aa(this, new jka(collection, size - 50));
        }
        return hzc.Q(this, collection.iterator());
    }

    @Override // defpackage.jid
    protected final Queue b() {
        return this.a;
    }

    @Override // defpackage.jhu, defpackage.jic
    protected final /* synthetic */ Object g() {
        return this.a;
    }

    @Override // defpackage.jid, java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }
}
