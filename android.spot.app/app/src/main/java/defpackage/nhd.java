package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nhd {
    public final nhk a;
    public final nfi b;
    public final nhg c;
    public nhm d;
    public int e;
    public int f;
    public int g;
    public ngq h;
    public njm i;

    public nhd(nhk nhkVar, nfi nfiVar, nhg nhgVar) {
        this.a = nhkVar;
        this.b = nfiVar;
        this.c = nhgVar;
    }

    public final void a(IOException iOException) {
        iOException.getClass();
        this.h = null;
        if ((iOException instanceof njn) && ((njn) iOException).a == 8) {
            this.e++;
        } else if (iOException instanceof nif) {
            this.f++;
        } else {
            this.g++;
        }
    }

    public final boolean b(ngd ngdVar) {
        ngd ngdVar2 = this.b.h;
        if (ngdVar.d == ngdVar2.d && amr.i(ngdVar.c, ngdVar2.c)) {
            return true;
        }
        return false;
    }
}
