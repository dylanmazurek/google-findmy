package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ngn implements Closeable {
    public final ngk a;
    public final ngi b;
    public final String c;
    public final int d;
    public final nga e;
    public final ngb f;
    public final ngp g;
    public final ngn h;
    public final ngn i;
    public final ngn j;
    public final long k;
    public final long l;
    public final nhc m;

    public ngn(ngk ngkVar, ngi ngiVar, String str, int i, nga ngaVar, ngb ngbVar, ngp ngpVar, ngn ngnVar, ngn ngnVar2, ngn ngnVar3, long j, long j2, nhc nhcVar) {
        this.a = ngkVar;
        this.b = ngiVar;
        this.c = str;
        this.d = i;
        this.e = ngaVar;
        this.f = ngbVar;
        this.g = ngpVar;
        this.h = ngnVar;
        this.i = ngnVar2;
        this.j = ngnVar3;
        this.k = j;
        this.l = j2;
        this.m = nhcVar;
    }

    public static /* synthetic */ String a(ngn ngnVar, String str) {
        String b = ngnVar.f.b(str);
        if (b == null) {
            return null;
        }
        return b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ngp ngpVar = this.g;
        if (ngpVar != null) {
            ngpVar.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public final String toString() {
        return "Response{protocol=" + this.b + ", code=" + this.d + ", message=" + this.c + ", url=" + this.a.a + "}";
    }
}
