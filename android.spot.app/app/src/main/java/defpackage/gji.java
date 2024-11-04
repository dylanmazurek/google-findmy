package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gji {
    public boolean a;
    public byte b;
    public Object c;
    public Object d;
    public Object e;

    public gji() {
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [lkq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [lkq, java.lang.Object] */
    public final gjj a() {
        if (this.b == 1) {
            return new gjj(this.c, this.d, (Throwable) this.e, this.a);
        }
        throw new IllegalStateException("Missing required properties: isRetryableError");
    }

    public final void b(boolean z) {
        this.a = z;
        this.b = (byte) 1;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [jls, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [jls, java.lang.Object] */
    public final ghr c() {
        return new ghr((lct) this.d, this.e, this.c, this.a, (~this.b) & 15);
    }

    public final void d(lct lctVar) {
        this.d = lctVar;
        this.b = (byte) (this.b | 1);
    }

    public final etp e() {
        Object obj;
        Object obj2;
        if (this.b == 1 && (obj = this.e) != null && (obj2 = this.c) != null) {
            return new etp((etn) obj, this.a, (jer) this.d, (etk) obj2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.e == null) {
            sb.append(" state");
        }
        if (this.b == 0) {
            sb.append(" operationInProgress");
        }
        if (this.c == null) {
            sb.append(" requirementsResult");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void f(boolean z) {
        this.a = z;
        this.b = (byte) 1;
    }

    public final void g(etk etkVar) {
        if (etkVar != null) {
            this.c = etkVar;
            return;
        }
        throw new NullPointerException("Null requirementsResult");
    }

    public final void h(etn etnVar) {
        if (etnVar != null) {
            this.e = etnVar;
            return;
        }
        throw new NullPointerException("Null state");
    }

    public gji(etp etpVar) {
        this.d = jdl.a;
        this.e = etpVar.a;
        this.a = etpVar.b;
        this.d = etpVar.c;
        this.c = etpVar.d;
        this.b = (byte) 1;
    }

    public gji(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.d = jdl.a;
    }
}
