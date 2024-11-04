package defpackage;

import java.net.SocketAddress;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mhr {
    private List a;
    private int b;
    private int c;

    public mhr(List list) {
        this.a = list == null ? Collections.emptyList() : list;
    }

    public final int a() {
        List list = this.a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final lyp b() {
        if (g()) {
            return ((lzn) this.a.get(this.b)).c;
        }
        throw new IllegalStateException("Index is off the end of the address group list");
    }

    public final SocketAddress c() {
        if (g()) {
            return (SocketAddress) ((lzn) this.a.get(this.b)).b.get(this.c);
        }
        throw new IllegalStateException("Index is past the end of the address group list");
    }

    public final void d() {
        this.b = 0;
        this.c = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:            r1 = r1;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(defpackage.jis r1) {
        /*
            r0 = this;
            if (r1 != 0) goto L6
            java.util.List r1 = java.util.Collections.emptyList()
        L6:
            r0.a = r1
            r0.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mhr.e(jis):void");
    }

    public final boolean f() {
        if (!g()) {
            return false;
        }
        lzn lznVar = (lzn) this.a.get(this.b);
        int i = this.c + 1;
        this.c = i;
        if (i < lznVar.b.size()) {
            return true;
        }
        int i2 = this.b + 1;
        this.b = i2;
        this.c = 0;
        if (i2 >= this.a.size()) {
            return false;
        }
        return true;
    }

    public final boolean g() {
        if (this.b < this.a.size()) {
            return true;
        }
        return false;
    }

    public final boolean h(SocketAddress socketAddress) {
        for (int i = 0; i < this.a.size(); i++) {
            int indexOf = ((lzn) this.a.get(i)).b.indexOf(socketAddress);
            if (indexOf != -1) {
                this.b = i;
                this.c = indexOf;
                return true;
            }
        }
        return false;
    }
}
