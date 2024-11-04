package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjv {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public int g;
    public int h;
    private String i;
    private boolean j;
    private boolean k;
    private byte l;
    private int m;

    public final hjw a() {
        String str;
        int i;
        int i2;
        int i3;
        if (this.l == 3 && (str = this.i) != null && (i = this.m) != 0 && (i2 = this.h) != 0 && (i3 = this.g) != 0) {
            return new hjw(str, this.j, this.a, this.b, this.c, this.d, this.k, i, i2, this.e, this.f, i3);
        }
        StringBuilder sb = new StringBuilder();
        if (this.i == null) {
            sb.append(" accountName");
        }
        if ((this.l & 1) == 0) {
            sb.append(" isMetadataAvailable");
        }
        if ((this.l & 2) == 0) {
            sb.append(" isG1User");
        }
        if (this.m == 0) {
            sb.append(" isDasherUser");
        }
        if (this.h == 0) {
            sb.append(" isUnicornUser");
        }
        if (this.g == 0) {
            sb.append(" ageRange");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(String str) {
        if (str != null) {
            this.i = str;
            return;
        }
        throw new NullPointerException("Null accountName");
    }

    public final void c(boolean z) {
        this.k = z;
        this.l = (byte) (this.l | 2);
    }

    public final void d(boolean z) {
        this.j = z;
        this.l = (byte) (this.l | 1);
    }

    public final void e(int i) {
        if (i != 0) {
            this.m = i;
            return;
        }
        throw new NullPointerException("Null isDasherUser");
    }
}
