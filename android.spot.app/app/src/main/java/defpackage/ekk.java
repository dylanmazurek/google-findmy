package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ekk {
    public jer a;
    public jer b;
    public jer c;
    public jer d;
    public jer e;
    private ifj f;
    private ekj g;
    private jer h;

    public ekk() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ekl a() {
        /*
            r10 = this;
            ifj r6 = r10.f
            if (r6 == 0) goto L9c
            ekj r7 = r10.g
            if (r7 != 0) goto La
            goto L9c
        La:
            eii r9 = new eii
            jer r1 = r10.a
            jer r2 = r10.b
            jer r3 = r10.c
            jer r4 = r10.d
            jer r5 = r10.e
            jer r8 = r10.h
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            jer r0 = r9.h
            jer r1 = r9.i
            boolean r0 = r0.g()
            boolean r1 = r1.g()
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L2e
            r0 = 1
            goto L2f
        L2e:
            r0 = 0
        L2f:
            defpackage.hwx.U(r0)
            jer r0 = r9.j
            boolean r0 = r0.g()
            if (r0 == 0) goto L45
            jer r0 = r9.k
            boolean r0 = r0.g()
            if (r0 != 0) goto L43
            goto L45
        L43:
            r0 = 0
            goto L46
        L45:
            r0 = 1
        L46:
            defpackage.hwx.U(r0)
            ifj r0 = r9.m
            ifj r1 = defpackage.ifj.STOPPED
            if (r0 == r1) goto L65
            jer r0 = r9.j
            boolean r0 = r0.g()
            if (r0 != 0) goto L61
            jer r0 = r9.k
            boolean r0 = r0.g()
            if (r0 != 0) goto L61
            r0 = 1
            goto L62
        L61:
            r0 = 0
        L62:
            defpackage.hwx.U(r0)
        L65:
            jer r0 = r9.l
            jer r1 = r9.j
            boolean r4 = r1.g()
            if (r4 == 0) goto L7b
            java.lang.Object r1 = r1.c()
            kzi r1 = (defpackage.kzi) r1
            int r1 = r1.a
            if (r1 != r3) goto L7b
        L79:
            r1 = 1
            goto L8f
        L7b:
            jer r1 = r9.k
            boolean r4 = r1.g()
            if (r4 == 0) goto L8e
            java.lang.Object r1 = r1.c()
            kzi r1 = (defpackage.kzi) r1
            int r1 = r1.a
            if (r1 != r3) goto L8e
            goto L79
        L8e:
            r1 = 0
        L8f:
            boolean r0 = r0.g()
            if (r0 != r1) goto L96
            r2 = 1
        L96:
            java.lang.String r0 = "Ringing request ID should be present if and only if there is a ringing action in progress."
            defpackage.hwx.V(r2, r0)
            return r9
        L9c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            ifj r1 = r10.f
            if (r1 != 0) goto Laa
            java.lang.String r1 = " localRingingState"
            r0.append(r1)
        Laa:
            ekj r1 = r10.g
            if (r1 != 0) goto Lb3
            java.lang.String r1 = " localRingingErrorType"
            r0.append(r1)
        Lb3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "Missing required properties:"
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekk.a():ekl");
    }

    public final void b(String str) {
        this.e = jer.i(str);
    }

    public final void c(ekj ekjVar) {
        if (ekjVar != null) {
            this.g = ekjVar;
            return;
        }
        throw new NullPointerException("Null localRingingErrorType");
    }

    public final void d(ifj ifjVar) {
        if (ifjVar != null) {
            this.f = ifjVar;
            return;
        }
        throw new NullPointerException("Null localRingingState");
    }

    public final void e(kzi kziVar) {
        this.c = jer.i(kziVar);
    }

    public final void f(Integer num) {
        this.b = jer.i(num);
    }

    public final void g(Long l) {
        this.a = jer.i(l);
    }

    public final void h(kzi kziVar) {
        this.d = jer.i(kziVar);
    }

    public final void i() {
        jdl jdlVar = jdl.a;
        this.a = jdlVar;
        this.b = jdlVar;
        d(ifj.STOPPED);
        c(ekj.NONE);
    }

    public ekk(ekl eklVar) {
        jdl jdlVar = jdl.a;
        this.a = jdlVar;
        this.b = jdlVar;
        this.c = jdlVar;
        this.d = jdlVar;
        this.e = jdlVar;
        this.h = jdlVar;
        this.a = eklVar.h;
        this.b = eklVar.i;
        this.c = eklVar.j;
        this.d = eklVar.k;
        this.e = eklVar.l;
        this.f = eklVar.m;
        this.g = eklVar.n;
        this.h = eklVar.o;
    }

    public ekk(byte[] bArr) {
        jdl jdlVar = jdl.a;
        this.a = jdlVar;
        this.b = jdlVar;
        this.c = jdlVar;
        this.d = jdlVar;
        this.e = jdlVar;
        this.h = jdlVar;
    }
}
