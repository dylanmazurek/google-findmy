package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class exu {
    public Object a;
    public Object b;
    private int c;
    private byte d;

    public exu() {
        throw null;
    }

    public final exv a() {
        Object obj;
        boolean z;
        if (this.d == 1 && (obj = this.a) != null) {
            exv exvVar = new exv(this.c, (String) obj, (jer) this.b);
            if (exvVar.a != 0) {
                z = true;
            } else {
                z = false;
            }
            hwx.U(z);
            if (exvVar.c.g()) {
                ((Integer) exvVar.c.c()).intValue();
            }
            hwx.U(true);
            return exvVar;
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == 0) {
            sb.append(" titleId");
        }
        if (this.a == null) {
            sb.append(" message");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.b = jer.i(Integer.valueOf(i));
    }

    public final void c(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null message");
    }

    public final void d(int i) {
        this.c = i;
        this.d = (byte) 1;
    }

    public final evj e() {
        Object obj;
        Object obj2;
        if (this.d == 1 && (obj = this.a) != null && (obj2 = this.b) != null) {
            return new evj(this.c, (Boolean) obj, (evi) obj2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == 0) {
            sb.append(" duration");
        }
        if (this.a == null) {
            sb.append(" aboveDevicePanelOnly");
        }
        if (this.b == null) {
            sb.append(" action");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void f(int i) {
        this.c = i;
        this.d = (byte) 1;
    }

    public final void g(Duration duration) {
        f((int) duration.toMillis());
    }

    public exu(byte[] bArr) {
        this.b = jdl.a;
    }

    public exu(char[] cArr) {
    }
}
