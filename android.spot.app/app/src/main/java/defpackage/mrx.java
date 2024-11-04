package defpackage;

import java.net.URI;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mrx {
    public final Object a;
    public final Object b;

    public mrx(Map map, dvy dvyVar) {
        this.a = map;
        this.b = dvyVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.concurrent.ScheduledFuture, java.lang.Object] */
    public final void a() {
        ((mce) this.a).b = true;
        this.b.cancel(false);
    }

    public final boolean b() {
        mce mceVar = (mce) this.a;
        if (!mceVar.c && !mceVar.b) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map, java.lang.Object] */
    public final cgn c(cgn cgnVar) {
        iqg.E(cgnVar);
        return new lrf(this.a, cgnVar, (dvy) this.b);
    }

    public mrx(maq maqVar, mca mcaVar) {
        this.b = maqVar;
        this.a = mcaVar;
    }

    public mrx(URI uri, mbo mboVar) {
        uri.getClass();
        this.a = uri;
        this.b = mboVar;
    }

    public mrx(mca mcaVar, Object obj) {
        mcaVar.getClass();
        this.b = mcaVar;
        this.a = obj;
    }

    public mrx(mce mceVar, ScheduledFuture scheduledFuture) {
        this.a = mceVar;
        scheduledFuture.getClass();
        this.b = scheduledFuture;
    }

    public mrx(mtc[] mtcVarArr) {
        this.a = mtcVarArr;
        this.b = new mrp(mtcVarArr.length, mrs.a);
    }

    public mrx(mau mauVar, String str) {
        mauVar.getClass();
        this.a = mauVar;
        str.getClass();
        this.b = str;
    }
}
