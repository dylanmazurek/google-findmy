package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdo {
    public int a;
    public boolean b;
    public byte c;
    public Object d;
    public Object e;

    public hdo() {
        throw null;
    }

    public final hdp a() {
        boolean z;
        boolean z2 = true;
        if (this.c != 3) {
            StringBuilder sb = new StringBuilder();
            if ((this.c & 1) == 0) {
                sb.append(" iconResId");
            }
            if ((this.c & 2) == 0) {
                sb.append(" useTint");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        hdp hdpVar = new hdp((Drawable) this.d, this.a, this.b, (jer) this.e);
        int i = hdpVar.b;
        if (hdpVar.a != null) {
            z = true;
        } else {
            z = false;
        }
        if (i == -1) {
            z2 = false;
        }
        hwx.V(z2 ^ z, "Either icon id or icon drawable must be specified");
        return hdpVar;
    }

    public final void b(int i) {
        this.a = i;
        this.c = (byte) (this.c | 1);
    }

    public final void c(boolean z) {
        this.b = z;
        this.c = (byte) (this.c | 2);
    }

    public final void d(boolean z) {
        this.b = z;
        this.c = (byte) (this.c | 2);
    }

    public hdo(byte[] bArr) {
        this.e = jdl.a;
    }

    public hdo(char[] cArr) {
    }
}
