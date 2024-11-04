package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gkp {
    private long a;
    private String b;
    private long c;
    private long d;
    private byte e;
    private int f;
    private int g;
    private int h;
    private int i;

    public gkp() {
    }

    public final gks a() {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        if (this.e == 7 && (str = this.b) != null && (i = this.f) != 0 && (i2 = this.g) != 0 && (i3 = this.h) != 0 && (i4 = this.i) != 0) {
            return new gks(this.a, str, this.c, i, i2, i3, i4, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.e & 1) == 0) {
            sb.append(" id");
        }
        if (this.b == null) {
            sb.append(" threadId");
        }
        if ((this.e & 2) == 0) {
            sb.append(" lastUpdatedVersion");
        }
        if (this.f == 0) {
            sb.append(" readState");
        }
        if (this.g == 0) {
            sb.append(" deletionStatus");
        }
        if (this.h == 0) {
            sb.append(" countBehavior");
        }
        if (this.i == 0) {
            sb.append(" systemTrayBehavior");
        }
        if ((this.e & 4) == 0) {
            sb.append(" modifiedTimestamp");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(long j) {
        this.a = j;
        this.e = (byte) (this.e | 1);
    }

    public final void c(Long l) {
        this.c = l.longValue();
        this.e = (byte) (this.e | 2);
    }

    public final void d(long j) {
        this.d = j;
        this.e = (byte) (this.e | 4);
    }

    public final void e(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null threadId");
    }

    public final void f(int i) {
        if (i != 0) {
            this.h = i;
            return;
        }
        throw new NullPointerException("Null countBehavior");
    }

    public final void g(int i) {
        if (i != 0) {
            this.g = i;
            return;
        }
        throw new NullPointerException("Null deletionStatus");
    }

    public final void h(int i) {
        if (i != 0) {
            this.f = i;
            return;
        }
        throw new NullPointerException("Null readState");
    }

    public final void i(int i) {
        if (i != 0) {
            this.i = i;
            return;
        }
        throw new NullPointerException("Null systemTrayBehavior");
    }

    public gkp(gks gksVar) {
        this.a = gksVar.a;
        this.b = gksVar.b;
        this.c = gksVar.c;
        this.f = gksVar.e;
        this.g = gksVar.f;
        this.h = gksVar.g;
        this.i = gksVar.h;
        this.d = gksVar.d;
        this.e = (byte) 7;
    }
}
