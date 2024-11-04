package defpackage;

import j$.util.DesugarCollections;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mca {
    public static final List a;
    public static final mca b;
    public static final mca c;
    public static final mca d;
    public static final mca e;
    public static final mca f;
    public static final mca g;
    public static final mca h;
    public static final mca i;
    static final maz j;
    static final maz k;
    private static final mbb o;
    public final mbx l;
    public final String m;
    public final Throwable n;

    static {
        TreeMap treeMap = new TreeMap();
        for (mbx mbxVar : mbx.values()) {
            mca mcaVar = (mca) treeMap.put(Integer.valueOf(mbxVar.r), new mca(mbxVar, null, null));
            if (mcaVar != null) {
                throw new IllegalStateException("Code value duplication between " + mcaVar.l.name() + " & " + mbxVar.name());
            }
        }
        a = DesugarCollections.unmodifiableList(new ArrayList(treeMap.values()));
        b = mbx.OK.a();
        c = mbx.CANCELLED.a();
        d = mbx.UNKNOWN.a();
        mbx.INVALID_ARGUMENT.a();
        e = mbx.DEADLINE_EXCEEDED.a();
        mbx.NOT_FOUND.a();
        mbx.ALREADY_EXISTS.a();
        mbx.PERMISSION_DENIED.a();
        mbx.UNAUTHENTICATED.a();
        f = mbx.RESOURCE_EXHAUSTED.a();
        g = mbx.FAILED_PRECONDITION.a();
        mbx.ABORTED.a();
        mbx.OUT_OF_RANGE.a();
        mbx.UNIMPLEMENTED.a();
        h = mbx.INTERNAL.a();
        i = mbx.UNAVAILABLE.a();
        mbx.DATA_LOSS.a();
        j = new mba("grpc-status", false, new mby());
        mbz mbzVar = new mbz();
        o = mbzVar;
        k = new mba("grpc-message", false, mbzVar);
    }

    private mca(mbx mbxVar, String str, Throwable th) {
        mbxVar.getClass();
        this.l = mbxVar;
        this.m = str;
        this.n = th;
    }

    public static mca b(Throwable th) {
        th.getClass();
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof mcb) {
                return ((mcb) th2).a;
            }
            if (th2 instanceof mcc) {
                return ((mcc) th2).a;
            }
        }
        return d.c(th);
    }

    public static String e(mca mcaVar) {
        String str = mcaVar.m;
        mbx mbxVar = mcaVar.l;
        if (str == null) {
            return mbxVar.toString();
        }
        return mbxVar.toString() + ": " + str;
    }

    public final mca a(String str) {
        String str2 = this.m;
        if (str2 == null) {
            return new mca(this.l, str, this.n);
        }
        return new mca(this.l, a.an(str, str2, "\n"), this.n);
    }

    public final mca c(Throwable th) {
        if (amr.g(this.n, th)) {
            return this;
        }
        return new mca(this.l, this.m, th);
    }

    public final mca d(String str) {
        if (amr.g(this.m, str)) {
            return this;
        }
        return new mca(this.l, str, this.n);
    }

    public final boolean f() {
        if (mbx.OK == this.l) {
            return true;
        }
        return false;
    }

    public final String toString() {
        jeq q = ivc.q(this);
        q.b("code", this.l.name());
        q.b("description", this.m);
        Throwable th = this.n;
        Object obj = th;
        if (th != null) {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            obj = stringWriter.toString();
        }
        q.b("cause", obj);
        return q.toString();
    }
}
