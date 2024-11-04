package defpackage;

import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpn {
    public Object a;
    private Object b;

    public final gpo a() {
        Object obj;
        Object obj2 = this.a;
        if (obj2 != null && (obj = this.b) != null) {
            return new gpo((lfs) obj2, (gpq) obj);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" androidPayload");
        }
        if (this.b == null) {
            sb.append(" pushPayloadType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(lfs lfsVar) {
        if (lfsVar != null) {
            this.a = lfsVar;
            return;
        }
        throw new NullPointerException("Null androidPayload");
    }

    public final void c(gpq gpqVar) {
        if (gpqVar != null) {
            this.b = gpqVar;
            return;
        }
        throw new NullPointerException("Null pushPayloadType");
    }

    public final fhp d() {
        if (this.a == null) {
            this.a = new fma();
        }
        if (this.b == null) {
            this.b = Looper.getMainLooper();
        }
        return new fhp((fma) this.a, (Looper) this.b);
    }
}
