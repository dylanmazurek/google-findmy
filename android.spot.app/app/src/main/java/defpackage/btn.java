package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class btn implements Callable {
    final /* synthetic */ String a;
    final /* synthetic */ Context b;
    final /* synthetic */ btl c;
    final /* synthetic */ int d;

    public btn(String str, Context context, btl btlVar, int i) {
        this.a = str;
        this.b = context;
        this.c = btlVar;
        this.d = i;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final kvw call() {
        try {
            return btp.b(this.a, this.b, this.c, this.d);
        } catch (Throwable unused) {
            return new kvw(-3);
        }
    }
}
