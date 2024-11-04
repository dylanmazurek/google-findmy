package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class jai extends jwq {
    private jak a;
    private final int b;

    public jai(jak jakVar, int i) {
        this.a = jakVar;
        this.b = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.jwq
    public final String a() {
        Object obj;
        jak jakVar = this.a;
        if (jakVar == null || (obj = jakVar.d.a) == null) {
            return null;
        }
        String c = der.c(obj, "callable=[", "]");
        jaj jajVar = (jaj) this.a.b.get();
        if (jajVar != null) {
            return c + ", trial=[" + jajVar.toString() + "]";
        }
        return c;
    }

    @Override // defpackage.jwq
    protected final void b() {
        long j;
        int i;
        int a;
        boolean z;
        jaj jajVar;
        jak jakVar = this.a;
        this.a = null;
        if (jakVar == null) {
            return;
        }
        do {
            j = jakVar.a.get();
            i = (int) j;
            a = jak.a(j);
            if (i != Integer.MIN_VALUE) {
                if (i == -2147483647) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    a++;
                }
            } else {
                throw new AssertionError(a.ap(j, "Refcount is: "));
            }
        } while (!jakVar.a.compareAndSet(j, jak.b(a, i - 1)));
        if (!z) {
            return;
        }
        do {
            jajVar = (jaj) jakVar.b.get();
            if (jajVar != null) {
                if (jajVar.a <= this.b) {
                    jajVar.cancel(true);
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!a.p(jakVar.b, jajVar));
    }
}
