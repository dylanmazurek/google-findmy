package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aku {
    public final Object a;
    public final Object b;

    public aku(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final aku a(Object obj) {
        return new aku(this.a, obj);
    }

    public final boolean b() {
        if (this.b != aky.a) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.a != aky.a) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public aku() {
        /*
            r1 = this;
            aky r0 = defpackage.aky.a
            r1.<init>(r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aku.<init>():void");
    }
}
