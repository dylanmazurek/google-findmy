package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mrr {
    private static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(mrr.class, Object.class, "a");
    public volatile Object a;
    private final mpd c;

    public mrr(Object obj, mpd mpdVar) {
        this.c = mpdVar;
        this.a = obj;
    }

    public final Object a(Object obj) {
        Object andSet = b.getAndSet(this, obj);
        if (this.c != mrs.a) {
            Objects.toString(obj);
            Objects.toString(andSet);
        }
        return andSet;
    }

    public final void b(Object obj) {
        b.lazySet(this, obj);
        if (this.c != mrs.a) {
            Objects.toString(obj);
        }
    }

    public final void c(Object obj) {
        this.a = obj;
        if (this.c != mrs.a) {
            Objects.toString(obj);
        }
    }

    public final boolean d(Object obj, Object obj2) {
        boolean e = amr.e(b, this, obj, obj2);
        if (e && this.c != mrs.a) {
            Objects.toString(obj);
            Objects.toString(obj2);
            return true;
        }
        return e;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
