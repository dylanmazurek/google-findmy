package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ys {
    public bfs a;
    public bgm b;
    public int c;
    public boolean d;
    public int e;
    public ble f;
    public bfx g;
    public bln h;
    public bgk i;
    public dkr j;
    private long k = yr.a;

    public /* synthetic */ ys(bfs bfsVar, bgm bgmVar, dkr dkrVar, int i, boolean z, int i2) {
        this.a = bfsVar;
        this.b = bgmVar;
        this.j = dkrVar;
        this.c = i;
        this.d = z;
        this.e = i2;
    }

    private final void e() {
        this.g = null;
        this.i = null;
    }

    public final bgk a() {
        bgk bgkVar = this.i;
        if (bgkVar != null) {
            return bgkVar;
        }
        throw new IllegalStateException("You must call layoutWithConstraints first");
    }

    public final bgk b(bln blnVar, long j, bfw bfwVar) {
        float min = Math.min(bfwVar.a.a(), bfwVar.c);
        bfs bfsVar = this.a;
        bgm bgmVar = this.b;
        mlx mlxVar = mlx.a;
        int i = this.e;
        boolean z = this.d;
        int i2 = this.c;
        ble bleVar = this.f;
        bleVar.getClass();
        return new bgk(new bgj(bfsVar, bgmVar, mlxVar, i, z, i2, bleVar, blnVar, this.j, j), bfwVar, bbc.m(j, bef.m(ct.c(min), ct.c(bfwVar.d))));
    }

    public final void c(ble bleVar) {
        long j;
        ble bleVar2 = this.f;
        if (bleVar != null) {
            j = yr.a(bleVar);
        } else {
            j = yr.a;
        }
        if (bleVar2 == null) {
            this.f = bleVar;
            this.k = j;
        } else {
            if (bleVar != null && a.n(this.k, j)) {
                return;
            }
            this.f = bleVar;
            this.k = j;
            e();
        }
    }

    public final void d(bfs bfsVar, bgm bgmVar, dkr dkrVar, int i, boolean z, int i2) {
        this.a = bfsVar;
        this.b = bgmVar;
        this.j = dkrVar;
        this.c = i;
        this.d = z;
        this.e = i2;
        e();
    }
}
