package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpk {
    public final Uri a;
    public final boolean b;

    public cpk(Uri uri, boolean z) {
        this.a = uri;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!amr.i(cls2, cls)) {
            return false;
        }
        obj.getClass();
        cpk cpkVar = (cpk) obj;
        if (amr.i(this.a, cpkVar.a) && this.b == cpkVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.i(this.b);
    }
}
