package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hps implements jfe {
    private final Context a;
    private final /* synthetic */ int b;

    public hps(Context context, int i) {
        this.b = i;
        this.a = context;
    }

    @Override // defpackage.jfe
    public final /* synthetic */ Object a() {
        if (this.b != 0) {
            return jer.h(hzc.a(this.a));
        }
        if (gad.c(this.a)) {
            return jdl.a;
        }
        return jer.i(new File(this.a.getFilesDir(), "primes/crash"));
    }
}
