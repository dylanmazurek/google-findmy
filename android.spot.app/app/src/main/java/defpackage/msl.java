package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class msl {
    public final Object a;
    public final msc b;
    public final moh c;
    public final Object d;
    public final Throwable e;

    public msl(Object obj, msc mscVar, moh mohVar, Throwable th) {
        this.a = obj;
        this.b = mscVar;
        this.c = mohVar;
        this.d = null;
        this.e = th;
    }

    public static /* synthetic */ msl b(msl mslVar, msc mscVar, Throwable th, int i) {
        Object obj;
        moh mohVar = null;
        if ((i & 1) != 0) {
            obj = mslVar.a;
        } else {
            obj = null;
        }
        if ((i & 2) != 0) {
            mscVar = mslVar.b;
        }
        if ((i & 4) != 0) {
            mohVar = mslVar.c;
        }
        if ((i & 8) != 0) {
            Object obj2 = mslVar.d;
        }
        if ((i & 16) != 0) {
            th = mslVar.e;
        }
        return new msl(obj, mscVar, mohVar, th);
    }

    public final boolean a() {
        if (this.e != null) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof msl)) {
            return false;
        }
        msl mslVar = (msl) obj;
        if (!amr.i(this.a, mslVar.a) || !amr.i(this.b, mslVar.b) || !amr.i(this.c, mslVar.c)) {
            return false;
        }
        Object obj2 = mslVar.d;
        if (amr.i(null, null) && amr.i(this.e, mslVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        Object obj = this.a;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        msc mscVar = this.b;
        if (mscVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = mscVar.hashCode();
        }
        int i2 = hashCode * 31;
        moh mohVar = this.c;
        if (mohVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = mohVar.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Throwable th = this.e;
        if (th != null) {
            i = th.hashCode();
        }
        return ((i3 + hashCode3) * 961) + i;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=null, cancelCause=" + this.e + ")";
    }

    public /* synthetic */ msl(Object obj, msc mscVar, moh mohVar, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : mscVar, (i & 4) != 0 ? null : mohVar, (i & 16) != 0 ? null : th);
    }
}
