package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class wd implements wc {
    private final Object a;
    private final Object b;

    public wd(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.wc
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.wc
    public final Object b() {
        return this.b;
    }

    @Override // defpackage.wc
    public final /* synthetic */ boolean d(Object obj, Object obj2) {
        return rb.c(this, obj, obj2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wc) {
            wc wcVar = (wc) obj;
            if (amr.i(this.a, wcVar.a()) && amr.i(this.b, wcVar.b())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Object obj = this.a;
        int i2 = 0;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        Object obj2 = this.b;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return (i * 31) + i2;
    }
}
