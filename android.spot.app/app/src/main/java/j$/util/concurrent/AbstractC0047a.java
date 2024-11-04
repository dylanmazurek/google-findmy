package j$.util.concurrent;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.concurrent.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0047a extends p {
    final ConcurrentHashMap i;
    l j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0047a(l[] lVarArr, int i, int i2, ConcurrentHashMap concurrentHashMap) {
        super(lVarArr, i, 0, i2);
        this.i = concurrentHashMap;
        a();
    }

    public final boolean hasMoreElements() {
        if (this.b != null) {
            return true;
        }
        return false;
    }

    public final boolean hasNext() {
        if (this.b != null) {
            return true;
        }
        return false;
    }

    public final void remove() {
        l lVar = this.j;
        if (lVar != null) {
            this.j = null;
            this.i.g(lVar.b, null, null);
            return;
        }
        throw new IllegalStateException();
    }
}
