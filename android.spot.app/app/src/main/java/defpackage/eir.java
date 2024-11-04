package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eir {
    public jer a;
    public jer b;
    public jer c;
    public jer d;
    public int e;
    private boolean f;
    private boolean g;
    private byte h;

    public eir() {
        throw null;
    }

    public final eit a() {
        if (this.h == 3 && this.e != 0) {
            return new eig(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.e == 0) {
            sb.append(" batteryLevel");
        }
        if ((this.h & 1) == 0) {
            sb.append(" isInCase");
        }
        if ((this.h & 2) == 0) {
            sb.append(" isConnectable");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        if (i != 0) {
            this.e = i;
            return;
        }
        throw new NullPointerException("Null batteryLevel");
    }

    public final void c(boolean z) {
        this.g = z;
        this.h = (byte) (this.h | 2);
    }

    public final void d(boolean z) {
        this.f = z;
        this.h = (byte) (this.h | 1);
    }

    public final void e(Long l) {
        this.d = jer.i(l);
    }

    public final eda f() {
        int i;
        if (this.h == 3 && (i = this.e) != 0) {
            return new eda(this.f, this.g, this.d, i, this.c, this.a, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.h & 1) == 0) {
            sb.append(" supportsStopRinging");
        }
        if ((this.h & 2) == 0) {
            sb.append(" supportsLock");
        }
        if (this.e == 0) {
            sb.append(" ringingState");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void g(boolean z) {
        this.g = z;
        this.h = (byte) (this.h | 2);
    }

    public final void h(boolean z) {
        this.f = z;
        this.h = (byte) (this.h | 1);
    }

    public eir(eit eitVar) {
        jdl jdlVar = jdl.a;
        this.a = jdlVar;
        this.b = jdlVar;
        this.c = jdlVar;
        this.d = jdlVar;
        this.a = eitVar.d;
        this.b = eitVar.e;
        this.c = eitVar.f;
        this.d = eitVar.g;
        this.e = eitVar.j;
        this.f = eitVar.h;
        this.g = eitVar.i;
        this.h = (byte) 3;
    }

    public eir(byte[] bArr) {
        jdl jdlVar = jdl.a;
        this.a = jdlVar;
        this.b = jdlVar;
        this.c = jdlVar;
        this.d = jdlVar;
    }

    public eir(byte[] bArr, byte[] bArr2) {
        jdl jdlVar = jdl.a;
        this.d = jdlVar;
        this.c = jdlVar;
        this.a = jdlVar;
        this.b = jdlVar;
    }
}
