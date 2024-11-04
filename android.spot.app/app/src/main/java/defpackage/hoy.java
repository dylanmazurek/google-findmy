package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hoy {
    public String a;
    public ndq b;
    public String c;
    public Long d;
    public hnf e;
    private boolean f;
    private nfe g;
    private boolean h;
    private int i;
    private byte j;

    public final hoz a() {
        nfe nfeVar;
        if (this.j == 7 && (nfeVar = this.g) != null) {
            return new hoz(this.a, this.f, nfeVar, this.b, this.c, this.d, this.h, this.e, this.i);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.j & 1) == 0) {
            sb.append(" isEventNameConstant");
        }
        if (this.g == null) {
            sb.append(" metric");
        }
        if ((this.j & 2) == 0) {
            sb.append(" isUnsampled");
        }
        if ((this.j & 4) == 0) {
            sb.append(" debugLogsSize");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.i = i;
        this.j = (byte) (this.j | 4);
    }

    public final void c(boolean z) {
        this.f = z;
        this.j = (byte) (this.j | 1);
    }

    public final void d(boolean z) {
        this.h = z;
        this.j = (byte) (this.j | 2);
    }

    public final void e(nfe nfeVar) {
        if (nfeVar != null) {
            this.g = nfeVar;
            return;
        }
        throw new NullPointerException("Null metric");
    }
}
