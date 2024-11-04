package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gip {
    public byte a;
    public Object b;
    public Object c;
    public Object d;
    private boolean e;
    private boolean f;
    private Object g;

    public gip() {
    }

    public final giv a() {
        boolean z;
        boolean z2;
        boolean z3;
        int i = ~this.a;
        if ((i & 3) != 0) {
            StringBuilder sb = new StringBuilder();
            if ((this.a & 1) == 0) {
                sb.append(" notificationTarget");
            }
            if ((this.a & 2) == 0) {
                sb.append(" timeout");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        Object obj = this.g;
        Object obj2 = this.b;
        Object obj3 = this.c;
        Object obj4 = this.d;
        boolean z4 = this.e;
        boolean z5 = this.f;
        if ((i & 4) != 0) {
            obj3 = null;
        }
        if ((i & 8) != 0) {
            obj4 = null;
        }
        if ((i & 16) != 0) {
            z = false;
        } else {
            z = true;
        }
        boolean z6 = z & z4;
        if ((i & 32) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z7 = z2 & z5;
        if ((i & 64) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        return new giv((giu) obj, (gnd) obj2, (ghh) obj3, (gxh) obj4, z6, z7, z3);
    }

    public final void b() {
        this.a = (byte) (this.a | 64);
    }

    public final void c() {
        this.f = true;
        this.a = (byte) (this.a | 32);
    }

    public final void d(boolean z) {
        this.e = z;
        this.a = (byte) (this.a | 16);
    }

    public final void e(gnd gndVar) {
        if (gndVar != null) {
            this.b = gndVar;
            this.a = (byte) (this.a | 2);
            return;
        }
        throw new NullPointerException("Null timeout");
    }

    public final void f(giu giuVar) {
        this.g = giuVar;
        this.a = (byte) (this.a | 1);
    }

    public final ehx g() {
        Object obj;
        Object obj2;
        if (this.a == 3 && (obj = this.b) != null && (obj2 = this.d) != null) {
            return new ehx((lqc) obj, this.f, this.e, (String) obj2, (jer) this.c, (jer) this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" device");
        }
        if ((this.a & 1) == 0) {
            sb.append(" editNameSupported");
        }
        if ((this.a & 2) == 0) {
            sb.append(" renamingInProgress");
        }
        if (this.d == null) {
            sb.append(" model");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void h(boolean z) {
        this.f = z;
        this.a = (byte) (this.a | 1);
    }

    public final void i(String str) {
        if (str != null) {
            this.d = str;
            return;
        }
        throw new NullPointerException("Null model");
    }

    public final void j(long j) {
        this.g = jer.i(Long.valueOf(j));
    }

    public final void k(boolean z) {
        this.e = z;
        this.a = (byte) (this.a | 2);
    }

    public gip(byte[] bArr, byte[] bArr2) {
        jdl jdlVar = jdl.a;
        this.c = jdlVar;
        this.g = jdlVar;
    }
}
