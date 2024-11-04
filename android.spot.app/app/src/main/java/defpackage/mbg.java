package defpackage;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mbg {
    public final mbf a;
    public final String b;
    public final String c;
    public final mbe d;
    public final mbe e;
    private final boolean f;

    public mbg(mbf mbfVar, String str, mbe mbeVar, mbe mbeVar2, boolean z) {
        String substring;
        new AtomicReferenceArray(2);
        mbfVar.getClass();
        this.a = mbfVar;
        str.getClass();
        this.b = str;
        int lastIndexOf = str.lastIndexOf(47);
        if (lastIndexOf == -1) {
            substring = null;
        } else {
            substring = str.substring(0, lastIndexOf);
        }
        this.c = substring;
        mbeVar.getClass();
        this.d = mbeVar;
        mbeVar2.getClass();
        this.e = mbeVar2;
        this.f = z;
    }

    public static mbd a() {
        mbd mbdVar = new mbd();
        mbdVar.b = null;
        mbdVar.c = null;
        return mbdVar;
    }

    public static String c(String str, String str2) {
        str.getClass();
        str2.getClass();
        return str + "/" + str2;
    }

    public final InputStream b(Object obj) {
        return new mka((lkq) obj, ((mkb) this.d).b);
    }

    public final String toString() {
        jeq q = ivc.q(this);
        q.b("fullMethodName", this.b);
        q.b("type", this.a);
        q.f("idempotent", false);
        q.f("safe", false);
        q.f("sampledToLocalTracing", this.f);
        q.b("requestMarshaller", this.d);
        q.b("responseMarshaller", this.e);
        q.b("schemaDescriptor", null);
        q.a = true;
        return q.toString();
    }
}
