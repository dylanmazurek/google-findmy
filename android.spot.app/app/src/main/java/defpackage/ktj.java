package defpackage;

import android.content.Context;
import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ktj implements knw {
    public final /* synthetic */ String a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ktj(String str, Object obj, int i) {
        this.c = i;
        this.a = str;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kth] */
    @Override // defpackage.knw
    public final Object a(knv knvVar) {
        if (this.c != 0) {
            return new ktg(this.a, this.b.a((Context) knvVar.e(Context.class)));
        }
        Object obj = this.b;
        try {
            Trace.beginSection(this.a);
            return ((knu) obj).f.a(knvVar);
        } finally {
            Trace.endSection();
        }
    }
}
