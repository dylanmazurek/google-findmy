package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jts extends jfm {
    final /* synthetic */ jfk a;
    final /* synthetic */ jtw b;
    private int c = 0;
    private final jfd d;

    public jts(jtw jtwVar, jfk jfkVar) {
        this.a = jfkVar;
        this.b = jtwVar;
        this.d = jfd.b(jfkVar);
    }

    @Override // defpackage.jfm
    protected final /* bridge */ /* synthetic */ Object a() {
        int i = this.c;
        this.d.a(TimeUnit.MILLISECONDS);
        jtw jtwVar = this.b;
        long j = -1;
        if (jtwVar.cY(i)) {
            if (i == 0) {
                j = 0;
            } else if (jtwVar.cY(i)) {
                j = (long) (Math.pow(2.0d, i - 1) * 100.0d);
            }
        }
        if (j < 0) {
            b();
            return null;
        }
        this.c++;
        return Long.valueOf(j);
    }
}
