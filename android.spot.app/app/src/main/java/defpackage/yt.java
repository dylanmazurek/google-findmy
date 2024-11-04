package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yt {
    public String a;
    public bgm b;
    public int c;
    public boolean d;
    public int e;
    public ble f;
    public boolean g;
    public bga i;
    public bln j;
    public bfp l;
    public dkr m;
    private long n = yr.a;
    public long h = bef.m(0, 0);
    public long k = bbc.n(0, 0, 0, 0);

    public yt(String str, bgm bgmVar, dkr dkrVar, int i, boolean z, int i2) {
        this.a = str;
        this.b = bgmVar;
        this.m = dkrVar;
        this.c = i;
        this.d = z;
        this.e = i2;
    }

    private final void c() {
        this.l = null;
        this.i = null;
        this.j = null;
        this.k = bbc.n(0, 0, 0, 0);
        this.h = bef.m(0, 0);
        this.g = false;
    }

    public final void a(ble bleVar) {
        long j;
        ble bleVar2 = this.f;
        if (bleVar != null) {
            j = yr.a(bleVar);
        } else {
            j = yr.a;
        }
        if (bleVar2 == null) {
            this.f = bleVar;
            this.n = j;
        } else {
            if (bleVar != null && a.n(this.n, j)) {
                return;
            }
            this.f = bleVar;
            this.n = j;
            c();
        }
    }

    public final void b(String str, bgm bgmVar, dkr dkrVar, int i, boolean z, int i2) {
        this.a = str;
        this.b = bgmVar;
        this.m = dkrVar;
        this.c = i;
        this.d = z;
        this.e = i2;
        c();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        if (this.l != null) {
            str = "<paragraph>";
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append(", lastDensity=");
        long j = this.n;
        sb.append((Object) ("InlineDensity(density=" + Float.intBitsToFloat((int) (j >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j & 4294967295L)) + ')'));
        sb.append(')');
        return sb.toString();
    }
}
