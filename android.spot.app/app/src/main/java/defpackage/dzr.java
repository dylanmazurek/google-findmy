package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzr {
    public jis a;
    public jis b;
    private boolean c;
    private boolean d;
    private boolean e;
    private jis f;
    private jis g;
    private jer h;
    private byte i;

    public dzr() {
        throw null;
    }

    public final dzu a() {
        jis jisVar;
        jis jisVar2;
        jis jisVar3;
        jis jisVar4;
        if (this.i == 7 && (jisVar = this.f) != null && (jisVar2 = this.g) != null && (jisVar3 = this.a) != null && (jisVar4 = this.b) != null) {
            dzu dzuVar = new dzu(this.c, this.d, this.e, jisVar, jisVar2, jisVar3, jisVar4, this.h);
            if (dzuVar.a) {
                hwx.U(dzuVar.d.isEmpty());
                hwx.U(!dzuVar.b);
            }
            if (dzuVar.c) {
                hwx.U(!dzuVar.a);
                hwx.U(dzuVar.d.isEmpty());
            }
            return dzuVar;
        }
        StringBuilder sb = new StringBuilder();
        if ((this.i & 1) == 0) {
            sb.append(" isInitialLoading");
        }
        if ((this.i & 2) == 0) {
            sb.append(" isRefreshing");
        }
        if ((this.i & 4) == 0) {
            sb.append(" isFailure");
        }
        if (this.f == null) {
            sb.append(" devices");
        }
        if (this.g == null) {
            sb.append(" supervisedAccountDevices");
        }
        if (this.a == null) {
            sb.append(" supervisedAccountNames");
        }
        if (this.b == null) {
            sb.append(" filteredDevices");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(jis jisVar) {
        if (jisVar != null) {
            this.f = jisVar;
            return;
        }
        throw new NullPointerException("Null devices");
    }

    public final void c(boolean z) {
        this.e = z;
        this.i = (byte) (this.i | 4);
    }

    public final void d(boolean z) {
        this.c = z;
        this.i = (byte) (this.i | 1);
    }

    public final void e(boolean z) {
        this.d = z;
        this.i = (byte) (this.i | 2);
    }

    public final void f(dzt dztVar) {
        this.h = jer.i(dztVar);
    }

    public final void g(jis jisVar) {
        if (jisVar != null) {
            this.g = jisVar;
            return;
        }
        throw new NullPointerException("Null supervisedAccountDevices");
    }

    public dzr(dzu dzuVar) {
        this.h = jdl.a;
        this.c = dzuVar.a;
        this.d = dzuVar.b;
        this.e = dzuVar.c;
        this.f = dzuVar.d;
        this.g = dzuVar.e;
        this.a = dzuVar.f;
        this.b = dzuVar.g;
        this.h = dzuVar.h;
        this.i = (byte) 7;
    }

    public dzr(byte[] bArr) {
        this.h = jdl.a;
    }
}
