package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gnz {
    public String a;
    public String b;
    public String c;
    public String d;
    public jjr e;
    public String f;
    public String g;
    private long h;
    private String i;
    private int j;
    private long k;
    private long l;
    private int m;
    private long n;
    private byte o;
    private int p;

    public gnz() {
    }

    public final goa a() {
        String str;
        int i;
        if (this.o == 63 && (str = this.i) != null && (i = this.p) != 0) {
            return new goa(this.h, str, i, this.a, this.b, this.c, this.j, this.d, this.e, this.f, this.k, this.l, this.m, this.n, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.o & 1) == 0) {
            sb.append(" id");
        }
        if (this.i == null) {
            sb.append(" accountSpecificId");
        }
        if (this.p == 0) {
            sb.append(" accountType");
        }
        if ((this.o & 2) == 0) {
            sb.append(" registrationStatus");
        }
        if ((this.o & 4) == 0) {
            sb.append(" syncVersion");
        }
        if ((this.o & 8) == 0) {
            sb.append(" lastRegistrationTimeMs");
        }
        if ((this.o & 16) == 0) {
            sb.append(" lastRegistrationRequestHash");
        }
        if ((this.o & 32) == 0) {
            sb.append(" firstRegistrationVersion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(gwf gwfVar) {
        j(frx.D(gwfVar));
        c(gwfVar.a());
        if (gwfVar instanceof gwg) {
            this.a = ((gwg) gwfVar).a;
        }
    }

    public final void c(String str) {
        if (str != null) {
            this.i = str;
            return;
        }
        throw new NullPointerException("Null accountSpecificId");
    }

    public final void d(long j) {
        this.n = j;
        this.o = (byte) (this.o | 32);
    }

    public final void e(long j) {
        this.h = j;
        this.o = (byte) (this.o | 1);
    }

    public final void f(int i) {
        this.m = i;
        this.o = (byte) (this.o | 16);
    }

    public final void g(long j) {
        this.l = j;
        this.o = (byte) (this.o | 8);
    }

    public final void h(int i) {
        this.j = i;
        this.o = (byte) (this.o | 2);
    }

    public final void i(long j) {
        this.k = j;
        this.o = (byte) (this.o | 4);
    }

    public final void j(int i) {
        this.p = i;
    }

    public gnz(goa goaVar) {
        this.h = goaVar.a;
        this.i = goaVar.b;
        this.p = goaVar.o;
        this.a = goaVar.c;
        this.b = goaVar.d;
        this.c = goaVar.e;
        this.j = goaVar.f;
        this.d = goaVar.g;
        this.e = goaVar.h;
        this.f = goaVar.i;
        this.k = goaVar.j;
        this.l = goaVar.k;
        this.m = goaVar.l;
        this.n = goaVar.m;
        this.g = goaVar.n;
        this.o = (byte) 63;
    }
}
